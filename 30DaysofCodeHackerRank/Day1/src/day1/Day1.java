/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author vaibh
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human tom;
        tom = new Human();
        tom.age = 2;
        tom.eyeColor = "Brown";
        tom.heightInInches = 10;
        tom.name = "Tom Holler";
        tom.Walk();
        tom.Speak();
        
    }
    
}
