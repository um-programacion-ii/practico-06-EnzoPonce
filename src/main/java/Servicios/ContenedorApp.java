package Servicios;

import Dao.PacienteDAO;

public class ContenedorApp {
    private AtencionMedicoService atencionMedicoService;
    private GestionFarmaciaService gestionFarmaciaService;
    private GestionTurnoService gestionTurnoService;
    private PacienteDAO pacienteDAO;

    private static ContenedorApp instance;

    private ContenedorApp() {
        gestionTurnoService = GestionTurnoService.getInstance();
        atencionMedicoService = AtencionMedicoService.getInstance();
        gestionFarmaciaService = GestionFarmaciaService.getInstance();
        pacienteDAO = PacienteDAO.getInstance();
    }

    public static ContenedorApp getInstance(){
        if(instance == null){
            instance = new ContenedorApp();
        }return instance;
    }

    public AtencionMedicoService getAtencionMedicoService() {
        return atencionMedicoService;
    }

    public GestionFarmaciaService getGestionFarmaciaService() {
        return gestionFarmaciaService;
    }

    public GestionTurnoService getGestionTurnoService() {
        return gestionTurnoService;
    }

    public PacienteDAO getPacienteDAO() {
        return pacienteDAO;
    }
}
