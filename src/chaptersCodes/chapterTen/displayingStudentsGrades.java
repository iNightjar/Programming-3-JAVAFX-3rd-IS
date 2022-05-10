package chaptersCodes.chapterTen;

import java.sql.*;
public class displayingStudentsGrades {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cs","root", "");
            Statement stat = con.createStatement();
            ResultSet result = stat.executeQuery("select  id, name, grade from Student where grade > 75");
            while(result.next()){
                System.out.println(result.getInt(1) + "\t" + result.getString(2) + "\t" + result.getInt(3) );
            }
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
