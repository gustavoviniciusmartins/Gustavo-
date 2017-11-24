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
 * @author kscka
 */
public class CadProfessorDAO implements DAO<CadProfessor>{

    @Override
    public void inserir(CadProfessor entidade) throws DadosException {
            Connection conexao = ConexaoBD.getConexao();
            String sql = "INSERT INTO tb_professor (id_matricula, tx_nome, tx_email, "
                    + "tx_telefone, tx_senha) VALUES (?,?,?,?,?,?)";
            
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1,entidade.getMatricula());
            comando.setString(2,entidade.getNome());
            comando.setString(3,entidade.getEmail());
            comando.setString(4,entidade.getTelefone());
            comando.setString(5,entidade.getSenha());
            comando.executeUpdate();   
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException ("Erro ao inserir ", ex);
        }
            
    }

    @Override
    public void alterar(CadProfessor entidade) throws DadosException {
                        Connection conexao = ConexaoBD.getConexao();
            String sql = "UPDATE tb_professor SET tx_email=?, tx_telefone=?, "
                    + "tx_senha=? WHERE tx_matricula=?";
            
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1,entidade.getEmail());
            comando.setString(2,entidade.getTelefone());
            comando.setString(3,entidade.getSenha());
            comando.setInt(4,entidade.getMatricula());//será a variável chave da tabela, a fim de ser localizada.
            comando.executeUpdate();   
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException ("Erro ao alterar ", ex);
        }

    }

    @Override
    public void excluir(CadProfessor entidade) throws DadosException {
            Connection conexao = ConexaoBD.getConexao();
            String sql = "DELETE FROM tb_professor WHERE id_matricula=?";
            
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1,entidade.getMatricula());
            comando.executeUpdate();   
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException ("Erro ao excluir ", ex);
        }

    }

    @Override
    public CadProfessor consultar(int id) throws DadosException {
            Connection conexao = ConexaoBD.getConexao();
            String sql = "SELECT * FROM tb_professor WHERE id_matricula =?";
            CadProfessor cadprofessor = new CadProfessor();
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1,id);
            ResultSet resultado = comando.executeQuery();
            if (resultado.next()){
                    cadprofessor.setMatricula(resultado.getInt(1));
                    cadprofessor.setNome(resultado.getString(2));
                    cadprofessor.setEmail(resultado.getString(3));
                    cadprofessor.setTelefone(resultado.getString(4));
            }
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException ("Erro ao consultar ", ex);
        }
    return cadprofessor;
    }

    @Override
    public List<CadProfessor> listar() throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
        String sql = "SELECT * FROM tb_professor";
        List<CadProfessor> lista = new ArrayList<CadProfessor>();
        
         try {
            Statement comando = conexao.createStatement();
            ResultSet resultado = comando.executeQuery(sql);
            while (resultado.next()){
                 CadProfessor cadprofessor = new CadProfessor();   
                cadprofessor.setMatricula(resultado.getInt(1));
                    cadprofessor.setNome(resultado.getString(2));
                    cadprofessor.setEmail(resultado.getString(3));
                    cadprofessor.setTelefone(resultado.getString(4));
                    lista.add(cadprofessor);
            }
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException ("Erro ao listar ", ex);
        }
        
        return lista;
        
    }

    public void alterar(CadDisciplina entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
