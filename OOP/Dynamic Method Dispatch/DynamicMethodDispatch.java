package saad;


abstract class  Quadilateral{
	double s1, s2 , s3 ,s4;
	
	Quadilateral(double s1, double s2 ,double s3 ,double s4){
		this.s1 =s1;
		this.s2 =s2;
		this.s3 =s3;
		this.s4 =s4;
		
	}
	public abstract double computeArea(); 
}

class Square extends Quadilateral{
	
	Square(double side){
		super(side,side,side,side);
	}
	public double computeArea(){
		return s1*s2;
	}
	
}
class Rectangle extends Quadilateral{

	Rectangle(double side1 , double side2){
		super(side1,side2,side1,side2);
	}
	public double computeArea(){
		return s1*s2;
	}
	
}

public class DynamicMethodDispatch {
	
	public static void main(String [] args) {
	Quadilateral refVar;
	Square Sq1= new Square(4);
	Rectangle rec1 = new Rectangle(5,4);
	
	refVar =Sq1;
	System.out.println(refVar.computeArea());
	
	Quadilateral q1 = new Square(4);
	q1.computeArea();
	
	refVar =rec1;
	System.out.println(refVar.computeArea());
	}
}
