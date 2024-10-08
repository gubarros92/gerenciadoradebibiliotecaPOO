package model;

public class Professores extends Usuario{
    //Atributos
    private String departamento;
    private String titulacao;

    //Metodos

    @Override
    public String toString() {
        return "Professores{" +
                "departamento='" + departamento + '\'' +
                ", titulacao='" + titulacao + '\'' +
                '}';
    }

    //Construtores

    public Professores(int idUsuario, String nome, String email, String departamento, String titulacao) {
        super(idUsuario, nome, email);
        this.departamento = departamento;
        this.titulacao = titulacao;
    }
    public Professores(String departamento, String titulacao) {
        this.departamento = departamento;
        this.titulacao = titulacao;
    }
    public Professores() {}

    //Getters e Setters

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
