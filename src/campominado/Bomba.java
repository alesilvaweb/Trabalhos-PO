/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campominado;

import java.util.ArrayList;

/**
 *
 * @author alessandros
 */
public class Bomba {
    
    private int valor;
    private String descricao;
    private String icon;
    private ArrayList<Bomba> bombas ;

    
    public String getBombas(int valor) {
        return  bombas.get(valor).getIcon();
      
    }
 
   public void criaBomba(){
       this.bombas = new ArrayList();
       Bomba v = new Bomba();
       Bomba p = new Bomba();
       Bomba l = new Bomba();
       
       v.setDescricao("Campo Livre"); 
       v.setValor(0);
       v.setIcon(" ");
       l.setDescricao("Bomba Leve"); 
       l.setValor(1);
       l.setIcon("L");
       p.setDescricao("Bomba Pesada");
       p.setValor(2);
       p.setIcon("P");
       
       this.bombas.add(v);
       this.bombas.add(l);
       this.bombas.add(p);
   }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    
}
