/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author MUHAMMAD SYAFIQ
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Movie m = new Movie();
      m.printMovie();
      System.out.println();
      Scanner Keyboard = new Scanner (System.in);
      System.out.println("Please enter movie genre (A=Action) (C=Comedy) (S=Science Fiction) (T= Thriller): ");
      char choice = Keyboard.nextLine().charAt(0);
       
      if(choice == 'C'|| choice =='c'){
      
      Comedy c = new Comedy();
      c.printBio();
      c.printExampleofMovie();
      c.ActorActress();
      }
      
      else if (choice == 'A'|| choice =='a'){
      Action a = new Action();
     a.printBio();
     a.printExampleofMovie();
     a.ActorActress();
      
    }
      
      else if (choice =='S'|| choice =='s'){
      ScienceFiction s = new ScienceFiction();
      s.printBio();
      System.out.println();
      s.printExampleOfMovies();
      System.out.println();
      s.ActorActress();
      }
      
      else if(choice == 'T'|| choice == 't'){
      Thriller t = new Thriller();
      t.printBio();
      System.out.println();
      t.printExampleOfMovies();
      System.out.println();
      t.ActorActress();
      }
      
      
    
    }
}