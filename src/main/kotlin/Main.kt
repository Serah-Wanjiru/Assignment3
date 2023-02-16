fun main() {
    school()
    MYname()
    println(source("Nile"))
    Name()

}
fun school() {
    val campus = "AkiraChix"
    println(campus[0])
    println(campus[2])
    println(campus[3])
}
fun MYname() {
    val myName = "serah"
    val age = "18"
    println("Hi, my name is $myName and i am $age years old")
}
fun source(name:String):Int{
    val river = name.length
    return river
}
fun Name() {
    val name = "serah"
    if (name == "serah" ) {
        println("That's me.")
    } else {
        println("I don't know who that is")
        }

}



