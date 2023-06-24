/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tms;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static tms.TMS.scanner;

/**
 *
 * @author raoaw
 */
public class MainMenu {
    
    
    public static void mainmenu() {
                ArrayList<Movie> moviesarraylist= FileHandling.getallobjects();;

        while(true) {
            while(true) {
                System.out.println(" --------------------------------\n>\tSelect from main menu\n --------------------------------\n1)\tSearch by name\n2)\tBrowse by genere\n3)\tFilter by number of tickets \n4)\tShowing now\n5)\tExit ");
                System.out.print("Please select: ");
                int choice = scanner.nextInt();
                
                if (choice == 1) {
                ArrayList<Movie> finalselect = new ArrayList<>();
                
                int count=0;
                System.out.print("Please provide the title: ");
                String title = scanner.next();
                System.out.println(">\tSelect from matching list");
                for(int i=0; i<moviesarraylist.size();i++){
                    if(moviesarraylist.get(i).getTitle().contentEquals(title)){
                        count++;
                        System.out.println("("+count+") ID: "+moviesarraylist.get(i).getMovieid()+" - "+moviesarraylist.get(i).getTitle()+" Genere: "+moviesarraylist.get(i).getGenere()+" Starts:"+moviesarraylist.get(i).getStarttime()+" Runtime: "+moviesarraylist.get(i).getRuntime()+" with "+moviesarraylist.get(i).getTickets()+" tickets");
                        finalselect.add(moviesarraylist.get(i));
                    }
                }
                if(count==0){
                    System.out.println("This movie was not found.");
                }
                count++;
                System.out.println("("+count+") Go to main menu");
                int choice2 = scanner.nextInt();
                if(choice2==count){
                    mainmenu();
                }
                else if(choice2>count){
                    System.out.println("Wrong input");
                }
                else {
                      System.out.println("Enter the number of tickets you need:");
                      int nooftickets = scanner.nextInt();

                   // int days = providedates(finalselect.get(choice-1));
                   FinalizeBooking.finalize(finalselect.get(choice2-1),nooftickets);
                }
                }
                
                else if(choice==2){
                System.out.println(">\tBrowse by genere of movie");
                ArrayList<String> types = new ArrayList<>();
                for (int i=0;i<moviesarraylist.size();i++){
                    types.add(moviesarraylist.get(i).getGenere());
                }


                HashSet<String> distincttypeshaset = new HashSet<>(types);
                ArrayList<String> distincttypes = new ArrayList<>(distincttypeshaset);


                int count2 = 0;
                for(int i = 0; i<distincttypes.size(); i++){
                    count2++;
                    System.out.println(""+count2+")"+distincttypes.get(i));
                }count2++;
                System.out.println(count2+") Go to main menu");
                System.out.print("Please select: ");
                int choice3 = scanner.nextInt();
                if(choice3==count2){
                    mainmenu();
                }else if(choice3==1){
                   Movie v = FindType.gettype("Superhero",moviesarraylist);
                       System.out.println("Enter the number of tickets you need:");
                      int nooftickets = scanner.nextInt();
                   FinalizeBooking.finalize(v,nooftickets);
                 //   int days = providedates(v);
                 //   finalizevehicle(v,days);
                }else if(choice3==2){
                    Movie v =  FindType.gettype("Action",moviesarraylist);
                    System.out.println("Enter the number of tickets you need:");
                      int nooftickets = scanner.nextInt();
                   FinalizeBooking.finalize(v,nooftickets);
                //    int days = providedates(v);
                 //   finalizevehicle(v,days);
                }else if(choice3==3){
                    Movie v = FindType.gettype("Adventure",moviesarraylist);
                    System.out.println("Enter the number of tickets you need:");
                      int nooftickets = scanner.nextInt();
                   FinalizeBooking.finalize(v,nooftickets);
                //    int days = providedates(v);
                //    finalizevehicle(v,days);
                }
            }
                
                else if(choice==3){
                ArrayList<Movie> vh = new ArrayList<>();
                System.out.print("Please provide the number of number:");
                        Scanner scanner = new Scanner(System.in);
                int ticketsneeded = scanner.nextInt();
                int count=0;
                for (int i=0;i<moviesarraylist.size();i++){
                    if(Integer.parseInt(moviesarraylist.get(i).getTickets())>ticketsneeded){
                        count++;
                        System.out.println("("+count+") ID: "+moviesarraylist.get(i).getMovieid()+" - "+moviesarraylist.get(i).getTitle()+" Genere: "+moviesarraylist.get(i).getGenere()+" Starts:"+moviesarraylist.get(i).getStarttime()+" Runtime: "+moviesarraylist.get(i).getRuntime()+" with "+moviesarraylist.get(i).getTickets()+" tickets");
                        vh.add(moviesarraylist.get(i));
                    }
                }count++;
                    System.out.println(count+") Go to main menu");
                    System.out.print("Please select: ");
                    int choice4 = scanner.nextInt();
                    if(choice4==count){
                        mainmenu();
                    }
                    else if(choice4>count){
                        System.out.println("Enter a correct input");
                    }
                    else {
                         System.out.println("Enter the number of tickets you need:");
                      int nooftickets = scanner.nextInt();
                   FinalizeBooking.finalize(vh.get(choice4-1),nooftickets);
                      //  int days = providedates(vh.get(choice4-1));
                      //  finalizevehicle(vh.get(choice4-1),days);
                    }
            }else if(choice==4){
                 ArrayList<Movie> vh = new ArrayList<>();
                int count=0;
                for (int i=0;i<moviesarraylist.size();i++){
                    if(moviesarraylist.get(i).getStarttime().contentEquals("0:00")){
                        count++;
                        System.out.println("("+count+") ID: "+moviesarraylist.get(i).getMovieid()+" - "+moviesarraylist.get(i).getTitle()+" Genere: "+moviesarraylist.get(i).getGenere()+" Starts:"+moviesarraylist.get(i).getStarttime()+" Runtime: "+moviesarraylist.get(i).getRuntime()+" with "+moviesarraylist.get(i).getTickets()+" tickets");
                        vh.add(moviesarraylist.get(i));
                    }
                }count++;
                    System.out.println(count+") Go to main menu");
                    System.out.print("Please select: ");
                    int choice4 = scanner.nextInt();
                    if(choice4==count){
                        mainmenu();
                    }
                    else if(choice4>count){
                        System.out.println("Enter a correct input");
                    }
                    else {
                         System.out.println("Enter the number of tickets you need:");
                      int nooftickets = scanner.nextInt();
                   FinalizeBooking.finalize(vh.get(choice4-1),nooftickets);
                      //  int days = providedates(vh.get(choice4-1));
                      //  finalizevehicle(vh.get(choice4-1),days);
                    }
            }
                else if(choice==5){
                System.exit(0);
            }else {
                System.out.println("Enter a correct input");
            }     
          }
        }
    }
}
             
        
    
    
    
    

