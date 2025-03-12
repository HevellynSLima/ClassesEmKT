package com.example.classe



import kotlin.random.Random

fun main (){
    var carro = Veiculo("Volvo V40")
    carro.acelerar(400)
    carro.desacelerar()
    println("Velocidade atual: ${carro.getCurrentSpeed()} km/h")
}

class Veiculo(model: String ) {
    val model: String
    var velocity: Long
    var aceleracao : Long


    init{
        this.model = model
        this.aceleracao = 10
        this.velocity = 0
    }

    fun acelerar (aceleracao: Long){
        velocity += aceleracao
        println("$model acelerou para $velocity km/h")

    }

    fun desacelerar(){
        if(velocity >= aceleracao){
            velocity -= aceleracao
        } else {
            velocity = 0
        }
        println("$model desacelerou para $velocity")
    }

    fun getCurrentSpeed(): Long = velocity

}
