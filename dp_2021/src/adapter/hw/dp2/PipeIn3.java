package adapter.hw.dp2;

public class PipeIn3 {
	public String getOuput() {
		return "3";
	}

	public void setInput(String s) {
		if (s.equals(getOuput())) {
			System.out.println("correct input, flow starts now.");
		}
		else{
			System.out.println("Wrong input");
		}
	}
}
