fun main(){
  var me = Human("Gumato",22,54)
    me.eat(10)
    println(me.weight)

    me.speak("Hello! I am a student at AkiraChix")


    var person = User("Stephen","Antony","stephenantony@gmail.com","254702345687",4353)
    println(person.firstName+" "+person.lastName)

    me.birthday()

}
class Human(var name: String, var age: Int, var weight: Int){
    fun eat(foodWeight: Int){
        println("I am eating $foodWeight kgs of food")
        weight+= foodWeight
    }
    fun speak(speech: String){
        println(speech)
    }

fun birthday(){
    println(age+1)
    
}


}
data class User(var firstName: String, var lastName: String, var email: String, var phoneNumber: String, var password: Int)

