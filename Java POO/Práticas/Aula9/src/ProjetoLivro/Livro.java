package ProjetoLivro;

public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String altor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos Públicos
    public String detalhes() {
        return "Livro {" + " Titulo = " + titulo + ", Altor = " + altor 
                + ",\n Total de Paginas = " + totPaginas + ", Pagina Atual = " + pagAtual + ", Aberto = " + aberto 
                + ",\n Leitor = " + leitor.getNome() + ", Idade do Leitor = " + leitor.getIdade() + ", Sexo = " + leitor.getSexo()
                + " }";
    }
    
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas){
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

    //Métodos Especiais
    public Livro(String titulo, String altor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.altor = altor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAltor() {
        return altor;
    }

    public void setAltor(String altor) {
        this.altor = altor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}