fun main() {
  println(isLength("My name is Ali"))
    println(isUpper("amina"))
    isWord("Ali")
    isName("This is not a comment")
    println(isEven(2))
    Remainder(9,2)
    add(5,7,1,50)
}

fun isLength(name:String):Int{

   return name.length
}
fun isUpper(word:String):String{
    return word.uppercase()

}
fun isWord (w:String){
    println(w[0])
}
fun isName(word:String ) {
    println(word[5])
    println(word[6])
}
fun isEven(a:Int):Boolean {
    if (a == 0) {
        return true
    } else
       return false}
fun Remainder( b:Int,z:Int){
    println(b%z)
}
fun add(a:Int,b:Int,c:Int,d:Int){
    println(a+b+c+d)

}