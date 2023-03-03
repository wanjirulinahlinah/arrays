fun main(args: Array<String>) {
    namesarrays("Wanjiku","Wambui","haman","Wan")
    cities()
    numbers()
    println(fam("Linah", "Wanjiru", "Nkirote"))

}
fun namesarrays(k:String,l:String,m:String,n:String){
    var namesarray = arrayOf(k, l, m, n)
    println(namesarray.contentToString())


 }
fun cities(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta",)
    println(cities.map { it.capitalize()})


}
fun numbers(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1] + numbers[4]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun fam(a:String, b:String, c:String):String{
    var names = arrayOf(a, b, c)
    return names.contentToString()
}
