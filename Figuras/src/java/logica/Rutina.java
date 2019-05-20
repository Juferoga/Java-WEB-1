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
public class Rutina extends Usuario{
    
    private String Tipo;
    private String Intensidad;
    private String Ruta;
    
    public Rutina(){
        super ();
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getIntensidad() {
        return Intensidad;
    }

    public void setIntensidad(String Intensidad) {
        this.Intensidad = Intensidad;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }
    
    @Override
    public void Rutine(){
        if("PN".equals(this.RESIMC) && "B".equals(this.Intensidad)){
        }
        else{
            if("PN".equals(this.RESIMC) && "M".equals(this.Intensidad)){
            }
            else{
                if("PN".equals(this.RESIMC) && "A".equals(this.Intensidad)){
                    this.Ruta="";
                }
                else{
                    if("S".equals(this.RESIMC) && "B".equals(this.Intensidad)){
                        this.Ruta="";
                    }
                    else{
                        if("S".equals(this.RESIMC) && "M".equals(this.Intensidad)){
                            this.Ruta="";
                        }
                        else{
                            if("S".equals(this.RESIMC) && "A".equals(this.Intensidad)){
                                this.Ruta="";
                            }
                            else{
                                if("ONI".equals(this.RESIMC) && "B".equals(this.Intensidad)){
                                    this.Ruta="";
                                }
                                else{
                                    if("ONI".equals(this.RESIMC) && "M".equals(this.Intensidad)){
                                        this.Ruta="";
                                    }
                                    else{
                                        if("ONI".equals(this.RESIMC) && "A".equals(this.Intensidad)){
                                            this.Ruta="";
                                        }
                                        else{
                                            if("ONII".equals(this.RESIMC) && "B".equals(this.Intensidad)){
                                                this.Ruta="";
                                            }
                                            else{
                                                if("ONII".equals(this.RESIMC) && "M".equals(this.Intensidad)){
                                                    this.Ruta="";
                                                }
                                                else{
                                                    if("ONII".equals(this.RESIMC) && "A".equals(this.Intensidad)){
                                                        this.Ruta="";
                                                    }
                                                    else{
                                                        if("ONIII".equals(this.RESIMC) && "B".equals(this.Intensidad)){
                                                            this.Ruta="";
                                                        }
                                                        else{
                                                            if("ONIII".equals(this.RESIMC) && "M".equals(this.Intensidad)){
                                                                this.Ruta="";
                                                            }
                                                            else{
                                                                if("ONIII".equals(this.RESIMC) && "A".equals(this.Intensidad)){
                                                                    this.Ruta="";
                                                                }
                                                                else{
                                                                    this.Ruta="";
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
