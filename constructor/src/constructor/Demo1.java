package constructor;

public class Demo1 {
		int value1;
		int value2;

		

		/*Demo(){
		value1 = 10;
		value2 = 20;
		System.out.println("Inside 1st Constructor");
		}*/
		Demo1(int a){
		value1 = a;
		System.out.println("Inside 2nd Constructor");
		}
		Demo1(int a,int b){
		value1 = a;
		value2 = b;
		System.out.println("Inside 3rd Constructor");
		}
		public void display(){
		System.out.println("Value1 === "+value1);
		System.out.println("Value2 === "+value2);
		}
		public static void main(String args[]){
		Demo d1 = new Demo();
		Demo1 d2 = new Demo1(30);
		Demo1 d3 = new Demo1(30,40);
		d1.display();
		d2.display();
		d3.display();
		}
}
