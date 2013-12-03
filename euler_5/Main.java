
package eulller5;

/**
 *
 * @author Manzoor Ahmed
 * Euller project 5
 *
 * PROBLEM
 *2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 *What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 */
public class Main {

    public static void main(String[] args) {
    boolean found =false;
    //all numbers
    for(int numbers=1;found==false;){
    
           if( (numbers % 1==0)
                   && (numbers % 2==0)
                   && (numbers % 3==0)
                   && (numbers % 4==0)
                   && (numbers % 5==0)
                   && (numbers % 6==0)
                   && (numbers % 7==0)
                   && (numbers % 8==0)
                   && (numbers % 9==0)
                   && (numbers % 10==0)
                   && (numbers %11==0)
                   && (numbers % 13==0)
                   && (numbers % 14==0)
                   && (numbers % 15==0)
                   && (numbers % 16==0)
                   && (numbers % 17==0)
                   && (numbers % 18==0)
                   && (numbers % 19==0)
                   && (numbers % 20==0)){
              
                System.out.println("Found\t"+numbers);
                found = true;
           }
           else{
               numbers++;
           }
        }
    }
}
