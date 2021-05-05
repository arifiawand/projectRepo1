package com.kodehive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mahasiswa_profil")
public class ProfilMahasiswaModel {

	// property
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idProfil")
	private int idProfil;
	
	@Column(name="email")
	private String email;
	
	@Column(name="noHp")
	private String noHp;
	
	@Column(name="nama_mahasiswa")
	private String namaMahasiswa;

	public int getIdProfil() {
		return idProfil;
	}

	public void setIdProfil(int idProfil) {
		this.idProfil = idProfil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNoHp() {
		return noHp;
	}

	public void setNoHp(String noHp) {
		this.noHp = noHp;
	}

	public String getNamaMahasiswa() {
		return namaMahasiswa;
	}

	public void setNamaMahasiswa(String namaMahasiswa) {
		this.namaMahasiswa = namaMahasiswa;
	}

		
}
