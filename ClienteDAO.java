import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

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

    public List<Cliente> listarClientes() {

         String sql = "SELECT * FROM cliente";
         List<Cliente> lista = new ArrayList<>();

         try (Connection conn = ConexaoBanco.conectar();
              PreparedStatement stmt = conn.prepareStatement(sql);
              ResultSet rs = stmt.executeQuery()) {

               while (rs.next()) {

                  Cliente cliente = new Cliente();

                  cliente.setId(rs.getInt("id"));
                  cliente.setNome(rs.getString("nome"));
                  cliente.setCpf(rs.getString("cpf"));
                  cliente.setCelular(rs.getString("celular"));
                  cliente.setRua(rs.getString("rua"));
                  cliente.setNumero(rs.getString("numero"));
                  cliente.setBairro(rs.getString("bairro"));
                  cliente.setComplemento(rs.getString("complemento"));

                  lista.add(cliente);
               }
              } catch (SQLException e) {
                  System.out.println("Erro ao listar clientes. " + e.getMessage());
              }

              return lista;
    }
}
