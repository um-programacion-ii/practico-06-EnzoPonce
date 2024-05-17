package Dao;

import org.example.entidades.ObraSocial;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObraSocialDAO {
    private static ObraSocialDAO instance;
    private Map<String, ObraSocial> obrasSociales;

    private ObraSocialDAO() {
        obrasSociales = new HashMap<>();
    }

    public static ObraSocialDAO getInstance() {
        if (instance == null) {
            instance = new ObraSocialDAO();
        }
        return instance;
    }

    public void agregarObraSocial(ObraSocial obraSocial) {
        obrasSociales.put(obraSocial.getNombre(), obraSocial);
    }

    public ObraSocial obtenerObraSocial(String nombre) {
        return obrasSociales.get(nombre);
    }

    public List<ObraSocial> obtenerTodasLasObrasSociales() {
        return new ArrayList<>(obrasSociales.values());
    }
}
