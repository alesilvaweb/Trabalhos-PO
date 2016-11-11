/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campominado;

/**
 *
 * @author alessandros
 */
public class Jogo {
    
    private int[][]jogadas;
    private int tentativas;
    private int vidas;

    public Jogo() {
        this.jogadas = new int[5][5];
        this.tentativas = 0;
        this.vidas = 0;
    }
    public Jogo(int x) {
        this.jogadas = new int[x][x];
        this.tentativas = 0;
        this.vidas = 0;
    }

    public void novoJogo(int n){
        Minas mina = new Minas(n);
            
        mina.criaMinas();
        mina.printMina();
    }
    
    public int[][] getJogadas() {
        return jogadas;
    }

    public void setJogadas(int x ,int y) {
        this.jogadas[x][y]+=1;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
       
}
