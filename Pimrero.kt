fun main() {

    println("Conceptos de funciones")
    //Para invocar la función simplemente la agregamos con su respctiva lista de argumento
    mensaje()
    //Invocamos la funcion anterior, ésta tiene tiene tipo de retorno y es String, entoces podemos
    //mandarla llamar o invocar desde un println()
    println("Vamos a invocar nuestra funcion que se llama saludar ${saludar()}  y eso es todo")
    //Mandamos llamar la funcion sumar
    println("Sumamos dos numeros ${sumar(4,5)}  ,  esa fue la suma")


}

//Aqui vamos a declarar una funcion
fun mensaje(){
    println("Mi primer funcion con kotlin")
}

//La siguiente funcion tiene tipo de retorno
fun saludar():String{

    var saludo="Hola desde \n otra linea"

    return saludo
}

//Una tercera funcion que tiene lista de argumentos
fun  sumar(primero:Int, segundo:Int):Int{
    var resultado = primero+segundo
    return resultado
}

fun main() {
    val x:Int=5

    //Vamos a mandarl llamar es igual que los lenguajes orietados a objetos.


    //Declaracion d una funcion como tipo de dato usando el operador lambda (->)
    val hacerAlgo:()->Unit={
        println("Esta es mi primer variable funcional con lambdas!!!")
    }

    hacerAlgo()

}


//Veremos otro ejemplo:

val edadEnDias:(edad:Int)={
    var diasVividos=edad*365
    println("Tu edad vivida en dias es ${diasVividos}")
}



