/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2laco;

/**
 *
 * @author fabao
 */
public class Ex2Laco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int i = 10;
    double n;
    
//    while (i <= 100)
//    {
//        n = (i * 9 / 5) + 32;
//        System.out.println(n);
//        i += 10;
//    }

//      do
//      {
//          n = (i * 9 / 5) + 32;
//          System.out.println(n);
//          i +=10;
//      }
//      while ( i <= 100);

      for (i = 10 ; i <= 100 ; i += 10)
      {
          n = (i * 9 / 5) + 32;
          System.out.println(n);
      }
    }
}
