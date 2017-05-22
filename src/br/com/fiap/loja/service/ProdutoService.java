package br.com.fiap.loja.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.fiap.loja.bo.ProdutoBO;
import br.com.fiap.loja.entity.Produto;


@Path("/loja")
public class ProdutoService {
	
	ProdutoBO produtoBO = new ProdutoBO();
	
	@GET
	@Path("/produtoPorId/{id}")
	@Produces("application/json; chartset=UTF-8")
	public Produto buscarPorId(@PathParam("id") Integer id){
		return produtoBO.buscarPorID(id);
	}
	
	@POST
	public void cadastrarProduto(Produto produto){
		produtoBO.CadastrarProduto(produto);
	}
	
	@GET
	@Path("/produtos")
	@Produces("application/json; chartset=UTF-8")
	public List<Produto> buscarTodo(){
		return produtoBO.buscarTodos();
	}
	
	@PUT
	public void alterarProduto (Produto produto) {
		produtoBO.alterarProduto(produto);
	}
	
	@DELETE
	public void excluirProduto (Produto produto){
		produtoBO.excluirProduto(produto);
	}
	
	@DELETE
	@Path("/del/{id}")
	public void excluirProduto (@PathParam("id") Integer id){
		produtoBO.excluirProduto(id);
	}
}
