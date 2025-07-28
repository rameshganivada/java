package multithreading_tasks;

class RunnableCounter implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }}
	
}
public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RunnableCounter counter = new RunnableCounter();
		 Thread thread = new Thread(counter);  
		 thread.start();
	}

}