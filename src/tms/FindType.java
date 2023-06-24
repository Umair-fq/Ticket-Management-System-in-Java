/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author raoaw
 */
public class FindType {
    
     public static Movie gettype(String type, ArrayList<Movie> allvehicles){
                 ArrayList<Movie> allobjarraylist = FileHandling.getallobjects();
        System.out.println(">\tSelect from the list of "+type+"s");
        ArrayList<Movie> moviesarraylist = new ArrayList<>();
        for (int i=0;i<allobjarraylist.size();i++){
            if(allobjarraylist.get(i).getGenere().contentEquals(type)){
                moviesarraylist.add(allvehicles.get(i));
            }
        }
        int count = 0;
        for(int i = 0; i<moviesarraylist.size(); i++){
            count++;
                        System.out.println("("+count+") ID: "+moviesarraylist.get(i).getMovieid()+" - "+moviesarraylist.get(i).getTitle()+" Genere: "+moviesarraylist.get(i).getGenere()+" Starts:"+moviesarraylist.get(i).getStarttime()+" Runtime: "+moviesarraylist.get(i).getRuntime()+" with "+moviesarraylist.get(i).getTickets()+" tickets");
        }count++;
        System.out.println(count+") Go to main menu");
        System.out.print("Please select: ");
        Scanner scanner = new Scanner(System.in);
        int choice4 = scanner.nextInt();
        Movie v ;
        if(choice4==count){
            MainMenu.mainmenu();
        }
        else if(choice4>count){
            System.out.println("Wrong input");
        }
        else {
            return moviesarraylist.get(choice4-1);
        }

        return null;
    }
}
