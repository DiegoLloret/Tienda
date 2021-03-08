/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

/**
 *
 * @author Alumno 3
 */
public class placas_cocina extends Electrodomestico{
    private construccion construccion;
    private control control;
    private material material;

    public placas_cocina() {}
    public placas_cocina(construccion construccion, control control, material material,Clasificacion_energetica Clasificacion_energetica, String gama, String codigo, String nombre, float precio, int stock) {
        super(Clasificacion_energetica, gama, codigo, nombre, precio, stock);
        this.construccion = construccion;
        this.control = control;
        this.material = material;
    }

    /**
     * @return the construccion
     */
    public construccion getConstruccion() {
        return construccion;
    }

    /**
     * @param construccion the construccion to set
     */
    public void setConstruccion(construccion construccion) {
        this.construccion = construccion;
    }

    /**
     * @return the control
     */
    public control getControl() {
        return control;
    }

    /**
     * @param control the control to set
     */
    public void setControl(control control) {
        this.control = control;
    }

    /**
     * @return the material
     */
    public material getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(material material) {
        this.material = material;
    }
@Override
    public String toString(){
      return super.toString() + "Material: " + this.material + "\nControl: " +this.control+ "\nConstruccion :"+this.construccion+"\n" ;
    }
    
    
            
}
