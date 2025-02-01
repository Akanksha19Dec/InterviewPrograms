


	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	public class OverrideStaticFunction {
	public static class baseclass {
	 void print()
	{
	System.out.println("print in baseclass.");
	}
	}
	public static class derivedclass extends baseclass {
	 void print()
	{
	System.out.println("print in derivedclass.");
	}
	}

	public static void main(String[] args)
	{
	baseclass A = new baseclass();
	baseclass B = new derivedclass();
	A.print();
	B.print();
	}
	}
	

