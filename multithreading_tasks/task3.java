package multithreading_tasks;

class NumberPrinterThread extends Thread {

	 public void run() {
	     for (int i = 1; i <= 5; i++) {
	         System.out.println(i);
	         try {
	             Thread.sleep(1000); 
	         } catch (InterruptedException e) {
	             System.out.println("Thread interrupted!");
	         }
	     }
	 }

	}
	class task3{
	 public static void main(String[] args) {
	     NumberPrinterThread thread1 = new NumberPrinterThread(); 

	     thread1.start();

	     try {
	         thread1.join(); 
	     } catch (InterruptedException e) {
	         System.out.println("Main thread interrupted!");
	     }

	     System.out.println("Main thread done."); 
	 }

	}