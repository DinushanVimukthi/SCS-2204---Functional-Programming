var (a,b,c,d)=(2,3,4,5)
var k:Float=4.3f;

@main
def run():Unit={
    q1()
    q2()
    a=Inc(a)
    // q3()
    q4()
    c=Inc(c)
    q5()
}
def Inc(n:Int):Int=n+1
def --(n:Int):Int=n-1
def q1():Unit=println(--(b)*a +c*d); 
//d-- is not a valid operator in scala. 
//But since this is postfix decrement it won't affect to answer
def q2():Unit=println(a);
//a++ is not an valid operator in scala. 
//But But since this is postfix decrement it won't affect to answer
// def q3():Unit=println(-2+(g-k)+c);
def q4():Unit=println(Inc(c)); //c++ is not a valid operator
def q5():Unit=println(Inc(c)*a);
//++,-- Operator is not work in Scala and
// ++,-- is valid method


