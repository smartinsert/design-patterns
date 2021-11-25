package adapter.hw.dp2;

public class Main {

	public static void main(String[] args) {
		PipeIn3 pipe3=new PipeIn3();
		PipeOut5 pipe5=new Adaptor(pipe3);

		System.out.println(pipe5.getOutput());

	}

}
