package com.distribuida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.FacturaDetalleDAO;

@Controller
@RequestMapping("/facturacion")

public class FacturaController {
	
	@Autowired
	private FacturaDAO facturaDAO;
	
	@Autowired
	private FacturaDetalleDAO facturaDetalleDAO;
	
	private ClienteDAO clienteDAO;
	
	@GetMapping ("/findAll")
	public String findAll(ModelMap modelMap) {
		
		modelMap.addAttribute("facturas", facturaDAO.findAll());
		return "listar-facturas";
	}
	
	@GetMapping ("/findOne")
	public String findOne (@RequestParam("idFactura")@Nullable Integer idFactura
			, ModelMap modelMap) {
		
		modelMap.addAttribute("facturas", facturaDAO.findOne(idFactura));
		return "listar-facturas";
	}
	@GetMapping ("/findOneCliente")
	public String findOneCliente (@RequestParam("idCliente")@Nullable Integer idCliente
			, ModelMap modelMap) {
		
		modelMap.addAttribute("cliente", clienteDAO.findOne(idCliente));
		return "redirect:/facturas/principal";
		
	

}
}