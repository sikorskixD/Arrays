/*
Adrian Sikorski
 */
package arrays;

import java.util.*;

public class Arrays 
{// start Arrays


    public static void main(String[] args) 
    {// start main
    
    Scanner kb = new Scanner(System.in);
    char Grades[] = {'A', 'B', 'C', 'D', 'F'};
    double Temps[] = {98.6, 99.0, 100.3};
    String Names[] = {"Sally","Marry","Josh"};
    String Pokemon[] = new Pokemon[];
        
      
       
    for (int x=0;x<Grades.length;x++)
    {// start for
    System.out.println(Grades[x]+ " ");
    }// end for
    
    for (int x=0;x<Temps.length;x++)
    {// start for
    System.out.println(Temps[x]+ " ");
    }// end for
    
    for (int x=0;x<Names.length;x++)
    {// start for
    System.out.println(Names[x]+ " ");
    }// end for
    
    for (int x=0;x<Pokemon.length;x++)
    {// start for
    System.out.println("Enter a pokemon");
    Pokemon[x] = kb.nextLine();
    }// end fo
       
    }// end main
    
   
    
}// end Arrays
