
package campominado;

import java.util.Random;


public class Minas extends Bomba{
    
    private String[][] mina;

     public Minas(int x) {
        this.mina = new String[x][x];
    }
    public Minas() {
        this.mina = new String[5][5];
    }
   
    
     public void criaMinas(){
      criaBomba();
       Random r = new Random();
       for(int i=0;i< mina.length;i++){
           for(int j=0;j<mina.length;j++){
              mina[i][j]=getBombas(r.nextInt(3));
           } 
       }
   }
     
     public void printMina(){
         
        for(int i=0;i< this.mina.length;i++){
            for(int j=0;j<this.mina.length;j++){
                  if(j==0){
                         System.out.println();
                        }  
               System.out.print(" ["+this.mina[i][j]+"]");   
           }
        }
               System.out.println();
               System.out.println();
               System.out.println();
     }
}
