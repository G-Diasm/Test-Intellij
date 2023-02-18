package app;


import app.gat.Gato;

import java.io.PrintStream;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintStream queijo = System.out;
        Gato gato = new Gato();

        queijo.println(gato);
        /*queijo.println("Qual o seu nome");
        String nome = scan.nextLine();*/
    }
}
