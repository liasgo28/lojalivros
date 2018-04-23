package br.com.diego.lojalivros.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.diego.lojalivros.daos.ProdutoDAO;
import br.com.diego.lojalivros.models.Produto;

@Controller
public class ProdutosController {
	@Autowired
    private ProdutoDAO produtoDao;
	
	@RequestMapping("/produtos/form")
    public String form(){
        return "produtos/form";
    }
	
	@RequestMapping("/produtos")
	public String gravar(Produto produto){
		System.out.println(produto);
        produtoDao.gravar(produto);
        return "/produtos/ok";
	}
}
