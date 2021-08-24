
/**
 * Simple calculator class to perform the basic calculation.
 *
 * @author Hei Lam Yip
 * @version 09.08.2021
 */
import java.util.Scanner;
import java.lang.*;
import java.util.List;

public class Calculator
{
    private String screen;
    private String x;
    private double first_number;
    private double second_number;
    private char operator;
    private ProcessBuilder.Redirect.Type invalid;

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        // initialise instance variables
        first_number= 0;
        second_number= 0;
        screen = "Welcome to PROG5001 calculator: \n****************************************************" + 
                "\n* Type 1 and press enter to perform basic calculation\n* Type 2 and press enter to calculate the sum of N integers (N < 5)" +
                "\n* Type 3 and press enter to calculate the factorial of the first N integers (N < 10)\n****************************************************";
        System.out.println(screen);
        System.out.println("Your choice:");
    
    }

    /**
     * An method to print menu to the user
     *
     * @param  
     * @return    the sum of x and y
     */
    public void ShowMenu() {
        //Type 1 and press enter to perform basic calculation 4
        //Type 2 and press enter to calculate the sum of N integers (N < 5)
        //Type 3 and press enter to calculate the factorial of the first N integers (N < 10)�

        int Key = 0;
        boolean quit = false; 

        while (!quit){
            try{
                Key = System.in.read();
            } catch (Exception e) { 
            }

            switch (Key) {
            case 49: //1
                System.out.println ("Your choice: 1");
                ReadOpearator();
                break;
            case 50: //2
                System.out.println ("Your choice:2");
                sum();
                break;
            case 51: //3  
            System.out.println ("Your choice:3");
                factorial ();
                break;
            case 10: //Enter  
            System.out.println(screen);
                break;
            default:
                System.out.println ("The selected option does not exist");
                quit = false;
        }
    }
}
    
    /**
     * An method to read in operator from the user
     * 
     * @param
     * @return  the operator
     */
    public void ReadOpearator() {
        String line;
        boolean invalid;
        byte count = 0;
        do {
            System.out.println("Input your operator [+-*/]:");
            Scanner inScanner = new Scanner (System.in);
            line = inScanner.nextLine();
            invalid = false;
             if (line.equals ("+")) {
                operator = '+';
                ReadArguments();
                addition();
                invalid = true;
            } else
            if (line.equals ("-")){
                operator = '-';
                ReadArguments();
                subtraction();
                invalid = true;
            } else
            if (line.equals ("*")){
                operator = '*';
                ReadArguments();
                multiplication(); 
                invalid = true;
            } else
            if (line.equals ("/")){
                operator = '/';
                ReadArguments();
                division(); 
                invalid = true;
            }
        } while (invalid == false);
    
}

    /**
     * An method to read in arguments from the user
     * 
     * @param
     * @return  the operator
     */
    public void ReadArguments() {
        String line;
        boolean invalid;

        do {
            try {
               invalid = false;
               System.out.print ("Input your numbers and press enter:");
               Scanner inScanner = new Scanner(System.in);
               first_number  = inScanner.nextDouble();
               second_number = inScanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Please enter valid number");
                invalid = true;
            }
        } while (invalid == true);
    }
    
    /**
     * An method to perform addition operation
     * Option 1
     * @param  
     * @return    the sum of x and y
     */
    public double addition() {
        //perform the clculation
        double result;
        result = first_number + second_number;
        x = "The result is: " + result;
        System.out.println(x);
        System.out.println ("\nPress enter to continue…");
        return result;
        
    }

    /**
     * An method to perform a subtraction operation
     * Option 1
     * @param  
     * @return    the sum of x and y
     */
    public double subtraction() {
        //perform the clculation
        double result;
        result = first_number - second_number;
        x = "The result is: " + result;
        System.out.println(x);
        System.out.println ("nPress enter to continue…");
        return result;
    }

    /**
     * An method to perform division operation
     * Option 1
     * @param  
     * @return    the sum of x and y
     */
    public double division() {
        //perform the clculation
        double result;
        result = first_number / second_number;
        x = "The result is: " + result;
        System.out.println(x);
        System.out.println ("\nPress enter to continue…");
        return result;
    }

    /**
     * An method to perform multiplication operation
     * Option 1
     * @param  
     * @return    the sum of x and y
     */
    public double multiplication() {
        //perform the clculation
        double result;
        result = first_number * second_number;
        x = "The result is: " + result;
        System.out.println(x);
        System.out.println ("\nPress enter to continue…");
        return result;
    }
    
    /**
     * An method to perform sum of N integers (N<5) 
     * Option 2
     */
        public double sum() {
        int n, sum=0;
        Scanner inScanner = new Scanner (System.in);
        System.out.println("Input N and press enter:");
        n = inScanner.nextInt();
        boolean quit = false;
        
        while (!quit){
        try{
            System.out.println("Input N and press enter:" + n);
            System.out.println("The calculation is as follows:");
            } catch (Exception e) { 
            }
            
        if (n <0){
            System.out.println("Can't enter negative number");
            quit = true; 
        } else
        if (n >5){
            System.out.println("You should enter a number <5");
            quit = true; 
        } else      
        for(int i=1; i<=n; i++){
        // if n = 3; then sum = 0+1;sum =1; sum + i; sum 1 +2 =3; sum 3+3=6
        sum=sum+i;
        System.out.println("+" + " " + i);
        quit = true; 
        }
    }
        System.out.println("The result is" + " " + sum);
        System.out.println("\nPress enter to continue…");
        return sum;    
    }
    
     /**
     * An method to perform factorial operation 
     * Option 3
     * @param  
     * @return    the sum of x and y
     */
    public int factorial () {
        //5! = 5*4*3*2*1 = 120
        int number;
        long factorial = 1;
        System.out.println("Input N and press enter:");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        boolean quit = false;
        
        while (!quit){
        try{
            System.out.println("Input N and press enter:" + number);
            } catch (Exception e) { 
            }
        
        if (number <0){
            System.out.println("Can't find the factorial of negative number");
            quit = false;
        } else 
        if (number <=1){
            System.out.printf("%d! = %d", number,factorial);
            quit = false;
        } else 
        if (number >10) {
            System.out.println("please enter a number < 10");
            quit = false;
        } else
        for (int counter = number; counter >=2; counter--) {
                factorial = factorial * counter;
                quit = true; 
            } 
        System.out.println("The factorial of" +" " + number + " " + "is:" + " " + factorial); 
    }  
    System.out.println ("\nPress enter to continue…");
    return number;
    }
    
    /**
     * A method to return the screen value
     * 
     * @param
     * @return screen value
     */
    public String getScreen() {
        return screen;
    }
    
    public static void main(String[] arg) {
        Calculator calc = new Calculator ();        
        calc.ShowMenu();
    }
}
