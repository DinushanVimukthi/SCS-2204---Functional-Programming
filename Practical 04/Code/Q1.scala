@main
def run()={
    println("1. Interest for Rs.10 000 : Rs."+Interest(10000))
    println("2. Interest for Rs.100 000 : Rs."+Interest(100000))
    println("3. Interest for Rs.1 000 000 : Rs."+Interest(1000000))
    println("4. Interest for Rs.10 000 000 : Rs."+Interest(10000000))
    

}
val Interest=(deposit:Int)=> deposit match {
    case deposit if(20000>=deposit) => deposit*0.02
    case deposit if(200000>=deposit) => deposit*0.04
    case deposit if(2000000>=deposit) => deposit*0.035
    case deposit if(2000000<deposit) => deposit*0.065
}