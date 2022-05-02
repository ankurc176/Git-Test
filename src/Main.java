
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInter myinter = new MyInterImple();
		
		myinter.SayHello();
		
		MyInter inter1 = new MyInter() {
			
			@Override
			public void SayHello() {
				// TODO Auto-generated method stub
				System.out.println("This is first anonymous");
			}
		};
		
		inter1.SayHello();

		
		MyInter inter2 = () -> System.out.println("This is Lambda Expression");
		
		inter2.SayHello();
		
		MySumInter suminter = (a, b) -> a+b;
		
		System.out.println(suminter.sum(4, 6));
		
		
		Runnable thread = () -> {
			for ( int i =1;i<=10;i++) {
				System.out.println(i);
				try {
					Thread.sleep(2000);
					
					System.out.println("HIMMAT GIT DIFF TEST");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread thread1 = new Thread(thread);
		thread1.start();
		
		
		Runnable thread3 = () -> {
			for (int i=1;i<=10;i++) {
				
				System.out.println("Table of 2"+i*2);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		Thread thread2 = new Thread(thread3);
		thread2.start();
		
	}

}
