/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw06;

/**
 *
 * @author Robyn
 */
import java.util.*;
import java.util.Random;

public class HW06 {

    /**
     * Implement an Odd/Even game Roll a dice to get a number between 1-6 Ask
     * users to guess Odd or Even Track and announce result You win/lose You’ve
     * played xx number of times The system generate yy number of Odds and zz
     * number of Even Your winning percentage is nn% Must use Array
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        // do integers
        int[] die = new int[7];
        int guess = 0;
        int roll = 0;
        int guessC = 0;//guesscount
        int guessO = 0;//guessodd
        int guessE = 0;//guesseven
        int guessW = 0;//guesswin      
        int percent = 0;
        //int percent = 0;
        //ask user to to guess odd or even
        //use for statement
        for (roll = 1; roll < die.length; roll++) {
            System.out.println("Guess a odd or even number  ");
            guess = input.nextInt();
            guessC++;
            //state what was guessed and if you won or lost
            System.out.println("You guessed a " + guess + " We had  " + roll);
            if (guess == roll) {
                System.out.println("You won!!!");
                guessW++;//keep track of wins
                guessO++;//keep track of odd numbers
                guessE++;// keep track of even numbers
                System.out.println("You got it right in " + guessC + " guesses!");
                } else if (guess != roll) {
                System.out.println("You lost!!!");

                 
                // Print game stats              
                int guessG = (int) guessC - guessW;
                System.out.println("Bad guesses " + guessG);
                System.out.println("Good guesses " + guessW);
                guessE = guessC - guessO;
               
                System.out.println("You got " + guessO + " odd numbers!");
                System.out.println("You got " + guessE + " Even numbers!");
                // calculate percentage overall
                 if (guessW != 0) {
                    percent = (int) (float) (100/guessC   * guessW);               
                    System.out.println("Percent of winning guesses " + percent + "%");
                }

            }//if else
        }//for
    }//main

}//class

