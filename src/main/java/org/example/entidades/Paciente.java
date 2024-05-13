package org.example.entidades;



public class Paciente {
    private String nombre;
    private String id;
    private Boolean obraSocial;



    public Paciente() {
    }

    public Paciente(String nombre, String id, Boolean obraSocial) {
        this.nombre = nombre;
        this.id = id;
        this.obraSocial = obraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(Boolean obraSocial) {
        this.obraSocial = obraSocial;
    }
}
