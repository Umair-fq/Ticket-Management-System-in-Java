/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tms;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileHandling {
    public FileHandling() {
    }

    public static ArrayList<Movie> getallobjects() {
        ArrayList<Movie> allobjects = new ArrayList();

        try {
            File csvFile = new File("MovieFile.csv");
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String line = "";
            StringTokenizer st = null;
            int lineNumber = 0;
//            int tokenNumber = false;

            for(int i = 0; (line = br.readLine()) != null; ++i) {
                if (i != 0) {
                    String[] arr = line.split(",");
                    

//                    int discount;
//                    try {
//                        discount = Integer.parseInt(arr[10]);
//                    } catch (NumberFormatException var16) {
//                        discount = 0;
//                    }

                   Movie m = new Movie(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]) ;
                    allobjects.add(m);
                    ++lineNumber;
                }
            }
        } catch (FileNotFoundException var17) {
            System.out.println("File not found");
        } catch (IOException var18) {
            System.out.println("IO exception");
        }

        return allobjects;
    }
    
    public static void updateCSV(String fileToUpdate, String replace, int row, int col) throws IOException {
//                File inputFile = new File(fileToUpdate);
//                CSVReader reader = new CSVReader(new FileReader(inputFile), ',');
//                List<String[]> csvBody = reader.readAll();
//                csvBody.get(row)[col] = replace;
//                reader.close();
//                CSVWriter writer = new CSVWriter(new FileWriter(inputFile), ',');
//                writer.writeAll(csvBody);
//                writer.flush();
//                writer.close();
}
}

