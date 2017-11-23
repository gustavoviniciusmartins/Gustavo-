/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.Curso;
import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.dados.CursoDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vimag
 */
public class CursoBO implements BO<Curso> {

    @Override
    public void validar(Curso entidade) throws NegocioException {
        if (entidade.getNome().isEmpty()){
            throw new NegocioException("Nome do Curso é obrigatório");
        }
        if (entidade.getTipo().isEmpty()){
            throw new NegocioException("Tipo do Curso é obrigatório");
        }
    }

    @Override
    public void inserir(Curso entidade) throws NegocioException {
        CursoDAO dao= new CursoDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("Erro ao incluir", ex);
        }
    }

    @Override
    public void alterar(Curso entidade) throws NegocioException {
        consultar(entidade.getCodCurso());
        validar(entidade);
        CursoDAO dao= new CursoDAO();
        
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("Erro ao alterar", ex);
        }
        
    }

    @Override
    public void excluir(Curso entidade) throws NegocioException {
        consultar(entidade.getCodCurso());
        CursoDAO dao= new CursoDAO();
        
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("Erro ao excluir", ex);
        }
    }

    @Override
    public Curso consultar(int id) throws NegocioException {
        Curso curso= new Curso();
        CursoDAO dao= new CursoDAO();        
        try {
            curso= dao.consultar(id);
            if (curso.getCodCurso()==0){
                throw new NegocioException("Documento não encontrado");
            }
        } catch (DadosException ex) {
            throw new NegocioException ("Erro ao consultar", ex);
        }
        return curso;
    }

    @Override
    public List<Curso> listar() throws NegocioException {
        List<Curso> lista= new ArrayList<Curso>();
        CursoDAO dao= new CursoDAO();
        
        try {
            lista= dao.listar();
            if (lista.isEmpty()){
                throw new NegocioException("Nenhum documento cadastrado!");
            }            
        } catch (DadosException ex) {
            throw new NegocioException ("Erro ao listar", ex);
        }
        return lista;
    }
    
}
