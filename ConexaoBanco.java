import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    
    private static final String URL = "JDBC:mysql://localhost:3306/crediapp_2";
    private static final String USUARIO = "elkinbg";
    private static final String SENHA = "9712";

    public static Connection conectar () {

        try{
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch(SQLException e) {
            System.out.println("Erro ao conectar ao banco. " + e.getMessage());
            return null;
        }
    }
}
