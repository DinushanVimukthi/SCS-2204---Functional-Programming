@main
def run()={
    println(EvenOrOdd(302))
}
def EvenOrOdd(n:Int)=n match{
    case n if IsEven(n)=>"Even"
    case _=>"Odd"
}

def IsEven(n:Int):Boolean= n match{
  case n if n<2 => n %2 == 0 
  case _ => IsEven(n-2)
}