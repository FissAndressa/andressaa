package br.edu.ifsul.teste1.modelo;

import java.util.Objects;

public class Quadrado {

   private double lado;
   private int id;


    public Quadrado() {
    }

    public Quadrado(double lado, int id) {
        this.lado = lado;
        this.id = id;
    }

    public double calculaArea (double lado) {
        return (lado * lado);
    }

    public double calculaPerimetro (double lado) {
        return 4*lado;
    }

    public double getLado() {
        return lado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadrado quadrado = (Quadrado) o;
        return id == quadrado.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}