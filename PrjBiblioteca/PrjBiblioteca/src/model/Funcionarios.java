package model;

public class Funcionarios extends Usuario{
    //Atributos
    private String cargo;
    private String setor;

    //Metodos

    @Override
    public String toString() {
        return "Funcionarios{" +
                "cargo='" + cargo + '\'' +
                ", setor='" + setor + '\'' +
                '}';
    }

    //Construtores

    public Funcionarios(int idUsuario, String nome, String email, String cargo, String setor) {
        super(idUsuario, nome, email);
        this.cargo = cargo;
        this.setor = setor;
    }

    public Funcionarios(String cargo, String setor) {
        this.cargo = cargo;
        this.setor = setor;
    }
    public Funcionarios() {
        super();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
