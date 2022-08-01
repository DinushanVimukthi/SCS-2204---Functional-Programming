case class ShoppingCart(name:String,price:Double,quantity:Int){   
    def Display():Unit=println(quantity +" "+name+" ar Rs."+price +" each")
    def GetName():String=name
}
@main
def run()={
    var carts:Array[ShoppingCart]=new Array[ShoppingCart](3)
    carts(0)=ShoppingCart("vanilla ice cream",3.99,13)
    carts(1)=ShoppingCart("chocolate biscuits",4,6)
    carts(2)=ShoppingCart("cupcakes",7.77,7)
    ViewAll(carts)
    Filter(carts)
}
val ViewAll=(carts:Array[ShoppingCart])=>{
    for(i<-carts)
    {
        i.Display()
    }
}

val Filter=(carts:Array[ShoppingCart])=>{
    for(i<-carts)
    {
        IsVanilla(i)
    }
}

val IsVanilla=(cart:ShoppingCart)=>cart match{
    case cart if(cart.GetName()=="vanilla ice cream")=>println("Vanilla Ice Cream!")
    case _ => println("Found Another Item")
}

