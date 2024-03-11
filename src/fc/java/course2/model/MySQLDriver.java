package fc.java.course2.model;

public class MySQLDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("mysql connecting");
    }
}
