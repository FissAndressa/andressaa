package br.edu.ifsul.teste1.modelo;

import java.util.Objects;

public class Circulo {



    private int id;
    private double raio;


    //construtores
    public Circulo() {
    }


    public Circulo(int id, double raio) {
        this.id = id;
        this.raio = raio;
    }

 // final

    public double calculaArea (double raio){

        return  Math.PI * (raio * raio);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double calculaPerimetro (double raio){
        return 2 * Math.PI * raio;

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "id=" + id +
                ", raio=" + raio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return id == circulo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


