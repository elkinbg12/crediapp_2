import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class EmprestimoDAO {
    
    public void novoEmprestimo (Emprestimo emprestimo) {

        String sql = "INSERT INTO Emprestimo (valorPuro, taxaAplicada, totalComJuros, saldoDevedor, totalParcelas, parcelasPagas, dataEmprestimo, cliente_id) VALUES (?,?,?,?,?,?,?,?)";

        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);) {

                 stmt.setDouble(1, emprestimo.getValorPuro());
                 stmt.setDouble(2, emprestimo.getTaxaAplicada());
                 stmt.setDouble(3, emprestimo.getTotalComJuros());
                 stmt.setDouble(4, emprestimo.getSaldoDevedor());
                 stmt.setInt(5, emprestimo.getTotalParcelas());
                 stmt.setInt(6, emprestimo.getParcelasPagas());
                 stmt.setDate(7, java.sql.Date.valueOf(emprestimo.getDataEmprestimo()));
                 stmt.setInt(8, emprestimo.getCliente().getId());

                 stmt.executeUpdate();

                 System.out.println("Empréstimo cadastrado com sucesso!");

             } catch (SQLException e) {
                System.out.println("Erro ao registrar novo Empréstimo: " + e.getMessage());
             } 
    }
}
