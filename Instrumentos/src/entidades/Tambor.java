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
public class Tambor  extends Instrumentos{
    private Integer medida;

    public Tambor() {
    }

    public Tambor(Integer medida) {
        this.medida = medida;
    }

    public Tambor(Integer medida, String origen, Double precio) {
        super(origen, precio);
        this.medida = medida;
    }
    

    public Integer getMedida() {
        return medida;
    }

    public void setMedida(Integer medida) {
        this.medida = medida;
    }
    
    
    
}
