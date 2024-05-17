package Servicios;

import Dao.EspecialidadDAO;
import Dao.MedicoDAO;
import Dao.ObraSocialDAO;
import Dao.PacienteDAO;

public class ContenedorApp {
    private AtencionMedicoService atencionMedicoService;
    private GestionFarmaciaService gestionFarmaciaService;
    private GestionTurnoService gestionTurnoService;
    private PacienteDAO pacienteDAO;
    private MedicoDAO medicoDAO;
    private EspecialidadDAO especialidadDAO;
    private ObraSocialDAO obraSocialDAO;
    private static ContenedorApp instance;

    private ContenedorApp() {
        gestionTurnoService = GestionTurnoService.getInstance();
        atencionMedicoService = AtencionMedicoService.getInstance();
        gestionFarmaciaService = GestionFarmaciaService.getInstance();
        pacienteDAO = PacienteDAO.getInstance();
        medicoDAO = MedicoDAO.getInstance();
        especialidadDAO = EspecialidadDAO.getInstance();
        obraSocialDAO = ObraSocialDAO.getInstance();
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

    public MedicoDAO getMedicoDAO() {
        return medicoDAO;
    }

    public EspecialidadDAO getEspecialidadDAO(){
        return especialidadDAO;
    }

    public ObraSocialDAO getObraSocialDAO() {
        return obraSocialDAO;
    }
}
