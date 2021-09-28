package com.ewapps.quizappreal

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

import kotlinx.android.synthetic.main.activity_quiz_question.*

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {


    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCount = 1
    private var mUserName: String? = null
    private var mCorrectAnswers: Int = 0
    private var mTest = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        mQuestionsList = Constants.getQuestions()

        setQuestion()



        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)

        btn_submit.setOnClickListener(this)


    }

    private fun setQuestion() {

        defaultOptionsView()


        var total = mQuestionsList!!.size - 1

        mCurrentPosition = (0..total).shuffled().first()

        val question = mQuestionsList?.get(mCurrentPosition)


        if (question?.teste == 0) {
            question?.teste = 1
        } else {

            return setQuestion()
        }


        /*if (mCount == 10) {
            btn_submit.text = "VER RESULTADO"
        } else {
            btn_submit.text = "ENVIAR"

        }*/


        btn_submit.text = "ENVIAR"
        progress_bar.progress = mCount
        tv_progress.text = "$mCount" + "/" + progress_bar.max

        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour


    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#5C5C5C"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_back_border)
        }


    }

    override fun onClick(v: View?) {

        when (v?.id) {

            R.id.tv_option_one -> {

                selectedOptionView(tv_option_one, 1)
            }

            R.id.tv_option_two -> {

                selectedOptionView(tv_option_two, 2)
            }

            R.id.tv_option_three -> {

                selectedOptionView(tv_option_three, 3)
            }

            R.id.tv_option_four -> {

                selectedOptionView(tv_option_four, 4)
            }

            R.id.btn_submit -> {


                if (mSelectedOptionPosition == 0) {





                    when {
                        mCount < 10 -> {

                            if (mTest == 0) {
                                Toast.makeText(this, "Voce deve escolher uma opção!", Toast.LENGTH_SHORT).show()
                            } else {
                                mCount++
                                setQuestion()
                                mTest = 0

                                tv_option_one.isClickable = true
                                tv_option_two.isClickable = true
                                tv_option_three.isClickable = true
                                tv_option_four.isClickable = true

                            }


                        }
                        else -> {

                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, mUserName)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, 10)
                            val question = mQuestionsList?.get(mCurrentPosition)
                            for (i in mQuestionsList!!) {
                                question?.teste = 0
                                startActivity(intent)
                                finish()

                            }
                        }


                    }

                } else {

                    mTest = 1

                    val question = mQuestionsList?.get(mCurrentPosition)


                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border)
                        tv_option_one.isClickable = false
                        tv_option_two.isClickable = false
                        tv_option_three.isClickable = false
                        tv_option_four.isClickable = false



                    } else {

                        mCorrectAnswers++
                        tv_option_one.isClickable = false
                        tv_option_two.isClickable = false
                        tv_option_three.isClickable = false
                        tv_option_four.isClickable = false



                    }

                    answerView(question.correctAnswer, R.drawable.correct_option_border)
                    if (mCount == 10) {
                        btn_submit.text = "VER RESULTADO"


                    } else {
                        btn_submit.text = "IR PARA A PRÓXIMA QUESTÃO"


                    }
                    mSelectedOptionPosition = 0




                }


            }

        }
    }

    private fun answerView(answer: Int, drawableView: Int) {

        when (answer) {
            1 -> {
                tv_option_one.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                tv_option_two.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                tv_option_three.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                tv_option_four.background = ContextCompat.getDrawable(this, drawableView)
            }
        }

    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_back_border)
    }
}