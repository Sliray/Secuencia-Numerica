/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

/**
 *
 * @author shelb
 */
public class SecuenciaNumerica {

    public void Fibonacci(int lim) {

        for (long a = 0, b = 1, c = 0; c < lim; c = a + b) {

            a = b;
            b = c;
            System.out.print(c + ",");

        }
    }

    public void Padovan(int lim) {

        int a = 1, b = 1, c = 1, d;

        for (int i = 0; i < lim; i++) {

            d = a + b;
            a = b;
            b = c;
            c = d;
            if (d <= lim) {
                System.out.print(d + ",");
            } else {
                break;
            }

        }

    }

    public void TrianguloPascal(int lim) {
        int n = lim;
        

            int[][] matriz = new int[n + 1][];
            matriz[0] = new int[]{1};

            System.out.println(String.format("%5d", matriz[0][0]));
            for (int k = 1; k < matriz.length; k++) {
                matriz[k] = new int[k + 1];
                matriz[k][0] = matriz[k][k] = 1;
                System.out.print(String.format("%5d", 1));
                for (int i = 1; i < k; i++) {
                    matriz[k][i] = matriz[k - 1][i - 1] + matriz[k - 1][i];
                    System.out.print(String.format("%5d", matriz[k][i]));
                }
                System.out.println(String.format("%5d", 1));
            }
        
    }

}
