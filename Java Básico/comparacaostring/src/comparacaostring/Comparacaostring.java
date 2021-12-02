/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author João Pedro
 */
public class Comparacaostring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "João";
        String nome2 = "João";
        String nome3 = new String("João");
        
        String res;
        res = (nome1==nome2)? "Igual":"Diferente";//Verifica se os objetos são iguais
        res = (nome1.equals(nome3))? "Igual":"Diferente"; //Verifica se o conteudo dentro dos objetos são iguais
        System.out.println(res);
    }
}