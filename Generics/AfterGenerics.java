package saad;


class AfterGen <T>{
	T o;
	AfterGen(T o){
		this.o =o ;
		
	}
	T getob(){
		return o;
	}
}

public class AfterGenerics {
	
public static void main(String [] args) {

	Double dob = new Double(100.5);
	AfterGen<Double> agen1 = new AfterGen<Double>(dob);
	double d = agen1.getob();
	
	
	Character cob = new Character('a');
	AfterGen<Character> agen2 = new AfterGen<Character>(cob);
	char c = agen2.getob();
	
	
	
	agen1 = agen2;
	//This is showing error ecen bedore executing
}
}
