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
public class Cuadrado extends Figura{
    private double base;
    private double altura;
    
    public Cuadrado(){
        super();
    }
    
    public double getBase(){
        return base;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public void calcularArea() { 
        this.area = base*altura; 
     }  
    public void calcularPerimetro() { 
        this.perimetro = 2*(altura+base);
    } 
    
}
