package Java.Basic;

public class WhileLoop {

	public static void DoWhileLoop() {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 5);
	}

	public static void Whileloop() {
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
	}

	public static void forloop() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

	public static void ForEachLoop() {
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String i : cars) {
			System.out.println(i);
		}
	}

	public static void javaBreak(){
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
			  break;
			}
			System.out.println(i);
		  }
	}

	public static void JavaContinue(){
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
			  continue;
			}
			System.out.println(i);
		  }
	}

	public static void main(String[] args) {

	}
}
