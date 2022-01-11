package org_example.java_jenkins_in_docker;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( EvenOrOdd(122) );
    }
    public static boolean EvenOrOdd(int number) {
    	
    	return number % 2==0;
    }
}
