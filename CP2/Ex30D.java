package exercicios;

public class Ex30D {

	public static void main(String[] args) {
		int num1=1;
	    int num2=1;
	    int num3=1;	 
	    int num4;
	    
        int i=0;
        do{
        	System.out.println(num1);
        	num4=num1+num2+num3;
        	num1=num2;
        	num2=num3;
        	num3=num4;
	        i++;
	     }while(i<20);
    }
}