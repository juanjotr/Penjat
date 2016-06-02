package com.company;

/**
 * Created by ies on 02/06/16.
 */
public class Comprobar_Letra {

    boolean trobada=false;
    String paraula_old;
    String paraulaOriginal;
    String palabranueva;

    public Comprobar_Letra(String palabraOriginal, String palabraEscondida ){

        paraulaOriginal=palabraOriginal;
        paraula_old=palabraEscondida;
        palabranueva="";


    }

    public boolean LetraEncontrada(char letra){

        palabranueva="";
        for (int i=0; i<paraula_old.length(); i++) {
            if (paraulaOriginal.charAt(i) == letra) {
                palabranueva+=paraulaOriginal.charAt(i);
                trobada = true;
            }
            else {
                palabranueva+= paraula_old.charAt(i);
            }
        }
        System.out.println(paraula_old);
        paraula_old=palabranueva;
        return trobada;

    }

    public void PintarLetra(){

        System.out.println(palabranueva);


    }



}
