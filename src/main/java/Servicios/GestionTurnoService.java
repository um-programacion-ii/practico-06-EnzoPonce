package Servicios;

import org.example.entidades.Medico;
import org.example.entidades.Paciente;

import java.util.HashMap;
import java.util.Map;

public class GestionTurnoService {
    private static GestionTurnoService instance;
    private Map<Paciente, Medico> turnos;

    private GestionTurnoService() {
        turnos = new HashMap<>();
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
            System.out.println(paciente.getNombre() + "Ha solicitado un turno con el Dr:" + medico.getNombre());
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
}
