/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import conexao.ConexaoBD;
import DAO.DAOCliente;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.ModelCliente;
import model.ModelTabela;

/**
 *
 * @author Marcio Henrique
 */
public class FormCliente extends javax.swing.JFrame {

    ModelCliente mod = new ModelCliente();
    DAOCliente control = new DAOCliente();
    ConexaoBD conex = new ConexaoBD();
    
    int flag = 0;
    
    public FormCliente() {
        initComponents();
        preencherTabela("select * from cadclientes order by nome_cliente");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCadClientes = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelRG = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelOpcao = new javax.swing.JLabel();
        jComboBoxOpcao = new javax.swing.JComboBox<>();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldRG = new javax.swing.JTextField();
        jLabelCEP = new javax.swing.JLabel();
        jTextFieldCEP = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelUF = new javax.swing.JLabel();
        jTextFieldUF = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLabelEstadoCivil = new javax.swing.JLabel();
        jComboBoxEstadoCivil = new javax.swing.JComboBox<>();
        jLabelPerfil = new javax.swing.JLabel();
        jTextFieldPerfil = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCad = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelCadClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelNome.setText("Nome:");

        jLabelCPF.setText("CPF: ");

        jLabelRG.setText("RG:");

        jTextFieldNome.setEnabled(false);

        jLabelOpcao.setText("Opção de serviço:");

        jComboBoxOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Self-Service", "Kilograma", "Pratos do Cardapio", "Bebidas - Petiscos" }));
        jComboBoxOpcao.setEnabled(false);
        jComboBoxOpcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcaoActionPerformed(evt);
            }
        });

        jTextFieldCPF.setEnabled(false);

        jTextFieldRG.setEnabled(false);
        jTextFieldRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRGActionPerformed(evt);
            }
        });

        jLabelCEP.setText("CEP:");

        jTextFieldCEP.setEnabled(false);
        jTextFieldCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCEPActionPerformed(evt);
            }
        });

        jLabelEndereco.setText("Endereço:");

        jTextFieldEndereco.setEnabled(false);

        jLabelCidade.setText("Cidade:");

        jTextFieldCidade.setEnabled(false);
        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });

        jLabelUF.setText("UF:");

        jTextFieldUF.setEnabled(false);

        jLabelSexo.setText("Sexo:");

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));
        jComboBoxSexo.setEnabled(false);

        jLabelEstadoCivil.setText("Estado Civil:");

        jComboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado" }));
        jComboBoxEstadoCivil.setEnabled(false);

        jLabelPerfil.setText("Perfil:");

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.setEnabled(false);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setEnabled(false);

        jLabel2.setText("Código");

        jTableCad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableCad);

        javax.swing.GroupLayout jPanelCadClientesLayout = new javax.swing.GroupLayout(jPanelCadClientes);
        jPanelCadClientes.setLayout(jPanelCadClientesLayout);
        jPanelCadClientesLayout.setHorizontalGroup(
            jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                                .addComponent(jLabelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                                .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                                        .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelNome)
                                                .addComponent(jLabelRG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                                                .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldRG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                                                        .addComponent(jLabelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                                                        .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonPesquisar))
                                    .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                                        .addComponent(jLabelOpcao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                                        .addComponent(jLabelEndereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelUF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldUF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44)
                                .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                                .addComponent(jLabelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(110, 110, 110))
        );
        jPanelCadClientesLayout.setVerticalGroup(
            jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                        .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                        .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCidade)
                            .addComponent(jTextFieldCPF)
                            .addGroup(jPanelCadClientesLayout.createSequentialGroup()
                                .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelRG, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldRG)
                                .addComponent(jLabelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUF)
                            .addComponent(jTextFieldUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241)
                .addGroup(jPanelCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        getContentPane().add(jPanelCadClientes);
        jPanelCadClientes.setBounds(20, 30, 720, 470);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Clientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 0, 320, 30);

        setSize(new java.awt.Dimension(787, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxOpcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOpcaoActionPerformed

    private void jTextFieldRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRGActionPerformed

    private void jTextFieldCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCEPActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        jTextFieldCEP.setEnabled(!true);
        jTextFieldCPF.setEnabled(!true);
        jTextFieldCidade.setEnabled(!true);
        jTextFieldEndereco.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jTextFieldPerfil.setEnabled(!true);
        jTextFieldRG.setEnabled(!true);
        jTextFieldUF.setEnabled(!true);
        jComboBoxEstadoCivil.setEnabled(!true);
        jComboBoxOpcao.setEnabled(!true);
        jComboBoxSexo.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(flag ==1){
        mod.setNome(jTextFieldNome.getText());
        mod.setSexo((String) jComboBoxSexo.getSelectedItem());
        mod.setEstadoCivil((String) jComboBoxEstadoCivil.getSelectedItem());
        mod.setOpcaoServico((String) jComboBoxOpcao.getSelectedItem() );
        mod.setCPF(jTextFieldCPF.getText());
        mod.setCidade(jTextFieldCidade.getText());
        mod.setRG(jTextFieldRG.getText());
        mod.setCEP(jTextFieldCEP.getText());
        mod.setEndereco(jTextFieldEndereco.getText());
        mod.setUF(jTextFieldUF.getText());
        control.Salvar(mod);
        jTextFieldNome.setText("");
        jTextFieldCEP.setText("");
        jTextFieldCPF.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldPerfil.setText("");
        jTextFieldRG.setText("");
        jTextFieldUF.setText("");
        jTextFieldNome.setEnabled(false);
        jTextFieldCEP.setEnabled(false);
        jTextFieldCPF.setEnabled(false);
        jTextFieldCidade.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldPerfil.setEnabled(false);
        jTextFieldRG.setEnabled(false);
        jTextFieldUF.setEnabled(false);
        jComboBoxEstadoCivil.setEditable(false);
        jComboBoxOpcao.setEditable(false);
        jComboBoxSexo.setEditable(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        } else{
           mod.setCodigo(Integer.parseInt(jTextFieldCodigo.getText())); 
           mod.setNome(jTextFieldNome.getText());
        mod.setSexo((String) jComboBoxSexo.getSelectedItem());
        mod.setEstadoCivil((String) jComboBoxEstadoCivil.getSelectedItem());
        mod.setOpcaoServico((String) jComboBoxOpcao.getSelectedItem() );
        mod.setCPF(jTextFieldCPF.getText());
        mod.setCidade(jTextFieldCidade.getText());
        mod.setRG(jTextFieldRG.getText());
        mod.setCEP(jTextFieldCEP.getText());
        mod.setEndereco(jTextFieldEndereco.getText());
        mod.setUF(jTextFieldUF.getText());
        control.Editar(mod);
        jTextFieldNome.setText("");
        jTextFieldCEP.setText("");
        jTextFieldCPF.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldPerfil.setText("");
        jTextFieldRG.setText("");
        jTextFieldUF.setText("");
        jTextFieldNome.setEnabled(false);
        jTextFieldCEP.setEnabled(false);
        jTextFieldCPF.setEnabled(false);
        jTextFieldCidade.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldPerfil.setEnabled(false);
        jTextFieldRG.setEnabled(false);
        jTextFieldUF.setEnabled(false);
        jComboBoxEstadoCivil.setEditable(false);
        jComboBoxOpcao.setEditable(false);
        jComboBoxSexo.setEditable(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        }
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"Código", "Nome", "CPF"};
        conex.conexao();
        conex.executaSql(sql);
        try{
            conex.rs.first();
            do{
                    dados.add(new Object[]{conex.rs.getInt("cod_cliente"), conex.rs.getString("nome_cliente"),conex.rs.getString("cpf_cliente")});
              }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Erro ao preencher tabela"+ex);
        }
        
        ModelTabela modelo = new ModelTabela(dados,colunas);
        jTableCad.setModel(modelo);
        jTableCad.getColumnModel().getColumn(0).setMinWidth(25);
        jTableCad.getColumnModel().getColumn(0).setResizable(false);
        jTableCad.getColumnModel().getColumn(1).setMinWidth(250);
        jTableCad.getColumnModel().getColumn(1).setResizable(false);
        jTableCad.getColumnModel().getColumn(1).setMinWidth(100);
        jTableCad.getColumnModel().getColumn(1).setResizable(false);
        jTableCad.getTableHeader().setReorderingAllowed(false);
        jTableCad.setAutoResizeMode(jTableCad.AUTO_RESIZE_OFF);
        jTableCad.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
      
    }
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldCEP.setEnabled(true);
        jTextFieldCPF.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldPerfil.setEnabled(true);
        jTextFieldRG.setEnabled(true);
        jTextFieldUF.setEnabled(true);
        jComboBoxEstadoCivil.setEnabled(true);
        jComboBoxOpcao.setEnabled(true);
        jComboBoxSexo.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
        mod.setPesquisa(jTextFieldPesquisar.getText());
            ModelCliente model = control.Buscar(mod);
            jTextFieldCEP.setText(String.valueOf(mod.getCEP()));
            jTextFieldCPF.setText(String.valueOf(mod.getCPF()));
            jTextFieldCidade.setText(mod.getCidade());
            jTextFieldEndereco.setText(mod.getEndereco());
            jTextFieldNome.setText(mod.getNome());
            jTextFieldUF.setText(mod.getUF());
            jTextFieldRG.setText(String.valueOf(mod.getRG()));
            jComboBoxEstadoCivil.setSelectedItem(mod.getUF());
            jComboBoxOpcao.setSelectedItem(mod.getOpcaoServico());
            jComboBoxSexo.setSelectedItem(mod.getSexo());
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            jTextFieldCodigo.setText(String.valueOf(mod.getCodigo()));
            
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldCEP.setEnabled(true);
        jTextFieldCPF.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldPerfil.setEnabled(true);
        jTextFieldRG.setEnabled(true);
        jTextFieldUF.setEnabled(true);
        jComboBoxEstadoCivil.setEnabled(true);
        jComboBoxOpcao.setEnabled(true);
        jComboBoxSexo.setEnabled(true);
        jButtonSalvar.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir?");
        if(resposta == JOptionPane.YES_OPTION){
            mod.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
            control.Excluir(mod);
        }
        
        jTextFieldNome.setText("");
        jTextFieldCEP.setText("");
        jTextFieldCPF.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldPerfil.setText("");
        jTextFieldRG.setText("");
        jTextFieldUF.setText("");
        jTextFieldNome.setEnabled(false);
        jTextFieldCEP.setEnabled(false);
        jTextFieldCPF.setEnabled(false);
        jTextFieldCidade.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldPerfil.setEnabled(false);
        jTextFieldRG.setEnabled(false);
        jTextFieldUF.setEnabled(false);
        jComboBoxEstadoCivil.setEditable(false);
        jComboBoxOpcao.setEditable(false);
        jComboBoxSexo.setEditable(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxEstadoCivil;
    private javax.swing.JComboBox<String> jComboBoxOpcao;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstadoCivil;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelOpcao;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JPanel jPanelCadClientes;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCad;
    private javax.swing.JTextField jTextFieldCEP;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPerfil;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldUF;
    // End of variables declaration//GEN-END:variables
}
