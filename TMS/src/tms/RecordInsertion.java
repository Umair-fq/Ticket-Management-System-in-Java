/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author raoaw
 */
public class RecordInsertion {
    
    public static void writeDataAtOnce(Record record)
{
    File file = new File("Records.txt");
        boolean fileformed;
        try { fileformed = file.createNewFile();  } catch (IOException e) { e.printStackTrace();}
        File f = new File("Records.txt");
        try {
            FileWriter write = new FileWriter("Records.txt",true);
                write.append(record.getName()+ "  " + record.getEmail()+" "+ record.getMovie().movie.getTitle()+" "+record.getMovie().nooftickets+" "+record.getMovie().totalprice+ "$\n");
            write.close();
        } catch (IOException e) {
            System.out.println("An error occurred in file handling.");
            e.printStackTrace();
        }
    }

}
