package operator;

public class Main06 {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int x = 5;
		int y = 3;
		
		
		boolean result1 = a != b || a == b; // T || F : T
		boolean result2 = a < b || x > y; // T || T : T
		boolean result3 = a < b || x < y; // T || F : T
		boolean result4 = a > b || x > y; // F || T : T
		boolean result5 = a > b || x < y; // F || F : F
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		boolean result6 = a > b ^ x < y; // F ^ F : F
		boolean result7 = a < b ^ x > y; // T ^ T : F
		boolean result8 = a < b ^ x < y; // T ^ F : T
		boolean result9 = a > b ^ x > y; // F ^ T : T

		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		System.out.println(result9);
		
		System.out.println("---------------");
		
		boolean r1 = a >= b; // F
		boolean r2 = x >= y; // T
		boolean result10 = r1 && r2;
		boolean result11 = r1 || r2;
		
		System.out.println(result10);
		System.out.println(result11);
		System.out.println("---------------");
		
		boolean success = true;
		boolean fail = !success; // fail = false
		System.out.println(fail);
	}

}
