
package br.iesb.meuprograma.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author vimag
 */
public class DocumentoDAO implements DAO<Documento> {

    @Override
    public void inserir(Documento entidade) throws DadosException {
        Connection conexao= ConexaoBD.getConexao();
        String sql="INSERT INTO Documentos (numero, nome, tipo, data, descricao) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement comando= conexao.prepareStatement (sql);
            comando.setInt(1, entidade.getNumero());
            comando.setString(2, entidade.getNome());
            comando.setString(3, entidade.getTipo());
            comando.setInt(3, entidade.getData());
            comando.setString(3, entidade.getDescricao());
            comando.executeUpdate();
            conexao.close();
            
        } catch (SQLException ex) {
            throw new DadosException("Erro ao inserir", ex);
        }       
    }

    @Override
    public void alterar(Documento entidade) throws DadosException {
        Connection conexao= ConexaoBD.getConexao();
        String sql="UPDATE Documentos SET nome=?, tipo=?, data=?, descricao=? WHERE numero=?";
        
        try {
            PreparedStatement comando= conexao.prepareStatement (sql);
            comando.setInt(1, entidade.getNumero());
            comando.setString(2, entidade.getNome());
            comando.setString(3, entidade.getTipo());
            comando.setInt(3, entidade.getData());
            comando.setString(3, entidade.getDescricao());
            comando.executeUpdate();
            conexao.close();
            
        } catch (SQLException ex) {
            throw new DadosException("Erro ao alterar", ex);
        }
    }

    @Override
    public void excluir(Documento entidade) throws DadosException {
    }

    @Override
    public Documento consultar(int id) throws DadosException {
    }

    @Override
    public List<Documento> listar() throws DadosException {
    }
    
}
