 
package outgoingSocity;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class outgoingSocityDao {
    private String dburl="jdbc:mysql://localhost:3306/paurash";
    private String dbname="root";
    private String dbpassword="root";
    private String dbDriver="com.mysql.jdbc.Driver";
    
    public void loadDriver(String dbDriver) throws ClassNotFoundException{
                Class.forName(dbDriver);
    }
    
    public Connection getConnection() throws SQLException{
    return DriverManager.getConnection(dburl, dbname,dbpassword);
    }
    public String insert(outgoninSocityGETSET member) throws SQLException, ClassNotFoundException{
        loadDriver(dbDriver);
        Connection con=getConnection();
        System.out.println("Connection is:"+con);
        String result="data successfully entered";
        String sql="insert into outgoingsocity values(?,?,?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,member.getOutgoingid());
            ps.setString(2,member.getOrdername());
            ps.setString(3,member.getBags());
            ps.setString(4,member.getDate());
            ps.setString(5,member.getVnumber());
            ps.setString(6,member.getDname());
            ps.executeUpdate();
         }catch(SQLException e){
          e.printStackTrace();
          result="date not saved";
          }
          return result;
    }
}
