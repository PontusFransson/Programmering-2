package vecka50;

public class TestMain {

	public static Counter c = new Counter();

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				c.count();
			}
		};
		
		for (int i = 0; i < 10; i++) {
			new Thread(r).start();
		}

	}

}
