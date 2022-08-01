case class carUUID(car_Type:String)
{
    def uuid()={
        car_Type+"-"+car_Type.hashCode()
    }
}

case class car(name:String,price:Double){
    val uuid:carUUID=carUUID(name)
    def getUUID()=uuid.uuid()
    def Print()=println("a "+name +" priced at "+price)
}
@main
def run()={
    val cars:Array[car]=new Array[car](5)
    cars(0)=car("bmw 3 series",20000)
    cars(1)=car("bmw 5 series",50000)
    cars(2)=car("vw passat",10000)
    cars(3)=car("vw golf",12000)
    cars(4)=car("mazda 3",15000)
    printAllUUID(cars)
}
def printAllUUID(cars:Array[car])={
    for(car<-cars){
        println("car uuid = "+car.getUUID())
    }
}