package Pruebas;

import Servicios.ContenedorApp;
import org.example.entidades.Paciente;

public class PruebasIntegracion {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Enzo", "1", true);
        Paciente paciente2 = new Paciente("Luciana", "2", false);

        /*Obtener instancia*/
        ContenedorApp contenedorApp = ContenedorApp.getInstance();

        contenedorApp.getPacienteDAO().agregarPaciente(paciente1);
        contenedorApp.getPacienteDAO().agregarPaciente(paciente2);

        /*Obtenemos paciente utilizando PacienteDao*/
        Paciente pacienteRecuperado = contenedorApp.getPacienteDAO().obtenerPaciente("1");
        System.out.println("Paciente recuperado " + pacienteRecuperado.getNombre());

    }
}
