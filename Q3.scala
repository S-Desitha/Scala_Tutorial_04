object Name {
  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    names.foreach { name =>
      val formattedName = formatNames(name)(toUpper)
      println(formattedName)
    }
  }

  def toUpper(name: String): String = {
    name.toUpperCase()
  }

  def toLower(name: String): String = {
    name.toLowerCase()
  }

  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }
}
