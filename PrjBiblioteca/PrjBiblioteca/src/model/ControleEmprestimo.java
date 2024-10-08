package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class ControleEmprestimo {

    private final ArrayList<RegistroEmprestimo> emprestimos;

    public ControleEmprestimo() {
        this.emprestimos = new ArrayList<>();
    }

    public String registraEmprestimo(Usuario usuario, Livro livro) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            LocalDate dataEmprestimo = LocalDate.now();
            return "\nEmprestimo para = " + usuario.getNome() +
                    "\nTitulo = " + livro.getTitulo() +
                    "\nData de emprestimo = " + dataEmprestimo;
        } else {
            return "Livro indisponível para empréstimo.";
        }
    }

    public String registraDevolucao(Usuario usuario, Livro livro) {
        for (RegistroEmprestimo registro : emprestimos) {
            if (registro.getUsuario().equals(usuario) && registro.getLivro().equals(livro) && registro.getDataDevolucao() == null ) {
                livro.setDisponivel(true);
                LocalDate dataDevolucao = LocalDate.now();
                registro.setDataDevolucao(dataDevolucao);
                return "Devolução registrada para: " + usuario.getNome() +
                        "\nLivro: " + livro.getTitulo() +
                        "\nData da Devolução: " + dataDevolucao;
            }
        }
        return "O livro já foi devolvido ou não há registro de empréstimo.";
    }

    public ArrayList<RegistroEmprestimo> getEmprestimos() {
        return emprestimos;
    }
}

