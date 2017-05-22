package br.com.fiap.loja.bo;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import br.com.fiap.loja.dao.ProdutoDAO;
import br.com.fiap.loja.dao.impl.ProdutoDAOImpl;
import br.com.fiap.loja.entity.Produto;
import br.com.fiap.loja.exception.DataBaseException;

public class ProdutoBO {
	
	 private ProdutoDAO dao = new ProdutoDAOImpl();
	 
	 public Produto buscarPorID(Integer id){
		 return dao.buscarPorId(id);		 
	 }
	 
	 public void CadastrarProduto(Produto produto){
		 try {
			dao.adicionar(produto);
		} catch (DataBaseException e) {
			e.printStackTrace();
		}
	 }
	 
	 public List<Produto> buscarTodos(){
		 return dao.buscarTodos();
	 }
	 
	 public void alterarProduto (Produto produto){
		 try {
			 dao.atualizar(produto);
			
		} catch (DataBaseException e) {
			e.printStackTrace();
		}
	 }
	 
	 public void excluirProduto (Produto produto) {
		 try {
			dao.remover(produto.getCd_produto());
		} catch (EntityNotFoundException | DataBaseException e) {
			e.printStackTrace();
		}
	 }	 
	 public void excluirProduto (int cod) {
		 try {
			dao.remover(cod);
		} catch (EntityNotFoundException | DataBaseException e) {
			e.printStackTrace();
		}
	 }	 

	 
}
