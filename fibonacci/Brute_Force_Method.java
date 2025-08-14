package fibonacci;

public class Brute_Force_Method {
	public static int fib(int data) {
		if(data<=1) return data;
		else return fib(data-2)-fib(data-1);
	}
	public static void main(String[] args) {
		System.out.println(fib(5));
	}

}
