fun main(){
    name()
    modulus(50,3)
    stmt("winnie",20)
    hobby("swimming")

}
fun name(){
    var prog = "CodeHive"
    println(prog [4].toString() + prog[5] + prog[6] + prog[7])
}
fun modulus(a:Int,b:Int){
    var reminder = a%b
    println(reminder)
}
fun stmt(p:String,z:Int){
    var x = "Hi my name is $p"
    var y = "and i am $z years old"
    println(x+" "+y)

}
fun hobby(a:String){
    println(a.length)
}