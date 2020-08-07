fun main(){
    println("Solucion")

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


class BaseDatosFake{

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
        if(!buscar(perfil))throw  MiExcepcion("Tienes un erro de autenticacion")
    }
}

class MiExcepcion(mensajito:String):Exception(mensajito){

}