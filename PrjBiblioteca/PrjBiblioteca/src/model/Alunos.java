package model;

public class Alunos extends Usuario{
    //Atributos
    private int matricula;
    private String curso;

    //Metodos

    @Override
    public String toString() {
        return "Alunos{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }

    //Construtor

    public Alunos(int idUsuario, String nome, String email, int matricula, String curso) {
        super(idUsuario, nome, email);
        this.matricula = matricula;
        this.curso = curso;
    }

    public Alunos(int matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }
    public Alunos(){
        super();
    }

    // Getters e Setters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
