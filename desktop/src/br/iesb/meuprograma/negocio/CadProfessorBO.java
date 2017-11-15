/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.CadProfessor;
import br.iesb.meuprograma.dados.CadProfessorDAO;
import br.iesb.meuprograma.dados.DadosException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author kscka
 */
public class CadProfessorBO implements BO<CadProfessor> {

    @Override
    public void validar(CadProfessor entidade) throws NegocioException {
            if (entidade.getNome().isEmpty()){
                throw new NegocioException ("O Campo Nome é obrigatório.");
            }
         /*  if (entidade.getSenha().isEmpty()){
                throw new NegocioException ("O Campo Senha é obrigatório.");
           }*/
    }

    @Override
    public void inserir(CadProfessor entidade) throws NegocioException {
        validar (entidade);    
        CadProfessorDAO dao = new CadProfessorDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException ("Erro ao incluir.", ex);    
        }
          
    }

    @Override
    public void alterar(CadProfessor entidade) throws NegocioException {
        consultar (entidade.getMatricula());
        validar (entidade);
         CadProfessorDAO dao = new CadProfessorDAO();
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
            throw new NegocioException ("Erro ao alterar.", ex);    
        }
        
    }

    @Override
    public void excluir(CadProfessor entidade) throws NegocioException {
        consultar(entidade.getMatricula());
        CadProfessorDAO dao = new CadProfessorDAO();
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException ("Erro ao excluir.", ex);    
        }
    }

    @Override
    public CadProfessor consultar(int id) throws NegocioException {
        CadProfessor cadprofessor = new CadProfessor();
        CadProfessorDAO dao = new CadProfessorDAO();

        try {
           cadprofessor = dao.consultar(id);
           if (cadprofessor.getMatricula()== 0){
               throw new NegocioException ("Documento não encontrado.");
           }
        } catch (DadosException ex) {
            throw new NegocioException ("Erro ao consultar.", ex);    
        }
        return cadprofessor;
    }

    @Override
    public List<CadProfessor> listar() throws NegocioException {
        List<CadProfessor> lista = new ArrayList<CadProfessor>();
        CadProfessorDAO dao = new CadProfessorDAO();
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
