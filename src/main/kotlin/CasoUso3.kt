fun main(){
    println("Solucion a entregable")

    var perfilA=Perfil("floky","floky@gmail.com","floky123")

    var autenticacion=Autenticacion()
    autenticacion.autenticar(perfilA)
    println("Autenticado con exito")
}

class Perfil(
   var nombre:String,
   var email:String,
    var password:String
)
//La siguiente clase pertenece  a un grupo de clases que se llaman MODELO. LAS CLASES MODELO GENERALMNETE
//SON LAS QUE MANEJAN LA LOGICA DE LAS CLASES ENTIDAD.
class BaseDatosFake{
    //Supondremos que esta clase obtiene los registro guardados de Perfiles de una BD emota en un servidor
    //Las clases Modelo continen dos tipos de logica: La trnsaccional y la de Persistencia
    //La transaccional implica realmente algoritmos de acceso a información.
    //La logica de PERSISTENCIA solamente implica opreciones basicas de acceso de informacion (guardar, buscar,
    //buscar por id, actualizar y borrar)
    // var xx=arrayListOf<Int>(  3,
    //							 4,
    //							 4)



    fun obtenerUsuarios():ArrayList<Perfil>
            =arrayListOf(Perfil("floky", "floky@gmail.com","floky123"),
                        Perfil("tribi","tribi@oulook.com", "tribi123"),
                        Perfil("ludo", "ludo@hotmail.com", "ludo123"))


}
class Autenticacion{
   private var encontrado:Boolean=false
  fun  buscar(perfil:Perfil):Boolean{
        //BUscamos
      var bd=BaseDatosFake()
      bd.obtenerUsuarios().forEach {
          if(it.email==perfil.email&&it.password==perfil.password){
              encontrado=true

          }

      }
      return encontrado
    }

    fun autenticar(perfil:Perfil){
        if(!buscar(perfil))throw  AutenticacionFallidaException("No existes en la BD")
    }
}

class AutenticacionFallidaException(mensajito:String):Exception(mensajito){

}