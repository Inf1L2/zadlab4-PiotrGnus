/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author Petro
 */
public class Sześcian {
     float a6;
    float p6;
    float o6;

    public Sześcian(float a6) {
        this.a6 = a6;}
     public void p6() {   this.p6 = 6.0f *  this.a6 *  this.a6;}
     public void o6() {    this.o6 =  this.a6* this.a6* this.a6;}
    

   
     public void sześcian(){
         this.p6();
         this.o6();
        System.out.println("Sześcian");
       
        System.out.println("Pole wynosi = " + this.p6 );
        System.out.println("Obwód wynosi = " + this.o6 );
    }
    
}
