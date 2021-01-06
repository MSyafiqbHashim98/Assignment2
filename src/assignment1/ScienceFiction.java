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
public class ScienceFiction extends Movie {
    String Bio,ExampleOfMovies,ActorActress;
    
    ScienceFiction(){
        this.Bio ="Science fiction (or sci-fi) is a film genre that uses speculative, fictional science-based depictions of phenomena that are not fully accepted"
              + "\nby mainstream science, such as extraterrestrial lifeforms, alien worlds, extrasensory perception and time travel, along with futuristic elements"
              + "\nsuch as spacecraft, robots, cyborgs, interstellar travel or other technologies. Science fiction films have often been used to focus on political "
              + "\nor social issues, and to explore philosophical issues like the human condition." ;
        
        this.ExampleOfMovies= "1. Interstellar"
              + "\n2. Gravity"
              +"\n3. Geostorm";
        
        this.ActorActress = "1. David Tennant"
      + "\n2. Linda Hamilton"
      + "\n3. Milla Jovovich"
      + "\n4. Will Smith";
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
