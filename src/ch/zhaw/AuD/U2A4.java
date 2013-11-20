package ch.zhaw.AuD;

public class U2A4 {
	public static void main(String[] args) {
		int max = 4000000;
		int a = 1;
		int b = 0;
		int c;
		System.out.println("0");
		while (a < max) {
			if (a % 2 == 0)
				System.out.println(a);
			c = a + b;
			b = a;
			a = c;
		}
	}
}
