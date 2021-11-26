package iterator.ex1;

interface ChannelIterator {
    public Channel nextChannel();

    public Channel prevChannel();
}

class Channel {
    String name;

    public Channel(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("this is " + name + " channel");
    }
}


class TV {
    public  Channel c[] = new Channel[10];

    public TV() {
        c[0] = new Channel("STAR PLUS");
        c[1] = new Channel("STAR GOLD");
        c[2] = new Channel("STAR SPORTS");
        c[3] = new Channel("NDTV");
        c[4] = new Channel("TV 9");
        c[5] = new Channel("ETV NEWS");
        c[6] = new Channel("ETV ");
        c[7] = new Channel("GEMINI");
        c[8] = new Channel("SUN");
        c[9] = new Channel("MAA TV");
    }

	public class Remote implements ChannelIterator {
		//TV myTv = new TV();
		int currentChannel = 5;

		public Channel nextChannel() {
			if (currentChannel < 9)
				currentChannel++;

			return (c[currentChannel]);
		}

		public Channel prevChannel() {
			if (currentChannel > 0)
				currentChannel--;

			return (c[currentChannel]);
		}


	}

};



class IteratorExample {
    public static void main(String[] a) {
       TV tv = new TV();
       TV.Remote ro= tv.new Remote();
        System.out.println("going forward");
        ro.nextChannel().show();
        ro.nextChannel().show();
        ro.nextChannel().show();

        System.out.println("going backward");
        ro.prevChannel().show();
        ro.prevChannel().show();
        ro.prevChannel().show();
    }
};
