import java.sql.*;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/singhal_2","root","");
        PreparedStatement ps = con.prepareStatement("insert into sstudent values (?,?,?)");

        ps.setString(1,"abcd");
        ps.setInt(2,22);
        ps.setInt(3,33);
        if (ps.execute()==true){
            System.out.println("Value Inserted");
        }
        else{
            System.out.println("Not Inserted");
        }
    }
}