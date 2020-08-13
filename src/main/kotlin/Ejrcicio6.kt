fun main(){

    //Ejercicio 6: Ultimo entregable!!
    //Probamos el caso de uso
    var tituloPregunta="¿Cual es el pais donde neva mas den el mundo?"
    var opciones=arrayListOf<Opcion>(Opcion("Canada",false ), Opcion("Estados Unidos", false),
        Opcion("Japon", true), Opcion("Alemania",false), Opcion("Rusia", false))

    //Antes de generar la pregunta nos convendria validar las opciones:
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

//Primero creamos las excepcion del numero de opciones
class OpcionesInvalidasException(mensajito:String):Exception(mensajito){

}

//Creamos la segunda excepción
class OpcionCorrectaException(mensajito:String):Exception(mensajito){

}

//Generamos la clase que va a validar la pregunta
class ValidacionPregunta {
    //A diferencia del otro ejrcicio,, por cada excepcion habra un metodo
    public fun validarNumeroDeOpciones(opciones: ArrayList<Opcion>) {
        if (opciones.size > 6) throw OpcionesInvalidasException("Agragase mas de 6 opciones!!, no se puede!")
        if (opciones.size < 3) throw OpcionesInvalidasException("Minimo deberas agregar 3 opciones")
    }

    //Vamos a validar ahora el numero de opciones que son true, SOLAMENTE DEBE HABER UNA TRUE
    public fun validarOpcionesCorrectas(opciones: ArrayList<Opcion>) {
        var cantidad = 0;
        opciones.forEach {
            //Con la palabra reservada it accedemos a los atributos de el arreglo y validamos que el atributo correcta
            //realmente NO SEA NULL Y QUE YA TENGA UN VALOR con el operador !! al final de la invocacion del atributo
            //Este operador SIEMORE SE USA AL INVOCAR EL ATRIBUTO con esto garantizamos que ya no sea null
            //En diseño app moviles a  esto se les llama aserciones: Estas estructuras llamadas aserciones se ocupan mucho
            //en las app mviles en LA ETAPA DE TESTING.
            if (it.correcta!!) {
                cantidad++
                if (cantidad > 1) throw OpcionCorrectaException("Solamente una opcion debe ser verdadera")
            }
        }

    }
}


//Construcción del modelo
//Primero creamoa la clase opcion
//Inicializacion nueva por constructor
class Opcion(
    val titulo:String,
    val correcta:Boolean
)

//Declaracion de clase de forma tardicional
//Ayuda: En una clase Kotlin solamente van dos elementos: atributos y funciones o metodos
class Pregunta{
    var titulo:String?=null
  //Ayuda  en un ArrayList como se llama el operador <> ? DIAMANTE   Y adentro se pone un tipo de dato
  //Este tipo de dato nos garantiza que los arreglos SOLAMENTE PUEDEN CONTENER ELEMENTOS  DE ESA CLASE
   //El signo de interrogación  en kotlin GARANTIZA QUE EL ATRIBUTO QUEDARA INICIALIADO A NULL PARA EVITAR UNA EXPCION
    //MUY COMUN QUE SE LLAMA NullPointerException. Esta excepcion es extremadaemnte comun sobr todo en aplicaciones moviles
    //hace que se cierre la app y qu se muestre un mensaje que dice:
  // "Esta apliacion se cerrara por un error inesperado!"
    var opciones:ArrayList<Opcion>?=null
}

