package com.eli.ComprobadorDeAnagramas;

public class Main {

    public static void main(String[] args) {
	    String textoDeOrigen = "PRO TESTA";
        String textoPorComprobar ="portaste";
        
        //int a= ' ';
        //System.out.println("a = " + a);

        char[] comprobador= normalizar(textoDeOrigen);

        for(int i=0;i<comprobador.length;i++) {
            System.out.print(comprobador[i]);
        }



    }

    public static char[] normalizar(String entrada){
        entrada=entrada.toLowerCase();
        char[] salida = entrada.toCharArray();
        return salida;
    }

    public static int contarEspacios(char[] entrada){
        int espacios=0;
        for (char letra:entrada){
            if (letra == 32){
                espacios++;
            }

        }
        return espacios;
    }


    public static char[] borrarEspacios(char[] entrada){
        char[] salida = char[entrada.length-contarEspacios(entrada)];

        for(int i=0;i<entrada.length-contarEspacios(entrada);i++);

    }

}
