fun main() {
    //Generamos las pregunta
    //Primero generamos cada opcion
    var op1=Opcion()
    op1.titulo="Atlantico"
    op1.correcta=false

    var op2=Opcion()
    op2.titulo="Pacifico"
    op2.correcta=true

    var op3=Opcion()
    op3.titulo="Indico"
    op3.correcta=false

    var op4=Opcion()
    op4.titulo="Artico"
    op4.correcta=false

    var opciones=ArrayList<Opcion>();
    opciones.add(op1)
    opciones.add(op2)
    opciones.add(op3)
    opciones.add(op4);



    //Alternativamente
    //  var opcionesAlternativas=arrayListOf<Opcion>(op1,op2,op3,op4)
    //  Genarar finalmente la pregunta
    var p1=Pregunta()
    p1.titulo="¿Cual es el oceano mas grande del mundo?"
    p1.opciones=opciones

    //El siguiente paso simplemenente es iterar o recorrer las opciones para poder verifica que esta bien
    //tu propuesta de modelo
    println(p1.titulo)
    opciones.forEach{
        println(" ${it.titulo}")
    }


}

//Modelo de opcions
class Opcion{
    var  titulo:String?=null
    var correcta:Boolean?=null
}

//La pregunta
//
class Pregunta{
    var titulo:String?=null
    var opciones:ArrayList<Opcion>?=null
}