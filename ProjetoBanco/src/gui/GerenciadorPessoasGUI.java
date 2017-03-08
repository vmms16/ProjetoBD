/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import dominio.Pessoa;
import dominio.Telefone;
import service.PessoaService;
import service.TelefoneService;

/**
 *
 * @author Vinicius
 */
public class GerenciadorPessoasGUI extends javax.swing.JFrame {

    private PessoaService pessoaService= new PessoaService();
    private ArrayList<Pessoa> listaPessoaBanco = pessoaService.getTodasPessoas();
    /**
     * Creates new form GerenciadorPessoasGUI
     */
    public GerenciadorPessoasGUI() {
        initComponents();
        for(int i=0; i<this.listaPessoaBanco.size(); i++){
            Pessoa pessoa = this.listaPessoaBanco.get(i);
            this.listaPessoas.add(pessoa);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listaPessoas = new ArrayList<Pessoa>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPessoa = new javax.swing.JTable();
        botaoCadastrar = new javax.swing.JToggleButton();
        botaoExcluirPessoa = new javax.swing.JButton();
        botaoEditarPessoa = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        botaoVisualizarPessoa = new javax.swing.JButton();

        listaPessoas = org.jdesktop.observablecollections.ObservableCollections.observableList(listaPessoas);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaPessoas, tabelaPessoa);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${endereco}"));
        columnBinding.setColumnName("Endereco");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(tabelaPessoa);

        botaoCadastrar.setText("Cadastrar Pessoa");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoExcluirPessoa.setText("Excluir Pessoa");
        botaoExcluirPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirPessoaActionPerformed(evt);
            }
        });

        botaoEditarPessoa.setText("Editar Pessoa");
        botaoEditarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarPessoaActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoVisualizarPessoa.setText("Visualizar Pessoa");
        botaoVisualizarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarPessoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(botaoExcluirPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoEditarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoVisualizarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoCadastrar)
                        .addGap(37, 37, 37)
                        .addComponent(botaoExcluirPessoa)
                        .addGap(51, 51, 51)
                        .addComponent(botaoEditarPessoa)
                        .addGap(38, 38, 38)
                        .addComponent(botaoVisualizarPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltar)
                        .addGap(28, 28, 28))))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        PessoaCadastroGUI pessoaCadastroGUI = new PessoaCadastroGUI();
        pessoaCadastroGUI.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(GerenciadorPessoasGUI.EXIT_ON_CLOSE);
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoExcluirPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirPessoaActionPerformed
        
        try{
            
        
        int pessoaSelecionada = this.tabelaPessoa.getSelectedRow();
        Pessoa pessoa=this.listaPessoas.get(pessoaSelecionada); 
        this.pessoaService.deletarPessoa(pessoa);
        this.listaPessoas.remove(pessoaSelecionada);
        
        }catch(ArrayIndexOutOfBoundsException e){
            ErroItem erro = new ErroItem();
            erro.setVisible(true);
        }
    }//GEN-LAST:event_botaoExcluirPessoaActionPerformed

    private void botaoVisualizarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarPessoaActionPerformed
       
        try{
        
       int pessoaSelecionada = this.tabelaPessoa.getSelectedRow();
       Pessoa pessoa = this.listaPessoas.get(pessoaSelecionada);
       PessoaCadastroGUI pessoaCadastroGUI = new PessoaCadastroGUI();
       pessoaCadastroGUI.setTextField(pessoa);
       pessoaCadastroGUI.setVisible(true);
       this.setVisible(false);
       this.setDefaultCloseOperation(GerenciadorPessoasGUI.EXIT_ON_CLOSE);
       
        }catch(ArrayIndexOutOfBoundsException e){
            ErroItem erro = new ErroItem();
            erro.setVisible(true);
        }
       
    }//GEN-LAST:event_botaoVisualizarPessoaActionPerformed

    private void botaoEditarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarPessoaActionPerformed
        try{  
            int pessoaSelecionada = this.tabelaPessoa.getSelectedRow();
            Pessoa pessoa = this.listaPessoas.get(pessoaSelecionada);
            EditaPessoa editapessoa = new EditaPessoa();
            ArrayList<Telefone> listaTelefonesPessoa = new TelefoneService().listarTelefones(pessoa);
            //editapessoa.setTextField(pessoa);
            editapessoa.setTextField(pessoa, listaTelefonesPessoa);
            editapessoa.setVisible(true);
            this.setVisible(false);
            this.setDefaultCloseOperation(GerenciadorPessoasGUI.EXIT_ON_CLOSE);
            
            
            
           
        }catch(ArrayIndexOutOfBoundsException e){
            ErroItem erro = new ErroItem();
            erro.setVisible(true);
        }
    }//GEN-LAST:event_botaoEditarPessoaActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        InicioGUI inicio = new InicioGUI();
        inicio.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(GerenciadorPessoasGUI.EXIT_ON_CLOSE);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciadorPessoasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciadorPessoasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciadorPessoasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciadorPessoasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciadorPessoasGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoCadastrar;
    private javax.swing.JButton botaoEditarPessoa;
    private javax.swing.JButton botaoExcluirPessoa;
    private javax.swing.JButton botaoVisualizarPessoa;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private java.util.List<Pessoa> listaPessoas;
    private javax.swing.JTable tabelaPessoa;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
