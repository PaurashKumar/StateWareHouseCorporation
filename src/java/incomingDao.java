
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class incomingDao {
    private  String dburl="jdbc:mysql://localhost:3306/paurash";
    private  String dbuname="root";
    private  String dbpassword="root";
    private  String dbDriver="com.mysql.jdbc.Driver";
   
    
    public void loadDriver(String dbDriver)
    {
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(incomingDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dburl, dbuname, dbpassword);
        
    
    }
    public String insert(incomingGETSET member) throws SQLException{
       loadDriver(dbDriver);
        Connection con=getConnection();
        System.out.println("Connection is+" +con);
        String result="data entered successfully";
        String sql="insert into incoming values(?,?,?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,member.getOrderid());
            ps.setString(2,member.getOrdername());
            ps.setString(3,member.getBags());
            ps.setString(4,member.getDate());
            ps.setString(5,member.getVnumber());
            ps.setString(6,member.getDname());
            ps.executeUpdate();
         
        }catch(SQLException ex){
            ex.printStackTrace();
         result ="data not entered ";
        }
        return result;
    }
    
    
    
}
