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
public class Action extends Movie {
    String Bio,ExampleofMovie,ActorActress;
    
    Action(){
        this.Bio = "is a film genre in which the protagonist or protagonists are thrust into a series of events that typically"
              + "\ninclude violence, extended fighting, physical feats, rescues and frantic chases.";
        
        this.ExampleofMovie = "1.Maze Runner"
                + "\n2. Bad Boys";
        
        this.ActorActress = "1.Dylan O'Brien"
                +"\n2.Kaya Scodelario"
                + "\n3. Will Smith";
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
