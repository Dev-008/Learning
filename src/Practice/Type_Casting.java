package Practice;

public class Type_Casting {
	public static void main(String[] args) {

        double num = 10.75;
        int value;

        value = (int) num;   // manual conversion (Syntax)

        System.out.println("Double value: " + num);
        System.out.println("Converted to int: " + value);
    }
	
	
	 /*public static void main(String[] args) {

	        int num = 10;
	        double value;

	        value = num;   // automatic conversion

	        System.out.println("Integer value: " + num);
	        System.out.println("Converted to double: " + value);
	    }*/

}
