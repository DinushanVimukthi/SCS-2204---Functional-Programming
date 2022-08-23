@main
def run()={
    println(SumofEven(6))
}

def IsEven(n:Int):Boolean= n match{
  case n if n<2 => n %2 == 0 
  case _ => IsEven(n-2)
}

def SumofEven(n:Int):Int=n match {
    case 0 => 0
    case n if IsEven(n) => n + SumofEven(n-1)
    case _ => SumofEven(n-1)
}