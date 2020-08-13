fun main(){
    //EJERCICIO 5: CALCULO DEL IMC
    //Creamos un objeto de la clase Persona
    var yo=Persona()
    //Asignamos nuestros valores de peso y altura
    yo.peso=78f
    yo.altura=1.68f
    //calculamos el imc
    yo.calcularImc()
    //Imprimirmos el resultado
    println("Tu IMC es ${yo.imc}")
    //Hay que validar como andamos!!
    var validar=ValidacionIMC()
    try{

        validar.validarImc(yo.imc!!)
        //Si se jecuta este renglon todo esta bien
        println("Estas muy bien de peso, felicidades!!!, el covid te pela los dientes!")

    }
    catch(e:IMCPeligrosoException){
        println(e.message)
    }

}

//PRIMERO CREAMOS LA CLASE MODELO
class Persona{
    var peso:Float?=null
    var altura:Float?=null
    var imc:Float?=null

    public fun calcularImc(){
        //hacemos el calculo
        imc=peso!!/(altura!!*altura!!)

    }

} //Aqui termina la clase Persona

//Creamos la clase que va a ser la excepción
class IMCPeligrosoException(mensajito:String):Exception(mensajito){

}

//Agregamos una clase Valiadora, este tipo de clases taambien son tipo Modelo
class ValidacionIMC{
    public fun validarImc(imc: Float){
        if(imc>30) throw  IMCPeligrosoException("Peligro!!! tienes sobre-peso")//Cosntructor
        if(imc<20)throw IMCPeligrosoException("Peligro!!! esta muy desnutrido!!")//Constructor
    }
}




