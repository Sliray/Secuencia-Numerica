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
            System.out.println(c + ",");

        }
    }

    public void Padavuan(int lim) {

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
    
    private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}

}
