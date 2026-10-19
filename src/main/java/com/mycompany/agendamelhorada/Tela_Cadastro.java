/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.agendamelhorada;

import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Tela_Cadastro extends javax.swing.JPanel {

    /**
     * Creates new form Tela_Cadastro
     */
    public Tela_Cadastro() {
        initComponents();

        java.net.URL caminhoInicio = getClass().getResource("/imagens/icone.png");
        if (caminhoInicio != null) {
            ImageIcon icone = new ImageIcon(caminhoInicio);
            Image imagemRedimensionada = icone.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            ImageIcon iconeFinal = new ImageIcon(imagemRedimensionada);
            btInicio.setIcon(iconeFinal);

        }

        java.net.URL caminhoImg = getClass().getResource("/imagens/icone.png");
        java.net.URL iconeCadastro = getClass().getResource("/imagens/iconeCadastro.png");
        java.net.URL iconeContato = getClass().getResource("/imagens/iconeContato.jpg");
        java.net.URL iconeAlterar = getClass().getResource("/imagens/iconeAlterar.png");
        java.net.URL iconeSobreoSoftware = getClass().getResource("/imagens/iconeSobreoSoftware.png");
        java.net.URL iconeSair = getClass().getResource("/imagens/iconeSair.png");

        if (caminhoImg != null) {
            ImageIcon icone = new ImageIcon(caminhoImg);
            Image imagemRedimensionada = icone.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            ImageIcon iconeFinal = new ImageIcon(imagemRedimensionada);
            btInicio.setIcon(iconeFinal);
        }

        if (iconeCadastro != null) {
            ImageIcon icone = new ImageIcon(iconeCadastro);
            Image imagemRedimensionada = icone.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            ImageIcon iconeFinal = new ImageIcon(imagemRedimensionada);
            btCadastro.setIcon(iconeFinal);
        }

        if (iconeContato != null) {
            ImageIcon icone = new ImageIcon(iconeContato);
            Image imagemRedimensionada = icone.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            ImageIcon iconeFinal = new ImageIcon(imagemRedimensionada);
            btConsultar.setIcon(iconeFinal);

        }

        if (iconeAlterar != null) {
            ImageIcon icone = new ImageIcon(iconeAlterar);
            Image imagemRedimensionada = icone.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            ImageIcon iconeFinal = new ImageIcon(imagemRedimensionada);
            btAlterar.setIcon(iconeFinal);

        }

        if (iconeSobreoSoftware != null) {
            ImageIcon icone = new ImageIcon(iconeSobreoSoftware);
            Image imagemRedimensionada = icone.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            ImageIcon iconeFinal = new ImageIcon(imagemRedimensionada);
            btSoftware.setIcon(iconeFinal);

        }

        if (iconeSair != null) {
            ImageIcon icone = new ImageIcon(iconeSair);
            Image imagemRedimensionada = icone.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            ImageIcon iconeFinal = new ImageIcon(imagemRedimensionada);
            btSair.setIcon(iconeFinal);

        }

    }

    private void salvarContato() {
        String nome = textoNome.getText();
        String email = textoEmail.getText();
        String telefone = textoTelefone.getText();

        if (nome.isBlank()) {
            JOptionPane.showMessageDialog(null, "Digite o nome!");

        }

        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
            JOptionPane.showMessageDialog(null, "E-mail inválido!");

        }

        if (!telefone.matches("\\(?\\d{2}\\)?\\s?9\\d{4}-?\\d{4}")) {
            JOptionPane.showMessageDialog(null, "Celular inválido!");

        } else {

            Arquivo arq = new Arquivo();
            String conteudo = arq.ler();
            String[] linhas = conteudo.split("\n");

            for (String linha : linhas) {
                String[] dados = linha.split(";");

                for (int j = 0; j < linhas.length; j += 3) {

                    if (nome.equals(dados[j])) {
                        JOptionPane.showMessageDialog(null, "Nome já existe, por favor modifique o nome!");
                        return;
                    }
                }
            }

            Contato contato = new Contato(nome, email, telefone);
            arq.gravar(contato);

            JOptionPane.showMessageDialog(this, "Contato salvo com sucesso!");
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        textoEmail = new javax.swing.JTextField();
        textoTelefone = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btInicio = new javax.swing.JButton();
        btCadastro = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btSoftware = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(248, 250, 252));
        setPreferredSize(new java.awt.Dimension(1000, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Cadastrar Contato");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Preencha os dados abaixo para adicionar um novo contato");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("E-mail:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Telefone:");

        textoNome.setForeground(new java.awt.Color(100, 116, 139));
        textoNome.setText("Digite o nome completo");
        textoNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoNomeMouseClicked(evt);
            }
        });
        textoNome.addActionListener(this::textoNomeActionPerformed);

        textoEmail.setForeground(new java.awt.Color(100, 116, 139));
        textoEmail.setText("EX: aaaa@gmail.com");
        textoEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoEmailMouseClicked(evt);
            }
        });
        textoEmail.addActionListener(this::textoEmailActionPerformed);

        textoTelefone.setForeground(new java.awt.Color(100, 116, 139));
        textoTelefone.setText("EX: (55)999999999");
        textoTelefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoTelefoneMouseClicked(evt);
            }
        });

        btSalvar.setBackground(new java.awt.Color(37, 99, 235));
        btSalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(this::btSalvarActionPerformed);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(100, 116, 139));
        jButton2.setText("LIMPAR");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textoTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(23, 37, 84));

        btInicio.setBackground(new java.awt.Color(23, 37, 84));
        btInicio.setForeground(new java.awt.Color(255, 255, 255));
        btInicio.setText("Início");
        btInicio.setBorderPainted(false);
        btInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btInicio.addActionListener(this::btInicioActionPerformed);

        btCadastro.setBackground(new java.awt.Color(37, 99, 235));
        btCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btCadastro.setText("Cadastrar Contato");
        btCadastro.setBorderPainted(false);
        btCadastro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCadastro.addActionListener(this::btCadastroActionPerformed);

        btAlterar.setBackground(new java.awt.Color(23, 37, 84));
        btAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btAlterar.setText("Alterar/Remover");
        btAlterar.setBorderPainted(false);
        btAlterar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btAlterar.addActionListener(this::btAlterarActionPerformed);

        btSoftware.setBackground(new java.awt.Color(23, 37, 84));
        btSoftware.setForeground(new java.awt.Color(255, 255, 255));
        btSoftware.setText("Sobre o Software");
        btSoftware.setBorderPainted(false);
        btSoftware.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSoftware.addActionListener(this::btSoftwareActionPerformed);

        btConsultar.setBackground(new java.awt.Color(23, 37, 84));
        btConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btConsultar.setText("Consultar Contato");
        btConsultar.setBorderPainted(false);
        btConsultar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btConsultar.addActionListener(this::btConsultarActionPerformed);

        btSair.setBackground(new java.awt.Color(23, 37, 84));
        btSair.setForeground(new java.awt.Color(255, 51, 51));
        btSair.setText("Sair");
        btSair.setBorderPainted(false);
        btSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSair.addActionListener(this::btSairActionPerformed);

        jLabel1.setBackground(new java.awt.Color(23, 37, 84));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSoftware, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSair)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        salvarContato();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void textoNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoNomeMouseClicked
        textoNome.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeMouseClicked

    private void textoEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoEmailMouseClicked
        textoEmail.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_textoEmailMouseClicked

    private void textoTelefoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoTelefoneMouseClicked
        textoTelefone.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_textoTelefoneMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        textoNome.setText("");
        textoEmail.setText("");
        textoTelefone.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEmailActionPerformed

    private void btInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInicioActionPerformed
        Tela_Principal.frame.voltarInicio();// TODO add your handling code here:
    }//GEN-LAST:event_btInicioActionPerformed

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed

        Tela_Principal.frame.trocarTela(new Tela_Cadastro());
    }//GEN-LAST:event_btCadastroActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        Tela_Principal.frame.trocarTela(new Tela_Remover());
        // TODO add your handling code here:
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSoftwareActionPerformed
        Tela_Principal.frame.trocarTela(new Tela_SobreoSoftware());  // TODO add your handling code here:
    }//GEN-LAST:event_btSoftwareActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        Tela_Principal.frame.trocarTela(new Tela_Consulta());
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btInicio;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSoftware;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoTelefone;
    // End of variables declaration//GEN-END:variables
}
