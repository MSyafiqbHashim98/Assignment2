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
      Scanner Keyboard = new Scanner (System.in);
      System.out.println("Please enter movie genre (A=Action) (C=Comedy) : ");
      char choice = Keyboard.nextLine().charAt(0);
       
      if(choice == 'c'|| choice =='c'){
      
      Comedy c = new Comedy();
      c.setBio("is a category of film in which the main emphasis is on humor.");
      c.setExampleOfMovie("Grown Ups");
      c.setActorActress("Adam Sandler, Kevin James and Salma Hayek");
      
      System.out.println("This is a comedy genre");
      System.out.println("About this genre : "+c.getBio());
      System.out.println("Example of comedy movie : "+c.getExampleOfMovie());
      System.out.println("The actor and actress of the movie : "+c.getActorActress());
      System.out.println();
      }
      
      else if (choice == 'a'|| choice =='a'){
      Action a = new Action();
      a.setBio("is a film genre in which the protagonist or protagonists are thrust into a series of events that typically\n\t\tinclude violence, extended fighting, physical feats, rescues and frantic chases.");
      a.setExampleOfMovie("Maze Runner");
      a.setActorActress("Dylan O'Brien and Kaya Scodelario");
      
      System.out.println("This is an action genre");
      System.out.println("About this genre : " +a.getBio());
      System.out.println("Example of action movie : "+a.getExampleOfMovie());
      System.out.println("The actor and actress of the movie : "+a.getActorActress());
    }
    
}
}