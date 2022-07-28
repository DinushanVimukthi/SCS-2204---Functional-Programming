class carUUID(car_Type:String)
{
    def uuid()={
        car_Type+"-"+car_Type.hashCode()
    }
}

class car(name:String,price:Double){
    var uuid=new carUUID(name).uuid()
    def getUUID()=uuid
    def Print()={
        println("a "+name +" priced at "+price)
    }
}
@main
def run()={
    var cars:Array[car]=new Array[car](5)
    cars(0)=new car("bmw 3 series",20000)
    cars(1)=new car("bmw 5 series",50000)
    cars(2)=new car("vw passat",10000)
    cars(3)=new car("vw golf",12000)
    cars(4)=new car("mazda 3",15000)
    printAllUUID(cars)
}
def printAllUUID(cars:Array[car])={
    for(car<-cars){
        println("car uuid = "+car.getUUID())
    }
}