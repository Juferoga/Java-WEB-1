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
public class FichaMedica extends Usuario {
   //Encapsulamiento
   private double Talla;
   private double Peso;
   private int Edad;
   private String Cond_Esp;
   //Constructor
   public FichaMedica(){
       super();
   }
   //Geters & Seters
       public double getTalla() {
        return Talla;
    }

    public void setTalla(double Talla) {
        this.Talla = Talla;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getCond_Esp() {
        return Cond_Esp;
    }

    public void setCond_Esp(String Cond_Esp) {
        this.Cond_Esp = Cond_Esp;
    }
    
   @Override
    public void CalcularIMC(){
        this.IMC = Peso / (Talla * Talla);
    }
    
   @Override
    public void ResIMC(){
        if(this.IMC > 19 && this.IMC <= 24.9){
            this.RESIMC="PN";
        }
        else{
            if(this.IMC > 25 && this.IMC <= 29.9){
                this.RESIMC="S";
            }
            else{
                if(this.IMC > 30 && this.IMC <= 34.9){
                    this.RESIMC="ONI";
                }
                else{
                    if(this.IMC > 35 && this.IMC <= 39.9){
                        this.RESIMC="ONII";
                    }
                    else{
                        if(this.IMC > 40){
                            this.RESIMC="ONIII";
                        }
                         else{
                                this.RESIMC="Fuera de Rango";
                            }
                        }
                    }
                }
        }
    }
}
