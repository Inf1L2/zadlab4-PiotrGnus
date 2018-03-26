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
public class Kolo {
   
       float r ;
       float o;
       float p;

    public Kolo(float r) { this.r = r;}
       public void  o(){this.o = (float) (2*3.14f*this.r);}
        public void  p() {this.p = (float) (3.14f*(this.r*this.r)); }

   
   public void kolo()
   {
        this.p();
        this.o();
        System.out.println("Koło");
        System.out.println("Pole wynosi = " + this.p );
        System.out.println("Obwód wynosi = " + this.o );
   }
   
   
    
}
       
  
    

