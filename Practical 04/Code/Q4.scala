@main
def run()={
    println(PatternMatching(-1))
    println(PatternMatching(0))
    println(PatternMatching(1))
    println(PatternMatching(2))
}

def PatternMatching(x:Int):String=x match{
    case 0 => "zero"
    case x if(x<0) => "negative"
    case x if(x%2==0)=> "even"
    case _ => "odd"
}