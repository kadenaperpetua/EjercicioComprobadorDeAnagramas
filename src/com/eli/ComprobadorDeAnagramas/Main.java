package com.eli.ComprobadorDeAnagramas;

public class Main {

    public static void main(String[] args) {
	    String entrada1 = "PROTESTA";
        String entrada2 ="portaste";
        comprobarAnagrama(entrada1,entrada2);


        String entrada3 = "Tom Marvolo Riddle";
        String entrada4 ="I am Lord Voldemort";
        comprobarAnagrama(entrada3,entrada4);

        }

    public static char[] normalizar(String entrada){
        entrada=entrada.toLowerCase();
        char[] salida = entrada.toCharArray();
        return salida;
    }


    public static int contarInstancias(char[] entrada){
        int instancias=0;
        for (char letra:entrada){
            if (letra != 32){
                instancias++;
            }

        }
        return instancias;
    }

    public static void comprobarAnagrama(String entrada1, String entrada2){
        char[] entrada1norm = normalizar(entrada1);
        char[] entrada2norm = normalizar(entrada2);

        int sumatoria1 = 0;
        int sumatoria2 = 0;
        int contador1 = 0;
        int contador2 = 0;

        for (char letra:entrada1norm) {
            if (letra != 32) {
                sumatoria1+= letra;
                contador1++;
            }
        }

        for (char letra:entrada1norm){
            if (letra != 32){
                sumatoria2+= letra;
                contador2++;
            }
        }

        if(sumatoria1==sumatoria2 && contador1==contador2){
            System.out.println("El texto es un anagrama");
        }else{
            System.out.println("El texto no es un anagrama");
        }





    }




}
