package org.example1.java_jenkins_in_docker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( ifInputIsEven(22) );
    }
    public static boolean ifInputIsEven(int number)
    {
    	return number % 2 == 0;
    }
}
