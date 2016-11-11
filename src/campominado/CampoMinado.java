/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campominado;


import java.util.Scanner;

public class CampoMinado {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int op =1;
        int x=0,y=0,campos=0;
        System.out.print("Digite a quantidade de celulas no campo = ");
        campos = s.nextInt();
        Jogo jogo = new Jogo();
        jogo.novoJogo(campos);
        do {            
        System.out.print("Digite o valor da linha = ");
        x=s.nextInt();
        System.out.print("Digite o valor da coluna = ");
        y=s.nextInt();
        

        } while (op==1);
       
    }
    
}
