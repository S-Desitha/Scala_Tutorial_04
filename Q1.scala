object DepositToInterest {
  def interest(deposit: Int): Double = 
  {
    if (deposit<=20000)
    {
      val intst=deposit*0.02
      return intst 
    }
    else if (deposit<=200000)
    {
      val intst=deposit*0.04
      return intst 
    }
    else if (deposit<=2000000)
    {
      val intst=deposit*0.035
      return intst 
    }
    else 
    {
        val intst=deposit*0.065
        return intst
    }
  }

  def main(args: Array[String]): Unit = 
  {
    val deposit=50000.5
    val totalInterest = interest(deposit)
    println("Total Interest is " + totalInterest) 
  }
}
