package org.example.entidades;

public class Medico {
    private String nombre;
    private String especialidad;
    public String obraSocial;

    public Medico(String nombre, String especialidad, String obraSocial){
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.obraSocial = obraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
}
