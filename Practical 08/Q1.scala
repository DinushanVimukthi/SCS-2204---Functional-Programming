case class Point(x: Int, y: Int)
{
    def add(p: Point) = Point(x + p.x, y + p.y)
    def move(dx: Int, dy: Int) = Point(x + dx, y + dy)
    def distance(p: Point) = math.sqrt(math.pow(x - p.x, 2) + math.pow(y - p.y, 2))
    def invert() = Point(y, x)
}

@main
def main() ={
    val p1 = Point(1, 2)
    val p2 = Point(3, 4)
    println(p1.add(p2))
    val p3=p1.move(2, 3)
    println(p3)
    println(p3.distance(p2))
    println(p3.invert())
}