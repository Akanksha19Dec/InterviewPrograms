

public class OverloadFunction {
	 public void method1 (int num1,String num2){
         System.out.println("int-float method");
    }

	
	/*
	 * public void method1(int num1,String num2){
	 * System.out.println("float-int method"); }
	 */
	  
	 public static void main(String[] args){
    	 OverloadFunction interviewBit=new OverloadFunction();
           interviewBit.method1(40,"20");
     }
}
