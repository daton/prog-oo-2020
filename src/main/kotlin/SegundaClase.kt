import kotlin.random.Random

fun main(){
    print("Hola")


// Genereacion de arreglos mutables en kotlin
    var lista=ArrayList<Int>();
    //Agregamos algunos elementos al arreglo
    lista.add(4)
    lista.add(3)
    lista.add(-6)
    lista.add(4)
    //Estos arregloa aceptan repeticiones
    lista.forEach{
        println("Esta es una linea por cada elemento  $it ")
    }

    println("Arreglos mutables que no aceptan repeticion")
    var conjunto=HashSet<Int>();
    //Agregamos los mismos elementos
    conjunto.add(4)
    conjunto.add(3)
    conjunto.add(-6)
    conjunto.add(4)
    conjunto.forEach{
        println("Elemento del conjunto $it")
    }


}