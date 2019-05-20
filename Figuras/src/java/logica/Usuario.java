/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

/**
 *
 * @author Juan Felipe (Local)
 */
public class Usuario {
    
   protected double IMC;
   protected String RESIMC; 
   protected String RUTA;
   protected String DIETA;
    
   public Usuario(){
       this.IMC=0;
       this.RESIMC="";
       this.RUTA = "";
       this.DIETA = "";
       
   }
   
   public void CalcularIMC(){
   
   }
   
   public void ResIMC(){
   
   }
   
   public void Rutine(){
   
   }
   
   public void Dieta(){
   
   }
   
   public String getDieta(){
       return DIETA;
   }

    public String getRUTA() {
        return RUTA;
    }
   
   public double getIMC(){
        return IMC;
   }
   
   public String getRESIMC(){
        return RESIMC;
   }  
    
}
