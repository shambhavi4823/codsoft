import java.util.Random;
import java.util.Scanner;


public class guess {

    public static void main(String[] args) {
        int attempts=0;

        int bound =100;

        boolean number=false;
        Random take= new Random();
        int computer_input =take.nextInt(bound);       
    

        Scanner scan = new Scanner(System.in);
       
        
        while(!number){
            System.out.print("Choose any number from 0 to 100 = ");
            int user_input=scan.nextInt();
            attempts++;

        if (user_input==computer_input) {
            System.out.println("The number that you have guessed is Correct");
            break;
        }
        else if (user_input>computer_input) {
            System.out.println("The guessing number is too Big");
    
        }
        else if (user_input<computer_input) {
            System.out.println("The guessing number is too Small");
        } 
    

       
    }
    scan.close();
    }
    }