package multithreading_tasks;

class PriorityThread extends Thread {

	 public PriorityThread(String name) {
	     super(name); 
	 }

	 public void run() {
	     for (int i = 1; i <= 5; i++) {
	         System.out.println(getName() + " [Priority: " + getPriority() + "] - Count: " + i);
	     }
	 }
	 
	}
	class task5{

	 public static void main(String[] args) {
	     
	     PriorityThread t1 = new PriorityThread("Thread-1 (Low)");
	     PriorityThread t2 = new PriorityThread("Thread-2 (Normal)");
	     PriorityThread t3 = new PriorityThread("Thread-3 (High)");

	     
	     t1.setPriority(Thread.MIN_PRIORITY);  
	     t2.setPriority(Thread.NORM_PRIORITY);  
	     t3.setPriority(Thread.MAX_PRIORITY);  

	     
	     t1.start();
	     t2.start();
	     t3.start();
	 }
	}
