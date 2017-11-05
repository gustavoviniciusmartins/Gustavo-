
package br.iesb.meuprograma.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
        Connection conexao= ConexaoBD.getConexao();
        String sql= "DELETE FROM Documentos WHERE numero=?";
        
        try {
            PreparedStatement comando= conexao.prepareStatement (sql);
            comando.setInt(1, entidade.getNumero());
            comando.executeUpdate();
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException("Erro ao excluir", ex);
        }
        
    }

    @Override
    public Documento consultar(int id) throws DadosException {
        Connection conexao= ConexaoBD.getConexao();
        String sql= "SELECT* FROM Documentos WHERE numero=?";
        Documento documento= new Documento();
        
        try {
            PreparedStatement comando= conexao.prepareStatement (sql);
            comando.setInt(1, id);
            ResultSet resultado= comando.executeQuery();
            if (resultado.next()){
                documento.setNumero(resultado.getInt(1));
                documento.setNome(resultado.getString(2));
                documento.setTipo(resultado.getString(3));
                documento.setData(resultado.getInt(4));
                documento.setDescricao(resultado.getString(5));               
            }
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException("Erro ao excluir");            
        }
        return documento;
    }

    @Override
    public List<Documento> listar() throws DadosException {
        Connection conexao= ConexaoBD.getConexao();
        String sql= "SELECT * FROM Documentos";
        List<Documento> lista= new ArrayList<Documento>();
        
        try {
            Statement comando= conexao.createStatement();
            ResultSet resultado= comando.executeQuery(sql);
            while(resultado.next()){
                Documento documento= new Documento();
                documento.setNumero(resultado.getInt(1));
                documento.setNome(resultado.getString(2));
                documento.setTipo(resultado.getString(3));
                documento.setData(resultado.getInt(4));
                documento.setDescricao(resultado.getString(5));
                lista.add(documento);
            }
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException("Erro ao listar", ex);
        }
        return lista;
    }
    
}
