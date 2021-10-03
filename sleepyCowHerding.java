import java.util.*;

public class sleepyCowHerding {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d;
		
		if (a > b) {
			d = a;
			a = b;
			b = d;
		} if (b > c) {
			d = b;
			b = c;
			c = d;
		} if (a > b) {
			d = a;
			a = b;
			b = d;
		}
		
		if (c == a+2) {
			System.out.println("0\n");
		}	else if (b == a+2 || c==b+2) {
			System.out.println("1\n");
		}	else {
			System.out.println("2\n");
		}
		System.out.println(Math.max(b-a, c-b) - 1 + "\n");
		
	}

}
