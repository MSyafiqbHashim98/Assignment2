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
public class Movie {
  String Movie;  
  
  Movie(){
this.Movie = "A film, also called a movie, motion picture or moving picture,"
        + "\nis a work of visual art used to simulate experiences that communicate ideas, stories, perceptions, feelings,"
        + "\nbeauty, or atmosphere through the use of moving images."
        + "\nThese images are generally accompanied by sound, and more rarely, other sensory stimulations."
        + "\nThere are several genres that available in movie. Such as Action, Comedy, Science Fiction and Thriller.";
}
  Movie(String m){
      this.Movie = m;
  }
  
  public void printMovie(){
      Movie m = new Movie();
      
      System.out.println("What is Movie?");
      System.out.println("= "+m.Movie);
      
  }
}

