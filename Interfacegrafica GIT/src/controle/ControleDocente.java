package controle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Docente;
import visao.ListaDocente;
import visao.TelaCadastroAluno;
import visao.TelaCadastroDocente;

public class ControleDocente {
    
    private TelaCadastroDocente telaCadastro;
    private ListaDocente telaListagem;
    private List<Docente> docentes = new ArrayList();
    private Docente docenteSelecionado;

    public ControleDocente() {
    }

    public ControleDocente(TelaCadastroDocente telaCadastro, ListaDocente telaListagem, Docente docenteSelecionado) {
        this.telaCadastro = telaCadastro;
        this.telaListagem = telaListagem;
        this.docenteSelecionado = docenteSelecionado;
    }

    public TelaCadastroDocente getTelaCadastro() {
        return telaCadastro;
    }

    public ListaDocente getTelaListagem() {
        return telaListagem;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public Docente getDocenteSelecionado() {
        return docenteSelecionado;
    }
    
    public void editarDocente(String nome, String cpf, String email,
            String genero, String curso, LocalDate dataNascimento){
        if(docenteSelecionado != null){
            docenteSelecionado.setNome(nome);
            docenteSelecionado.setCpf(cpf);
            docenteSelecionado.setEmail(email);
            docenteSelecionado.setFormacao(curso);
            docenteSelecionado.setGenero(genero);
            docenteSelecionado.setDataNascimento(dataNascimento);
        }
    }

    public void adicionarDocente(String nome, String cpf, String email,
            String genero, String formacao, LocalDate dataNascimento) {

        Docente dc = new Docente(nome, cpf, email, genero, formacao, dataNascimento);
        docentes.add(dc);
    }

    public Docente getDocenteSelecionado(int index) {
        if (index >= 0 && index < docentes.size()) {
            return docentes.get(index);
        }
        return null;
    }
    
    public void abrirTelaListaDocente(){
        telaListagem = new ListaDocente(this);
        telaListagem.setVisible(true);
    }

     public void abrirTelaCadastro(){
         telaCadastro = new TelaCadastroDocente(this);
         telaCadastro.setVisible(true);
     }
     
    public void abrirTelaCadastroParaEdicao(int index) {
        docenteSelecionado = getDocenteSelecionado(index);
        if (docenteSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Falha ao Editar Aluno!\nAluno não encontrado!", "Falha ao Editar", JOptionPane.ERROR_MESSAGE);
        }
        telaCadastro = new TelaCadastroDocente(this, telaListagem,
                docenteSelecionado.getNome(),
                docenteSelecionado.getCpf(),
                docenteSelecionado.getEmail(),
                docenteSelecionado.getFormacao(),
                docenteSelecionado.getGenero(),
                docenteSelecionado.getDataNascimento()
        );
        telaCadastro.setVisible(true);
    }

    public void removerAluno(int index) {
        docentes.remove(index);
    }
    
}
