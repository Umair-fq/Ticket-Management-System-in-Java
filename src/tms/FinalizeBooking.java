/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tms;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author raoaw
 */
public class FinalizeBooking {
public static void finalize(Movie v,int tickets){
        System.out.println(">\tShow vehicle details\n" +
                " \n" +
                "Movie:\t"+v.getTitle()+"\n" +
                "Genere:\t"+v.getGenere()+"\n" +
                "Start time:\t"+v.getStarttime()+"\n" +
                "Run time:\t"+v.getRuntime()+"\n" +
                "Tickets bought:\t\t"+tickets+"\n" );

        int priceofoneticket = Integer.parseInt(v.getPrice());
        int total = priceofoneticket*tickets;
        System.out.println(
                "Total:\t$"+total+"\t\n");

        System.out.println("Would you like to reserve this vehicle (Y/N)? ");
        Character character = null;
        try {
            Scanner scanner = new Scanner(System.in);
            character = scanner.next().charAt(0);
        }catch (InputMismatchException e){
            System.out.println("You are supposed to insert a character");
        }

        int compareyes = Character.compare(character, 'Y');
        int compareno = Character.compare(character, 'N');

        if (compareyes==0) {
            PersonalInformation.getpersonalinformation(new MovieBooking(v,String.valueOf(tickets),total));
        }else if (compareno==0) {
            MainMenu.mainmenu();
        }else {
            System.out.println("Enter the correct input");
            MainMenu.mainmenu();
        }
        //getpersonalinformation();
    }
}