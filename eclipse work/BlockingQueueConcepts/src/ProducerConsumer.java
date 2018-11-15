import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
	
	static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					producer();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					consumer();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		t1.start();
		t2.start();
		
		}
	
	
	 public static void producer() throws InterruptedException{
		 Random random = new Random();
		 while(true){
			 
			 Thread.sleep(1000);
			 queue.put(random.nextInt(100));
			 System.out.println(" Queue size is: " + queue.size());
			 
		 }
		 
		
		 
	 }
	 
	 public static void consumer() throws InterruptedException{
		 Random random = new Random();
		
     while(true){
    	 Thread.sleep(1000);
    	 queue.take();
    	 System.out.println(" Queue size is after removal: " + queue.size());
    	 
     }
		
		 
	 }

}
