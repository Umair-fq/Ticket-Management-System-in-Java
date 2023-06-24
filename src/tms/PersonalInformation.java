/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tms;

import java.util.InputMismatchException;
import static tms.TMS.scanner;

/**
 *
 * @author raoaw
 */
public class PersonalInformation {
    
        public static void getpersonalinformation(MovieBooking booking) {
        System.out.println(">\tProvide personal information");
        System.out.println("Please provide your given name: ");
        String name = scanner.next();
        System.out.println(" Please provide your surname: ");
        String surname = scanner.next();
        System.out.println("Please provide your email address: ");
        String email = scanner.next();
        System.out.println("Please provide number of people including you: ");
        int noofpass = scanner.nextInt();
        System.out.println("Confirm and pay (Y/N): ");
        Character character = null;

        try {
            character = scanner.next().charAt(0);
        } catch (InputMismatchException var8) {
            System.out.println("You are supposed to insert a character");
        }

        int compareyes = Character.compare(character, 'Y');
        int compareno = Character.compare(character, 'N');
        if (compareyes == 0) {
            String n = name + " " + surname;
            RecordInsertion.writeDataAtOnce(new Record( n,email,booking));
            System.out.print(">\tCongratulations! Your movie is booked. A receipt has been sent to your email.\n");
            System.out.println("Name:\t" + name + " " + surname + "\nEmail:\t" + email + "\nYour  Movie:\t"  + " " + booking.movie.getTitle());
            System.out.println(" Genere: "+booking.movie.getGenere()+" Starts:"+booking.movie.getStarttime()+" Runtime: "+booking.movie.getRuntime()+" And you got "+booking.nooftickets +" tickets");

        } else if (compareno == 0) {
            MainMenu.mainmenu();
        } else {
            System.out.println("Enter the correct input");
            MainMenu. mainmenu();
        }

    }
    
}
