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
public class Kula {
    
    float r4;
    float o4;
    float p4;

    public Kula(float r4) { this.r4 = r4;}
        public void o4(){  this.o4 = 4*3.14f*this.r4;}
        public void p4() { this.p4 = 4/3*3.14f*(this.r4*this.r4*this.r4);}
    

    Kula(int promkuli) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void kula(){
         this.p4();
        this.o4();
        System.out.println("Kula");
        System.out.println("Pole wynosi = " + this.p4 );
        System.out.println("Obwód wynosi  = " + this.o4 );
    }
  
}
