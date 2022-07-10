var k,i,j:Int=2;
var m,n:Int=5;
var f=12.0f;
var g=4.0f;
var c='X';

@main
def run():Unit={
    q1()
    q2()
    q3()
    q4()
    q5()
    // q6()
}
// def ++(n:Int):Int=n+1
def q1():Unit=println(k+12*m);
def q2():Unit=println(m/j);
def q3():Unit=println(n%j);
def q4():Unit=println(m/j*j);
def q5():Unit=println(f+10*5+g);
// def q6():Unit=println(++(i)*n);
//++ Operator is not work in Scala and
// ++ is valid method


