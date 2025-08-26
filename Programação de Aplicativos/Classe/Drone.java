package Classe;

import java.util.Objects;

public class Drone {
    
    //Atributos
    private long numSerie;
    private String marca;
    private Integer posicaoX;
    private Integer posicaoY;


    public Drone() {
        
    }

    public long getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(long numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(Integer posicaoX) {
        this.posicaoX = posicaoX;
    }

    public Integer getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(Integer posicaoY) {
        this.posicaoY = posicaoY;
    }

    public Drone(Integer posicaoY, Integer posicaoX, String marca, long numSerie) {
        this.posicaoY = posicaoY;
        this.posicaoX = posicaoX;
        this.marca = marca;
        this.numSerie = numSerie;
   
    }

    @Override
    public String toString() {
        return "Drone{" +
                "numSerie=" + numSerie +
                ", marca='" + marca + '\'' +
                ", posicaoX=" + posicaoX +
                ", posicaoY=" + posicaoY +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Drone drone = (Drone) o;
        return numSerie == drone.numSerie;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numSerie);
    }
}

