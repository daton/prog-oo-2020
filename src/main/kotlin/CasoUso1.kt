fun main(){

    //Caso de uso division "integral" entre cero
    //int x=0
    try{
        var x:Int=0
        var y=4.0
        println("Aqui todavia no se lanza la exepcion pues porque aún no hacecmos da division, este se va a imprimir")
        println(y/x) //Se lanza la excepcion y este renglon JAMAS SE EJECUTA.
        println("Este renglon jamas se vera si el de arriba lanza excepcion")

    }catch(e:ArithmeticException){
        println("Se cometió un error, es decir se lanzo la excepcion")
    }finally{
        println("Este bloque que es el finally SIEMPRE se ejecuta, se lance o no la expcecion.")
    }
}