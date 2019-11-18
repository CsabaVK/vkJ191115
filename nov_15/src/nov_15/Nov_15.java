/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nov_15;
import java.util.*;
import java.io.*;

/**
 *
 * @author csabavk
 */
public class Nov_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> Filmcim = new ArrayList<>();
        ArrayList<Integer> Ev = new ArrayList<>();
        ArrayList<Integer> Nezo = new ArrayList<>();
        
        Scanner be = new Scanner(System.in);
        try
        {
            FileReader file = new FileReader("mozi.txt");
            BufferedReader br = new BufferedReader(file);
            
            String sor = null;
            while ((sor = br.readLine()) != null)
            {
                String[] splitter = sor.split(";");
                Filmcim.add(splitter[0]);
                Ev.add(Integer.parseInt(splitter[1]));
                Nezo.add(Integer.parseInt(splitter[2]));
            }
            be.close();
            System.out.println("Beolvasás Kész!");
        }
        
        catch (Exception e) 
        {
            System.out.println("A fájl nem található! " + e);
        }
        
        
        for (int i = 0; i <Filmcim.size(); i++) 
        {
            System.out.println(Filmcim.get(i) + ";" + Nezo.get(i));
        }
        
        int sum = 0;
        int db = 0;
        
        for (int i = 0; i < Nezo.size(); i++) 
        {
            sum = sum + Nezo.get(i);
        }
        System.out.println("Az összes nézőszám: " + sum);
        
        double avg = sum/db;
        System.out.println("Az átlagos nézőszám: " + avg);
        
        System.out.println("Kérek egy kiadási évet: ");
        //Scanner be = new Scanner(System.in);
        
        
        Integer YearIn = be.nextInt();
        for (int i = 0; i < Nezo.size(); i++) 
        {
            
        }
    }
    
}
