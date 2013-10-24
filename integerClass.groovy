class Integer2 {
	int value;

	int getValue(){
		 //returns the value of this number as an int, a getter.
		 return value
	}
	void setValue(int x){
		//a setter.
		value = x
	}
	
	boolean	isEven(){
		//returns true if the number is even, false otherwise.
		if(value % 2 == 0){
			return true
		} else {
			return false
		}
	}
	
	boolean isOdd(){
		//returns true if the number is odd, false otherwise.
		if(value % 2 == 0){
			return false
			} else {
			return true
		}
	}
	
	void prettyPrint(){
	//prints the value of the integer on the screen.
		print value
	}
	
	String toString(){
	//returns a String equivalent to the number.
		String result = value + ''
		return result
	}
}

Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine(); 
int i = Integer.parseInt(str); 
i2.setValue(i);
print "The number you entered is "
if (i2.isEven()) {
	println "even.";
} else if (i2.isOdd()) {
    println "odd.";
} else {
println "undefined!! Your code is buggy!"; 
}
int parsedInt = Integer.parseInt(i2.toString()); 
if (parsedInt == i2.getValue()) {
println("Your toString() method seems to work fine."); 
}