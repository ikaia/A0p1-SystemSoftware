import java.util.Scanner;

public class A0p1 {
	
Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For-loop Hello 14 times
		for (int i = 1; i <= 14; i++) {
			String name = "hello";
			//For-loop add spaces as 1 every times Hello repeat
			for (int k = 1; k <= i; k++) {
			name = name + " ";
			
		   
		}
			
			name += "world";
			//Every other statement has a period.
			if (i%2 == 0) {
				name= name + ".";
			}
			else {
				//No period.
			}
			System.out.println(name);
		}
	}
	
}
		

	
