import scala.io.StdIn.readInt
@main
def Run():Unit={
    println("Enter the Normal Hours")
    val Normal_Hours=readInt();
    println("Enter the OT Hours")
    val OT_Hours=readInt();
    val pureSalary= PureSalary(Normal_Hours,OT_Hours)
    val tax=Tax(Normal_Hours,OT_Hours)
    println(Salary(pureSalary,tax));
}
def PureSalary(Normal_Hours:Int,OTHours:Int):Int = {250*Normal_Hours + 85*OTHours}
def Tax(NormalHrs:Int,OTHrs:Int):Float=if(NormalHrs>=40 && OTHrs>=30) 0.12 else 0
def Salary(PureSalary:Int,Tax:Float):Float={PureSalary-PureSalary*Tax}
