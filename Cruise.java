class Cruise {
	static Boolean cruiseControlSet = false;
	static int speed = 0;
	static final int MAX_SPEED = 45;
	static int warningSpeed = 25;

	public static void main(String[] args) {
       
    }

	public static void toggleCruiseControl() {
        
        CruiseControlSet = !CruiseControlSet

        if(true){
            
            System.out.println("Cruise Control Disabled.");
            
            speed = 0
        }
        else {

            System.out.println("Cruise Control Enabled");
        }        

	}

	public static void accelerate() {
        
        if(CruiseControlSet&& (speed < MAX_SPEED))
            speed += 5;
	    }

        System.out.println("Accelerated 5mph");
        reportSpeed();

        if(exceeds warningSpeed) {

        alert(false);
        }
    
    }

    public static void decelerate() {

	}

	public static void reportSpeed() {

	}

	public static void alert(Boolean isDecelerating) {

	}

	public static Boolean exceedsWarningThreshold(int speed) {

	}
}