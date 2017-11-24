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
 * @author kscka
 */
public class CadDisciplinaDAO implements DAO<CadDisciplina>{

    @Override
    public void inserir(CadDisciplina entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
            String sql = "INSERT INTO tb_disciplina (tx_nome, tx_descricao, tx_tipo, tx_codigo, "
                    + "tx_semestre, tx_cargaHora) VALUES (?,?,?,?,?)";
    try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1,entidade.getNome());
            comando.setString(2,entidade.getDescricao());
            comando.setString(3,entidade.getTipo());
            comando.setInt(4,entidade.getCodigo());
            comando.setString(5,entidade.getSemestre());
            comando.setString(6,entidade.getCargaHora());
            comando.executeUpdate();   
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException ("Erro ao inserir ", ex);
        }
            
    }
    @Override
    public void alterar(CadDisciplina entidade) throws DadosException {
        Connection conexao = ConexaoBD.getConexao();
            String sql = "UPDATE tb_cadastro SET tx_nome=?, tx_descricao=?, "
                    + "tx_tipo=?, tx_semestre=?, tx_cargaHora=? WHERE tx_codigo=?";
            
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1,entidade.getNome());
            comando.setString(2,entidade.getDescricao());
            comando.setString(3,entidade.getTipo());
            comando.setString(4,entidade.getSemestre());
            comando.setString(5,entidade.getCargaHora());
            comando.setInt(6,entidade.getCodigo());
            comando.executeUpdate();   
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException ("Erro ao alterar ", ex);
        }

    }

    @Override
    public void excluir(CadDisciplina entidade) throws DadosException {
    Connection conexao = ConexaoBD.getConexao();
            String sql = "DELETE FROM tb_disciplina WHERE tx_codigo=?";
            
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1,entidade.getCodigo());
            comando.executeUpdate();   
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException ("Erro ao excluir ", ex);
        }

    }

    @Override
    public CadDisciplina consultar(int id) throws DadosException {
     Connection conexao = ConexaoBD.getConexao();
            String sql = "SELECT * FROM tb_professor WHERE tx_codigo =?";
            CadDisciplina caddisciplina = new CadDisciplina();
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1,id);
            ResultSet resultado = comando.executeQuery();
            if (resultado.next()){
                    caddisciplina.setNome(resultado.getString(1));
                    caddisciplina.setDescricao(resultado.getString(2));
                    caddisciplina.setTipo(resultado.getString(3));
                    caddisciplina.setSemestre(resultado.getString(4));
                    caddisciplina.setCargaHora(resultado.getString(5));
                    caddisciplina.setCodigo(resultado.getInt(6));
            }
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException ("Erro ao consultar ", ex);
        }
    return caddisciplina;
    }

    @Override
    public List<CadDisciplina> listar() throws DadosException {
     Connection conexao = ConexaoBD.getConexao();
        String sql = "SELECT * FROM tb_professor";
        List<CadDisciplina> lista = new ArrayList<CadDisciplina>();
        
         try {
            Statement comando = conexao.createStatement();
            ResultSet resultado = comando.executeQuery(sql);
            while (resultado.next()){
                 CadDisciplina caddisciplina = new CadDisciplina();   
                caddisciplina.setNome(resultado.getString(1));
                    caddisciplina.setDescricao(resultado.getString(2));
                    caddisciplina.setTipo(resultado.getString(3));
                    caddisciplina.setCodigo(resultado.getInt(4));
                    caddisciplina.setSemestre(resultado.getString(5));
                    caddisciplina.setCargaHora(resultado.getString(6));
                    
                    lista.add(caddisciplina);
            }
            conexao.close();
        } catch (SQLException ex) {
            throw new DadosException ("Erro ao listar ", ex);
        }
        
        return lista;    
    
    }
    
    }

   