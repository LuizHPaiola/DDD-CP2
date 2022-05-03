package exercicios;

public class Ex29W {

	public static void main(String[] args) {
	    int num1=1;
	    int num2=1;
	    int num3;
	    
        int i=0;
        while(i<30){
        	System.out.println(num1);
        	num3=num1+num2;
        	num1=num2;
        	num2=num3;
	        i++;
	     }
    }
}