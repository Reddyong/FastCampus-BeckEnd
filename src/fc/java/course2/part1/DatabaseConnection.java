package fc.java.course2.part1;

import fc.java.course2.model.Connection;
import fc.java.course2.model.MSSQLDriver;
import fc.java.course2.model.MySQLDriver;
import fc.java.course2.model.OracleDriver;

public class DatabaseConnection {
    public static void main(String[] args) {
        Connection oracleDriver = new OracleDriver();
        oracleDriver.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");

        Connection mySQLDriver = new MySQLDriver();
        mySQLDriver.getConnection("jdbc:mysql://localhost:3306/DBNAME", "system", "manager");

        Connection mssqlDriver = new MSSQLDriver();
        mssqlDriver.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=DBNAME", "system", "manager");

    }
}
