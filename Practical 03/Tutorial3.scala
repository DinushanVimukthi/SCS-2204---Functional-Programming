import scala.math.Pi
@main
def run():Unit={
    printf("1. Area of a Disk with radius 5 : %.2f\n",AreaOfDisk(5))
    printf("2. 35 Celcius in Farenheit : %.2f\n",CelciusToFarenheit(35))
    printf("3. Volume of Sphere with radius 5 : %.2f\n",VolumeOfSphere(5))
    printf("4. Total wholesale cost for 60 copies Rs.%.2f\n",TotalWholeSaleCost(60))
    printf("5. Total Runiing Time %d min\n",TotalRuniingTime())
}
def AreaOfDisk(Radius:Double):Double=Radius*Radius*Pi
def CelciusToFarenheit(Celcius:Double):Double=Celcius*9/5+32
def VolumeOfSphere(Radius:Double):Double=4/3*Pi*Radius*Radius*Radius
def TotalWholeSaleCost(Quantity:Int):Double=Quantity match {
    case Quantity if Quantity>50 => 3*50 + (Quantity-50)*0.75 +24.95*Quantity*0.6
    case _ => Quantity*3 +24.95*Quantity*0.6
}
def TotalRuniingTime(easy:Int=8,tempo:Int=7):Int=2*easy+3*tempo+2*easy