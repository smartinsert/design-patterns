package flyweight.ex2;

public class Test {

	public static void main(String[] args) {
		String[] chars = { "A", "C", "D", "E", "F" };
		for (int i = 0; i < 100; i++) {
			System.out.print(MyCharFactory.getChar(
					chars[(int) (Math.random() * 5)]).getMyChar());
			if (i % 10 == 0)
				System.out.println();

		}
		System.out.println("Total Objects created.." + MyCharFactory.count);
		/*String s1 = "hello";
		String s2 = "hello";
		String s3=new String("hello");
		if (s1 == s3) {
			System.out.println("Same");
		}
		System.out.println(s1.hashCode()+"   "+s2.hashCode());*/
	}

}
