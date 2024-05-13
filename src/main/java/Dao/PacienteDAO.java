package Dao;


import java.util.*;
import org.example.entidades.Paciente;
public class PacienteDAO {
    private static PacienteDAO instance;
    private Map<String, Paciente> pacientes;

    private PacienteDAO() {
        pacientes = new HashMap<>();
    }

    public static PacienteDAO getInstance() {
        if (instance == null) {
            instance = new PacienteDAO();
        }
        return instance;
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.put(paciente.getId(), paciente);
    }

    public Paciente obtenerPaciente(String id) {
        return pacientes.get(id);
    }

    public List<Paciente> obtenerTodosLosPacientes() {
        return new ArrayList<>(pacientes.values());
    }
}

