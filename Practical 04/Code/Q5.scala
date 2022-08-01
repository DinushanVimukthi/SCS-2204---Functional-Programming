@main
def run()={
    println(formatNames("Benny",toUpper))
    // println("N"+formatNames("i",toUpper)+"roshan")
    println(formatNames("Niroshan",SecondLetterUpper))
    println(formatNames("Saman",toLower))
    println(formatNames("Kumara",LastLetterUpper))
}

def toUpper(s:String):String=s.toUpperCase()
def toLower(s:String):String=s.toLowerCase()
def SecondLetterUpper(s:String):String=s.take(2).toUpperCase()+s.drop(2)
def LastLetterUpper(s:String):String=s.take(s.length-1)+s.takeRight(1).toUpperCase()
def formatNames(name:String,f:String=>String)=f(name)