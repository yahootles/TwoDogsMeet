/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodogsmeet;

/**
 *
 * @author antho6229
 */
public class Dog {
    //variables for characteristics

    private String dogName, dogBreed;
    private int aggression, hunger, age;
    //aggression = 5; this is bad :(

    //constructors
    public Dog() {
        dogName = "Rufus Doe";
        dogBreed = "Unknown Breed";
        aggression = 0;
        hunger = 0;
        age = 2;
    }

    public Dog(String dgName, String dgBreed, int agg, int hung, int ag) {
        dogName = dgName;
        dogBreed = dgBreed;
        aggression = agg;
        hunger = hung;
        age = ag;
    }

    /**
     * 
     * @param dgName - name of the dog
     * @param dgBreed  breed of the dog
     */
    public Dog(String dgName, String dgBreed) {
        //This constructor only uses the name and breed
        //Set the aggression and hunger to random #s
        dogName = dgName;
        dogBreed = dgBreed;
        aggression = (int) (Math.random() * 10) + 1;
        hunger = (int) (Math.random() * 10) + 1;
        age = (int) (Math.random()*13 + 1);
    }

    /**
     * This method allows the user to set the aggression of the dog pre: needs
     * an aggression value post: sets the aggression value
     */
    public int getAggression() {
        return aggression;
    }

    /**
     * This method allows the user to set the aggression of the dog pre: needs
     * an aggression value post: sets the aggression value
     */
    public void setAggression(int aggres) {
        aggression = aggres;
    }
    
    /**
     * accessor method to give user the hunger of the dog 
     * @return - the dog's hunger
     */
    public int getHunger(){
        return hunger;
    }
    
    /**
     * accessor method to change the value of the hunger of the dog
     * @param hung - the new value of the dog's hunger
     */
    public void setHunger(int hung){
        hunger = hung;
    }

    /**
     * This method allows for a dog to friendly bark pre: none post: the dog
     * object barks
     */

    public void barkFriendly() {
        System.out.println("Arf! Arf!");
    }

    /**
     * This method allows for a dog to angry bark pre: none post: none the dog
     * object barks
     */
    public void barkAngry() {
        System.out.println("GRR! RRRFFF!");
    }
    
    /**
     * This method decides which bark to do, depending on hunger and aggression
     */
    public void bark(){
        if(hunger+aggression > 10){
            barkAngry();
        }else{
            barkFriendly();
        }
    }

    public static void caringForYourDog() {
        System.out.println("This is how you care for your dog");
    }

    //method to display all info of the Dog
    public String toString() {
        String output = "Name: " + dogName + "\n";
        output += "Breed: " + dogBreed + "\n";
        output += "Aggression: " + aggression + "\n";
        output += "Hunger: " + hunger;
        //output string is complete, return it
        return output;
    }
}
