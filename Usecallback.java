
public class Usecallback implements Icallback {
	public int callback(int n1) {
		System.out.println("value:"+n1);
		return n1;
	}
	public static void main(String args[])
	{
		Usecallback callbackobj = new Usecallback();
		callbackobj.callback(100);
	}

}
