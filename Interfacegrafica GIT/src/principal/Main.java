package principal;

import controle.ControleAluno;
import visao.TelaPrincipal;


public class Main {

   
    public static void main(String[] args) {
        ControleAluno controleAluno = new ControleAluno();
        TelaPrincipal tela = new TelaPrincipal(controleAluno);
        tela.setVisible(true);
        
//        ListaAlunos telaAlunos = new ListaAlunos();
//        telaAlunos.setVisible(true);
    }
    
}
