//Repaso Parte 1.

/**
 Java al igual que kotlin es un lenguaje orientado a objetos pero kotlin es muy pupular porque
 Tiene ciertas ventajas:
 1.- La principal es que EVITA AL MAXIMO la excepcion NullPointerException, la cual es muy comun en sistemas
 distribuidos. UN sistema de este tipo es aquel que consta de dos o mas aplicaciones que trabajan
 conjuntamente.
 2.- Funciona con el paradigma orienatdo a objetos + paradigma funcional +paradigma reactivo

   a.- Paradigma funcional.- En este lo que tenemos es que una funcion ES TRATADA COMO UN TIPO DE DATO
 **/
 //Ejemplo
 fun main(){

      var x=5
     fun suma(x:Int, y:Int)=x+y

}
//Una funcion es un conjunto expresiones que entre ellas resuelven un problema en particular
//Continuando aqui con el paradigma funcional, en él, tambien una funcion puede regresar OTRA FUNCION

//Tambien Kotlin es reactivo porque pueden realziarse tareas autonomamente es decir, "por debajo del gua
//sin interviner en otros aspectos. En lenguaje tecnico a esto se le denomina ASINCRONICIDAD.
//En este paradgma hay dos conceptos
/*
 a) El obsevador(Observer).- Es un objeto VIGILANTE  que esta cuidando si hay algo nuevo sin interfir en la app
 b) El sucriptor(Subscriber).- Es un objeto el cual RECIBE la NOTIFICACION proveniente del OBSERVER.

 Ejemplos de apps que use esto: UBER , whats, face, messenger de face, Instagram, Twitter,etc etc
 Si quieres ahonda un poco de esto hay un sitio oficial:
 */

//Las diferentes formas de inicializar o declarar variables y datos en Kotlin
/*
En kotlin TODOS LOS DATOS SON OBJETOS, YA NO HAY DATOS PRIMARIOS O PRIMITIVOS

eJEMPLO EN jAVA ESTO ES VALIDO
 int x=0

 En kotlin:
 var x:Int=null   //OK
 var y = 5  //OK
 val y:Int    //wrong porque en koltin la palabra val se usa para contantes
 val z=10 //OK
 */

