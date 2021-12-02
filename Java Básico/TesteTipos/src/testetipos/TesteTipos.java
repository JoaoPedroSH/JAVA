package testetipos;
public class TesteTipos {
    public static void main(String[] args) {
        /*int idade = 30;
        String valor = Integer.toString(idade); //Convertendo valor usando uma classe envolucro
        System.out.println(valor);*/
        
        String valor = "30";
        int idade = Integer.parseInt(valor); // em caso de float ou outras classes( float idade = Float.parseFloat(valor); )
        System.out.println(idade);
    } 
}