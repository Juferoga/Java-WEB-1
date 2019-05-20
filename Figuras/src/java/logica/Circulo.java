/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author estudiantes
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(){
        super();
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public void calcularArea() { 
       this.area = Math.PI*Math.pow(this.radio,2.0); 
     }  
    public void calcularPerimetro() { 
       this.perimetro = 2*Math.PI*this.radio; 
    } 
    
}
