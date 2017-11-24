/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.CadDisciplina;
import br.iesb.meuprograma.dados.CadDisciplinaDAO;
import br.iesb.meuprograma.dados.DadosException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kscka
 */
public class CadDisciplinaBO implements BO<CadDisciplina> {

    @Override
    public void validar(CadDisciplina entidade) throws NegocioException {
        if (entidade.getNome().isEmpty()){
                throw new NegocioException ("O Campo Nome é obrigatório.");    
    }
}

    @Override
    public void inserir(CadDisciplina entidade) throws NegocioException {
     validar (entidade);    
        CadDisciplinaDAO dao = new CadDisciplinaDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException ("Erro ao incluir.", ex);    
        }    
    
    }

    @Override
    public void alterar(CadDisciplina entidade) throws NegocioException {
    consultar (entidade.getCodigo());
        validar (entidade);
         CadDisciplinaDAO dao = new CadDisciplinaDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex){ 
            throw new NegocioException ("Erro ao alterar.", ex);    
        }   
    }

    @Override
    public void excluir(CadDisciplina entidade) throws NegocioException {
      consultar(entidade.getCodigo());
        CadDisciplinaDAO dao = new CadDisciplinaDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException ("Erro ao excluir.", ex);    
        }   
    }
    
    @Override
    public CadDisciplina consultar(int id) throws NegocioException {
     CadDisciplina caddisciplina = new CadDisciplina();
        CadDisciplinaDAO dao = new CadDisciplinaDAO();

        try {
           caddisciplina = dao.consultar(id);
           if (caddisciplina.getCodigo()== 0){
               throw new NegocioException ("Documento não encontrado.");
           }
        } catch (DadosException ex) {
            throw new NegocioException ("Erro ao consultar.", ex);    
        }
        return caddisciplina;    
    }

    @Override
    public List<CadDisciplina> listar() throws NegocioException {
     List<CadDisciplina> lista = new ArrayList<CadDisciplina>();
        CadDisciplinaDAO dao = new CadDisciplinaDAO();
        try {
            lista = dao.listar();
            if (lista.isEmpty()){
               throw new NegocioException ("Nenhum documento listado.");
           }
        } catch (DadosException ex) {
            throw new NegocioException ("Erro ao listar.", ex);    
        }
        return lista;   
    }
    
    
    }