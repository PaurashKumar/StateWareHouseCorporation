 package outgoingLR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class outgoingLRDao {
    private String dburl="jdbc:mysql://localhost:3306/paurash";
    private String dbname="root";
    private String dbpassword="root";
    private String dbDriver="com.mysql.jdbc.Driver";
    
    public void loadDriver(String dbDriver){
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(outgoingLRDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection getConnection() throws SQLException{
    return DriverManager.getConnection(dburl, dbname, dbpassword);
    }
    
    public String insert(outgoingLRGETSET member) throws SQLException{
                loadDriver(dbDriver);
                Connection con=getConnection();
                System.out.println("Connection is:"+con);
                String result="date enterd successfully";
                String sql="insert into outgoinglr values(?,?,?,?,?,?,?)";
                try{
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,member.getOutgoingid());
                    ps.setString(2,member.getSwid());
                    ps.setString(3,member.getOrdername());
                    ps.setString(4,member.getBags());
                    ps.setString(5,member.getDate());
                    ps.setString(6,member.getVnumber());
                    ps.setString(7,member.getDname());
                    ps.executeUpdate();
                }catch(SQLException e){
                e.printStackTrace();
                result="data not saved";
                }
                return result;
    }
}
