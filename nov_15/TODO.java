* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mozi;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;

/**
 *
 * @author simon.imre
 */
public class Mozi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
    ArrayList<String> Filmcim = new ArrayList<>();
    ArrayList<Integer> ev = new ArrayList<>();
    ArrayList<Integer> nezo = new ArrayList<>();
    
    Scanner be = new Scanner(System.in);
        try {
            FileReader fajl = new FileReader("mozi.txt");
            BufferedReader  br = new BufferedReader(fajl);
            String sor = null;
            while ((sor = br.readLine())!=null) {                
                String[]d = sor.split(";");
                Filmcim.add(d[0]);
                ev.add(Integer.parseInt(d[1]));
                nezo.add(Integer.parseInt(d[2]));
            }
            br.close();
        } catch (Exception hiba) {
            System.out.println("nincs meg a fájl");
            
        }
        for (int i = 0; i < Filmcim.size(); i++) {
            System.out.println(Filmcim.get(i)+",");
        }
        
        int osszeg = 0;
        int db = 0;
        for (int i = 0; i < nezo.size() ; i++) {
           
            if (nezo.size() % 2 != 0) {
                 osszeg = osszeg + nezo.get(i);
                 db++;
            }
        }
        double atlag = osszeg/db;
        System.out.println("összesen:  " + osszeg);
        System.out.println("atlag: " + atlag);
        
        
        System.out.println("adjon meg egy évet");
        Scanner asd = new Scanner(System.in);
        int e = asd.nextInt();
        for (int i = 0; i < ev.size(); i++) {
            if (ev.get(i) == e ) 
            {
                System.out.println(Filmcim.get(i));
            }
        
        
         }
    
        System.out.println("adjon meg egy nézőszámot:");
        Scanner fasd = new Scanner(System.in);
        int g = fasd.nextInt();
        for (int i = 0; i < nezo.size(); i++) {
            if (nezo.get(i)== g) {
                System.out.println(Filmcim.get(i));
            }
        }
    }
}