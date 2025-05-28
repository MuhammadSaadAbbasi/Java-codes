package saad;
public class Student {
	private int rollNo;
	private String name;
	
	Student(int rollNo ,String name){
		
		this.rollNo=rollNo;
		this.name=name; 
}
	public String toString() {
		
	return "roll No : "+rollNo +"\tName :" + name; 
	}

}
