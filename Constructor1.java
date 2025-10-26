
class MyThr extends Thread
{
	public MyThr(String name)
	{
		super(name);
	}
	public void run()
	{
		int i=34;
		System.out.println("Thank You");
	}
}
public class Constructor1 {

	public static void main(String[] args) {
		MyThr t=new MyThr("Harry");
		System.out.println("id of thread: "+t.getId());
		System.out.println("name of thread: "+t.getName());
	}

}
