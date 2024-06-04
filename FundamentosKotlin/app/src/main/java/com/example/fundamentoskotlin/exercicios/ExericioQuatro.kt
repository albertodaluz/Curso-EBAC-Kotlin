package com.example.fundamentoskotlin.exercicios

//Crie um array de inteiro de tamanho 40
//Escreva um código que escreva os numeros de 1 a 39 neste array utilizando o comando for

//Crie uma lista de inteiros
//Escreva na lista os numeros de 1 a 99 utilizando o comando for

//Utilizando a lista anterior
//Crie uma variavel do tipo inteiro de nome soma e inicialize ela com o valor 0
//Crie um códiugo que percorre a lista que criamos anteriormente e que a cada interação,
//acrescente o valor da posição atual a varial soma

fun main() {
    val array = IntArray(40) { 0 }

    // Preenchendo array
    for (i in 1..39) {
        array[i - 1] = i
    }
    // Mostrando array
    println(array.contentToString())

    // Utilizando a mutableList
    val lista: MutableList<Int> = mutableListOf()

    for (i in 1..99) {
        lista.add(i)
    }
    for (i in lista) {
        print("${lista[i - 1]} ")
    }

    println() // Quebrar uma linha

    var soma : Int = 0

    for (i in lista) {
        soma += lista[i - 1]
    }
    println(soma)
}