import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

	public static void main(String[] args) {
		// 쓰레드를 2개 생성
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		executorService.submit(getRunable("Hello"));
		executorService.submit(getRunable("JinSeok"));
		executorService.submit(getRunable("The"));
		executorService.submit(getRunable("Java"));
		executorService.submit(getRunable("Thread"));
		
		executorService.shutdown();
	}
	private static Runnable getRunable(String message) {
		return () -> System.out.println(message + Thread.currentThread().getName());
	}
}