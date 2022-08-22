@main
def run()={
    println(Prime(5))
    println(Prime(8))
}


def Prime(n:Int,i:Int=2):Boolean= n match{
    case n if n<=1 => false
    case n if n==2 => true
    case n if n%i==0 => false
    case n if i*i>n => true
    case _ => Prime(n,i+1)
}

