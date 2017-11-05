/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.CadProfessor;
import java.util.List;

/**
 *
 * @author kscka
 */
public class CadProfessorBO implements BO<CadProfessor> {

    @Override
    public void validar(CadProfessor entidade) throws NegocioException {
        if (entidade.getMatricula().isEmpty()){ //deu erro quando a entidade estava como INT.
        throw new NegocioException ("O campo Matrícula do professor é obrigatória.");
        }
        if (entidade.getNome().isEmpty()){
        throw new NegocioException ("O campo Nome do professor é obrigatório.");
        }
    }

    @Override
    public void inserir(CadProfessor entidade) throws NegocioException {
    
    }

    @Override
    public void alterar(CadProfessor entidade) throws NegocioException {
    
    }

    @Override
    public void excluir(CadProfessor entidade) throws NegocioException {
    
    }

    @Override
    public CadProfessor consultar(int id) throws NegocioException {
    
    }

    @Override
    public List<CadProfessor> listar() throws NegocioException {
    
    }
    
}
