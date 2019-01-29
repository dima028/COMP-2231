import java.util.Arrays;

public class ShellSort {

	public void sort(int[] intArr, int arrayLength) {
	    System.out.print("Organising Array: ");
		int gaplength = arrayLength / 2;
		while(gaplength > 0) {
			boolean swapflag = true;
			while(swapflag == true) {
				swapflag = false;
				for(int s = 0; s < arrayLength - gaplength; s++) {
					if(intArr[s] > intArr[s+gaplength]) {
						swapflag = true;
			            int temp = intArr[s]; //hold
			            intArr[s] = intArr[s+gaplength];
			            intArr[s+gaplength] = temp;
					}
				}
			}
			gaplength = gaplength / 2;
		    System.out.println(Arrays.toString(intArr));
		}
	}
	    
}