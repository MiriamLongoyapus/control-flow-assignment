fun main() {
    numbers()
    println(arrayname(arrayOf("Miriam","Mary","Manu","Mumbi")) )
   num(6)
    num(14)
    num(18)
    Buzz()
}
fun numbers(){
    for (nums in 1..100){
        if (nums%2 !=0){
            println(nums)
        }
    }
}
fun arrayname(word: Array<String>):Int {
    var count = 0
    for (x in word) {
        if (x.length>5){
            count++
        }

    }
    return count
}
fun num(age: Int){
    if (age in 0..6){
        println("serve a glass of milk")
    }else if (age in 7..14){
        println("serve a bottle of fanta orange")
    }else{
        println("get a bottle of coca cola")
    }
}
fun Buzz(){
    for (nums in 1..100){
        if (nums %3==0 && nums %5==0){
            println("FizzBuzz")
        }else if (nums %3==0){
            println("Fizz")
        }else if (nums %5==0){
            println("Buzz")
        }
    }

}


