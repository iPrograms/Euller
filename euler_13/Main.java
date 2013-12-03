/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

/**
 *
 * @author Manzoor Ahmed
 *
 */
public class Main {

    public static void main(String[] args) {
        //initial sum
        BigInteger number;
        try {
            BufferedReader bf = new BufferedReader(
                    new FileReader("C:/Users/shams/Desktop/data.txt"));
            String line;
            while((line =bf.readLine()) != null){
                
                String sub = line.substring(line.length()-10,line.length());
                number = new BigInteger(sub,10);

                //int k = Integer.parseInt(sub);
                
                System.out.println(number);
                //System.out.println(sub);
            }

        } catch (IOException ex) {
            
        }
        
    }
}
