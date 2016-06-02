package com.company;


import java.util.Scanner;
import java.util.Random;

/**
 * Clase main contiene la ejecuccion de los metodos y funciones del programa
 *
 * @paraules Contiene las palabras que se cargaran en la base de datos del juego
 * @index Se usa para elegir la palabra que usaremos en la base de datos paraules
 * @p contendra la palabra y la mostrara en formato escondido
 */
public class Main {

    static protected String paraules[] = {"hola","programació","casa"};
    static protected int index;
    static protected String paraulaAmagada="";
    static Comprobar_Letra comprobar_letra;

    /**
     *Este main contiene el codigo para la ejecuccion del programa
     *
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("Comença el joc!");

        Random rand = new Random();
        index = rand.nextInt(3);
        for (int i=0; i<paraules[index].length(); i++) {
            paraulaAmagada += "_";
        }

        System.out.println(paraulaAmagada);

        Scanner reader = new Scanner(System.in);

        int num_errors = 0;

        comprobar_letra=new Comprobar_Letra(paraules[index],paraulaAmagada);

        while (!paraulaAmagada.equals(paraules[index]) && num_errors < 5) {
            if (!comprobar_letra.LetraEncontrada(reader.next().charAt(0))) {
                num_errors++;
                System.out.print("fallo");
            }
            comprobar_letra.PintarLetra();
        }
    }



}
