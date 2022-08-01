@main
def run()={
    println(PatternMatching(-1))
    println(PatternMatching(0))
    println(PatternMatching(1))
    println(PatternMatching(2))
}

def PatternMatching(x:Int):String=x match{
    case x if(x<=0) => "zero/negative is given"
    case x if(x%2==0)=> "even is given"
    case _ => "odd is given"
}