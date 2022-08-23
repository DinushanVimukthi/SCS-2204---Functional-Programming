@main
def run()={
    PrintPrimeNumbersSequence(10)
}

def PrintPrimeNumbersSequence(n:Int):Unit=n match {
    case n if n==2 => println(2)
    case n if IsPrime(n) => PrintPrimeNumbersSequence(n-1);println(n)
    case _ =>PrintPrimeNumbersSequence(n-1)
}
def GCD(a:Int,b:Int):Int= b match
    case 0 => a
    case b if b>a => GCD(b,a)
    case _ => GCD(b,a%b)

def IsPrime(p:Int,n:Int=2):Boolean=n match {
    case n if n==p => true
    case n if GCD(n,p)>1 => false
    case n => IsPrime(p,n+1)
}