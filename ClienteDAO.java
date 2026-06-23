import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    
    public String sql = "INSERT INTO cliente (nome, cpf, celular, rua, numero, bairro, complemento) VALUES (?,?,?,?,?,?,?)";

    public void cadastrarCliente (Cliente cliente) {

        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)){

                stmt.setString(1, cliente.getNome());
                stmt.setString(2, cliente.getCpf());
                stmt.setString(3, cliente.getCelular());
                stmt.setString(4, cliente.getRua());
                stmt.setString(5, cliente.getNumero());
                stmt.setString(6, cliente.getBairro());
                stmt.setString(7, cliente.getComplemento());

                stmt.executeUpdate();
             } catch(SQLException e) {
                System.out.println("Erro ao cadastrar Cliente" + e.getMessage());
             }
    }
}
