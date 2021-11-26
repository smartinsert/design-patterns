package strategy.ex1;

interface FeedInterface {
    public void feed();
}

class FeedMeat implements FeedInterface {
    public void feed() {
        System.out.println("feed meat");
    }
}

class FeedCake implements FeedInterface {
    public void feed() {
        System.out.println("feed cake");
    }
}

class FeedWater implements FeedInterface {
    public void feed() {
        System.out.println("feed water");
    }
}

class Tiger {
    FeedInterface f;

    public void setFeed(FeedInterface f) {
        this.f = f;
    }

    private int state;

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void eatFood() {
        f.feed();
    }
}

public class TestStrategy {
    public static void main(String[] args) throws Exception {
        Tiger t = new Tiger();
        t.setState(0);
        switch (t.getState()) {
            case 0:
                t.setFeed(new FeedCake());
                t.eatFood();
                break;
            case 1:
                t.setFeed(new FeedWater());
                t.eatFood();
                t.setState(2);
                break;
            case 2:
                t.setFeed(new FeedMeat());
                t.eatFood();
                break;
            default:
                throw new Exception("the state of the tiger is wrong");
        }

    }
}