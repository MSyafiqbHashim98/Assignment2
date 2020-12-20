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
public class Comedy {
    String Bio,ExampleofMovie,ActorActress;
    
    public void setBio(String Bio){
        this.Bio = Bio;   
    }
    
    public void setExampleOfMovie(String ExampleOfMovie){
       this.ExampleofMovie =ExampleOfMovie;
    }
    
    public void setActorActress(String ActorActress){
        this.ActorActress = ActorActress;
    }
    
    public String getBio(){
        return this.Bio;
    }
    public String getExampleOfMovie(){
        return this.ExampleofMovie;
    }
     public String getActorActress(){
        return this.ActorActress;  
}
}
