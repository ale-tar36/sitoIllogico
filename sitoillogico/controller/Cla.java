package org.example.sitoillogico.controller;

import org.example.sitoillogico.model.dao.QualcosaDao;
import org.example.sitoillogico.model.entities.Qualcosa;
import org.example.sitoillogico.model.enums.Enumeratore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class Cla
{
	@Autowired
	QualcosaDao qualcosaDao;

	@GetMapping("/qwe")
	public String primo()
	{
		return "abc";
	}

	@PostMapping("/qwe")
	public String secondo(Model m, @RequestParam String b,
						  @RequestParam Enumeratore c,
						  @RequestParam LocalDate d)
	{
		Qualcosa q = Qualcosa.builder().b(b).c(c).d(d).build();
		m.addAttribute("nuovoQualcosa",qualcosaDao.save(q));
		return "abc";
	}

	@GetMapping("/rty")
	public String terzo(Model oggettiQualcosa)
	{
		oggettiQualcosa.addAttribute("listaQualcosa",qualcosaDao.findAll());
		return "def";
	}

	@GetMapping("/uio")
	public String quarto(Model oggettiQualcosaFiltrati)
	{
		oggettiQualcosaFiltrati.addAttribute("listaEnumerata",qualcosaDao.oggettiQualcosaFiltrati());
		return "ghi";
	}

	@GetMapping("/pas")
	public String quinto()
	{
		return "lmn";
	}

	@GetMapping("/DESTRUCTION")
	public String sesto()
	{
		qualcosaDao.deleteAll();
		return "desolazione";
	}

}
