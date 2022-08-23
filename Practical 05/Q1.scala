@main
def run()={
    println(Prime(5))
    println(Prime(8))
}

def GCD(a:Int,b:Int):Int= b match
    case 0 => a
    case b if b>a => GCD(b,a)
    case _ => GCD(b,a%b)

def Prime(p:Int,n:Int=2):Boolean=n match {
    case n if n==p => true
    case n if GCD(n,p)>1 => false
    case n => Prime(p,n+1)
}

