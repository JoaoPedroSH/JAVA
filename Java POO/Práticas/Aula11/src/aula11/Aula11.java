package aula11;
public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        //System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        //System.out.println(a1.toString());
        Bolsista b1 = new Bolsista();
        //System.out.println(b1.toString());
        Tecnico t1 = new Tecnico();
        //System.out.println(t1.toString());
        
        Professor p1 = new Professor();
        p1.setNome("Thiago Nicolau");
        p1.setIdade(22);
        p1.setSexo("M");
        p1.setSalario(1800f);
        System.out.println(p1.toString());
        System.out.println("O salário do professor " + p1.getNome()+ " é de " + p1.getSalario() + " reais.");
        p1.receberAumento();
        System.out.println("O professor " + p1.getNome()+ " recebeu um aumento! \n Salário atual: " + p1.getSalario());
        
    }
}