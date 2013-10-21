int binary2decimal(String s){
	int result = 0
	for(i=0;i<s.length();i++){
		if(s.charAt(i) == '1'){
			result = result + Math.pow(2,s.length()-(i+1))	
		} 
	}
	return result
}

String decimal2binary(int x){
	boolean finished = false
	String str = "", result = ""
	int remain = x
	while(!finished){
		if(remain > 0){
			str = str + remain%2
			remain = remain / 2
		} else {
			finished = true
		}
	}
	for(i=0;i<str.length();i++){
		result = result + str.charAt(str.length()-(i+1))
	}
	return result	
}

println "Please choose what operation you would like:"
println "1 - Convert a Binary number to a Decimal number"
println "2 - Convert a Decimal number to a Binary number"
print ">> "
int option = Integer.parseInt(System.console().readLine())
switch(option){
	case 1: print "please key in a binary number: "
		int dec = binary2decimal(System.console().readLine())
		println "The equivalent decimal number is " + dec
		break;
	case 2: print "please key in a decimal number: "
		String bin = decimal2binary(Integer.parseInt(System.console().readLine()))
		println "The equivalent binary number is " + bin
		break;
	default: println "Invalid Option"
}