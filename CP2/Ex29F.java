package exercicios;

public class Ex29F {

	public static void main(String[] args) {
		int num1=1;
	    int num2=1;
	    int num3;
	    
	    for(int i=0;i<30;i++){
	    	System.out.println(num1);
	    	num3=num1+num2;
	    	num1=num2;
	    	num2=num3;
	    }
	 }
}