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
public class Thriller extends Movie{
    String Bio,ExampleOfMovies,ActorActress;
    
    Thriller(){
        this.Bio = "Thriller film, also known as suspense film or suspense thriller, is a broad film genre that evokes excitement and suspense in the audience."
                + "\nThe suspense element found in most films' plots is particularly exploited by the filmmaker in this genre. Tension is created by delaying what the audience sees as inevitable,"
                + "\nand is built through situations that are menacing or where escape seems impossible.";
        
         this.ExampleOfMovies = "1. Parasite"
              + "\n2. Insidious: The Last Key"
              +"\n3. Ready Or Not";
         
         this.ActorActress = "1. Gene Hackman"
      + "\n2. David Fincher";
    }
    
    public void setExampleOfMovies(String ExampleOfMovies){
        this.ExampleOfMovies = ExampleOfMovies;
    }
    
    public void setActorActress(String ActorActress){
        this.ActorActress = ActorActress;
    }
    public void printBio(){
        System.out.println("About this genre : "+ Bio);
    }
    
    public void printExampleOfMovies(){
       System.out.println("Example of the movies : "+ ExampleOfMovies);
    }
    
    public void ActorActress(){
        System.out.println("The Actor & Actress : "+ ActorActress);
    }
 
}    

