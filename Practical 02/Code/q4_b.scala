@main
def run():Unit=printf("Best Price iis Rs.%d",bestPrice(5))
def bestPrice(tp:Int):Int=if(profit(tp)>profit(tp+5)) tp else bestPrice(tp+5)
def profit(tp:Int):Int=revenue(tp)-cost(tp)
def cost(tp:Int):Int=(500+3*attend(tp))
def revenue(tp:Int):Int=attend(tp)*tp
def attend(tp:Int):Int=(120+(15-tp)*4)