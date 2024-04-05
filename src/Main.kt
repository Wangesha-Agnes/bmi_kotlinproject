fun main(){
val bmi = BMI(1.7F,90.0F)
    bmi.calculateBmi()

}

class BMI( var height:Float, var weight:Float){
    fun calculateBmi(){
        var totalBmi= weight / (height * height)
        println(totalBmi)
        if(totalBmi <18){
            println("underweight")
        }else {
            println("Overweight")
        }
    }
}

