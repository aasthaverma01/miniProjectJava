import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //MINI PROJECT

        Scanner sc= new Scanner(System.in);
        int myNumber = (int) (Math.random()*100);
        int userNumber=0;

        do{
            System.out.println("Guess my Number from 0-100 :");
            userNumber = sc.nextInt();

             if(userNumber == myNumber){
                 System.out.println("Wohoo... correct number!!");
                 break;
             }
             else if(userNumber > myNumber){
                 System.out.println("your number is too large!");
             }
             else{
                 System.out.println("your number is too small!");
             }
        } while(userNumber >= 0);
        System.out.println("My number was: ");
        System.out.println((myNumber));
    }
}