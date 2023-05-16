package java_code_WrapperClasses_15th_May_2023;

import java.util.ArrayList;

public class UnderstandingWrapper {
	//short, byte, int, long, double, char, float, boolean - primitive data types
	//Java is an OOP language. 
	//Java needs Objects

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		Integer I = new Integer(10);
		l.add(I);
		//this add method requires an Object as input parameter
		//but what are we giving now ?? we have passed an int primitive data type parameter
		
		//We need to convert the primitive data type to Object and provide that Object as an input parameter to the add method
		//How do we convert the primitive data type to Object ??
		
		//To wrap the primitive data type to Object by using Wrapper Class
		
		//int -     Integer
		//short -   Short
		//byte -    Byte
		//long -    Long
		//double -  Double
		//boolean - Boolean
		//float -   Float
		//char -    Character
		
		//What are the objectives of Wrapper Classes
		//1. Wrap primitive data types into Object form so that we can handle or use primitive just like Objects
		//2. To define severa utility methods for primitives for conversion and other operations
		
	Integer.parseInt(null); //this method will help convert String to an int
	Integer.toString(10); //this method will help convert int to String
		
	Boolean.valueOf(true); //this method will help convert String to a boolean
		
		//Autoboxing:
		//Automatic conversion of primitive data  types to their corresponding Wrapper Classes.
		//example: if you assign an int value to an Integer variable, java will convert the int to Integer
		//Autoboxing allows you to use primitive data types as if they were objects.
		
				int num1 = 10;
				Integer var1 = num1; //now num1 is an Integer Object. it is no longer an int value in this line
				
		
		//Unboxing:
		//opposite of autoboxing. conversion of Wrapper Classes to corresponding primitive data types.
	    //example: if you have an Integer Object and you assign it to an int variable, java will convert the Integer to int
		//Unboxing allows you to use Wrapper Class as if they were primitive data types.
				
				Integer num2 = new Integer(123);
				int var2 = num2; //num2 is now an int
		
				
		String S1 = "123";
		//convert the String to an int
		int value = Integer.parseInt(S1); //this will return an int
		System.out.println(value);
		
		//convert the String to a boolean
		String S2 = "true";
		boolean bool = Boolean.valueOf(S2);
		System.out.println(bool);
		
		//Create an Integer Object
		Integer icheck1 = 10;
		Integer icheck = Integer.valueOf(123);
		
		/*
 
Boolean class:
valueOf(boolean b): Returns a Boolean object representing the specified boolean value.
parseBoolean(String s): Parses the string argument as a boolean.
booleanValue(): Returns the boolean value of this Boolean object.
compareTo(Boolean b): Compares two Boolean objects numerically.

Byte class:
valueOf(byte b): Returns a Byte object representing the specified byte value.
parseByte(String s): Parses the string argument as a signed byte in the radix specified by the second argument.
byteValue(): Returns the byte value of this Byte object.
compareTo(Byte b): Compares two Byte objects numerically.

Short class:
valueOf(short s): Returns a Short object representing the specified short value.
parseShort(String s): Parses the string argument as a signed short in the radix specified by the second argument.
shortValue(): Returns the short value of this Short object.
compareTo(Short b): Compares two Short objects numerically.

Integer class:
valueOf(int i): Returns an Integer object representing the specified int value.
parseInt(String s): Parses the string argument as a signed decimal int.
intValue(): Returns the int value of this Integer object.
compareTo(Integer b): Compares two Integer objects numerically.

Long class:
valueOf(long l): Returns a Long object representing the specified long value.
parseLong(String s): Parses the string argument as a signed decimal long.
longValue(): Returns the long value of this Long object.
compareTo(Long b): Compares two Long objects numerically.

Float class:
valueOf(float f): Returns a Float object representing the specified float value.
parseFloat(String s): Parses the string argument as a float.
floatValue(): Returns the float value of this Float object.
compareTo(Float b): Compares two Float objects numerically.

Double class:
valueOf(double d): Returns a Double object representing the specified double value.
parseDouble(String s): Parses the string argument as a double.
doubleValue(): Returns the double value of this Double object.
compareTo(Double b): Compares two Double objects numerically.

Character class:
valueOf(char c): Returns a Character object representing the specified char value.
charValue(): Returns the char value of this Character object.
compareTo(Character b): Compares two Character objects numerically.
		 */

	}

}
