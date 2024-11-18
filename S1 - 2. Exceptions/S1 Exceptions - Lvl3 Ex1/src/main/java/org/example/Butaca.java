package org.example;

public class Butaca {

    private int fila;
    private int seient;
    private String persona;

    public Butaca(int fila, int seient, String persona) {
        this.fila = fila;
        this.seient = seient;
        this.persona = persona;
    }

    public int getFila() {
        return fila;
    }

    public int getSeient() {
        return seient;
    }

    public String getPersona() {
        return persona;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Butaca)) return false;
        Butaca other = (Butaca) obj;
        return this.fila == other.fila && this.seient == other.seient;
    }

    @Override
    public String toString() {
        return "Fila: " + fila + ", Seient: " + seient + ", Persona: " + persona;
    }
}

