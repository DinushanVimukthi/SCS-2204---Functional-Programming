@main
def run()={
    println(formatNames("benny",toUpper))
    println(formatNames("Niroshan",nochange))
    println(formatNames("Saman",toLower))
    println(formatNames("Kumara",LastLetterUpper))
}

def toUpper(s:String)=s.toUpperCase()
def toLower(s:String)=s.toLowerCase()
def nochange(s:String)=s
def LastLetterUpper(s:String)=s.take(s.length-1)+s.takeRight(1).toUpperCase()
def formatNames(name:String,f:String=>String)=f(name)