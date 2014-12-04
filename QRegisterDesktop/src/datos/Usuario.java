/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.io.Serializable;

/**
 *
 * @author santi
 */
public class Usuario implements Serializable{
    private String nombre;
    private int clave;
      private String fechaIngreso;
      private String ingreso;
      
      
       public Usuario() {
    }


    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getIngreso() {
        
        return ingreso;
       
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
}
