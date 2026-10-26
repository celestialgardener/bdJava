//pra fazer a conexao precisa antes colocar as bibliotecas do jtds na mesma pasta
// Conexão SQL Server do Java
package persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDaoSQLServer {

    private Connection c;

    public GenericDaoSQLServer() {
        super();
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String hostName = "localhost"; //ip da maquina do servidor
        String dbName = "clinica";
        String user = "sa";
        String senha = "eric300108#E";

        Class.forName("net.sourceforge.jtds.jdbc.Driver"); //referencia da classe lib da conexao

        c = DriverManager.getConnection(
            String.format(
                "jdbc:jtds:sqlserver://%s:1433/%s;user=%s;password=%s",
                hostName, dbName, user, senha
            )
        );

        return c;
    }
}
