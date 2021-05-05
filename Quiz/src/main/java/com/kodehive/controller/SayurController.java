package com.kodehive.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodehive.model.SayurModel;
import com.kodehive.service.SayurService;
import com.kodehive.model.KeranjangModel;
import com.kodehive.model.SayurModel;
import com.kodehive.service.KeranjangService;

@Controller
@RequestMapping("/sayur")
public class SayurController {
@Autowired
SayurService sayurService;
@Autowired
KeranjangService keranjangService;

	@RequestMapping("/home")
	public String home() {
		String html = "sayur/home";
		return html;
	}
	@RequestMapping("/add")
	public String addSayur(Model model) {
		this.bacaKeranjang(model);
		String html = "sayur/add";
		return html;
	}
	
	@RequestMapping("/add_keranjang")
	public String addKeranjang(Model model) {
		this.bacaKeranjang(model);
		String html = "sayur/createKeranjang";
		return html;
	}

	@RequestMapping("/createSayur")
	public String createSayur(HttpServletRequest request, Model model) {

		
		String nama = request.getParameter("nama");
		String jumlah = request.getParameter("jumlah");
		String tipe = request.getParameter("tipe");
		
		SayurModel sayurModel = new SayurModel();
		
		sayurModel.setNamaSayur(nama);
		sayurModel.setJumlahSayur(Integer.valueOf(jumlah));
		sayurModel.setTipeKeranjang(tipe);
		
		
		this.sayurService.save(sayurModel);
		
		String html= "/sayur/home";
		return html;
	}
	
	
	@RequestMapping("/createKeranjang")
	public String createKeranjang(HttpServletRequest request, Model model) {
		String tipe = request.getParameter("tipe");
	
		
		KeranjangModel keranjangModel = new KeranjangModel();
		keranjangModel.setTipeKeranjang(tipe);
		
		this.keranjangService.save(keranjangModel);
	
		String html= "/sayur/home";
		return html;
	}
	
	@RequestMapping("/list")
	public String readAll(Model model) {
		List<SayurModel> sayurModelList = new ArrayList<SayurModel>();
		sayurModelList = this.sayurService.readAll();
		model.addAttribute("SayurModelList", sayurModelList);
		
		String html = "sayur/list";
		return html;
	}

	public void bacaKeranjang(Model model) {
		List<KeranjangModel> keranjangModelList = new ArrayList<>();
		keranjangModelList = this.keranjangService.readAll();
		
		model.addAttribute("keranjangModelList", keranjangModelList);
	}
}
