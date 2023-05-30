package seriesanimelista;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FormularioPrincipal extends javax.swing.JFrame {
    
    ButtonGroup btnGr;
    
    public FormularioPrincipal() {
        initComponents();
        TXTid.setVisible(false);
        btnGr = new ButtonGroup();
        btnGr.add(RBemision);
        btnGr.add(RBfinalizado);
        cargarTabla();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBanimes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TXTnameAnime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RBemision = new javax.swing.JRadioButton();
        RBfinalizado = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        TXTtemAnime = new javax.swing.JTextField();
        Bguardar = new javax.swing.JButton();
        Bmodificar = new javax.swing.JButton();
        Beliminar = new javax.swing.JButton();
        TXTid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista Animes");
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Curlz MT", 1, 24)); // NOI18N
        jLabel1.setText("Lista Animes");

        TBanimes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id ", "Anime", "Temporadas", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        TBanimes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBanimesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBanimes);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Animes"));

        jLabel2.setText("Nombre Anime:");

        TXTnameAnime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTnameAnimeActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado:");

        RBemision.setText("Emision");
        RBemision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBemisionActionPerformed(evt);
            }
        });

        RBfinalizado.setText("Finalizado");

        jLabel4.setText("Temporadas:");

        TXTtemAnime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTtemAnimeActionPerformed(evt);
            }
        });

        Bguardar.setText("Guardar");
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        Bmodificar.setText("Modificar");
        Bmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmodificarActionPerformed(evt);
            }
        });

        Beliminar.setText("Eliminar");
        Beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TXTtemAnime, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXTnameAnime, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RBemision)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RBfinalizado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Bguardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bmodificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Beliminar)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TXTid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TXTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTnameAnime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXTtemAnime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RBemision)
                    .addComponent(RBfinalizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bguardar)
                    .addComponent(Bmodificar)
                    .addComponent(Beliminar))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTnameAnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTnameAnimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTnameAnimeActionPerformed

    private void RBemisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBemisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBemisionActionPerformed

    private void TXTtemAnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTtemAnimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTtemAnimeActionPerformed

    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed
        String Anime = TXTnameAnime.getText();
        int Temporadas = Integer.parseInt(TXTtemAnime.getText());
        String Estado;
        if(RBemision.isSelected() == true)
        {
            Estado = "Emision";
        }
        else if(RBfinalizado.isSelected() == true)
        {
            Estado = "Finalizado";
        } 
        else
        {
            Estado = "Finalizado";
        } 
        
        try
        {
            Connection con = ConectarSQL.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Animes (Animes, Temporadas , Estado, Activo ) VALUES (?,?,?,?)");
            ps.setString(1, Anime);
            ps.setInt(2, Temporadas);
            ps.setString(3, Estado);
            ps.setInt(4, 1);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Anime Guardado");
            Limpiar();
            cargarTabla();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }        
        
    }//GEN-LAST:event_BguardarActionPerformed

    private void TBanimesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBanimesMouseClicked
        try
        {
            int fila = TBanimes.getSelectedRow();
            int id = Integer.parseInt(TBanimes.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = ConectarSQL.getConexion();
            ps = con.prepareStatement("SELECT Animes, Temporadas , Estado FROM Animes WHERE Id=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                TXTid.setText(String.valueOf(id));
                TXTnameAnime.setText(rs.getString("Animes"));
                TXTtemAnime.setText(rs.getString("Temporadas")); 
                if(rs.getString("Estado").equals("Finalizado"))
                {
                    RBfinalizado.setSelected(true);
                } 
                else if(rs.getString("Estado").equals("Emision"))
                {
                    RBemision.setSelected(true);
                }    
            }    
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }        
    }//GEN-LAST:event_TBanimesMouseClicked

    private void BmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmodificarActionPerformed
        int Id = Integer.parseInt(TXTid.getText());
        String Anime = TXTnameAnime.getText();
        int Temporadas = Integer.parseInt(TXTtemAnime.getText());
        String Estado;
        if(RBemision.isSelected() == true)
        {
            Estado = "Emision";
        }
        else if(RBfinalizado.isSelected() == true)
        {
            Estado = "Finalizado";
        } 
        else
        {
            Estado = "Finalizado";
        } 
        
        try
        {
            Connection con = ConectarSQL.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE Animes SET Animes=?, Temporadas=? , Estado=? WHERE Id=?");
            ps.setString(1, Anime);
            ps.setInt(2, Temporadas);
            ps.setString(3, Estado);
            ps.setInt(4, Id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Anime Modificado");
            Limpiar();
            cargarTabla();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }        
        
    }//GEN-LAST:event_BmodificarActionPerformed

    private void BeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminarActionPerformed
        int Id = Integer.parseInt(TXTid.getText());
        
        try
        {
            Connection con = ConectarSQL.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM Animes WHERE Id=?");
            ps.setInt(1, Id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Anime Eliminado");
            Limpiar();
            cargarTabla();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }        
    }//GEN-LAST:event_BeliminarActionPerformed
    
    private void Limpiar()
    {
        TXTid.setText("");
        TXTnameAnime.setText("");
        TXTtemAnime.setText("");
        btnGr.clearSelection();
    } 
    
    private void cargarTabla()
    {
        DefaultTableModel modeloTabla = (DefaultTableModel) TBanimes.getModel();
        modeloTabla.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        
        try
        {
            Connection con = ConectarSQL.getConexion();
            ps = con.prepareStatement("SELECT Id, Animes, Temporadas , Estado FROM Animes");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while(rs.next())
            {
                Object[] fila = new Object[columnas];
                for (int indice=0; indice < columnas; indice++){
                   fila[indice] = rs.getObject(indice + 1);
                }
                 modeloTabla.addRow(fila);
            }   
           
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }         
    }        
 
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
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Beliminar;
    private javax.swing.JButton Bguardar;
    private javax.swing.JButton Bmodificar;
    private javax.swing.JRadioButton RBemision;
    private javax.swing.JRadioButton RBfinalizado;
    private javax.swing.JTable TBanimes;
    private javax.swing.JTextField TXTid;
    private javax.swing.JTextField TXTnameAnime;
    private javax.swing.JTextField TXTtemAnime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
