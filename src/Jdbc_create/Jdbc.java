package Jdbc_create;
import java.sql.*;
public class Jdbc {

    public static void main(String[] args){
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/fuxi";
            String name1 = "root";
            String password = "123456";
            con = DriverManager.getConnection(url,name1,password);
            stm = con.createStatement();
            String sql = "select * from school";
            rs = stm.executeQuery(sql);
            System.out.println("stu_id|id|name|sex");
            while (rs.next()){
                int stu = rs.getInt("stu_id");
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                System.out.println(stu+"|"+id+"|"+name+"|"+sex);


            }

        }
        catch (Exception x){
            x.printStackTrace();
        }
    }
}
