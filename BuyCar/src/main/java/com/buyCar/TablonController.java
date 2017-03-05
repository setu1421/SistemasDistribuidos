package com.buyCar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import repositorios.*;


@Controller
public class TablonController implements CommandLineRunner{

	
	@Autowired
	private UsuarioRepository usRepository;

	@Autowired
	private CocheRepository coRepository;
	
	@Autowired
	private CategoriaRepository caRepository;
	
	
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
