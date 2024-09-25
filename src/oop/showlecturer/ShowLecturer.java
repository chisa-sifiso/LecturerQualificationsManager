/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.showlecturer;

import oop.lecturer.Lecturer;
import oop.qualification.Qualification;

/**
 *
 * @author Sifiso
 */
public class ShowLecturer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Qualification obj1 = new Qualification("Diploma IT",2005,2);
        Qualification obj2 = new Qualification("MSc in Computer Science",2009,3);
         Qualification obj5 = new Qualification("MSc in Mathematics",2021,0);
        Qualification obj3 = new Qualification("PhD in Computer Science",2015,5);
        Qualification obj4 = new Qualification("MSc in Mathematics",2021,5);
        
        Lecturer lec = new Lecturer("Zwane");
        lec.addQualification(obj1);
        lec.addQualification(obj2);
        lec.addQualification(obj3);
        lec.addQualification(obj4);
        lec.addQualification(obj5);
        String quls="";
        for (int i = 0; i < lec.getQualifications().size(); i++) {
            quls+=lec.getQualifications().get(i).getDegree()+"\n";
        }
        System.out.println(quls);
        System.out.println(lec.highestQualification());
        String sentence ="sifiso/vinjwa/chisa";
        String[] names = sentence.split("/");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
    
}
