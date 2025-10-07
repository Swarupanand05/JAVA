

class MyThreadRunnable1 implements Runnable
{
	public void run()
	{
		int i;
		while(true) {
		System.out.println("I am thread1");
		}
	}
}
class MyThreadRunnable2 implements Runnable
{
	public void run()
	{
		while(true) {
		System.out.println("I am thread2");
		}
	}
}
public class RunnableInterface {

	public static void main(String[] args) {
		MyThreadRunnable1 r1=new MyThreadRunnable1();
		Thread t1=new Thread(r1);
		MyThreadRunnable2 r2=new MyThreadRunnable2();
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}

}
