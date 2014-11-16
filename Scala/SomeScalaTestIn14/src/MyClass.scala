class MyClass private (var someInt: Int, var someBool: Boolean) {
  object MyClass {
    def apply() = {
      MyClass(0,true)
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    var myObjectClass = new MyClass()
  }
}