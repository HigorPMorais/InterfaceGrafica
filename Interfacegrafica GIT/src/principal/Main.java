package principal;

import controle.ControleAluno;
import controle.ControleLogin;
import controle.ControlePrincipal;
import visao.ListaDocente;
import visao.TelaLogin;


public class Main {

   
    public static void main(String[] args) {
        ControlePrincipal controle = new ControlePrincipal();
        ControleLogin controleLogin = new ControleLogin(controle);
        
        controle.getControleLogin().abrirTelaLogin();
        
//        ListaDocente telaAlunos = new ListaDocente();
//        telaAlunos.setVisible(true);
    }
    
}
