package br.edu.ifsul.teste1.controle;

import br.edu.ifsul.teste1.modelo.Circulo;
import br.edu.ifsul.teste1.modelo.Quadrado;
import br.edu.ifsul.teste1.modelo.Retangulo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Circulo circulo= new Circulo(1, 5 );
    System.out.println(circulo.getRaio());
    System.out.println(circulo);
    circulo.setRaio(3);
    System.out.println( circulo.calculaArea (circulo.getRaio()));
    System.out.println( circulo.calculaPerimetro( circulo.getRaio()));

    Quadrado quadrado= new Quadrado (0,1  );
    System.out.println(quadrado.getLado());
    quadrado.setLado(3);
    System.out.println( quadrado.calculaArea (quadrado.getLado()) );
    System.out.println( quadrado.calculaPerimetro (quadrado.getLado()));



    Retangulo retangulo = new Retangulo (1, 0 ,0);
    retangulo.setBase(2.0);
    retangulo.setAltura(5.0);

    System.out.println(retangulo.getBase() + " " + retangulo.getAltura());
    System.out.println(retangulo);
    System.out.println( retangulo.calculaArea (retangulo.getBase(), retangulo.getAltura()  ));
    System.out.println( retangulo.calculaPerimetro( retangulo.getBase(), retangulo.getAltura()));


    /*
    Collection List
     */

    List <Circulo> circulos = new ArrayList <>();
    circulos.add( circulo);
    System.out.println(circulos);
    Circulo circulo2 = new Circulo ();
    circulo2.setId (2);
    circulo2.setRaio(8);
    circulos.add(circulo2);
        System.out.println(circulos);
        System.out.println( " Objetos circulos são iguais:");
        System.out.println( circulo.equals(circulo2));
        System.out.println( circulo.equals(circulo));

        System.out.println( circulos.get(0)); //mostra o primeiro elemento
        System.out.println(circulos.get (1)); // mostra o segundo elemento

        for ( Circulo c: circulos) {
            System.out.println(c);
        } // mostra todos os elementos



    /*
    Collection Map
     */
        Map <Integer, Circulo> circulosMap =
                 new HashMap<>();
        circulosMap.put (circulo.hashCode(), circulo);
        circulosMap.put (circulo2.hashCode(), circulo2);
        System.out.println( "\n\n Map");
        System.out.println( circulosMap);

        System.out.println( circulosMap.get(circulo2.hashCode())); // mostra o circulo 2








    }

    }
