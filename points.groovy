class Point {

	double x;

	double y;

	

	double distanceTo(Point pt){

		//calculates the distance to another point.	

		double xDist = Math.abs(pt.x - x)

		double yDist = Math.abs(pt.y - y)

		return Math.sqrt(Math.pow(xDist,2) + Math.pow(yDist,2))

	}



	double distanceToOrigin(){

		//calculates the distance to the origin. Implement it by calling the first method.

		Point origin = new Point()

		origin.x = 0.0

		origin.y = 0.0

		return distanceTo(origin)

	}

	



	void moveTo(double x, double y){

		//changes the coordinates of this point to be the given parameters x and y.

		this.x = x

		this.y = y	

	}



	void moveTo(Point newSpot){

		//changes the coordinates of this point to move where the given point is.

		x = newSpot.x

		y = newSpot.y

	}



	Point clone(){

	//returns a copy of the current point with the same coordinates.

		Point copy = new Point()

		copy.x = x

		copy.y = y

		return copy

	}	



	Point opposite(){

		//returns a copy of the current point with the coordinates multiplied by −1.

		Point opp = new Point()

		opp.x = x * -1

		opp.y = y * -1
		
		return opp

	}

}



//Start of main program

boolean running = true
Point myPoint = new Point()
myPoint.x = 0
myPoint.y = 0

while(running){

	println "What would you like to do?"
	println "1 - Calculate the distance from where your point is to where another point lies."
	println "2 - Calculate the distance of your point from the origin."
	println "3 - Move your point to another location."
	println "4 - Make a copy of your current location."
	println "5 - Find the opposite location of your point."
	println "0 - Exit."

	int option = Integer.parseInt(System.console().readLine())
	switch(option){
	case 0:	running = false
			break;
	case 1:	Point distPt = new Point()
			print "What is the x coordinate for the location you want to compare to your current point?: "
			distPt.x = Integer.parseInt(System.console().readLine())
			print "Now key in the y coordinate for the location you want to compare to your current point: "
			distPt.y = Integer.parseInt(System.console().readLine())
			println "The distance to this new location from your current point is " + myPoint.distanceTo(distPt)
			break;
	case 2: println "The distance of your point to the origin is " + myPoint.distanceToOrigin()
			break;
	case 3: Point movePt = new Point()
			println "What is the x coordinate for the location you want to move to?: "
			movePt.x = Integer.parseInt(System.console().readLine())
			print "Now key in the y coordinate for the location you want to move to: "
			movePt.y = Integer.parseInt(System.console().readLine())
			println "Would you like to move using the (P)oint or the two individual (C)oordinates?: "
			print "Key in P or C for your choice: "
			String choice = System.console().readLine()
			switch(choice){
			case "P":	myPoint.moveTo(movePt)
						break;
			case "C":	myPoint.moveTo(movePt.x, movePt.y)
						break;
			default:	println "Invalid option.  Please try again."			
			}
			break;
	case 4: Point clonePt = myPoint.clone()
			println "You have made a clone of your current point"
			println "Coordinates of the new point are clonePt.x: " + clonePt.x + " and clonePt.y: " + clonePt.y
			break;
	case 5: Point oppPt = myPoint.opposite()
			println "The opposite point to your current location is"
			println "x coordinate: " + oppPt.x + " y coordinate: " + oppPt.y 
			break;
	default:	println "Invalid option.  Please try again."
	}
}



