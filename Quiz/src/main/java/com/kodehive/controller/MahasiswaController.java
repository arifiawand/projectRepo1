package com.kodehive.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodehive.model.MahasiswaModel;
import com.kodehive.service.MahasiswaService;
import com.kodehive.model.ProfilMahasiswaModel;
import com.kodehive.service.ProfilMahasiswaService;

@Controller
@RequestMapping("/mahasiswa")
public class MahasiswaController {
@Autowired
MahasiswaService mahasiswaService;
@Autowired
ProfilMahasiswaService profilMahasiswaService;

	@RequestMapping("/home")
	public String home() {
		String html = "mahasiswa/home";
		return html;
	}
	@RequestMapping("/add")
	public String addMahasiswa() {
		String html = "mahasiswa/add";
		return html;
	}

	@RequestMapping("/create")
	public String create(HttpServletRequest request, Model model) {

		String kode = request.getParameter("kode");
		String nama = request.getParameter("nama");
		String semester = request.getParameter("semester");
		
		MahasiswaModel mahasiswaModel = new MahasiswaModel();
		mahasiswaModel.setKdMahasiswa(kode);
		mahasiswaModel.setNamaMahasiswa(nama);
		mahasiswaModel.setSemester(semester);
		
		this.mahasiswaService.save(mahasiswaModel);

		MahasiswaModel mahasiswaModelList = new MahasiswaModel();
		mahasiswaModelList = this.mahasiswaService.cariPrimaryKey(kode);
		
		model.addAttribute("mahasiswaModelList", mahasiswaModelList);
		
		String html= "/mahasiswa/createProfil";
		return html;
	}
	
	
	@RequestMapping("/createProfil")
	public String createProfil(HttpServletRequest request, Model model) {
		String email = request.getParameter("email");
		String noHp = request.getParameter("noHp");
		String nama = request.getParameter("nama");
		
		ProfilMahasiswaModel profilMahasiswaModel = new ProfilMahasiswaModel();
		profilMahasiswaModel.setEmail(email);
		profilMahasiswaModel.setNoHp(noHp);
		profilMahasiswaModel.setNamaMahasiswa(nama);
		
		this.profilMahasiswaService.save(profilMahasiswaModel);
	
		String html= "/mahasiswa/home";
		return html;
	}
	
	@RequestMapping("/list")
	public String readAll(Model model) {
		List<MahasiswaModel> mahasiswaModelList = new ArrayList<MahasiswaModel>();
		mahasiswaModelList = this.mahasiswaService.readAll();
		model.addAttribute("MahasiswaModelList", mahasiswaModelList);
		
		String html = "mahasiswa/list";
		return html;
	}

}
