/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobjectsort;

import java.util.ArrayList;

/**
 *
 * @author 92019494
 */
public class Student implements Comparable{

        

    private String name;

    private int rating;

    

    // getter methods

    public String getName(){

    return name;

    }

    

    public int getRating(){

    return rating;

    }

 

    @Override

    public int compareTo(Object o) {

        Student e = (Student) o;
       
        return this.getRating() - e.getRating();
  
    }
    

    

    public Student(String newName, int newRating){

    name = newName;

    rating = newRating;

    }

}