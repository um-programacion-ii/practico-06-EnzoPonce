package Servicios;

import org.example.entidades.Drogueria;
import org.example.entidades.Farmacia;
import org.example.entidades.Paciente;

import java.util.List;

public class GestionFarmaciaService {
    private static GestionFarmaciaService instance;
    private Farmacia farmacia;
    private Drogueria drogueria;


    private GestionFarmaciaService(){
        farmacia = new Farmacia();
        drogueria = new Drogueria();
    }

    public static GestionFarmaciaService getInstance(){
        if(instance == null){
            instance = new GestionFarmaciaService();
        }
        return instance;
    }

    public void comprarMedicamento(Paciente paciente, List<String> medicamentos){
        if (!medicamentos.isEmpty()) {
            System.out.println(paciente.getNombre() + " está comprando los siguientes medicamentos:");
            for (String medicamento : medicamentos) {
                if (farmacia.tieneStock(medicamento)) {
                    farmacia.venderMedicamento(medicamento);
                    System.out.println("- " + medicamento);
                } else {
                    System.out.println("El medicamento '" + medicamento + "' no está disponible en la farmacia.");
                    solicitarMedicamentoDrogueria(medicamento);
                }
            }
        } else {
            System.out.println("No se han especificado medicamentos para comprar.");
        }
    }

    private void solicitarMedicamentoDrogueria(String medicamento) {
        System.out.println("Solicitando el medicamento '" + medicamento + "' a la droguería...");
        drogueria.solicitarMedicamento(medicamento);
    }
}
