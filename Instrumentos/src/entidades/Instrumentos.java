/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Soda
 */
public class Instrumentos {
    private String origen;
    private Double precio;

    public Instrumentos() {
    }

    public Instrumentos(String origen, Double precio) {
        this.origen = origen;
        this.precio = precio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Instrumentos{" + "origen=" + origen + ", precio=" + precio + '}';
    }
    
    
    
    
}
