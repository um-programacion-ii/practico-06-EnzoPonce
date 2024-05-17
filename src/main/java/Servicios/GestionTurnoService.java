package Servicios;

import Dao.MedicoDAO;
import org.example.entidades.Especialidad;
import org.example.entidades.Medico;
import org.example.entidades.ObraSocial;
import org.example.entidades.Paciente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionTurnoService {
    private static GestionTurnoService instance;
    private Map<Paciente, Medico> turnos;
    private MedicoDAO medicoDAO;
    private Map<Medico, Especialidad> especialidadesMedicos;

    private GestionTurnoService() {
        turnos = new HashMap<>();
        medicoDAO = MedicoDAO.getInstance();
        especialidadesMedicos = new HashMap<>();
    }

    public static GestionTurnoService getInstance() {
        if (instance == null) {
            instance = new GestionTurnoService();
        }
        return instance;
    }

    public void solicitarTurno(Paciente paciente, Medico medico){
        if(!turnos.containsKey(paciente)){
            turnos.put(paciente,medico);
            System.out.println(paciente.getNombre() + " ha solicitado un turno con el " + medico.getNombre());
        }else {
            System.out.println("El paciente ya ha solicitado un turno");
        }
    }

    public void finalizarTurno(Paciente paciente){
        if(!turnos.containsKey(paciente)){
            turnos.remove(paciente);
            System.out.println(paciente.getNombre() + "Ha finalizado su turno");
        }else {
            System.out.println("El paciente no tiene turnos pendientes");
        }
    }

    public void asignarMedicoAEspecialidad(Medico medico, Especialidad especialidad) {
        especialidadesMedicos.put(medico, especialidad);
    }


    public List<Medico> listarMedicosPorEspecialidad(Especialidad especialidad, ObraSocial obraSocial) {
        List<Medico> medicosPorEspecialidad = new ArrayList<>();
        // Iterar sobre todos los médicos para determinar su especialidad y obra social
        for (Map.Entry<Paciente, Medico> entry : turnos.entrySet()) {
            Medico medico = entry.getValue();
            if (medico.getEspecialidad().equals(especialidad.getNombre()) &&
                    medico.getObraSocial().equals(obraSocial.getNombre())) {
                medicosPorEspecialidad.add(medico);
            }
        }
        return medicosPorEspecialidad;
    }



}
