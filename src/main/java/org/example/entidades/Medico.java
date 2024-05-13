package org.example.entidades;

public class Medico {
    private String nombre;
    private Especialidad especialidad;
    private boolean particular;

    public Medico() {
    }


    public Medico(String nombre, Especialidad especialidad, boolean particular){
        this.nombre= nombre;
        this.especialidad = especialidad;
        this.particular = particular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isParticular() {
        return particular;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }
}
