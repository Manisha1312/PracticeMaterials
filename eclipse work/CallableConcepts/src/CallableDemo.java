
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.Random;

public class CallableDemo {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newCachedThreadPool();
	Future<Integer> future = executor.submit(new Callable<Integer>(){
		
		public Integer call() throws TimeoutException{
			
			Random random = new Random();
			int duration = random.nextInt(3000);
			if (duration>2000)
				throw new TimeoutException();
						
			return duration;
			
		}

			
			
		});

	 executor.shutdown();
	 try {
		System.out.println("result is:"+future.get());
	} catch (InterruptedException | ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
