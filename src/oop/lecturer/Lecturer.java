/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.lecturer;

import java.util.ArrayList;
import oop.qualification.Qualification;

/**
 *
 * @author Sifiso
 */
public class Lecturer {
    private String surname; 
    private  ArrayList<Qualification>  qualifications;

    public Lecturer(String surname) {
        this.surname = surname;
        this.qualifications = new ArrayList<Qualification>();
    }
   public void  addQualification(Qualification quali){
      qualifications.add(quali);
   }
   public void  removeQualification(Qualification quali){
      qualifications.remove(quali);
   }

    public ArrayList<Qualification> getQualifications() {
        return qualifications;
    }
    public String highestQualification(){
        String name="";
        int highest=0; 
        for (int i = 0; i < qualifications.size(); i++) {
           if(qualifications.get(i).getLevel()>=highest){
             highest=qualifications.get(i).getLevel();
             name=qualifications.get(i).getDegree();
           }//end of if statment
          }//end of for loop
      return name; 
    }
    
}
