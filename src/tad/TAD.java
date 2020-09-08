/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import java.util.Scanner;

/**
 *
 * @author lab212
 */
public class TAD {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila f = new Fila();
        String nome, nome2, nome3;
        nome = "Leo";
        nome2 = "Tmr";
        nome3 = "xD";
        f.push(nome);
        f.push(nome2);
        System.out.println(f.show());
        f.pop();
        f.inject(nome3);
        System.out.println(f.show());
        f.eject();
        System.out.println(f.show());
        f.size();
    }
}
