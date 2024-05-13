package org.example.entidades;

import java.util.ArrayList;
import java.util.List;

public class ObraSocial {
    private String nombre;
    private List<Medico> medicos;

    public ObraSocial() {
    }

    public ObraSocial(String nombre) {
        this.nombre = nombre;
        this.medicos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico){
        medicos.add(medico);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }
}
