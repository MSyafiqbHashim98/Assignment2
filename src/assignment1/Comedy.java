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
public class Comedy extends Movie{
    String Bio,ExampleofMovie,ActorActress;
    
    Comedy(){
        this.Bio = "is a category of film in which the main emphasis is on humor.";   
        
        this.ExampleofMovie = "1.Grown Ups"
                + "\n2. Jumanji : Welcome to the jungle";
        
        this.ActorActress = "1. Adam Sandler"
                + "\n2. Kevin James"
                + "\n3.Salma Hayek"
                + "\n4. Dwayne Johnson";
    }
    
    public void setExampleofMovie(String ExampleofMovie){
        this.ExampleofMovie = ExampleofMovie;
    }
    
    public void setActorActress(String ActorActress){
        this.ActorActress = ActorActress;
    }
    public void printBio(){
        System.out.println("About this genre : "+ Bio);
    }
    
    public void printExampleofMovie(){
       System.out.println("Example of the movies : "+ ExampleofMovie);
    }
    
    public void ActorActress(){
        System.out.println("The Actor & Actress : "+ ActorActress);
    }
}
