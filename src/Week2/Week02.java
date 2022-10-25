package Week2;

import helpers.InputReader;

public class Week02 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();




 
        String name = InputReader.getString("Enter your name > ");
        System.out.println("Hello " + name);
        String id = InputReader.getString("enter your id : ");
        System.out.println("Welcome back Student : " +  id );
        int length = InputReader.getInt("Enter Length:");
        int hight = InputReader.getInt("Enter Hight:"); 
        int area = (length*hight) ;
        System.out.println("The area is : " + area );
        int number1 = InputReader.getInt("Enter the first number:");
        int number2 = InputReader.getInt("Enter the second number:");
        int average = (number1+number2)/2;
        System.out.println("The average is : " + average );

       
        int number = InputReader.getInt("Enter the number: ");
        for(number=1;number<10;number++);


    }    
}
