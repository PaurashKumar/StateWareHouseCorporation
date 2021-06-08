
package incomingCMDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class incomingCMDao {
        private String dburl="jdbc:mysql://localhost:3306/paurash";
        private String dbnane="root";
        private String dbpassword="root";
        private String dbDriver="com.mysql.jdbc.Driver";
        
        public void loadDriver(String dbDriver){
            try {
                Class.forName(dbDriver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(incomingCMDao.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        
        public Connection getConnection() throws SQLException{
        return  DriverManager.getConnection(dburl, dbnane, dbpassword);
        }
        
        public String insert(incomingCMGETSET member) throws SQLException{
            loadDriver(dbDriver);
            Connection con=getConnection();
            System.out.println("Connnection is:"+con);
            String result="data entered successfully";
            String sql="insert into incomingcm values(?,?,?,?,?,?)";
          try{  
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,member.getMid());
            ps.setString(2,member.getOrdername());
            ps.setString(3,member.getBags());
            ps.setString(4,member.getDate());
            ps.setString(5,member.getVnumber());
            ps.setString(6,member.getDname());
            ps.executeUpdate();
          }catch(SQLException e){
          e.printStackTrace();
          result="date not entered";
          }
          return result;
          
        }
        
}
