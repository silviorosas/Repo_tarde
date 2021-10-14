/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author lucas
 */
public class Guitarra {
    private String marca;
    private String origen;
    private String tipo;
    private String color;
    private Double precio;

    public Guitarra() {
    }

    public Guitarra(String marca, String origen, String tipo, String color, Double precio) {
        this.marca = marca;
        this.origen = origen;
        this.tipo = tipo;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Guitarra{" + "marca=" + marca + ", origen=" + origen + ", tipo=" + tipo + ", color=" + color + ", precio=" + precio + '}';
    }
    
    
    
}
