fun main() {


    fun tabuada() {
        do {
            println("TABUADA. \n")
            println("Digite um número aqui")
            var n1 = readLine()!!.toInt()

            println("Escolha a tabuada:")
            println(" M - Multiplicação")
            println(" D - Divisão")
            println(" A - Adição")
            println(" S - Subtração")

            var tabuada = readLine()
            when (tabuada) {

                "M", "m" -> for (i in 1..10) println("$n1 X $i = ${n1.times(i)}")
                "D", "d" -> for (i in 1..10) println("$n1 / $i = ${n1.div(i)}")
                "A", "a" -> for (i in 1..10) println("$n1 + $i = ${n1.plus(i)}")
                "S", "s" -> for (i in 1..10) println("$n1 - $i = ${n1.minus(i)}")

            }
            println("Fazer outra operação \nSim  ou Não?")
            val operacao = readLine()!![0]

        } while (operacao == 's')
        println("Finalizado \n")
    }


    fun calculadora() {
        println("Calculadora \n")
        do {
            println("Digite um número")
            var n1 = readLine()!!.toInt()

            println("Digite um número")
            var n2 = readLine()!!.toInt()

            println("Qual operação vc escolhe?")
            println("-------------------->")
            print(" + ")
            print(" / ")
            print(" * ")
            println(" - ")
            println("-------------------->")

            var operacao = readLine()

            when (operacao) {
                "+" -> println(n1.plus(n2))
                "/" -> println(n1.div(n2))
                "*" -> println(n1.times(n2))
                "-" -> println(n1.minus(n2))
                else -> {

                    println("Operação desconhecida")
                }
            }

            println("Deseja continuar a operação \nSim ou Não")
            val resposta = readLine()!![0]

        } while (resposta == 's')

        println("Tchau tchau \n")
    }

    while (true) {

            println("Escolha uma: \nTemos Calculadora e Tabuada")

            println("-----> Caso queira sair digite 0 <-----")
            var escolha = readLine()!![0]

            when (escolha) {
                'T', 't' -> tabuada()
                'C', 'c' -> calculadora()
                '0' -> break
                }

            }



    }

