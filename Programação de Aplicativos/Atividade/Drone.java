package Atividade;
import java.util.Objects;
import java.util.*;
public class Drone {

    private String nullSerie;
    private String marca;
    private Integer posicaoX;
    private Integer posicaoY;

    public Drone(String nullSerie, String marca, Integer posicaoX, Integer posicaoY) {
        this.nullSerie = nullSerie;
        this.marca = marca;
        this.posicaoX = posicaoX;
        this.posicaoX = posicaoX;
    }
    public String getNullSerie() {
        return nullSerie;
    }
    public void setNullSerie(String nullSerie) {
        this.nullSerie = nullSerie;
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
    @Override
    public String toString() {
        return "=== Drone ==={" +
                "| Numero de serie --> " + nullSerie + '\'' +
                "| Marca --> " + marca + '\'' +
                "| Posicao X --> " + posicaoX +
                "| Posicao Y --> " + posicaoY +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drone drone)) return false;
        return Objects.equals(nullSerie, drone.nullSerie) && Objects.equals(marca, drone.marca) && Objects.equals(posicaoX, drone.posicaoX) && Objects.equals(posicaoY, drone.posicaoY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nullSerie, marca, posicaoX, posicaoY);
    }
}
