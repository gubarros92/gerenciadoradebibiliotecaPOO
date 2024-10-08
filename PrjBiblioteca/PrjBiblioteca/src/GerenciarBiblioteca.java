import model.*;
import java.util.ArrayList;


public class GerenciarBiblioteca {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();

        // Criando usuários
        usuarios.add(new Alunos(1, "Maria Silva", "maria@email.com", 202312345, "Engenharia"));
        usuarios.add(new Professores(2, "João Oliveira", "joao@email.com", "Computação", "Doutor"));
        usuarios.add(new Funcionarios(3, "Carlos Mendes", "carlos@email.com", "Bibliotecário", "Setor de Empréstimos"));

        // Criando livros
        livros.add(new Livro(1, "Java para Iniciantes", "Autor A", true));
        livros.add(new Livro(2, "Estruturas de Dados", "Autor B", true));

        ControleEmprestimo controle = new ControleEmprestimo();

        // Registrando Empréstimos
        System.out.println(controle.registraEmprestimo(usuarios.get(0), livros.get(0)));
        System.out.println(controle.registraEmprestimo(usuarios.get(1), livros.get(1)));

        // Registrando Devoluções
        System.out.println(controle.registraDevolucao(usuarios.get(0), livros.get(0)));
        System.out.println(controle.registraDevolucao(usuarios.get(1), livros.get(1)));
    }
}
