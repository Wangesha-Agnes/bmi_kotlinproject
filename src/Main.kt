fun main(){
val bmi = BMI(1.7F,50.0F)
    BMI

}

class BMI( var height:Float, var weight:Float){
    fun calculateBmi(){
        var totalBmi= weight / (height * height)
        println(totalBmi)
    }
    fun checkBMI(){

    }
}