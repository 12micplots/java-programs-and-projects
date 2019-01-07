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
public class Human {
    String name;
    int age;
    String eyeColor;
    int heightInInches;
    
    public void Speak(){
        System.out.println("Hello my name is " + name);
        System.out.println("Hello my age is " + age);
        System.out.println("Hello my eye color is " + eyeColor);
        System.out.println("Hello my height is " + heightInInches);   
    }
    
    public void Walk(){
        System.out.println("Walking");
    }
}
