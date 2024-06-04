package com.example.fundamentoskotlin.exercicios

//Crie um condicional que testa se uma variavel é par,
//se for ela deve imprimir na tela "O numero é par",
//senão deve imprimir "O numero é impar"

//Teste primeiro utilizando a variavel par o verifique o resultado
//Faça o mesmo teste testando a variavel impar

// Refaça o Exemplo anterior utilizando o comando when para testar a variavel

fun main() {
    val valorPar = 8
    val valorImpar = 5

    // Deve retornar par
    validaComIf(valorPar)
    // Deve retornar impar
    validaComIf(valorImpar)

    println() // Quebrar uma linha

    // Deve retornar par
    validaComWhen(valorPar)
    // Deve retornar impar
    validaComWhen(valorImpar)
}
fun validaComIf(valor: Int){
    if (valor % 2 == 0){
        println("O numero é par")
    } else{
        println("O numero é Impar")
    }
}

fun validaComWhen(valor: Int){
    when (valor % 2){
        0 -> println("O numero é par")
        else -> println("o numero é impar")
    }
}