/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class CursoDAO implements DAO<Curso> {
    
    @Override
    public void inserir(Curso entidade) throws DadosException {
        Connection conexao= ConexaoBD.getConexao();
        String sql="INSERT INTO tb_curso (codCurso, tipo, modalidade, nome, habilitacao, localoferta, turno, numvagas, carga, regime, periodo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement comando= conexao.prepareStatement (sql);
            comando.setString(1, entidade.getCodCurso());
            comando.setString(2, entidade.getTipo());
            comando.setString(3, entidade.getModalidade());
            comando.setString(4, entidade.getNome());
            comando.setString(5, entidade.getHabilitacao());
            comando.setString(6, entidade.getLocaloferta());
            comando.setString(7, entidade.getTurno());
            comando.setInt(8, entidade.getNumvagas());
            comando.setString(9, entidade.getCarga());
            comando.setString(10, entidade.getRegime());
            comando.setString(11, entidade.getPeriodo());
            comando.executeUpdate();
            conexao.close();
            
        } catch (SQLException ex) {
            throw new DadosException("Erro ao inserir", ex);
        }       
    }

    @Override
    public void alterar(Curso entidade) throws DadosException {
        Connection conexao= ConexaoBD.getConexao();
        String sql="UPDATE tb_curso SET codCurso=?, tipo=?, modalidade=?, nome=?, habilitacao=?, localoferta=?, turno=?, numvagas=?, carga=?, regime=?, periodo=?";
        
        try {
            PreparedStatement comando= conexao.prepareStatement (sql);
            comando.setString(1, entidade.getCodCurso());
            comando.setString(2, entidade.getTipo());
            comando.setString(3, entidade.getModalidade());
            comando.setString(4, entidade.getNome());
            comando.setString(5, entidade.getHabilitacao());
            comando.setString(6, entidade.getLocaloferta());
            comando.setString(7, entidade.getTurno());
            comando.setInt(8, entidade.getNumvagas());
            comando.setString(9, entidade.getCarga());
            comando.setString(10, entidade.getRegime());
            comando.setString(11, entidade.getPeriodo());
            comando.executeUpdate();
            conexao.close();
            
        } catch (SQLException ex) {
            throw new DadosException("Erro ao alterar", ex);
        }
    }

    @Override
    public void excluir(Curso entidade) throws DadosException {
        Connection conexao= ConexaoBD.getConexao();
        String sql= "DELETE FROM tb_curso WHERE codCurso=?";
        
        try {
            PreparedStatement comando= conexao.prepareStatement (sql);
            comando.setString(1, entidade.getCodCurso());
            comando.executeUpdate();
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException("Erro ao excluir", ex);
        }
    }

    @Override
    public Curso consultar(int id) throws DadosException {
Connection conexao = ConexaoBD.getConexao();
            String sql = "SELECT * FROM tb_curso WHERE codCurso =?";
            Curso curso = new Curso();
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1,id);
            ResultSet resultado = comando.executeQuery();
            if (resultado.next()){
                    
                    curso.setCodCurso(resultado.getString(1));
                    curso.setTipo(resultado.getString(2));
                    curso.setModalidade(resultado.getString(3));
                    curso.setNome(resultado.getString(4));
                    curso.setHabilitacao(resultado.getString(5));
                    curso.setLocaloferta(resultado.getString(6));
                    curso.setTurno(resultado.getString(7));
                    curso.setNumvagas(resultado.getInt(8));
                    curso.setCarga(resultado.getString(9));
                    curso.setRegime(resultado.getString(10));
                    curso.setPeriodo(resultado.getString(11));
            }
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException ("Erro ao consultar ", ex);
        }
    return curso;
    }

    @Override
    public List<Curso> listar() throws DadosException {
        Connection conexao= ConexaoBD.getConexao();
        String sql= "SELECT * FROM tb_curso";
        List<Curso> lista= new ArrayList<Curso>();
        
        try {
            Statement comando= conexao.createStatement();
            ResultSet resultado= comando.executeQuery(sql);
            while(resultado.next()){
                Curso curso= new Curso();
                curso.setCodCurso(resultado.getString(1));
                curso.setTipo(resultado.getString(2));
                curso.setModalidade(resultado.getString(3));
                curso.setNome(resultado.getString(4));
                curso.setHabilitacao(resultado.getString(5));
                curso.setLocaloferta(resultado.getString(6));
                curso.setTurno(resultado.getString(7));
                curso.setNumvagas(resultado.getInt(8));
                curso.setCarga(resultado.getString(9));
                curso.setRegime(resultado.getString(10));
                curso.setPeriodo(resultado.getString(11));
                lista.add(curso);
            }
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException("Erro ao listar", ex);
        }
        return lista;
    }
    
}
