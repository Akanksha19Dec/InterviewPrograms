



public class OverloadDynamicFunction {
	public static class baseclass {
		static void print()
		{
		System.out.println("print in baseclass.");
		}
		}
		public static class derivedclass extends baseclass {
		static void print()
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