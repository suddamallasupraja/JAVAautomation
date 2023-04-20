package oops_concepts;

public class UncheckedExceptions {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("program started");
		System.out.println("program is in progress");
		Thread.sleep(5000);  //we can use try catch block as well no pblm 
		System.out.println("program is completed");
	
	}
}
