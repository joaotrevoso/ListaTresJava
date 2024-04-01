package Exercicio9;

import java.util.Scanner;

public class GerarOitentaNumeros {

    public static int ContarNumeros(){

    Scanner scanner = new Scanner(System.in);

    int contador =  0;

    for(
    int i = 0;i<80;i++){

        System.out.println("Informe um numero: ");
        
        int numero = scanner.nextInt();

        if(numero >=10 && numero <= 150){

            contador++;

        }


    }

    return contador;    
}
}