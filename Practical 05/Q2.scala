@main
def run()={
    PrintPrimeNumbersSequence(10)
}

def PrintPrimeNumbersSequence(n:Int):Unit=n match {
    case n if n==2 => println(2)
    case n if IsPrime(n) => PrintPrimeNumbersSequence(n-1);println(n)
    case _ =>PrintPrimeNumbersSequence(n-1)
}
def IsPrime(n:Int,i:Int=2):Boolean= n match{
    case n if n<=1 => false
    case n if n==2 => true
    case n if n%i==0 => false
    case n if i*i>n => true
    case _ => IsPrime(n,i+1)
}