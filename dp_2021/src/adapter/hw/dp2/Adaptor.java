package adapter.hw.dp2;

public class Adaptor extends PipeOut5 {
    private PipeIn3 pipeIn3;

    public Adaptor(PipeIn3 pipeIn3) {
        this.pipeIn3 = pipeIn3;
    }

    public void setPipeIn3(PipeIn3 pipeIn3) {
        this.pipeIn3 = pipeIn3;
    }



    @Override
    public String getOutput() {
        return pipeIn3.getOuput();
    }
}
