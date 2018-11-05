object tuple{
    def main(args: Array[String]): Unit = {

        val tuple = ("Gouri", 1)
        println(tuple)
        println("Tuple")
        println(tuple.getClass)
        val things = ("a", 1, 3.5)
        println(things._2)
        def getUserInfo = ("Al", 42, 200.0)
        val aa = getUserInfo
        val bb = getUserInfo
        println(bb)
        bb.productIterator.foreach(println)

        val map = (1->"@",2->"e")
        println(map)
    }
}