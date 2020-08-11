fun main(){

    //Ejercicio 6: Ultimo entregable!!
    //Probamos el caso de uso
    var tituloPregunta="¿Cual es el pais donde neva mas den el mundo?"
    var opciones=arrayListOf<Opcion>(Opcion("Canada",false ), Opcion("Estados Unidos", false),
        Opcion("Japon", true), Opcion("Alemania",false), Opcion("Rusia", false))

    //Antes de generar la prgunta nos convendria validar las opciones:
    //
    try{
        var validar=ValidacionPregunta()
        validar.validarNumeroDeOpciones(opciones)
        validar.validarOpcionesCorrectas(opciones)
        //Si se ejecuta el siguiente renglon todo esta correcto
        println("Opciones correctas")
        var pregunta=Pregunta()
        pregunta.titulo=tituloPregunta
        pregunta.opciones=opciones
    }catch(e:OpcionesInvalidasException ){
        println(e.message)
    }catch(e:OpcionCorrectaException){
        println(e.message)
    }

}
//Construcción del modelo
//Primero creamoa la clase opcion
public data class Opcion(
    var titulo:String,
    var correcta:Boolean
)
class Pregunta{
    var titulo:String?=null
    var opciones:ArrayList<Opcion>?=null
}

//Primero creamos las excepcion del numero de opciones
class OpcionesInvalidasException(mensajito:String):Exception(mensajito){

}

//Creamos la segunda excepción
class OpcionCorrectaException(mensajito:String):Exception(mensajito){

}

//Generamos la clase que va a validar la pregunta
class ValidacionPregunta{
    //A diferencia del otro ejrcicio,, por cada excepcion habra un metodo
    public fun validarNumeroDeOpciones(opciones:ArrayList<Opcion>){
        if(opciones.size>6) throw OpcionesInvalidasException("Agragase mas de 6 opciones!!, no se puede!")
        if(opciones.size<3)  throw OpcionesInvalidasException("Minimo deberas agregar 3 opciones")
    }

    //Vamos a validar ahora el numero de opciones que son true, SOLAMENTE DEBE HABER UNA TRUE
    public fun validarOpcionesCorrectas(opciones:ArrayList<Opcion>){
        var cantidad=0;
        opciones.forEach{
            //Con la palabra reservada it accedemos a los atributos de el arreglo
            if(it.correcta){
                cantidad++
                if(cantidad>1)throw OpcionCorrectaException("Solamente una opcion debe ser verdadera")
            }
        }

    }



