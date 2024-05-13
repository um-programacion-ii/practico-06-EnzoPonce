package org.example.entidades;

import java.util.HashMap;
import java.util.Map;

public class Drogueria {

    private Map<String ,Integer> stock;

    public Drogueria(){
        this.stock = new HashMap<>();
    }

    public void solicitarMedicamento(String medicamento) {
        // Simulación de solicitud a la droguería
        System.out.println("El medicamento '" + medicamento + "' ha sido solicitado a la droguería.");
        // Se asume que la droguería siempre tiene el medicamento en stock infinito
        // Se podría simular un tiempo de espera antes de que el medicamento esté disponible
    }

}
