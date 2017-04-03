import java.io.*;
import java.util.*;
class Fibon {
	public static void print(int a[]) {
		int i;
		for(i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
	public static void calculate(int n) {
		int a[] = new int[n];
		int i;
		a[0] = a[1] = 1;
		for(i = 2; i < n; i++)
			a[i] = a[i - 1] + a[i - 2];
		print(a);
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		calculate(n);
	}
}