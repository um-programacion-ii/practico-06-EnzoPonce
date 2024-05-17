package Dao;

import org.example.entidades.Medico;

import java.util.HashMap;
import java.util.Map;

public class MedicoDAO {
    private static MedicoDAO instance;
    private Map<String, Medico> medicos;

    private MedicoDAO(){
        medicos = new HashMap<>();
    }

    public static MedicoDAO getInstance(){
        if (instance == null){
            instance = new MedicoDAO();
        }return instance;
    }

    public void agregarMedico(Medico medico){
        medicos.put(medico.getNombre(), medico);
    }

    public Medico obtenerMedico(String nombre){
        return medicos.get(nombre);
    }
}
