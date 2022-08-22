@main
def run()={
    println(Sum(5))
}

def Sum(n:Int):Int=n match {
    case 0 => 0
    case n => n+Sum(n-1)
}