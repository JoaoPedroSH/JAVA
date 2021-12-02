/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefinal05;

/**
 *
 * @author João Pedro
 */
public class TesteFinal05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v0 = 3;
int v1 = v0++;
int v2 = ++v1;
v1 += v0;
v2 += --v1;

        System.out.println(v0);
        System.out.println(v1);
        System.out.println(v2);
    }
    
}
