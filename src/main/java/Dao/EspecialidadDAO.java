package Dao;

import org.example.entidades.Especialidad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EspecialidadDAO {
    private static EspecialidadDAO instance;
    private Map<String, Especialidad> especialidades;

    private EspecialidadDAO() {
        especialidades = new HashMap<>();
    }

    public static EspecialidadDAO getInstance() {
        if (instance == null) {
            instance = new EspecialidadDAO();
        }
        return instance;
    }

    public void agregarEspecialidad(Especialidad especialidad) {
        especialidades.put(especialidad.getNombre(), especialidad);
    }

    public Especialidad obtenerEspecialidad(String nombre) {
        return especialidades.get(nombre);
    }

    public List<Especialidad> obtenerTodasLasEspecialidades() {
        return new ArrayList<>(especialidades.values());
    }
}