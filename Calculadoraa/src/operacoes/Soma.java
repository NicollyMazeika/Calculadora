package operacoes;


import entradaNumeros.EntradaNumeros;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author info226
 */
public class Soma extends EntradaNumeros {

        public static void main(String[] args) {
           EntradaNumeros entradaNumeros = new EntradaNumeros();
           entradaNumeros.lerNumeros();
           
        System.out.println(entradaNumeros.x+entradaNumeros.y);
    }
}