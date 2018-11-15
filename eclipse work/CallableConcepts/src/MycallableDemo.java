import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class MycallableDemo {

	public static void main(String[] args) {
	
		
		List<Integer>li = new ArrayList<>();
		ExecutorService executor = Executors.newCachedThreadPool();
		Future<Integer> future;

        for (int i = 1; i < 10; i++) {
            future = executor.submit(new MyCallable(i));
            try {
                li.add(future.get());
            } catch (ExecutionException ex) {
                System.out.println(ex.getMessage());
            }
        }

        executor.shutdown();
        

        for (int i = 0; i < li.size(); i++) {
            //get returned values from call()
            System.out.println("List Values " + i + " Value: " + li.get(i));

        }
		
		
		
		

		 
	

}
}
