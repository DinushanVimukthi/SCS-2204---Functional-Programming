@main
def run()={
    FBS(10)
}

def fibonacci(n: Int): Int =n match
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(n-1) + fibonacci(n-2)


def FBS(n:Int):Unit=n match{
    case n if n<0 => println()
    case _ => {
        FBS(n-1)
        print(fibonacci(n) + ", ")
    }
}