double getTotal(double borrow,double rate){
	return borrow * (1 + (rate / 100))
}

double getAnnualPay(double total,double years){
	return total / years
}

double calcIntYears(double totalSum,double borrowSum,double numYears){
	return ((totalSum - borrowSum) / totalSum) * numYears
}

print "Please enter the total amount borrowed for your mortgage: "
double borrowAmt = Double.parseDouble(System.console().readLine())
print "Now key in the number of years you will take to pay it back: "
double yearsToPay = Double.parseDouble(System.console().readLine())
print "What is the interest rate on your mortgage: "
double intRate = Double.parseDouble(System.console().readLine())

double totAmt = getTotal(borrowAmt,intRate)
double annualRepay = getAnnualPay(totAmt,yearsToPay)
double yearsOfInt = calcIntYears(totAmt,borrowAmt,yearsToPay)

println "The total amount to be paid on your mortgage will be " + totAmt
println "You will need to pay back the following sum every year " + annualRepay
println "After " + yearsOfInt + " years you will have paid off all the interest and only have capital payments to make"