/*
 * Your Jaskaran Kaur
 * Student ID: 991 609 049
 * SYST10199 - Web Programming
 */
package gamecard;
import java.util.Scanner;

public class GameCard {

    public static void main(String[] args){
        Card[] arr;
        
        arr = new Card[7];
        
        arr[0] = new Card(2, "clubs");
        
        arr[1] = new Card(3, "hearts");
        arr[2] = new Card(4, "spades");
        arr[3] = new Card(6, "Diamonds");
        arr[4] = new Card(5, "clubs");
        arr[5] = new Card(10, "spades");
        arr[6] = new Card(9, "Hearts");
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        
        System.out.println("Enter the suit");
        String suit = in.next();
        
        if(number == number){
            if(suit == suit)
                System.out.println("Your card is the array");
        }
        else
            System.out.println("Your card is not the array");
            
            }
}