package deee;

public class hum2 {

	public static void main(String[] args) {
	Eat(5);
		
		
	}
	
	public static  void Eat( int num) {
		if(num==0) {
			System.out.println("Done");
		}else {
			System.out.println("Hello");
			num--;
			Eat(num);
		}
		
		
	}
//need  a base case
}
