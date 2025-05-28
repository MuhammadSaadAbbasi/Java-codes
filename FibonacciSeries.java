
import java.util.Scanner;
public class FibonacciSeries {
	
	public static void main(String[] args) {
		Scanner mynum = new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int n = mynum.nextInt();
		int  term1 = 0 , term2 = 1 ;
		for(int i = 0; i <= n ; i++) {
			
			System.out.print(term1 + " , "  );
			
			int lastterm = term1 + term2;
			term1 = term2;
			term2 = lastterm;
	        mynum.close();		}
		
	}

}
