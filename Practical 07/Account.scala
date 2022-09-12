class Bank(Acc:List[Account]){
    var Accounts:List[Account]=Acc
    def NegativeBalance():List[Account]=Accounts.filter(x=>x.Money<0)
    def TotalBalance():Double=Accounts.map(x=>x.Money).sum
    def ApplyInterest()=Accounts.map(x=>x.Interest(x))
    def PrintAccounts()=Accounts.foreach(x=>println("Account : "+ x.Money))
}


class Account(amount:Double){
    var Money = amount
    def setMoney(amount:Double)=Money=amount
    def transfer(target:Account, n:Int) = {
        this.Money = this.Money - n
        target.Money = target.Money + n
    }
    override def toString(): String = "$" + Money
    def Interest(x:Account):Account={
        if(x.Money>0){
            x.setMoney(x.Money*1.05)
        }
        else if(x.Money<0){
            x.setMoney(x.Money*0.9)
        }
        x
    }

}

@main
def run()={
    val a = new Account(100)
    val b = new Account(200)
    // println("Money in Account A "+a)
    // println("Money in Account B "+b)
    // a.transfer(b, 50)
    // println("After Transfer-")
    // println("Money in Account A "+a)
    // println("Money in Account B "+b)
    val c = new Account(300)
    val d = new Account(-200)
    val e = new Account(-300)
    val bank= new Bank(List(a,b,c,d,e))
    println("Initial Accounts")
    bank.PrintAccounts()
    println("Negative Balance Accounts "+bank.NegativeBalance())
    println("Total Balance "+bank.TotalBalance())
    println("After Interest")
    bank.ApplyInterest()
    println("Negative Balance Accounts "+bank.NegativeBalance())
    println("All Accounts")
    bank.PrintAccounts()
    println("Total Balance "+bank.TotalBalance())
}