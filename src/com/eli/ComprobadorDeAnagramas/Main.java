package com.eli.ComprobadorDeAnagramas;

public class Main {

    public static void main(String[] args) {
	    String textoDeOrigen = "PRO TESTA";
        String textoPorComprobar ="portaste";
        
        //int a= ' ';
        //System.out.println("a = " + a);

        char[] comprobador= normalizar(textoDeOrigen);
        System.out.println("comprobador = " + comprobador);
    }

    public static char[] normalizar(String entrada){
        entrada=entrada.toLowerCase();
        char[] salida=entrada.toCharArray();
        return salida;

    }
}
