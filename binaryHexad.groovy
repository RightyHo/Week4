int hexa2decimal(String s){
	int result = 0
	for(i=0;i<s.length();i++){
			if(s.charAt(i) == 'a'){
				result = result + 10 * Math.pow(16,s.length()-(i+1))	
			} else if(s.charAt(i) == 'b'){
				result = result + 11 * Math.pow(16,s.length()-(i+1))	 
			} else if(s.charAt(i) == 'c'){
				result = result + 12 * Math.pow(16,s.length()-(i+1))	 
			} else if(s.charAt(i) == 'd'){
				result = result + 13 * Math.pow(16,s.length()-(i+1))	 
			} else if(s.charAt(i) == 'e'){
				result = result + 14 * Math.pow(16,s.length()-(i+1))	 
			} else if(s.charAt(i) == 'f'){
				result = result + 15 * Math.pow(16,s.length()-(i+1))	 
			} else {
				int x = Integer.parseInt(s.substring(i,i+1))
				result = result + x * Math.pow(16,s.length()-(i+1))	
			} 
	}
	return result
}

String dec2hexadecimal(int x){
	boolean finished = false
	String str = ""
	int remain = x
	while(!finished){
		if(remain > 0){
			if(remain%16 == 15){
				str = str + 'f'
				remain = remain / 16
			} else if(remain%16 == 14){
				str = str + 'e'
				remain = remain / 16
			} else if(remain%16 == 13){
				str = str + 'd'
				remain = remain / 16
			} else if(remain%16 == 12){
				str = str + 'c'
				remain = remain / 16
			} else if(remain%16 == 11){
				str = str + 'b'
				remain = remain / 16
			} else if(remain%16 == 10){
				str = str + 'a'
				remain = remain / 16
			} else {
			str = str + remain%16
			remain = remain / 16
			}
		} else {
			finished = true
		}
	}
	//reverse the string
	String result = "0x"
	for(i=0;i<str.length();i++){
		result = result + str.charAt(str.length()-(i+1))
	}
	return result	
}

print "Please key in a decimal or hexadecimal number: "
String str = System.console().readLine()

if(str.substring(0,2) == "0x"){
	int deci = hexa2decimal(str.substring(2))
	println "The equivalent decimal number is " + deci
} else {
	String hexadec = dec2hexadecimal(Integer.parseInt(str))
	println "The equivalent hexadecimal number is " + hexadec
}