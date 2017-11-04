package br.iesb.meuprograma.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kscka
 */
public class CadProfessorDAO implements DAO<CadProfessor>{

    @Override
    public void inserir(CadProfessor entidade) throws DadosException {
            Connection conexao = ConexaoBD.getConexao();
            String sql = "INSERT INTO tb_professor (matricula, nome, email, "
                    + "telefone, senha) VALUES (?,?,?,?,?)";
            
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
        } catch (SQLException ex) {
            throw new DadosException ("Erro ao inserir ", ex);
        }
            
    }

    @Override
    public void alterar(CadProfessor entidade) throws DadosException {
    }

    @Override
    public void excluir(CadProfessor entidade) throws DadosException {
    }

    @Override
    public CadProfessor consultar(int id) throws DadosException {
    }

    @Override
    public List<CadProfessor> listar() throws DadosException {
    }
    
}
