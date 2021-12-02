/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author João Pedro
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r, r1;
        n1 = 4;
        n2 = 8;
        r = (n1>n2) ? n1:n2;
        r1 = (n1<n2) ? n1+n2:n1-n2;
        System.out.println(r);
        System.out.println(r1);
    }
}