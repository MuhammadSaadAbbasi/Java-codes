package saad;


class Gen{
	Object o;
	Gen(Object o){
		this.o =o ;
		
	}
	Object getob(){
		
		return o;
	}
}

public class BeforeGenerics {
	
public static void main(String [] args) {
	Gen bgen1;
	Gen bgen2;
	Double dob = new Double(100.5);
	bgen1 =  new Gen(dob);
	double d = (double)bgen1.getob();
	
	Character cob = new Character('F');
	bgen2= new Gen(cob);
	 char c =(Character)bgen2.getClass();
	
	
	bgen1 = bgen2;
	// this will give error
}
}

