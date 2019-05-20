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
public class Dieta extends Usuario{
    private String Nombre;
    private String DietaRecomendada;

    public Dieta(){
        super();
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDietaRecomendada() {
        return DietaRecomendada;
    }

    public void setDietaRecomendada(String DietaRecomendada) {
        this.DietaRecomendada = DietaRecomendada;
    }
    
    @Override
    public void Dieta(){
        if("PN".equals(this.RESIMC)){
        this.DIETA = "<iframe width=\"853\" height=\"480\" src=\"https://www.youtube.com/embed/MSfCqoVkcFg\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";
        }
        else{
            if("S".equals(this.RESIMC)){
            this.DIETA = "<iframe width=\"853\" height=\"480\" src=\"https://www.youtube.com/embed/8Pf9eZALd14\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";
            }
            else{
              if("ONI".equals(this.RESIMC)){
              this.DIETA = "<img src=\"MENU-EJEMPLO-ADELGAZAR-PERDIDA-DE-PESO.jfif\">";
              }
              else{
                  if("ONII".equals(this.RESIMC)){
                      this.DIETA = "<img src=\"DietaO2.png\">";
                  }
                  else{
                      if("ONIII".equals(this.RESIMC)){
                      this.DIETA = "<img src=\"DietaO3.png\">";
                        }
                      else{
                        this.DIETA = "<iframe width=\"853\" height=\"480\" src=\"https://www.youtube.com/embed/MSfCqoVkcFg\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";
                      }
                  }
              }
            }
        }
    }
}
