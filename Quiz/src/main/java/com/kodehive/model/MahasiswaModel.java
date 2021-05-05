package com.kodehive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mahasiswa_quiz")
public class MahasiswaModel {

	// property
	@Id
	@Column(name="kdMahasiswa")
	private String kdMahasiswa;
	
	@Column(name="nama_mahasiswa")
	private String namaMahasiswa;
	
	@OneToOne
	@JoinColumn(name="nama_mahasiswa", nullable=true, insertable=false, updatable=false)
	private ProfilMahasiswaModel ProfilMahasiswaModel;
	
	@Column(name="semester")
	private String semester;

	public String getKdMahasiswa() {
		return kdMahasiswa;
	}

	public void setKdMahasiswa(String kdMahasiswa) {
		this.kdMahasiswa = kdMahasiswa;
	}

	public String getNamaMahasiswa() {
		return namaMahasiswa;
	}

	public void setNamaMahasiswa(String namaMahasiswa) {
		this.namaMahasiswa = namaMahasiswa;
	}

	public ProfilMahasiswaModel getProfilMahasiswaModel() {
		return ProfilMahasiswaModel;
	}

	public void setProfilMahasiswaModel(ProfilMahasiswaModel profilMahasiswaModel) {
		ProfilMahasiswaModel = profilMahasiswaModel;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	
}
