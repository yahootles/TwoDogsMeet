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
import javax.swing.JOptionPane;

public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1 = "";
        String b1 = "";
        String n2 = "";
        String b2 = "";
        
        //get the name and bree
        try {
            n1 = JOptionPane.showInputDialog("Enter the name of the first dog.");
            b1 = JOptionPane.showInputDialog("Enter the breed of the first dog.");
            n2 = JOptionPane.showInputDialog("Enter the name of the second dog.");
            b2 = JOptionPane.showInputDialog("Enter the breed of the second dog.");
        } catch (NullPointerException npe) {
            System.exit(0);
        }

        //create two new dogs
        Dog dog1 = new Dog(n1, b1);
        Dog dog2 = new Dog(n2, b2);

        //flag for the while loop
        boolean flag = false;

        //loop until valid input or program exits
        while (!flag) {
            try {
                String input = JOptionPane.showInputDialog("The aggression of the first dog is " + dog1.getAggression()
                        + ". If you would like to change it, type in the positive number you would like to change"
                        + " it to, otherwise type \"N\"");

                if (input.equalsIgnoreCase("n")) {
                    flag = true;
                }else{
                    int agg = Integer.parseInt(input);
                    if(agg < 0){//can't have negative hunger or aggression, throw exception because input is invalid
                        throw new NumberFormatException();
                    }
                    flag = true;
                    dog1.setAggression(agg);
                }
            } catch (NullPointerException npe) {//exit if cancel button is clicked
                System.exit(0);
            } catch (NumberFormatException nfe) {//notify user that input is not valid, and continue loop
                System.err.println("Invalid input. Try again.");
            }
        }
        
        flag = false;
        //same as above
        while (!flag) {
            try {
                String input = JOptionPane.showInputDialog("The hunger of the first dog is " + dog1.getHunger()
                        + ". If you would like to change it, type in the positive number you would like to change"
                        + " it to, otherwise type \"N\"");

                if (input.equalsIgnoreCase("n")) {
                    flag = true;
                }else{
                    int hung = Integer.parseInt(input);
                    if(hung < 0){
                        throw new NumberFormatException();
                    }
                    flag = true;
                    dog1.setHunger(hung);
                }
            } catch (NullPointerException npe) {
                System.exit(0);
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid input. Try again.");
            }
        }
        
        flag = false;
        //same as above
        while (!flag) {
            try {
                String input = JOptionPane.showInputDialog("The aggression of the second dog is " + dog2.getAggression()
                        + ". If you would like to change it, type in the positive number you would like to change"
                        + " it to, otherwise type \"N\"");

                if (input.equalsIgnoreCase("n")) {
                    flag = true;
                }else{
                    int agg = Integer.parseInt(input);
                    if(agg < 0){
                        throw new NumberFormatException();
                    }
                    flag = true;
                    dog2.setAggression(agg);
                }
            } catch (NullPointerException npe) {
                System.exit(0);
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid input. Try again.");
            }
        }
        
        flag = false;
        //same as above
        while (!flag) {
            try {
                String input = JOptionPane.showInputDialog("The hunger of the second dog is " + dog2.getHunger()
                        + ". If you would like to change it, type in the positive number you would like to change"
                        + " it to, otherwise type \"N\"");

                if (input.equalsIgnoreCase("n")) {
                    flag = true;
                }else{
                    int hung = Integer.parseInt(input);
                    if(hung < 0){
                        throw new NumberFormatException();
                    }
                    flag = true;
                    dog2.setHunger(hung);
                }
            } catch (NullPointerException npe) {
                System.exit(0);
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid input. Try again.");
            }
        }
        
        //output the meeting
        System.out.println("Dog 1");
        System.out.println(dog1.toString() + "\n");
        System.out.println("Dog 2");
        System.out.println(dog2.toString() + "\n");
        
        System.out.println("Dog 1 says:");
        dog1.bark();
        
        System.out.println("");
        
        System.out.println("Dog 2 says:");
        dog2.bark();
    }

}
