//Q1 & Q2
class RationalNumbers(x:Int,y:Int=1){
    def numerator=x
    def denominator=y
    def neg=RationalNumbers(-this.numerator,this.denominator)
    def sub=(r:RationalNumbers)=>new RationalNumbers(this.numerator*r.denominator-this.denominator*r.numerator,this.denominator*r.denominator)
    override def toString=this.denominator match{
        case 1=>this.numerator.toString
        case _=>this.numerator+"/"+this.denominator
    }

}

@main
def run()={
    val x=RationalNumbers(3,4)
    val y=RationalNumbers(5,1)
    val result1=x.neg
    val result2=y.neg
    val result3=y.sub(x) //y-x
    println(result1)
    println(result2)
    println(result3)
}