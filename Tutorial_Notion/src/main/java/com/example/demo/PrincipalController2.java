package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PrincipalController2 {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/compras")
	public String compras() {
		return "compras";
	}

	@GetMapping("/vendas")
	public String Vendas() {
		return "vendas";
	}

	@GetMapping("/estoque")
	public String estoque() {
		return "estoque";
	}
}
