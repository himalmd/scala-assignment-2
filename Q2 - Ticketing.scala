object Ticketing {

	def main(args: Array[String]){

		println("Profit from Rs. 10: "+ profit(10))
		println("Profit from Rs. 15: "+ profit(15))
		println("Profit from Rs. 20: "+ profit(20))
    
	}

	def profit(n:Int):Int={
	  	return revenue(n)-cost(n);
	  }

	def cost(n:Int):Int={
	  	return 500+noAttendees(n)*3;
	  }

	def revenue(n:Int):Int={
	  	return noAttendees(n)*n;
	  }

	def noAttendees(n:Int):Int={
	  	return (120+(15-n)/5*20);
	  }
}