package Servicios;

import Dao.PacienteDAO;
import org.example.entidades.Medico;
import org.example.entidades.Paciente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AtencionMedicoService {
    private static AtencionMedicoService instance;
    private PacienteDAO pacienteDAO;
    private Map<Medico, List<Paciente>> pacientesAtendidos;

    private AtencionMedicoService(){
        this.pacientesAtendidos = new HashMap<>();
        pacienteDAO = PacienteDAO.getInstance();
    }

    public static AtencionMedicoService getInstance() {
        if (instance == null) {
            instance = new AtencionMedicoService();
        }
        return instance;
    }

    public void atenderPaciente(Paciente paciente, Medico medico){
        if(!pacientesAtendidos.containsKey(medico)){
            pacientesAtendidos.put(medico, new ArrayList<>());
        }
        pacientesAtendidos.get(medico).add(paciente);
        System.out.println("El paciente " + paciente.getNombre() + " esta siendo atendido por " + medico.getNombre());
    }

    public void generarReseta(Paciente paciente, Medico medico){
        if (pacientesAtendidos.containsKey(medico) && pacientesAtendidos.get(medico).contains(paciente)){
            boolean recetaGenerada = Math.random() < 0.5;
            if (recetaGenerada) {
                System.out.println("El " + medico.getNombre() + " generó una receta para " + paciente.getNombre());
            } else {
                System.out.println("No se generó una receta");
            }
        } else {
        System.out.println("El " + medico.getNombre() + " no está atendiendo al paciente " + paciente.getNombre());
        }
    }

}
