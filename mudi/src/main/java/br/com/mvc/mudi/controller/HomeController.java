package br.com.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("O último desejo - The Witcher");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/41Yy6AbJXAL._SX331_BO1,204,203,200_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/%C3%BAltimo-desejo-Witcher-bruxo-Geralt/dp/854690281X/ref=tmm_hrd_swatch_0?_encoding=UTF8&qid=1630184049&sr=1-2");
		pedido.setDescricao("Uma descrição qualquer para o pedido");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
	
}
