package saad;

public class StaticClass {
	static int x;
	StaticClass(){
		x++;
	}
public static void main(String [] args) {
	System.out.println(x);
	StaticClass c1=new StaticClass();
	StaticClass c2=new StaticClass();
	StaticClass c3=new StaticClass();
	StaticClass c4=new StaticClass();
	System.out.println(x);
}
}
