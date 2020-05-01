// run via sbt:
// > sbt module2/run
object Main extends App {
  def unitMethod() {
    println("hey")
  }
  
  val name = Hello.Name
  println(s"Hello $name")
}
