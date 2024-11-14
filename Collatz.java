// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mode = args[1];
		for (int count = 1 ; count <= n ; count++ ){ //loop from 1 to n
			int i = count;
			int stepCount = 1; // inside for loop so each iteration starts its own stepcount
			if (mode.equals("v")){ //only print if mode v
				System.out.print(i + " ");
			}
			while(true) { //collatz calculation for each number up to n, while still running on the 1
			    if (i%2 != 0){ //if odd
				    i = i*3 + 1;
					if (mode.equals("v")){ //only print if mode v
				        System.out.print(i + " ");
				    }
			    } else { //if even
				    i /=2;
					if (mode.equals("v")){ //only print if mode v
				        System.out.print(i + " ");
					}
			    } 
				stepCount++;
				 if (i==1) { // stop iterating when reaching 1 (works while starting at 1)
					break;
				}
		    } if(mode.equals("v")){
				System.out.println("(" + stepCount + ")"); // print the stepcount and start a new line
			}
		} 
		System.out.println(); // print the empty space line seperating the numbers from the text
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1");
	}
}
