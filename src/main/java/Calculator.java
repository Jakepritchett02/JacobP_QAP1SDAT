import java.util.Scanner;

public class Calculator {
//named the first characters to use
    static int firstoperator, secondoperator,Result;

    static char operator;
// you are able to enter in a series of numbers
    public static void main(String[] args) {
        Scanner userinput = new Scanner( System.in );
        System.out.println("Please enter your first number!");
        firstoperator = userinput.nextInt();
        System.out.println("Please enter your second number!");
        secondoperator = userinput.nextInt();
        System.out.println("please enter your symbol! +,-,*,/");
        operator = userinput.next().charAt(0);

        switch(operator){
            case'+':
                Result = firstoperator + secondoperator;
                System.out.println("Final Result of "+ firstoperator + " " +operator + secondoperator +" "  + "=" + Result);
                break;
            case'-':
                Result = firstoperator - secondoperator;
                System.out.println("Final Result of "+ firstoperator + " " +operator + secondoperator +" "  + "=" + Result);
                break;
            case'*':
                Result = firstoperator * secondoperator;
                System.out.println("Final Result of "+ firstoperator + " " +operator + secondoperator +" "  + "=" + Result);
                break;
            case'/':
                Result = firstoperator / secondoperator;
                System.out.println("Final Result of "+ firstoperator + " " +operator + secondoperator +" "  + "=" + Result);
                break;
            default:
                System.out.println("this is the wrong symbol used none shall pass ");
        }
        userinput.close();

    }
    // for my tests
    public void add(int i, int i1) {
    }
}
