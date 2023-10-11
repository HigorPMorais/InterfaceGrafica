package controle;

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
}
