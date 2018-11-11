
public class Usecalc implements calculator{
	    public int add(int num1,int num2)
	    {
	    	return num1+num2;
	    }
	    public int sub(int n1, int n2)
	    {
	    	return n1-n2;
	    }
	    public int multiply(int x, int y)
	    {
	    	return x*y;
	    }
	    public void display()
	    {
	    	System.out.println("addition value "+this.add(100,100));
	    	System.out.println("multiplication value "+multiply(100, 100));
	    	System.out.println("subtraction value "+sub(3,5));
	    }
	    public static void main(String args[]) {
	    	Usecalc calobj = new Usecalc();
	    	calobj.display();
	    }
	    
	}


