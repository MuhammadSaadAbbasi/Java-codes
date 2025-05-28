package saad;

public class dynamicArray {
private int count = 0;
private int size = 0;
private int[] arr;

dynamicArray(int size){
   this.size = size;
   arr = new int[size];
}
void display(){      //update modify the value index
	                   //and the value
	//delete the value
	for(int a : arr) {
		System.out.println(a);
	}
	
}

void isFull() {
	if(size==count) {
		System.out.println("Your Array is full");
		arr = makeDynamic();
	}
}

int[] makeDynamic() {
	int origsize=size;
    size=size*2;
    int [] dummy = new int [size];
    for(int i = 0 ; i < origsize ; i++) {
    	dummy[i] =arr[i];
    }
    return dummy;
}
void addVal(int val) {
isFull();
arr[count]=val;
count++;
}
void update(int index ,int value) {
	for(int i =0 ; i <arr.length;i++) {
	  if(index==i) {
		  arr[index]=value;
	  }
	}
	
}

int[] delete(int index) {
	int [] temp;
	for(int i =0 ; i <arr.length;i++) {
		if(index==i) {
			size--;
		}
	}
	temp = new int [size];
	for(int i =0, j = 0 ; i <arr.length;i++) {
		
		if(index==i) {
			continue;
		}		
		temp[j]=arr[i];
		j++;
		}
	
	return temp;
}
public static void main (String[] args) {
	
	dynamicArray dA = new dynamicArray(4);
	dA.addVal(1);
	dA.addVal(2);
	dA.addVal(3);
	dA.addVal(4);
	dA.display();
	int [] arr = dA.delete(2);
	for(int i : arr) {
		System.out.println(i);
	}
	//=====================temp = dummy=================================
			 }
}
