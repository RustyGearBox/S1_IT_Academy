package org.example;

import java.util.ArrayList;

public class GestioButaques {
    private ArrayList<Butaca> butaques;

    public GestioButaques() {
        butaques = new ArrayList<>();
    }

    public ArrayList<Butaca> getButaques() {
        return butaques;
    }

    public void afegirButaca(Butaca butaca) throws ExcepcioButacaOcupada {
        if (cercarButaca(butaca.getFila(), butaca.getSeient()) != -1) {
            throw new ExcepcioButacaOcupada("Butaca ocupada: " + butaca);
        }
        butaques.add(butaca);
    }

    public void eliminarButaca(int fila, int seient) throws ExcepcioButacaLliure {
        int index = cercarButaca(fila, seient);
        if (index == -1) {
            throw new ExcepcioButacaLliure("Butaca lliure: Fila " + fila + ", Seient " + seient);
        }
        butaques.remove(index);
    }

    public int cercarButaca(int fila, int seient) {
        for (int i = 0; i < butaques.size(); i++) {
            if (butaques.get(i).getFila() == fila && butaques.get(i).getSeient() == seient) {
                return i;
            }
        }
        return -1;
    }
}

class ExcepcioNomPersonaIncorrecte extends Exception {
    public ExcepcioNomPersonaIncorrecte(String message) {
        super(message);
    }
}

class ExcepcioFilaIncorrecta extends Exception {
    public ExcepcioFilaIncorrecta(String message) {
        super(message);
    }
}

class ExcepcioSeientIncorrecte extends Exception {
    public ExcepcioSeientIncorrecte(String message) {
        super(message);
    }
}

class ExcepcioButacaOcupada extends Exception {
    public ExcepcioButacaOcupada(String message) {
        super(message);
    }
}

class ExcepcioButacaLliure extends Exception {
    public ExcepcioButacaLliure(String message) {
        super(message);
    }
}

