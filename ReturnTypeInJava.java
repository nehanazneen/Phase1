package ReturnTyp;

public class ReturnTypeInJava {

	private static ReturnTypeInJava obj;
	private static int as[];

	public void test1() {

	}

	public int test2() {
		return 3;
	}

	public double test3() {
		return 3.99;
	}

	public boolean test4() {
		return true;
	}

	public char test5() {
		return 'a';
	}

	public String test6() {
		return "Test";
	}

	public ReturnTypeInJava test7() {
		return new ReturnTypeInJava();
	}

	public int[] test8() {
		return new int[7];
	}

   public static void main(String[] args) {
	   ReturnTypeInJava obj = new ReturnTypeInJava();
	
	int a[] = new int[5];
}
}