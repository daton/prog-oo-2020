fun main(){

    //Generamos unos arreglos para probar este caso de uso.

    var listaA=ArrayList<Int>()
    //Lo llenamos con unos enteremos
    listaA.add(4) //i=0
    listaA.add(-2)  //i=1
    listaA.add(5)//i=2
    //Iteramos (recordar que iterar es recorrer un arreglo de elementos)
    listaA.forEach{
        println("elemento: ${it}")
    }

    try{
        //su indice
        println("El primer es ${listaA[3]}")
    }catch(e:IndexOutOfBoundsException){
        println("Estas accediendo a un indice que no tiene este arreglo")
    }

}