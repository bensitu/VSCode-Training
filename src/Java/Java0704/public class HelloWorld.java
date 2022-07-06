package Java0704;

class HelloWorld {
	public static void main(String[] args) {      
		//問題１
		System.out.println("Hello, world!");
		//問題２
		double a = 3.14159265;
		long b = 2200000000L;
		// 
		
		System.out.println(a + " " + b);
		//問題３
		int a1=10;
		int b1=5;
		if (a1<b1){
			System.out.println("a1<b1");
		}
		else if(a1>b1){
			System.out.println("a1>b1");
		}
		//問題４
		double a2 = 3.2222;
		int b2 = (int)a2;

		System.out.println(b2);
	}
}
