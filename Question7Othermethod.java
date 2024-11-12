package assignment2;

public class Question7Othermethod {
	public static void main(String[] args) {
		int a=1, b=2;
		
		System.out.println("a \tb \tpow(a, b)");
		System.out.println(a +"\t"+ b+"\t" + (int)Math.pow(a, b));
		a=++a; b=++b;
		System.out.println(a +"\t"+ b+"\t" + (int)Math.pow(a, b));
		a=++a; b=++b;
		System.out.println(a +"\t"+ b+"\t" + (int)Math.pow(a, b));
		a=++a; b=++b;
		System.out.println(a +"\t"+ b+"\t" + (int)Math.pow(a, b));
		a=++a; b=++b;
		System.out.println(a +"\t"+ b+"\t" + (int)Math.pow(a, b));
	}

}
