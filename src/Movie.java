
import static com.sun.xml.internal.ws.streaming.XMLStreamReaderUtil.close;
import java.awt.Dimension;
import java.awt.Toolkit;
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
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
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
          // setting size 
        
        jPanel9.setVisible(false);
        
        
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        proccedbutton = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        Action = new javax.swing.JRadioButton();
        Comedy = new javax.swing.JRadioButton();
        Drama = new javax.swing.JRadioButton();
        Kids = new javax.swing.JRadioButton();
        Horror = new javax.swing.JRadioButton();
        SciFi = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("           CATEGORIES");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setForeground(new java.awt.Color(0, 153, 153));

        Action.setBackground(new java.awt.Color(0, 153, 153));
        Action.setText("Action");
        Action.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionActionPerformed(evt);
            }
        });

        Comedy.setBackground(new java.awt.Color(0, 153, 153));
        Comedy.setText("Comedy");
        Comedy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComedyActionPerformed(evt);
            }
        });

        Drama.setBackground(new java.awt.Color(0, 153, 153));
        Drama.setText("Drama");
        Drama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DramaActionPerformed(evt);
            }
        });

        Kids.setBackground(new java.awt.Color(0, 153, 153));
        Kids.setText("Kids");
        Kids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KidsActionPerformed(evt);
            }
        });

        Horror.setBackground(new java.awt.Color(0, 153, 153));
        Horror.setText("Horror");
        Horror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorrorActionPerformed(evt);
            }
        });

        SciFi.setBackground(new java.awt.Color(0, 153, 153));
        SciFi.setText("Sci-Fi");
        SciFi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SciFiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Action)
                .addGap(18, 18, 18)
                .addComponent(Comedy)
                .addGap(30, 30, 30)
                .addComponent(Drama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Kids)
                .addGap(36, 36, 36)
                .addComponent(Horror)
                .addGap(35, 35, 35)
                .addComponent(SciFi)
                .addGap(45, 45, 45))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Action)
                    .addComponent(Comedy)
                    .addComponent(Drama)
                    .addComponent(Kids)
                    .addComponent(Horror)
                    .addComponent(SciFi))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie", "Category", "Director", "Available", "Price"
            }
        ));
        jTable1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable1ComponentAdded(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(604, 604, 604))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(39, 39, 39)
                        .addComponent(jButton1))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(proccedbutton)
                        .addGap(26, 26, 26)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(116, 116, 116)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proccedbutton))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(128, 128, 128))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
      
        
        
        
        
    }//GEN-LAST:event_t1ActionPerformed

    private void proccedbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proccedbuttonActionPerformed

          /**this.hide();
     
       
       TableModel model1 = jTable1.getModel();
        int indexs[] =jTable1.getSelectedRows();
        
        
        Object[]row = new Object[5];
        
        Checkout frm2 = new Checkout();
        DefaultTableModel mode12 = (DefaultTableModel)frm2.jTable1.getModel();
        
        for (int i=0; i<indexs.length; i++)
        {
          row [0] = model1.getValueAt(indexs[i], 0);
          row [1] = model1.getValueAt(indexs[i], 1);
          row [2] = model1.getValueAt(indexs[i], 2);
          row [3] = model1.getValueAt(indexs[i], 3);
          row [4] = model1.getValueAt(indexs[i], 4);
        
          mode12.addRow(row);
                  
        }
        frm2.setVisible(true);
        **/
       
        DefaultTableModel tb1Model = (DefaultTableModel) jTable1.getModel();
        if(tb1Model.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Table is Empty");
        //}
        //if(tb1Model.getRowCount()>=5){
            //JOptionPane.showMessageDialog(this, "You selected 4 movies already");
        }else{
            
            String Movie,Category,Director,Avail,Price;
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/movierent","root","");
            
                for(int i=0;i<tblModel.getRowCount();i++){
                    Movie = tblModel.getValueAt(i, 0).toString();
                    Category = tblModel.getValueAt(i, 1).toString();
                    Director = tblModel.getValueAt(i, 2).toString();
                    Avail = tblModel.getValueAt(i, 3).toString();
                    Price = tblModel.getValueAt(i, 4).toString();
                    
                    String query = "INSERT INTO selecmov(movie_name, category, director, available, price) VALUES(?,?,?,?,?)";
                    
                    PreparedStatement prepstmt = con.prepareStatement(query);
                    prepstmt.setString(1,Movie);
                    prepstmt.setString(2,Category);
                    prepstmt.setString(3,Director);
                    prepstmt.setString(4,Avail);
                    prepstmt.setString(5,Price);
                    
                    prepstmt.execute();
                }
                
                    JOptionPane.showMessageDialog(this, "Movies selected");
                    
                    tblModel.setRowCount(0);
                
            
        }catch(Exception e){
            
        }
        }  
    }//GEN-LAST:event_proccedbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     this.hide();
     
        Checkout m = new Checkout();
    this.hide();
    m.setVisible(true);
       
        
        //int modelSelectedRow = jTable1.getSelectedRow();
        
        
       //String jTextField = model
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Main m = new Main();
        this.hide();
        m.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void KidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KidsActionPerformed

        if (Kids.isSelected())
           Horror.setSelected(false);
        Drama.setSelected(false);
        Action.setSelected(false);
        Comedy.setSelected(false);
        SciFi.setSelected(false);
        jPanel9.setVisible(true);
       jTable1.setModel(new DefaultTableModel(null, new String[]{"Movie","Category","Director","Available","Price"}));
        
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
               String price =rs.getString("price");
            //string array for store data into jtable
            
            String tbData[] = {movie_name,category,director,available, price};
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
        jPanel9.setVisible(true);
        jTable1.setModel(new DefaultTableModel(null, new String[]{"Movie","Category","Director","Available","Price"}));
  
     
        
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
               String price = rs.getString("price");
               
            //string array for store data into jtable
            
            String tbData[] = {movie_name,category,director,available,price};
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
        Action.setSelected(false);
        Horror.setSelected(false);
        SciFi.setSelected(false);
        jPanel9.setVisible(true);
        jTable1.setModel(new DefaultTableModel(null, new String[]{"Movie","Category","Director","Available","Price"}));
      
        
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
               String price = rs.getString("price");
               
            //string array for store data into jtable
            
            String tbData[] = {movie_name,category,director,available,price};
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
        Horror.setSelected(false);
        Action.setSelected(false);
        Comedy.setSelected(false);
        SciFi.setSelected(false);
        jPanel9.setVisible(true);
        jTable1.setModel(new DefaultTableModel(null, new String[]{"Movie","Category","Director","Available","Price"}));
        
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
               String price = rs.getString("price");
               
            //string array for store data into jtable
            
            String tbData[] = {movie_name,category,director,available,price};
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
       jPanel9.setVisible(true);
       jTable1.setModel(new DefaultTableModel(null, new String[]{"Movie","Category","Director","Available","Price"}));
        
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
               String price = rs.getString("price");
               
            //string array for store data into jtable
            
            String tbData[] = {movie_name,category,director,available,price};
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
        Action.setSelected(false);
        Comedy.setSelected(false);
       Horror.setSelected(false);
       jPanel9.setVisible(true);
       jTable1.setModel(new DefaultTableModel(null, new String[]{"Movie","Category","Director","Available","Price"}));
        
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
               String price = rs.getString("price");
               
            //string array for store data into jtable
            
            String tbData[] = {movie_name,category,director,available,price};
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
   
        
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       int selectRowIndex = jTable1.getSelectedRow();
           
       t1.setText(model.getValueAt(selectRowIndex, 0).toString());
        
        
   
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentAdded

    
    
    
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JButton proccedbutton;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class tblModel {

        private static int getRowCount() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static Object getValueAt(int i, int i0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void setRowCount(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public tblModel() {
        }
    }
}
