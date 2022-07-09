@main
def run()={
   prg(5)
   prg(10)
   prg(15)
   prg(20)
}
def prg(tp:Int)= println(profit(revenue(tp),cost(tp)))
def profit(revenue:Int,cost:Int)=revenue-cost
def cost(tp:Int):Int={500+3*attend(tp)}
def revenue(tp:Int)=attend(tp)*tp
def attend(tp:Int):Int={
    if(tp==15)
        120
    else if(tp>15)
        120+((tp-15)/5)*20
    else if(tp<15)
        120-((15-tp)/5)*20
    else
        0
}