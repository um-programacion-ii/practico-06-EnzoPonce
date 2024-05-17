package Pruebas;

import Servicios.ContenedorApp;
import org.example.entidades.Especialidad;
import org.example.entidades.Medico;
import org.example.entidades.ObraSocial;
import org.example.entidades.Paciente;
import java.util.List;

public class PruebasIntegracion {

    public static void main(String[] args) {
        // Pacientes
        Paciente paciente1 = new Paciente("Enzo", "1", true);
        Paciente paciente2 = new Paciente("Luciana", "2", false);

        // Médicos
        Medico medico1 = new Medico("Dr. Rodríguez", "Pediatría", "OSPE");
        Medico medico2 = new Medico("Dr. Gómez", "Ginecología", "OSTES");

        // Obra social
        ObraSocial obraSocial1 = new ObraSocial("OSPE");
        ObraSocial obraSocial2 = new ObraSocial("OSTES");

        // Agregar médicos a las obras sociales
        obraSocial1.agregarMedico(medico1);
        obraSocial2.agregarMedico(medico2);

        // Especialidades
        Especialidad especialidad1 = new Especialidad("Pediatría");
        Especialidad especialidad2 = new Especialidad("Ginecología");

        // Obtener instancia de ContenedorApp
        ContenedorApp contenedorApp = ContenedorApp.getInstance();

        // Agregar pacientes
        contenedorApp.getPacienteDAO().agregarPaciente(paciente1);
        contenedorApp.getPacienteDAO().agregarPaciente(paciente2);

        // Agregar médicos
        contenedorApp.getMedicoDAO().agregarMedico(medico1);
        contenedorApp.getMedicoDAO().agregarMedico(medico2);

        // Asignar médicos a especialidades
        contenedorApp.getGestionTurnoService().asignarMedicoAEspecialidad(medico1, especialidad1);
        contenedorApp.getGestionTurnoService().asignarMedicoAEspecialidad(medico2, especialidad2);

        // Llamar al método para listar médicos por especialidad y obra social
        List<Medico> medicosPediatrasOSPE = contenedorApp.getGestionTurnoService().listarMedicosPorEspecialidad(especialidad1, obraSocial1);
        List<Medico> medicosGinecologosOSTES = contenedorApp.getGestionTurnoService().listarMedicosPorEspecialidad(especialidad2, obraSocial2);


        System.out.println("Médicos pediatras de OSPE:");
        for (Medico medico : medicosPediatrasOSPE) {
            System.out.println("Nombre: " + medico.getNombre() + ", Especialidad: " + medico.getEspecialidad() + ", Obra Social: " + medico.getObraSocial());
        }

        System.out.println("Médicos ginecólogos de OSTES:");
        for (Medico medico : medicosGinecologosOSTES) {
            System.out.println("Nombre: " + medico.getNombre() + ", Especialidad: " + medico.getEspecialidad() + ", Obra Social: " + medico.getObraSocial());
        }

        System.out.println("Paciente recuperado: " + contenedorApp.getPacienteDAO().obtenerPaciente("1").getNombre());
        System.out.println("Médico " + medico1.getNombre() + " asignado a la especialidad de " + medico1.getEspecialidad());
        System.out.println("Médico " + medico2.getNombre() + " asignado a la especialidad de " + medico2.getEspecialidad());

        contenedorApp.getGestionTurnoService().solicitarTurno(paciente1, medico1);

        contenedorApp.getGestionTurnoService().finalizarTurno(paciente1);

        contenedorApp.getAtencionMedicoService().atenderPaciente(paciente1,medico1);

        contenedorApp.getAtencionMedicoService().generarReseta(paciente2,medico2);
    }
}



