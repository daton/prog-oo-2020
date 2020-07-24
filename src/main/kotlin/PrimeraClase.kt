fun main() {
    //Para generar un objeto de la clase anterior vamos a proceder de la misma manera que con Java
    //Java: Alumno a = new Alumno()
    var a=Alumno()
    //Para generar un objeto en kotlin ya no se requiere la pabra new, pues en Kotlin toda variables es
    //objeto.

    //Para asignar valores directamente al atributo del objeto que en este es "a" lo hacemos asi:
    a.nombre="Juan Carlos"
    a.edad=47
    a.calificacion=10.0f

    //para imprimir el valor es similar a Java
    println("El nombre del objeto a es ${a.nombre}  la edad es ${a.edad} y tu calificacion es ${a.calificacion}")

}

//En kotlin por defecto  todas las clases son publicas por ello, no hay necesidad de ponerles public

class Alumno{
    //atributos de manera tradicional
    var nombre:String?=null
    var edad:Int?=null
    var calificacion:Float?=null
}
