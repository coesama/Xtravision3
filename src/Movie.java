
import static com.sun.xml.internal.ws.streaming.XMLStreamReaderUtil.close;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.table.TableModel;
/**
 *
 * @author stefa
 */
public class Movie extends javax.swing.JFrame {

    /**
     * Creates new form Movie
     */
    public Movie() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to  the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        proccedbutton = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Kids = new javax.swing.JRadioButton();
        Action = new javax.swing.JRadioButton();
        Comedy = new javax.swing.JRadioButton();
        Drama = new javax.swing.JRadioButton();
        Horror = new javax.swing.JRadioButton();
        SciFi = new javax.swing.JRadioButton();
        resetbutton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        jLabel1.setText("jLabel1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jPanel3, gridBagConstraints);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 16, 0);
        jPanel2.add(jPanel4, gridBagConstraints);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("           CATEGORIES");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Gender");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        proccedbutton.setText("ADD");
        proccedbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proccedbuttonActionPerformed(evt);
            }
        });

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie", "Category", "Director", "Available"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Kids.setText("Kids");
        Kids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KidsActionPerformed(evt);
            }
        });

        Action.setText("Action");
        Action.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionActionPerformed(evt);
            }
        });

        Comedy.setText("Comedy");
        Comedy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComedyActionPerformed(evt);
            }
        });

        Drama.setText("Drama");
        Drama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DramaActionPerformed(evt);
            }
        });

        Horror.setText("Horror");
        Horror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorrorActionPerformed(evt);
            }
        });

        SciFi.setText("Sci-Fi");
        SciFi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SciFiActionPerformed(evt);
            }
        });

        resetbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resetbutton.setText("reset");
        resetbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetbuttonMouseClicked(evt);
            }
        });
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(411, 411, 411)
                .addComponent(jButton1)
                .addGap(216, 216, 216))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(Action)
                    .addGap(29, 29, 29)
                    .addComponent(Comedy)
                    .addGap(37, 37, 37)
                    .addComponent(Drama)
                    .addGap(51, 51, 51)
                    .addComponent(Kids)
                    .addGap(37, 37, 37)
                    .addComponent(Horror)
                    .addGap(41, 41, 41)
                    .addComponent(SciFi)
                    .addGap(18, 18, 18)
                    .addComponent(resetbutton)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(proccedbutton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 64, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(586, 586, 586)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Action)
                            .addComponent(Comedy)
                            .addComponent(Drama)
                            .addComponent(Horror)
                            .addComponent(Kids)
                            .addComponent(SciFi)
                            .addComponent(resetbutton))
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proccedbutton))
                .addGap(79, 79, 79)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void proccedbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proccedbuttonActionPerformed

       
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_proccedbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      Checkout m = new Checkout();
        this.hide();
       m.setVisible(true);
       
       TableModel model1 = jTable1.getModel();
        int indexs[] =jTable1.getSelectedRows();
        
        
        Object[]row = new Object[4];
        
        Checkout frm2 = new Checkout();
        DefaultTableModel mode12 = (DefaultTableModel)frm2.jTable1.getModel();
        
        for (int i=0; i<indexs.length; i++)
        {
          row [0] = model1.getValueAt(indexs[i], 0);
          row [1] = model1.getValueAt(indexs[i], 1);
          row [2] = model1.getValueAt(indexs[i], 2);
          row [3] = model1.getValueAt(indexs[i], 3);
        
          mode12.addRow(row);
                  
        }
        frm2.setVisible(true);
        
       // int modelSelectedRow = jTable1.getSelectedRow();
        
        
       // String jTextField = model
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
    
        
   
        
       
        
        
    }//GEN-LAST:event_resetbuttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Main m = new Main();
        this.hide();
        m.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void KidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KidsActionPerformed

        if (Kids.isSelected())
        Action.setSelected(false);
        Drama.setSelected(false);
        Horror.setSelected(false);
        Comedy.setSelected(false);
        SciFi.setSelected(false);
        
        
      
       
    



        
        try{
            //open connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/movierent","root","");
            
            Statement st = con.createStatement();
            //mysql query
            String sql = "select * from movreg where category='Kids'" ;
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
               String movie_name = rs.getString("movie_name");
               String category = rs.getString("category");
               String director = rs.getString("director");
               String available = rs.getString("available");
               
            //string array for store data into jtable
            
            String tbData[] = {movie_name,category,director,available};
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            
            //add string array data into jtable
            tblModel.addRow(tbData);
              
            }
                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_KidsActionPerformed

    private void ActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionActionPerformed
       
       
          if (Action.isSelected())
        Kids.setSelected(false);
        Drama.setSelected(false);
        Horror.setSelected(false);
        Comedy.setSelected(false);
        SciFi.setSelected(false);
        
  
     
        
        try{
            
            //open connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/movierent","root","");
            
            Statement st = con.createStatement();
            //mysql query
            String sql = "select * from movreg where category ='Action' ";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
               String movie_name = rs.getString("movie_name");
               
               String category = rs.getString("category");
               String director = rs.getString("director");
               String available = rs.getString("available");
               
             
             
               
               
            //string array for store data into jtable
            
            String tbData[] = {movie_name,category,director,available};
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            
            //add string array data into jtable
            tblModel.addRow(tbData);
              
           
            
            }
                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
       
        
        
        
    }//GEN-LAST:event_ActionActionPerformed

    private void ComedyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComedyActionPerformed

        if (Comedy.isSelected())
        Kids.setSelected(false);
        Drama.setSelected(false);
        Horror.setSelected(false);
        Action.setSelected(false);
        SciFi.setSelected(false);
        
        try{
            //open connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/movierent","root","");
            
            Statement st = con.createStatement();
            //mysql query
            String sql = "select * from movreg where category='Comedy'";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
               String movie_name = rs.getString("movie_name");
               String category = rs.getString("category");
               String director = rs.getString("director");
               String available = rs.getString("available");
               
            //string array for store data into jtable
            
            String tbData[] = {movie_name,category,director,available};
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            
            //add string array data into jtable
            tblModel.addRow(tbData);
              
            }
                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComedyActionPerformed

    private void DramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DramaActionPerformed

        if (Drama.isSelected())
        Kids.setSelected(false);
        Action.setSelected(false);
        Horror.setSelected(false);
        Comedy.setSelected(false);
        SciFi.setSelected(false);
        
        try{
            //open connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/movierent","root","");
            
            Statement st = con.createStatement();
            //mysql query
            String sql = "select * from movreg where category='Drama'";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
               String movie_name = rs.getString("movie_name");
               String category = rs.getString("category");
               String director = rs.getString("director");
               String available = rs.getString("available");
               
            //string array for store data into jtable
            
            String tbData[] = {movie_name,category,director,available};
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            
            //add string array data into jtable
            tblModel.addRow(tbData);
              
            }
                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DramaActionPerformed

    private void HorrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorrorActionPerformed

        if (Horror.isSelected())
        Kids.setSelected(false);
        Drama.setSelected(false);
        Action.setSelected(false);
        Comedy.setSelected(false);
        SciFi.setSelected(false);
        
        try{
            //open connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/movierent","root","");
            
            Statement st = con.createStatement();
            //mysql query
            String sql = "select * from movreg where category='Horror'";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
               String movie_name = rs.getString("movie_name");
               String category = rs.getString("category");
               String director = rs.getString("director");
               String available = rs.getString("available");
               
            //string array for store data into jtable
            
            String tbData[] = {movie_name,category,director,available};
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            
            //add string array data into jtable
            tblModel.addRow(tbData);
              
            }
                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HorrorActionPerformed

    private void SciFiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SciFiActionPerformed
        
        if (SciFi.isSelected())
        Kids.setSelected(false);
        Drama.setSelected(false);
        Horror.setSelected(false);
        Comedy.setSelected(false);
        Action.setSelected(false);
        
        try{
            //open connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/movierent","root","");
            
            Statement st = con.createStatement();
            //mysql query
            String sql = "select * from movreg where category='Sci-Fi'";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
               String movie_name = rs.getString("movie_name");
               String category = rs.getString("category");
               String director = rs.getString("director");
               String available = rs.getString("available");
               
            //string array for store data into jtable
            
            String tbData[] = {movie_name,category,director,available};
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            
            //add string array data into jtable
            tblModel.addRow(tbData);
              
            }
                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SciFiActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
   int index = jTable1.getSelectedRow();
   TableModel model = jTable1.getModel();
   
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void resetbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetbuttonMouseClicked
         Kids.setSelected(false);
        Drama.setSelected(false);
        Action.setSelected(false);
        Horror.setSelected(false);
        Comedy.setSelected(false);
        SciFi.setSelected(false);
    }//GEN-LAST:event_resetbuttonMouseClicked

    
    
    
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
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Action;
    private javax.swing.JRadioButton Comedy;
    private javax.swing.JRadioButton Drama;
    private javax.swing.JRadioButton Horror;
    private javax.swing.JRadioButton Kids;
    private javax.swing.JRadioButton SciFi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JButton proccedbutton;
    private javax.swing.JButton resetbutton;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
