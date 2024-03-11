package fc.java.course2.model;

public class OracleDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("oracle connecting");
    }
}
