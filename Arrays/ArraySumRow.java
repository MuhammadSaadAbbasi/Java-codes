package saad;
import java.util.*;

public class ArraySumRow {
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[][] arr = new int[5][5];
	int sum=0;
	
	for(int i =0  ; i < 5 ;i++) {
		for(int j = 0 ; j < 5 ;j++) {
			arr[i][j]=scan.nextInt();
		}
	}
	for(int i =0  ; i < 5 ;i++) {
		for(int j = 0 ; j < 5 ;j++) {
			sum+=arr[i][j];
		}
		System.out.println("Sum of Row"+ (i+1) +" = " + sum );
		sum=0;
	}
	
 }
}
