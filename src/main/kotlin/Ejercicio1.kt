fun main() {

    var conjunto=HashSet<Int>()
    var lista=ArrayList<Int>()
    lista.add(3)
    lista.add(6)
    lista.add(4)

    lista.forEach{
        println("valor del listado $it")
    }

    while(conjunto.size<5){
        var r=java.util.Random()
        var numero=r.nextInt(10)
        conjunto.add(numero)
    }

    //Ahora veremos si funciona:

    conjunto.forEach{

        println("Elemento: $it")

    }






}

