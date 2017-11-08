
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.dados.DadosException;
import br.iesb.meuprograma.dados.Documento;
import br.iesb.meuprograma.dados.DocumentoDAO;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author vimag
 */
public class DocumentoBO implements BO<Documento>{

    @Override
    public void validar(Documento entidade) throws NegocioException {
        if (entidade.getNome().isEmpty()){
            throw new NegocioException("Nome do documento é obrigatório");
        }
        if (entidade.getTipo().isEmpty()){
            throw new NegocioException("Tipo do documento é obrigatório");
        }
    }

    @Override
    public void inserir(Documento entidade) throws NegocioException {
        DocumentoDAO dao= new DocumentoDAO();
        try {
            dao.inserir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("Erro ao incluir", ex);
        }
    }

    @Override
    public void alterar(Documento entidade) throws NegocioException {
        consultar(entidade.getNumero());
        validar(entidade);
        DocumentoDAO dao= new DocumentoDAO();
        
        try {
            dao.alterar(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("Erro ao alterar", ex);
        }
    }

    @Override
    public void excluir(Documento entidade) throws NegocioException {
        consultar(entidade.getNumero());
        DocumentoDAO dao= new DocumentoDAO();
        
        try {
            dao.excluir(entidade);
        } catch (DadosException ex) {
            throw new NegocioException("Erro ao excluir", ex);
        }
        
    }

    @Override
    public Documento consultar(int id) throws NegocioException {
        Documento documento= new Documento();
        DocumentoDAO dao= new DocumentoDAO();        
        try {
            documento= dao.consultar(id);
            if (documento.getNumero()==0){
                throw new NegocioException("Documento não encontrado");
            }
        } catch (DadosException ex) {
            throw new NegocioException ("Erro ao consultar", ex);
        }
        return documento;
    }

    @Override
    public List<Documento> listar() throws NegocioException {
        List<Documento> lista= new ArrayList<Documento>();
        DocumentoDAO dao= new DocumentoDAO();
        
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
