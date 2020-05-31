object XYZ{
  def main(args: Array[String])={
    printf("Take-Home Salary : Rs. "+finalSalary(40,20))
  }

  def wage(hours:Int):Int={
    return hours*150;
  }

  def ot(hours:Int):Int={
    return hours*75;
  }

  def income(wage:Int,ot:Int):Int={
    return wage+ot;
  }

  def tax(income:Int):Double={
    return income*0.1;
  }

  def finalSalary(wHours:Int,otHours:Int):Double={
    var finalSalary=income(wage(wHours),ot(otHours))-tax(income(wage(wHours),ot(otHours)))
    return finalSalary;
  }
}



