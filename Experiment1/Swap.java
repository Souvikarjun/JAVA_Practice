public class Swap{
	public static void main(String arg[]){
		int a = 10;
		int b = 20;
		
		int external;

		System.out.println("First variables a = " + a + ",b = " +b);

		//with external variable
		external=a;
		a=b;
		b=external;

		System.out.println("After swaping with external variables a = " + a + ",b = " +b);

		//without external variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping without external variables a = " + a + ",b = " +b);

	}
}