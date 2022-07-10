class int(n:Int){
    var m=n;
    def ++():Int={
        var l=m
        m=m+1
        l
    }
    def --():Int={
        var l=m
        m=m-1
        l
    }
    override def toString(): String = m.toString
    def value():Int=m.toInt
}
def ++(n:Int):Int=n+1
def --(n:Int):Int=n-1
@main
def run()={
    var a=new int(2)
    var d=new int(5)
    var c=new int(4)
    var b=3
    var (k,g)=(4.3f,4.0f) //k value has get by previous question
    println(--(b)*a.value() + c.value() * d.--())
    b-=1
    println(a.++())
    println(-2*(g-k)+c.value())
    println(c.++())
    println(++(c.value())*a.++())
}