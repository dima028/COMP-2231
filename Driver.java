import java.util.Arrays;
import java.util.Scanner;

public class Driver {
	
	static int arrayLength;
	static int intArr[];
	public static void main(String args[]){
		Scanner intreader = new Scanner(System.in);

        System.out.print("Enter an integer followed by <enter>: ");
        arrayLength = intreader.nextInt();
        
        intreader.close();
        
        intArr = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            intArr[i] = (int)(Math.random()*20);
        }
        
	    System.out.println(Arrays.toString(intArr));
	    
	    ShellSort shellinst = new ShellSort();
	    shellinst.sort(intArr, arrayLength);
	}
}
