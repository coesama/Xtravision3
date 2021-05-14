
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coema
 */
public class Operations {

    public static Component frame;
    public static boolean isCredit(String cname, String cnumber, String seccode){
        try{
            Connection myConn = MySqlConnection.getConnection();
            String mySqlQuery = "SELECT name, cnumber, secode FROM card WHERE name = '"+cname+"' AND cnumber = '"+cnumber+"' AND secode = '"+seccode+"'";
            PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                CreditSession.cname = resultSet.getString("name");
                CreditSession.cnumber = resultSet.getString("cnumber");
                CreditSession.seccode = resultSet.getString("secode");
                
                return true;
            }
        }catch (Exception exception){
            JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
           }
        
        return false;
    }

       
}
