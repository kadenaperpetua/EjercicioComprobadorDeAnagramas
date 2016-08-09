package com.eli.ComprobadorDeAnagramas;

public class Main {

    public static void main(String[] args) {

        String entrada1 = "PROTESTA";
        String entrada2 = "portaste";
        comprobarAnagrama(entrada1,entrada2);


        entrada1 = "Tom Marvolo Riddle";
        entrada2 = "I am Lord Voldemort";
        comprobarAnagrama(entrada1,entrada2);


        entrada1 = "abef";
        entrada2= "acdf";
        comprobarAnagrama(entrada1,entrada2);

        entrada1 = "aabcd";
        entrada2= "abbcd";
        comprobarAnagrama(entrada1,entrada2);





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


        //Condicion 1: La sumatoria de valores UNICODE de todas las letras debe ser la misma en ambos textos.
        int sumatoria1 = 0;
        int sumatoria2 = 0;


        //Condicion 2: La cantidad de letras debe ser la misma en ambos textos.
        int contador1 = 0;
        int contador2 = 0;

        //condicion3: Todas las letras deben estar presentes al menos una vez en cada texto.
        int comprobador = 0;


        for (char letra:entrada1norm) {
            if (letra != 32) {
                sumatoria1+= letra;
                contador1++;


                for (int i=0;i<entrada2norm.length;i++){
                    if (entrada2norm[i]==letra) {
                        comprobador++ ;
                        break;
                    }

                }

            }

        }



        for (char letra:entrada2norm){
            if (letra != 32){
                sumatoria2+= letra;
                contador2++;
            }
        }

        /*
        System.out.println("sumatoria1 = " + sumatoria1);
        System.out.println("sumatoria2 = " + sumatoria2);
        System.out.println("contador1 = " + contador1);
        System.out.println("contador2 = " + contador2);
        System.out.println("comprobador = " + comprobador);

        */



        if(sumatoria1==sumatoria2 && contador1==contador2 && contador1==comprobador){
            System.out.println("El texto es un anagrama");
        }else{
            System.out.println("El texto no es un anagrama");
        }





    }




}
