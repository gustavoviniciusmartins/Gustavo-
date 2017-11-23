/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.Curso;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Curso entidade) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Curso entidade) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Curso consultar(int id) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Curso> listar() throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
