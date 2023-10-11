package controle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;

public class ControleAluno {
    List<Aluno> alunos = new ArrayList<>();

    public ControleAluno() {
    }

    
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(String nome, String cpf, String email, String genero, String curso, LocalDate dataNascimento){
        Aluno al = new Aluno(nome, cpf, email, genero, curso, dataNascimento);
        alunos.add(al);
    }
}