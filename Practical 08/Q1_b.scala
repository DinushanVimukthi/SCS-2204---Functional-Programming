//(Using Traits)


trait operator{
    def +(p:Point):Point
    def distance(p:Point):Double
    def move(dx:Int,dy:Int):Point
    def invert():Point
}



case class Point(x: Int, y: Int) extends operator
{
    override def +(p: Point) = Point(x + p.x, y + p.y)
    override def move(dx: Int, dy: Int) = Point(x + dx, y + dy)
    override def distance(p: Point) = math.sqrt(math.pow(x - p.x, 2) + math.pow(y - p.y, 2))
    override def invert() = Point(y, x)
}

@main
def main() ={
    val p1 = Point(1, 2)
    val p2 = Point(3, 4)
    println(p1.+(p2))
    val p3=p1.move(2, 3)
    println(p3)
    println(p3.distance(p2))
    println(p3.invert())
}