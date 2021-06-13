package JavaBasic;

public class TestTwoWheeler {

	public static void main(String[] args) {


		Dio d = new Dio();
		d.color();
		d.theftsafe();
		
		System.out.println("***************");
		
		TwoWheeler tw = new TwoWheeler();
		tw.start();
		tw.stop();
		tw.fuel();
		
		System.out.println("***************");
		d.start();
		d.stop();
		d.fuel();
		
		System.out.println("***************");
		d.start();
		tw.start();
		tw.run();
		
		
		System.out.println("***************");
		TwoWheeler tw1 = new Dio();
		tw1.start();
		tw1.stop();
		tw1.fuel();
		tw1.run();
		
		d.run();
	}

}
