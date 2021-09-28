package com.ewapps.quizappreal

import com.ewapps.quizappreal.Question
import com.ewapps.quizappreal.R


// TODO (STEP 5: Create a Constants Object.)
// START
object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    // TODO (STEP 6: Create a list of questions using the Question data model class. And add all the flag images to the drawable folder to add it in the list.)
    // START
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1, 0
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3, 0
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_brazil,
            "Bielorrússia", "Belize",
            "Brunei", "Brasil", 4, 0
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgica",
            "Barbados", "Belize", 2, 0
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_fiji,
            "Gabão", "França",
            "Fiji", "Finlândia", 3, 0
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_germany,
            "Alemanha", "Geórgia",
            "Grécia", "Nenhuma das alternativas", 1, 0
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egito",
            "Dinamarca", "Etiópia", 3, 0
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_india,
            "Irlanda", "Iran",
            "Hungria", "Índia", 4, 0
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "Nova Zelândia",
            "Tuvalu", "Estados Unidos", 2, 0
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "A qual país pertence esta bandeira?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordânia",
            "Sudão", "Palestina", 1, 0
        )

        questionsList.add(que10)

        val que11 = Question(
            11, "Quais o menor e o maior país do mundo?",
            R.drawable.perg,
            "Vaticano e Rússia", "Nauru e China",
            "São Marino e Índia", "Malta e Estados Unidos", 1, 0
        )

        questionsList.add(que11)

        val que12 = Question(
            12,
            "Quais os planetas do sistema solar?",
            R.drawable.perg,
            "Vênus, Saturno, Urano, Júpiter, Marte, Netuno, Mercúrio",
            "Júpiter, Marte, Mercúrio, Netuno, Plutão, Saturno, Sol, Terra, Urano, Vênus",
            "Terra, Vênus, Saturno, Júpiter, Marte, Netuno, Mercúrio",
            "Terra, Vênus, Saturno, Urano, Júpiter, Marte, Netuno, Mercúrio",
            4, 0
        )

        questionsList.add(que12)

        val que13 = Question(
            13, "Qual o maior animal terrestre?",
            R.drawable.perg,
            "Dinossauro", "Elefante africano",
            "Baleia Azul", "Girafa", 2, 0
        )

        questionsList.add(que13)

        val que14 = Question(
            14,
            "Normalmente, quantos litros de sangue uma pessoa tem? Em média, quantos são retirados numa doação de sangue?",
            R.drawable.perg,
            "Tem entre 2 a 4 litros. São retirados 450 mililitros",
            "Tem entre 4 a 6 litros. São retirados 450 mililitros",
            "Tem 10 litros. São retirados 2 litros",
            "Nenhuma das alternativas",
            2, 0
        )

        questionsList.add(que14)

        val que15 = Question(
            15, "De quem é a famosa frase “Penso, logo existo”?",
            R.drawable.perg,
            "Platão", "Galileu Galilei",
            "Descartes", "Francis Bacon", 3, 0
        )

        questionsList.add(que15)

        val que16 = Question(
            16, "De onde é a invenção do chuveiro elétrico?",
            R.drawable.perg,
            "França", "Inglaterra",
            "Itália", "Brasil", 4, 0
        )

        questionsList.add(que16)

        val que17 = Question(
            17, "Qual o nome do presidente do Brasil que ficou conhecido como Jango?",
            R.drawable.perg,
            "Jânio Quadros", "Jacinto Anjos",
            "João Figueiredo", "João Goulart", 4, 0
        )

        questionsList.add(que17)

        val que18 = Question(
            18, "	Quem ganhou a copa do mundo no ano de 2014?	",
            R.drawable.perg,
            "	Inglaterra	",
            "	Argentina	",
            "	Alemanha	",
            "	Brasil	", 3, 0
        )

        questionsList.add(que18)


        val que19 = Question(
            19, "	Qual o grupo em que todas as palavras foram escritas corretamente?	",
            R.drawable.perg,
            "	Asterisco, beneficente, meteorologia, entretido	",
            "	Asterisco, beneficente, metereologia, entretido	",
            "	Asterístico, beneficiente, metereologia, entretido	",
            "	Asterisco, beneficiente, metereologia, entretido	", 1, 0
        )

        questionsList.add(que19)

        val que20 = Question(
            20, "	Qual o livro mais vendido no mundo a seguir à Bíblia?	",
            R.drawable.perg,
            "	O Senhor dos Anéis	",
            "	Dom Quixote	",
            "	O Pequeno Príncipe	",
            "	Um Conto de Duas Cidades	", 2, 0
        )

        questionsList.add(que20)

        val que21 = Question(
            21, "	Quantas casas decimais tem o número pi?	",
            R.drawable.perg,
            "	Centenas	",
            "	Infinitas	",
            "	Vinte	",
            "	Milhares	", 2, 0
        )

        questionsList.add(que21)

        val que22 = Question(
            22, "	Atualmente, quantos elementos químicos a tabela periódica possui?	",
            R.drawable.perg,
            "	113	",
            "	109	",
            "	118	",
            "	108	", 3, 0
        )

        questionsList.add(que22)

        val que23 = Question(
            23, "	O que a palavra legend significa em português?	",
            R.drawable.perg,
            "	Legenda	",
            "	História	",
            "	Legendário	",
            "	Lenda	", 4, 0
        )

        questionsList.add(que23)

        val que24 = Question(
            24, "	Qual o número mínimo de jogadores numa partida de futebol?	",
            R.drawable.perg,
            "	8	",
            "	9	",
            "	7	",
            "	5	", 3, 0
        )

        questionsList.add(que24)

        val que25 = Question(
            25, "	Quais as duas datas que são comemoradas em novembro?	",
            R.drawable.perg,
            "	Independência do Brasil e Dia da Bandeira	",
            "	Dia de Finados e Dia Nacional do Livro	",
            "	Black Friday e Dia da Árvore	",
            "	Proclamação da República e Dia Nacional da Consciência Negra	", 4, 0
        )

        questionsList.add(que25)

        val que26 = Question(
            26, "	Quanto tempo a luz do Sol demora para chegar à Terra?	",
            R.drawable.perg,
            "	8 minutos	",
            "	12 minutos	",
            "	12 horas	",
            "	segundos	", 1, 0
        )

        questionsList.add(que26)

        val que27 = Question(
            27, "	Qual a nacionalidade de Che Guevara?	",
            R.drawable.perg,
            "	Cubana	",
            "	Peruana	",
            "	Argentina	",
            "	Boliviana	", 3, 0
        )

        questionsList.add(que27)

        val que28 = Question(
            28,
            "	Quais são os três predadores do reino animal reconhecidos pela habilidade de caçar em grupo, se camuflar para surpreender as presas e possuir sentidos apurados, respectivamente:	",
            R.drawable.perg,
            "	Tigre, gavião e orca	",
            "	Hiena, urso branco e lobo cinzento	",
            "	Tubarão branco, crocodilo e sucuri	",
            "	Leão, tubarão branco e urso cinzento	",
            2,
            0
        )

        questionsList.add(que28)

        val que29 = Question(
            29, "	Qual a altura da rede de vôlei nos jogos masculino e feminino?	",
            R.drawable.perg,
            "	2,4 para ambos	",
            "	1,8 m e 1,5 m	",
            "	2,45 m e 2,15 m	",
            "	2,43 m e 2,24 m	", 4, 0
        )

        questionsList.add(que29)

        val que30 = Question(
            30,
            "	Qual personagem folclórico costuma ser agradado pelos caçadores com a oferta de fumo?	",
            R.drawable.perg,
            "	Caipora	",
            "	Saci	",
            "	Boitatá	",
            "	Negrinho do Pastoreio	",
            1,
            0
        )

        questionsList.add(que30)

        val que31 = Question(
            31, "	Em que período da pré-história o fogo foi descoberto?	",
            R.drawable.perg,
            "	Neolítico	",
            "	Paleolítico	",
            "	Idade dos Metais	",
            "	Período da Pedra Polida	", 2, 0
        )

        questionsList.add(que31)

        val que32 = Question(
            32, "	Qual a montanha mais alta do Brasil?	",
            R.drawable.perg,
            "	Pico da Neblina	",
            "	Pico Paraná	",
            "	Monte Roraima	",
            "	Pico Maior de Friburgo	", 1, 0
        )

        questionsList.add(que32)

        val que33 = Question(
            33, "	Qual a velocidade da luz?	",
            R.drawable.perg,
            "	300 000 000 metros por segundo (m/s)	",
            "	199 792 458 metros por segundo (m/s)	",
            "	299 792 458 metros por segundo (m/s)	",
            "	150 000 000 metros por segundo (m/s)	", 3, 0
        )

        questionsList.add(que33)

        val que34 = Question(
            34, "	Em qual local da Ásia o português é língua oficial?	",
            R.drawable.perg,
            "	Índia	",
            "	Moçambique	",
            "	Portugal	",
            "	Macau	", 4, 0
        )

        questionsList.add(que34)

        val que35 = Question(
            35, "	“It is six twenty ou twenty past six”. Que horas são em inglês?	",
            R.drawable.perg,
            "12:06",
            "6:20",
            "6:02",
            "12:20", 2, 0
        )

        questionsList.add(que35)

        val que36 = Question(
            36, "	Quem é o autor de “O Príncipe”?	",
            R.drawable.perg,
            "	Antoine de Saint-Exupéry	",
            "	Montesquieu	",
            "	Rousseau	",
            "	Maquiavel	", 4, 0
        )

        questionsList.add(que36)

        val que37 = Question(
            37,
            "	Como é a conjugação do verbo caber na 1.ª pessoa do singular do presente do indicativo?	",
            R.drawable.perg,
            "	Ele cabe	",
            "	Eu caibo	",
            "	Que eu caiba	",
            "	Nenhuma das alternativas	",
            1,
            0
        )

        questionsList.add(que37)

        val que38 = Question(
            38, "	Quais destas construções famosas ficam nos Estados Unidos?	",
            R.drawable.perg,
            "	Estátua da Liberdade, Golden Gate Bridge e Empire State Building	",
            "	Estátua da Liberdade, Big Ben e The High Line	",
            "	Lincoln Memorial, Sidney Opera House e Burj Khalifa	",
            "	30 St Mary Axe, The High Line e Residencial 148 Spruce Stree	", 1, 0
        )

        questionsList.add(que38)

        val que39 = Question(
            39, "	Qual destes países é transcontinental?	",
            R.drawable.perg,
            "	Rússia	",
            "	Filipinas	",
            "	Groenlândia	",
            "	Tanzânia	", 1, 0
        )

        questionsList.add(que39)

        val que40 = Question(
            40,
            "	Qual foi o recurso utilizado inicialmente pelo homem para explicar a origem das coisas?	",
            R.drawable.perg,
            "	A Filosofia	",
            "	A Biologia	",
            "	A Astronomia	",
            "	A Mitologia	",
            4,
            0
        )

        questionsList.add(que40)

        val que41 = Question(
            41,
            "	Qual das alternativas menciona apenas símbolos nacionais?	",
            R.drawable.perg,
            "	Bandeira insígnia da presidência, bandeira nacional, brasão, hinos e selo	",
            "	Bandeira nacional, armas nacionais, hino nacional e selo nacional	",
            "	Bandeira nacional, brasão, hino nacional e hino da independência	",
            "	Bandeira nacional, cores nacionais, hino nacional e hino da independência	",
            2,
            0
        )

        questionsList.add(que41)

        val que42 = Question(
            42, "	Júpiter e Plutão são os correlatos romanos de quais deuses gregos?	",
            R.drawable.perg,
            "	 Ares e Hermes	",
            "	Cronos e Apolo	",
            "	Zeus e Hades	",
            "	Zeus e Ares	", 3, 0
        )

        questionsList.add(que42)

        val que43 = Question(
            43, "	Que líder mundial ficou conhecida como “Dama de Ferro”?	",
            R.drawable.perg,
            "	Dilma Rousseff	",
            "	Angela Merkel	",
            "	Margaret Thatcher	",
            "	Hillary Clinton	", 3, 0
        )

        questionsList.add(que43)

        val que44 = Question(
            44, "	Quais os nomes dos três Reis Magos?	",
            R.drawable.perg,
            "	Gaspar, Nicolau e Natanael	",
            "	Belchior, Gaspar e Baltazar	",
            "	Belchior, Gaspar e Nataniel	",
            "	Melchior, Noé e Galileu	", 2, 0
        )

        questionsList.add(que44)

        val que45 = Question(
            45,
            "	Qual a religião monoteísta que conta com o maior número de adeptos no mundo?	",
            R.drawable.perg,
            "	Judaísmo	",
            "	Islamismo	",
            "	Cristianismo	",
            "	Hinduísmo	",
            3,
            0
        )

        questionsList.add(que45)

        val que46 = Question(
            46, "	Qual desses filmes foi baseado na obra de Shakespeare?	",
            R.drawable.perg,
            "	Muito Barulho por Nada (2012)	",
            "	Capitães de Areia (2011)	",
            "	A Revolução dos Bichos (1954)	",
            "	Excalibur (1981)	", 1, 0
        )

        questionsList.add(que46)

        val que47 = Question(
            47, "	Quem foi o primeiro homem a pisar na Lua? Em que ano aconteceu?	",
            R.drawable.perg,
            "	Yuri Gagarin, em 1961	",
            "	Buzz Aldrin, em 1969	",
            "	Charles Duke, em 1971	",
            "	Neil Armstrong, em 1969	", 4, 0
        )

        questionsList.add(que47)

        val que48 = Question(
            48, "	As pessoas de qual tipo sanguíneo são consideradas doadores universais?	",
            R.drawable.perg,
            "	Tipo A	",
            "	Tipo B	",
            "	Tipo O	",
            "	Tipo AB	", 3, 0
        )

        questionsList.add(que48)

        val que49 = Question(
            49, "	Quais são os cromossomos que determinam o sexo masculino?	",
            R.drawable.perg,
            "	Os X	",
            "	Os Y	",
            "	Os Z	",
            "	Os V	", 2, 0
        )

        questionsList.add(que49)

        val que50 = Question(
            50, "	Quem amamentou os gêmeos Rômulo e Remo?	",
            R.drawable.perg,
            "	uma cabra	",
            "	uma vaca	",
            "	uma ovelha	",
            "	uma loba	", 4, 0
        )

        questionsList.add(que50)

        val que51 = Question(
            51,
            "	No exterior de que famoso edifício francês foi construída uma enorme pirâmide de vidro em 1989?	",
            R.drawable.perg,
            "	Torre Eiffel	",
            "	Grand Palais	",
            "	Museu do Louvre	",
            "	Arco do Triunfo	",
            3,
            0
        )

        questionsList.add(que51)

        val que52 = Question(
            52,
            "	Como se chamam os vasos que transportam sangue do coração para a periferia do corpo?	",
            R.drawable.perg,
            "	veias	",
            "	átrios	",
            "	ventrículos	",
            "	artérias	",
            4,
            0
        )

        questionsList.add(que52)

        val que53 = Question(
            53, "	Com que dois países faz fronteira o Equador?	",
            R.drawable.perg,
            "	com o Brasil e com a Colômbia	",
            "	com a Colômbia e com a Venezuela	",
            "	com a Colômbia e com o Peru	",
            "	com o Peru e com o Equador	", 3, 0
        )

        questionsList.add(que53)

        val que54 = Question(
            54, "	Que animal gruguleja?	",
            R.drawable.perg,
            "	o pavão	",
            "	a garça	",
            "	o papagaio	",
            "	o peru	", 4, 0
        )

        questionsList.add(que54)

        val que55 = Question(
            55, "	Qual é o maior arquipélago da Terra?	",
            R.drawable.perg,
            "	a Filipinas	",
            "	a Indonésia	",
            "	as Bahamas	",
            "	as Maldivas	", 2, 0
        )

        questionsList.add(que55)

        val que56 = Question(
            56,
            "	Que substância é absorvida pelas plantas e expirada por todos os seres vivos?	",
            R.drawable.perg,
            "	o oxigênio	",
            "	o nitrogênio	",
            "	o dióxido de carbono	",
            "	o dióxido de ferro	",
            3,
            0
        )

        questionsList.add(que56)

        val que57 = Question(
            57, "	Em que oceano fica Madagascar?	",
            R.drawable.perg,
            "	Oceano Índico	",
            "	Oceano Antártico	",
            "	Oceano Pacífico	",
            "	Oceano Ártico	", 1, 0
        )

        questionsList.add(que57)

        val que58 = Question(
            58, "	Qual o metal cujo símbolo químico é o Au?	",
            R.drawable.perg,
            "	Cobre	",
            "	Prata	",
            "	Ouro	",
            "	Mercúrio	", 3, 0
        )

        questionsList.add(que58)

        val que59 = Question(
            59, "	Em que século o continente europeu foi devastado pela peste bubônica?	",
            R.drawable.perg,
            "	No século X	",
            "	No século XII	",
            "	No século XIII	",
            "	No século XIV	", 4, 0
        )

        questionsList.add(que59)

        val que60 = Question(
            60, "	Quem viveu, segundo a bíblia, 969 anos?	",
            R.drawable.perg,
            "	Noé	",
            "	Matusalém	",
            "	Benjamim	",
            "	Abel	", 2, 0
        )

        questionsList.add(que60)

        val que61 = Question(
            61, "	Quem pintou o teto da capela sistina?	",
            R.drawable.perg,
            "	Michelangelo	",
            "	Leonardo da Vinci	",
            "	Rafael	",
            "	Donatello	", 1, 0
        )

        questionsList.add(que61)

        val que62 = Question(
            62, "	Quantos graus são necessário para que dois ângulos sejam complementares?	",
            R.drawable.perg,
            "	45	",
            "	60	",
            "	90	",
            "	180	", 3, 0
        )

        questionsList.add(que62)

        val que63 = Question(
            63, "	Jim Morrison era vocalista de que grupo?	",
            R.drawable.perg,
            "	The Police	",
            "	The Doors	",
            "	Pink Floyd	",
            "	Nirvana	", 2, 0
        )

        questionsList.add(que63)

        val que64 = Question(
            64, "	Onde o ping-pong foi inventado?	",
            R.drawable.perg,
            "	Na Inglaterra	",
            "	Na Alemanha	",
            "	No Brasil	",
            "	Nos Estados Unidos	", 1, 0
        )

        questionsList.add(que64)

        val que65 = Question(
            65, "	Quantas Champions Legue o Real Madrid venceu?	",
            R.drawable.perg,
            "	9	",
            "	7	",
            "	10	",
            "	13	", 4, 0
        )

        questionsList.add(que65)

        val que66 = Question(
            66, "	Quantos planetas Terra cabem dentro do Sol?	",
            R.drawable.perg,
            "	Um milhão	",
            "	Cem	",
            "	Seiscentos	",
            "	Cento de cinquenta	", 1, 0
        )

        questionsList.add(que66)

        val que67 = Question(
            67, "	Em que lugar vivem mais cangurus do que pessoas?	",
            R.drawable.perg,
            "	Indonésia	",
            "	Nova Zelândia	",
            "	Austrália	",
            "	África do Sul	", 3, 0
        )

        questionsList.add(que67)

        val que68 = Question(
            68, "	Quantos olhos a maior parte das aranhas têm?	",
            R.drawable.perg,
            "	Dois	",
            "	Quatro	",
            "	Quatro pares	",
            "	Seis	", 3, 0
        )

        questionsList.add(que68)

        val que69 = Question(
            69, "	O que mede a Escala Mercalli?	",
            R.drawable.perg,
            "	A intensidade dos ventos	",
            "	A intensidade sísmica de acordo com os danos provocados	",
            "	A resistência dos minerais	",
            "	A magnitude de um terremoto	", 2, 0
        )

        questionsList.add(que69)

        val que70 = Question(
            70, "	Qual das alternativas contém apenas nomes de rios?	",
            R.drawable.perg,
            "	São Francisco, Douro, Antártico	",
            "	Nilo, Amazonas, Mississipi	",
            "	Cáspio, Vermelho, Reno	",
            "	Danúbio, Jordão, Morto	", 2, 0
        )

        questionsList.add(que70)

        val que71 = Question(
            71, "	Quanto mede uma girafa?	",
            R.drawable.perg,
            "	Entre 4,8 e 5,5 metros	",
            "	2,5 metros	",
            "	Entre 5 e 6 metros	",
            "	4 metros	", 1, 0
        )

        questionsList.add(que71)

        val que72 = Question(
            72, "	Qual a ciência que estuda a atmosfera da Terra e a climatologia?	",
            R.drawable.perg,
            "	Astronomia	",
            "	Horologia	",
            "	Meteorologia	",
            "	Dispersão atmosférica	", 3, 0
        )

        questionsList.add(que72)

        val que73 = Question(
            73, "	Quantos braços tem um polvo?	",
            R.drawable.perg,
            "	Seis	",
            "	Oito	",
            "	Dez	",
            "	Sete	", 2, 0
        )

        questionsList.add(que73)

        val que74 = Question(
            74,
            "	Qual das alternativas contém apenas animais cujos esqueletos são externos?	",
            R.drawable.perg,
            "	Caracóis, caranguejos e lagostas	",
            "	Besouros, peixes e formigas	",
            "	Caracóis, lulas e aranhas	",
            "	Lagostas, polvos e escorpiões	",
            1,
            0
        )

        questionsList.add(que74)

        val que75 = Question(
            75, "	Qual das alternativas traz apenas nomes de grandes inventores?	",
            R.drawable.perg,
            "	Alfred Nobel, José Bonifácio, Leonardo da Vinci	",
            "	Machado de Assis, Oscar Niemeyer e Dmitri Mendeleiev	",
            "	Stephen Poplawski, Tarsila do Amaral, Amalie Auguste Melitta Bentz	",
            "	Alexander Graham Bell, Bartolomeu de Gusmão, Galileu Galilei	", 4, 0
        )

        questionsList.add(que75)

        val que76 = Question(
            76,
            "	Indique quais as respectivas invenções dos inventores Alexander Graham Bell e Galileu Galilei.	",
            R.drawable.perg,
            "	Lâmpada e avião	",
            "	Internet e televisão	",
            "	Telefone e termômetro	",
            "	Relógio e giroscópio	",
            4,
            0
        )

        questionsList.add(que76)

        val que77 = Question(
            77, "	Nesses pares, ambos são mamíferos:	",
            R.drawable.perg,
            "	Baleia azul e golfinhos	",
            "	Morcegos e galinhas	",
            "	Girafas e tartarugas	",
            "	Porcos e pinguins	", 1, 0
        )

        questionsList.add(que77)

        val que78 = Question(
            78, "	Quanto tempo o vidro demora para se decompor?	",
            R.drawable.perg,
            "	tempo indeterminado	",
            "	1000 anos	",
            "	4000 anos	",
            "	1 milhão de anos	", 1, 0
        )

        questionsList.add(que78)

        val que79 = Question(
            79, "	De que são constituídos os diamantes?	",
            R.drawable.perg,
            "	Grafite	",
            "	Carbono	",
            "	Ósmio	",
            "	Bóhrio	", 2, 0
        )

        questionsList.add(que79)

        val que80 = Question(
            80, "	Qual o significado das setas do símbolo internacional da reciclagem?	",
            R.drawable.reci,
            "	Fabricação, utilização e reutilização	",
            "	Papel, vidro e metal	",
            "	Papel, vidro e plástico	",
            "	Coleta, separação e consumo	", 1, 0
        )

        questionsList.add(que80)

        val que81 = Question(
            81, "	Em que ordem aparecem as cores do arco-íris sempre?	",
            R.drawable.perg,
            "	Amarelo, laranja, vermelho, azul, anil (ou índigo), verde e violeta	",
            "	Vermelho, laranja, violeta, anil (ou índigo), azul, verde e amarelo	",
            "	Vermelho, laranja, amarelo, branco, verde, azul e violeta	",
            "	Vermelho, laranja, amarelo, verde, azul, anil (ou índigo) e violeta	", 4, 0
        )

        questionsList.add(que81)

        val que82 = Question(
            82, "	Qual dessas aves não voa?	",
            R.drawable.perg,
            "	Pinguim	",
            "	Galinha	",
            "	Cegonha	",
            "	Peru	", 1, 0
        )

        questionsList.add(que82)

        val que83 = Question(
            83, "	A quem foi atribuído pela primeira vez o Prêmio Nobel da Paz?	",
            R.drawable.perg,
            "	 Frédéric Passy	",
            "	Martin Luther King Jr.	",
            "	Frédéric Passy e Henry Dunant	",
            "	Henri Becquerel e Marie Curie	", 3, 0
        )

        questionsList.add(que83)

        val que84 = Question(
            84, "	O que é um Papiloscopista?	",
            R.drawable.perg,
            "	Especialista em cópias	",
            "	Profissional especializado em identificação humana	",
            "	Indivíduo responsável por crianças órfãs	",
            "	Indivíduo que se dedica ao estudo de papiros	", 2, 0
        )

        questionsList.add(que84)

        val que85 = Question(
            85, "	Qual é respectivamente o animal terrestre mais lento e o mais veloz?	",
            R.drawable.perg,
            "	Bicho-preguiça e guepardo	",
            "	Tartaruga e leão	",
            "	Coala e cavalo	",
            "	Bicho-preguiça e libélula	", 1, 0
        )

        questionsList.add(que85)

        val que86 = Question(
            86,
            "	Método de seleção em que predomina o mérito. Essa é a definição de qual conceito da Sociologia?	",
            R.drawable.perg,
            "	Aristocracia	",
            "	Fidalguia	",
            "	Tirania	",
            "	Meritocracia	",
            4,
            0
        )

        questionsList.add(que86)

        val que87 = Question(
            87, "	O que é Ortorexia?	",
            R.drawable.perg,
            "	Obsessão pelo consumo de alimentos saudáveis	",
            "	Transtorno alimentar caracterizado pela perda de apetite	",
            "	Obsessão em falar de forma correta	",
            "	Distúrbio alimentar que provoca a ingestão excessiva de alimentos	", 1, 0
        )

        questionsList.add(que87)

        val que88 = Question(
            88, "	Qual desses autores brasileiros escreveu O Guarani e O Gaúcho?	",
            R.drawable.perg,
            "	Aluísio de Azevedo	",
            "	 José de Anchieta	",
            "	José de Alencar	",
            "	Gonçalves de Magalhães	", 3, 0
        )

        questionsList.add(que88)

        val que89 = Question(
            89, "	Qual o significado da expressão “calcanhar de Aquiles”?	",
            R.drawable.perg,
            "	A característica predominante das pessoas	",
            "	Fuga dos problemas	",
            "	O ponto mais vulnerável de alguém	",
            "	Esporão	", 3, 0
        )

        questionsList.add(que89)

        val que90 = Question(
            90, "	O etanol é produzido através de qual fonte de energia?	",
            R.drawable.perg,
            "	Solar	",
            "	Biomassa	",
            "	Eólica	",
            "	Geotérmica	", 2, 0
        )

        questionsList.add(que90)

        val que91 = Question(
            91, "	Qual destas, apesar do seu nome, não é considerada um tipo de força?	",
            R.drawable.perg,
            "	Força de atrito	",
            "	Força peso	",
            "	Força eletromotriz	",
            "	Força centrípeta	", 3, 0
        )

        questionsList.add(que91)

        val que92 = Question(
            92, "	Qual desses não é um instrumento meteorológico?	",
            R.drawable.perg,
            "	Barógrafo	",
            "	Termômetro	",
            "	Pluviômetro	",
            "	Etilômetro	", 4, 0
        )

        questionsList.add(que92)

        val que93 = Question(
            93, "	Este é um exemplo de palíndromo:	",
            R.drawable.perg,
            "	Roma é amor.	",
            "	O rato roeu a roupa do rei de Roma.	",
            "	Quem tem boca vai à Roma.	",
            "	Uni, duni, tê, Salamê, mingüê, Um sorvete colorê, O escolhido foi você!", 1, 0
        )

        questionsList.add(que93)

        val que94 = Question(
            94, "	Homem Vitruviano é um desenho de qual artista famoso?	",
            R.drawable.perg,
            "	Michelangelo	",
            "	Donatello	",
            "	William Shakespeare	",
            "	Leonardo da Vinci	", 4, 0
        )

        questionsList.add(que94)

        val que95 = Question(
            95, "	Em qual das alternativas constam apenas maravilhas do mundo?	",
            R.drawable.perg,
            "	Estátua de Zeus em Olímpia, Cristo Redentor, Centro Histórico de Ouro Preto	",
            "	Pirâmides do Egito, Coliseu de Roma, Cristo Redentor	",
            "	Muralha da China, Taj Mahal, Pirâmide do Sol	",
            "	Big Ben, Torre de Pisa, Jardins Suspensos da Babilônia	", 2, 0
        )

        questionsList.add(que95)

        val que96 = Question(
            96, "	Palavra “paz” soletrada através do alfabeto fonético da Otan:	",
            R.drawable.perg,
            "	Pá - amor - zuuum	",
            "	Pisces - alfa - zelo	",
            "	Paz - Aurélio - zulu	",
            "	Papa - alfa - zulu	", 4, 0
        )

        questionsList.add(que96)

        val	que97	= Question(	97	, "	O Dia do Fico é anualmente celebrado em que data?	",
            R.drawable.perg,
            "	7 de setembro	",
            "	19 de abril	",
            "	9 de janeiro	",
            "	1º de maio	",	3	, 0)

        questionsList.add(que97)

        val	que98	= Question(	98	, "	Listras azuis e brancas intercaladas e um sol no canto superior esquerdo caracterizam a bandeira de qual país da América do Sul?	",
            R.drawable.perg,
            "	Argentina	",
            "	Brasil	",
            "	Namíbia	",
            "	Uruguai	",	4	, 0)

        questionsList.add(que98)

        val	que99	= Question(	99	, "	Complete a frase: ___ ao vencedor!	",
            R.drawable.perg,
            "	Quimeras	",
            "	Cócoras	",
            "	Oblações	",
            "	Alvíssaras	",	4	, 0)

        questionsList.add(que99)

        val	que100	= Question(	100	, "	As cantigas de Escárnio e Maldizer pertencem a qual escola literária?	",
            R.drawable.perg,
            "	Modernismo	",
            "	Classicismo	",
            "	Barroco	",
            "	Trovadorismo	",	4	, 0)

        questionsList.add(que100)

        val	que101	= Question(	101	, "	Quantos dias, aproximadamente, a Lua demora para dar uma volta à Terra?	",
            R.drawable.perg,
            "	365 dias	",
            "	366 dias	",
            "	28 dias	",
            "	31 dias	",	3	, 0)

        questionsList.add(que101)

        val	que102	= Question(	102	, "	O português é a língua oficial nesses três países:	",
            R.drawable.perg,
            "	Guiné-Bissau, África do Sul e Brasil	",
            "	Guiné Equatorial, Cabo Verde e Angola	",
            "	Macau, Timor-Leste e Moçambique	",
            "	Venezuela, Angola e Portugal	",	2	, 0)

        questionsList.add(que102)

        val	que103	= Question(	103	, "	Qual a unidade que mede a intensidade do som?	",
            R.drawable.perg,
            "	Decibel	",
            "	Frequência	",
            "	Hertz	",
            "	Ruído	",	1	, 0)

        questionsList.add(que103)

        val	que104	= Question(	104	, "	Em que país nasceu o Conde Drácula?	",
            R.drawable.perg,
            "	Polônia	",
            "	Irlanda	",
            "	Escócia	",
            "	Transilvânia	",	4	, 0)

        questionsList.add(que104)

        val	que105	= Question(	105	, "	Que tipo de tempestade é um haboob?	",
            R.drawable.perg,
            "	tempestade de neve	",
            "	tempestade de granizo	",
            "	tempestade de areia	",
            "	tempestade de raios	",	3	, 0)

        questionsList.add(que105)

        val	que106	= Question(	106	, "	Que capital asiática tem uma Cidade Imperial e uma Cidade Proibida?	",
            R.drawable.perg,
            "	Nova Delhi	",
            "	Pequim	",
            "	Tóquio	",
            "	Cingapura	",	2	, 0)

        questionsList.add(que106)







        return questionsList
    }
    // END
}
// END