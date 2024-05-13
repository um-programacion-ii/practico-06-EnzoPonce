package org.example.entidades;

import java.util.HashMap;
import java.util.Map;

public class Farmacia {
    private Map<String, Integer> stock;

    public Farmacia(){
        this.stock = new HashMap<>();
    }

    public boolean tieneStock(String medicamento) {
        return stock.containsKey(medicamento) && stock.get(medicamento) > 0;
    }

    public void venderMedicamento(String medicamento) {
        if (tieneStock(medicamento)) {
            int cantidad = stock.get(medicamento);
            stock.put(medicamento, cantidad - 1);
        } else {
            System.out.println("Error: El medicamento '" + medicamento + "' no está disponible en la farmacia.");
        }
    }
}
