/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.agendamelhorada;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro
 */
public class Tela_Consulta extends javax.swing.JPanel {

    /**
     * Creates new form Tela_Consulta
     */
    public Tela_Consulta() {
        initComponents();
        carregarTabela();
        java.net.URL caminhoImg = getClass().getResource("/imagens/iconeContato.jpg");
        if (caminhoImg != null) {
            ImageIcon icone = new ImageIcon(caminhoImg);
            Image imagemRedimensionada = icone.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon iconeFinal = new ImageIcon(imagemRedimensionada);

            Imagem.setText("");
            Imagem.setIcon(iconeFinal);
        }

        java.net.URL caminhoImg2 = getClass().getResource("/imagens/icone.png");
        java.net.URL iconeCadastro = getClass().getResource("/imagens/iconeCadastro.png");
        java.net.URL iconeContato = getClass().getResource("/imagens/iconeContato.jpg");
        java.net.URL iconeAlterar = getClass().getResource("/imagens/iconeAlterar.png");
        java.net.URL iconeSobreoSoftware = getClass().getResource("/imagens/iconeSobreoSoftware.png");
        java.net.URL iconeSair = getClass().getResource("/imagens/iconeSair.png");

        if (caminhoImg2 != null) {
            ImageIcon icone = new ImageIcon(caminhoImg2);
            Image imagemRedimensionada = icone.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            ImageIcon iconeFinal = new ImageIcon(imagemRedimensionada);
            btInicio1.setIcon(iconeFinal);
        }

        if (iconeCadastro != null) {
            ImageIcon icone = new ImageIcon(iconeCadastro);
            Image imagemRedimensionada = icone.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            ImageIcon iconeFinal = new ImageIcon(imagemRedimensionada);
            btCadastro1.setIcon(iconeFinal);
        }

        if (iconeContato != null) {
            ImageIcon icone = new ImageIcon(iconeContato);
            Image imagemRedimensionada = icone.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            ImageIcon iconeFinal = new ImageIcon(imagemRedimensionada);
            btConsultar1.setIcon(iconeFinal);

        }

        if (iconeAlterar != null) {
            ImageIcon icone = new ImageIcon(iconeAlterar);
            Image imagemRedimensionada = icone.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            ImageIcon iconeFinal = new ImageIcon(imagemRedimensionada);
            btAlterar1.setIcon(iconeFinal);

        }

        if (iconeSobreoSoftware != null) {
            ImageIcon icone = new ImageIcon(iconeSobreoSoftware);
            Image imagemRedimensionada = icone.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            ImageIcon iconeFinal = new ImageIcon(imagemRedimensionada);
            btSoftware1.setIcon(iconeFinal);

        }

        if (iconeSair != null) {
            ImageIcon icone = new ImageIcon(iconeSair);
            Image imagemRedimensionada = icone.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
            ImageIcon iconeFinal = new ImageIcon(imagemRedimensionada);
            btSair1.setIcon(iconeFinal);

        }

        jLabel10.setVisible(false);

    }

    private void carregarTabela() {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabela.getModel();

        modelo.setRowCount(0);

        Arquivo arq = new Arquivo("contatos.txt");
        String conteudo = arq.ler();

        if (conteudo != null && !conteudo.isEmpty() && !conteudo.equals("#!ERRO!#")) {
            String[] linhas = conteudo.split("\n");
            for (String linha : linhas) {
                String[] dados = linha.split(";");
                if (dados.length >= 3) {
                    modelo.addRow(new Object[]{dados[0], dados[1], dados[2]});
                }
            }
        }
    }

    private void buscar() {
        String nome = textoNomeBusca.getText();

        Arquivo arq = new Arquivo();

        Contato contato = arq.buscarPorNome(nome);

        if (contato != null) {
            textoSaidaNome.setText(nome);
            textoSaidaEmail.setText(contato.getEmail());
            textoSaidaTelefone.setText(contato.getTelefone());
            jLabel10.setVisible(true);
            textoSaidaEmail.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            textoSaidaNome.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            textoSaidaTelefone.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        }
    }

    private void capturarDados() {
        String nome;
        String email;
        String telefone;

        int linha = tabela.getSelectedRow();

        email = tabela.getValueAt(linha, 1).toString();
        nome = tabela.getValueAt(linha, 0).toString();
        telefone = tabela.getValueAt(linha, 2).toString();

        textoSaidaNome.setText(nome);
        textoSaidaEmail.setText(email);
        textoSaidaTelefone.setText(telefone);
        jLabel10.setVisible(true);
        textoSaidaEmail.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        textoSaidaNome.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        textoSaidaTelefone.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
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
        btVoltar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textoNomeBusca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        textoSaidaNome = new javax.swing.JLabel();
        textoSaidaEmail = new javax.swing.JLabel();
        textoSaidaTelefone = new javax.swing.JLabel();
        Imagem = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btInicio1 = new javax.swing.JButton();
        btCadastro1 = new javax.swing.JButton();
        btAlterar1 = new javax.swing.JButton();
        btSoftware1 = new javax.swing.JButton();
        btConsultar1 = new javax.swing.JButton();
        btSair1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Cadastrar Contato");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 116, 139));
        jLabel3.setText("Preencha os dados abaixo para adicionar um novo contato");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("E-mail:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Telefone:");

        textoNome.setForeground(new java.awt.Color(100, 116, 139));
        textoNome.setText("Digite o nome completo");
        textoNome.addActionListener(this::textoNomeActionPerformed);

        textoEmail.setForeground(new java.awt.Color(100, 116, 139));
        textoEmail.setText("Digite o e-mail");

        textoTelefone.setForeground(new java.awt.Color(100, 116, 139));
        textoTelefone.setText("Digite o telefone");

        btSalvar.setBackground(new java.awt.Color(37, 99, 235));
        btSalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("SALVAR");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(100, 116, 139));
        jButton2.setText("LIMPAR");

        btVoltar.setForeground(new java.awt.Color(100, 116, 139));
        btVoltar.setText("VOLTAR");

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
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(64, 64, 64)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textoTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textoEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)))))
                .addContainerGap(39, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(1000, 650));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Consultar Contato");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Veja todos os contatos cadastrados ou busque por um nome");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Buscar por nome:");

        textoNomeBusca.setForeground(new java.awt.Color(100, 116, 139));
        textoNomeBusca.setText("Digite o nome para buscar");
        textoNomeBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoNomeBuscaMouseClicked(evt);
            }
        });
        textoNomeBusca.addActionListener(this::textoNomeBuscaActionPerformed);

        jButton1.setBackground(new java.awt.Color(22, 163, 74));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "E-mail", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setShowGrid(true);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setText("CONTATO SELECIONADO");

        textoSaidaNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoSaidaNome.setForeground(new java.awt.Color(51, 102, 255));

        textoSaidaEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        textoSaidaTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Imagem.setText("jLabel11");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoSaidaTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textoSaidaEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(361, 361, 361)))
                        .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(textoSaidaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(8, 8, 8)
                .addComponent(textoSaidaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoSaidaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoSaidaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(textoNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textoNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(23, 37, 84));

        btInicio1.setBackground(new java.awt.Color(23, 37, 84));
        btInicio1.setForeground(new java.awt.Color(255, 255, 255));
        btInicio1.setText("Início");
        btInicio1.setBorderPainted(false);
        btInicio1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btInicio1.addActionListener(this::btInicio1ActionPerformed);

        btCadastro1.setBackground(new java.awt.Color(23, 37, 84));
        btCadastro1.setForeground(new java.awt.Color(255, 255, 255));
        btCadastro1.setText("Cadastrar Contato");
        btCadastro1.setBorderPainted(false);
        btCadastro1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCadastro1.addActionListener(this::btCadastro1ActionPerformed);

        btAlterar1.setBackground(new java.awt.Color(23, 37, 84));
        btAlterar1.setForeground(new java.awt.Color(255, 255, 255));
        btAlterar1.setText("Alterar/Remover");
        btAlterar1.setBorderPainted(false);
        btAlterar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btAlterar1.addActionListener(this::btAlterar1ActionPerformed);

        btSoftware1.setBackground(new java.awt.Color(23, 37, 84));
        btSoftware1.setForeground(new java.awt.Color(255, 255, 255));
        btSoftware1.setText("Sobre o Software");
        btSoftware1.setBorderPainted(false);
        btSoftware1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSoftware1.addActionListener(this::btSoftware1ActionPerformed);

        btConsultar1.setBackground(new java.awt.Color(37, 99, 235));
        btConsultar1.setForeground(new java.awt.Color(255, 255, 255));
        btConsultar1.setText("Consultar Contato");
        btConsultar1.setBorderPainted(false);
        btConsultar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btConsultar1.addActionListener(this::btConsultar1ActionPerformed);

        btSair1.setBackground(new java.awt.Color(23, 37, 84));
        btSair1.setForeground(new java.awt.Color(255, 51, 51));
        btSair1.setText("Sair");
        btSair1.setBorderPainted(false);
        btSair1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSair1.addActionListener(this::btSair1ActionPerformed);

        jLabel11.setBackground(new java.awt.Color(23, 37, 84));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MENU");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btInicio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadastro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAlterar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSoftware1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btConsultar1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btSair1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btConsultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSoftware1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair1)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeActionPerformed

    private void textoNomeBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeBuscaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textoNomeBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoNomeBuscaMouseClicked
        textoNomeBusca.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeBuscaMouseClicked

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        capturarDados();        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaMouseClicked

    private void btInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInicio1ActionPerformed
        Tela_Principal.frame.voltarInicio();// TODO add your handling code here:
    }//GEN-LAST:event_btInicio1ActionPerformed

    private void btCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastro1ActionPerformed
       Tela_Principal.frame.trocarTela(new Tela_Cadastro()); // TODO add your handling code here:
    }//GEN-LAST:event_btCadastro1ActionPerformed

    private void btAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterar1ActionPerformed
       Tela_Principal.frame.trocarTela(new Tela_Remover()); // TODO add your handling code here:
    }//GEN-LAST:event_btAlterar1ActionPerformed

    private void btSoftware1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSoftware1ActionPerformed
        Tela_Principal.frame.trocarTela(new Tela_SobreoSoftware());// TODO add your handling code here:
    }//GEN-LAST:event_btSoftware1ActionPerformed

    private void btConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultar1ActionPerformed
        Tela_Principal.frame.trocarTela(new Tela_Consulta());// TODO add your handling code here:
    }//GEN-LAST:event_btConsultar1ActionPerformed

    private void btSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSair1ActionPerformed
       System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_btSair1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagem;
    private javax.swing.JButton btAlterar1;
    private javax.swing.JButton btCadastro1;
    private javax.swing.JButton btConsultar1;
    private javax.swing.JButton btInicio1;
    private javax.swing.JButton btSair1;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSoftware1;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoNomeBusca;
    private javax.swing.JLabel textoSaidaEmail;
    private javax.swing.JLabel textoSaidaNome;
    private javax.swing.JLabel textoSaidaTelefone;
    private javax.swing.JTextField textoTelefone;
    // End of variables declaration//GEN-END:variables
}
