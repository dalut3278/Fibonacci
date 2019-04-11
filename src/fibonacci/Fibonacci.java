/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;

/**
 *
 * @author dalut3278
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String myInput = JOptionPane.showInputDialog(
                "The first nine fibonacci numbers are listed as follows:\n" +
                "1, 1, 2, 3, 5, 8, 13, 21, 34, ...\n" +
                "What fibonacci term would you like to see?");
        int fibNum = Integer.parseInt(myInput);

        JOptionPane.showMessageDialog(null, "The " + fibNum + "th fibonacci number is " + fib(fibNum));
    }

    public static int fib(int n){
        if((n == 1) || (n == 2)){
            return 1;
        }
        else {
            return (fib(n-1) + fib(n-2));
        }
    }
}
    
  
