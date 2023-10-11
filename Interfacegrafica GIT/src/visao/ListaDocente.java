package visao;

import controle.ControleDocente;
import javax.swing.table.DefaultTableModel;
import modelo.Docente;

/**
 *
 * @author ANDRE.LUCHESI
 */
public class ListaDocente extends javax.swing.JFrame {

    private ControleDocente controleDocente;
    /**
     * Creates new form ListaAlunos
     */
    public ListaDocente(ControleDocente controleDocente) {
        initComponents();
        setLocationRelativeTo(null);
        this.controleDocente = controleDocente;
        setarDadosTabela();
    }

    public void setarDadosTabela() {
        String[][] dados = new String[controleDocente.getDocentes().size()][4];
        String[] colunas = new String[]{"Nome", "CPF", "E-mail", "Formacao"};

        int linha =0;
        for (Docente docente : controleDocente.getDocentes()) {
            dados[linha][0] = docente.getNome();
            dados[linha][1] = docente.getCpf();
            dados[linha][2] = docente.getEmail();
            dados[linha][3] = docente.getFormacao();
            linha++;
        }

        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                dados,
                colunas
        ) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };

        jTableAlunos.setModel(model);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jB_Adicionar = new javax.swing.JButton();
        jB_Remover = new javax.swing.JButton();
        jB_Editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Docente");

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "E-mail", "Formacao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlunos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlunos);

        jB_Adicionar.setText("Adicionar");
        jB_Adicionar.setPreferredSize(new java.awt.Dimension(100, 30));
        jB_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AdicionarActionPerformed(evt);
            }
        });

        jB_Remover.setText("Remover");
        jB_Remover.setPreferredSize(new java.awt.Dimension(100, 30));
        jB_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_RemoverActionPerformed(evt);
            }
        });

        jB_Editar.setText("Editar");
        jB_Editar.setToolTipText("");
        jB_Editar.setActionCommand("");
        jB_Editar.setPreferredSize(new java.awt.Dimension(100, 30));
        jB_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(385, Short.MAX_VALUE)
                        .addComponent(jB_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked
        if (evt.getClickCount() > 1 && jTableAlunos.getSelectedRow()>=0) {
            int linha = jTableAlunos.getSelectedRow();
            controleDocente.abrirTelaCadastroParaEdicao(linha);
        }
    }//GEN-LAST:event_jTableAlunosMouseClicked

    private void jB_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_EditarActionPerformed
        int linha = jTableAlunos.getSelectedRow();
        if(linha>=0){
            controleDocente.abrirTelaCadastroParaEdicao(linha);
        }
    }//GEN-LAST:event_jB_EditarActionPerformed

    private void jB_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AdicionarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableAlunos.getModel();
        model.addRow(new Object[4]);
        controleDocente.abrirTelaCadastro();
    }//GEN-LAST:event_jB_AdicionarActionPerformed

    private void jB_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_RemoverActionPerformed
        int posicao = jTableAlunos.getSelectedRow();
        if(posicao >= 0){
            controleDocente.removerAluno(posicao);
            DefaultTableModel model = (DefaultTableModel) jTableAlunos.getModel();
            model.removeRow(posicao);
        }
    }//GEN-LAST:event_jB_RemoverActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Adicionar;
    private javax.swing.JButton jB_Editar;
    private javax.swing.JButton jB_Remover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlunos;
    // End of variables declaration//GEN-END:variables
}
