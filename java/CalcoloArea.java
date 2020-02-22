package myPackage;
	
import java.util.Scanner;

public class CalcoloArea {

	public static void main(String args[]) {   
			      
		Scanner readInput = new Scanner(System.in);
		
		int base = 0;
		int altezza = 0;

		System.out.println("Base del triangolo:");
		base = readInput.nextInt();
     
		System.out.println("Altezza del triangolo:");
        altezza = readInput.nextInt();
        readInput.close();
 
        Triangolo myTriangle = new Triangolo(base, altezza);
      	System.out.println("L'area è " + myTriangle.area());
	}
}