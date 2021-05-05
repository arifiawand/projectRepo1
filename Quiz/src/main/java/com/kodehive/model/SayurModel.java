package com.kodehive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Sayur")
public class SayurModel {

	// property
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idSayur")
	private int idSayur;
	
	@Column(name="namaSayur")
	private String namaSayur;
	
	@Column(name="jumlahSayur")
	private int jumlahSayur;
	
	@Column(name="tipeKeranjang")
	private String tipeKeranjang;
	
	@ManyToOne
	@JoinColumn(name="tipeKeranjang", nullable=true, insertable=false, updatable=false)
	private KeranjangModel KeranjangModel;

	public int getIdSayur() {
		return idSayur;
	}

	public void setIdSayur(int idSayur) {
		this.idSayur = idSayur;
	}

	public String getNamaSayur() {
		return namaSayur;
	}

	public void setNamaSayur(String namaSayur) {
		this.namaSayur = namaSayur;
	}

	public int getJumlahSayur() {
		return jumlahSayur;
	}

	public void setJumlahSayur(int jumlahSayur) {
		this.jumlahSayur = jumlahSayur;
	}

	public String getTipeKeranjang() {
		return tipeKeranjang;
	}

	public void setTipeKeranjang(String tipeKeranjang) {
		this.tipeKeranjang = tipeKeranjang;
	}

	public KeranjangModel getKeranjangModel() {
		return KeranjangModel;
	}

	public void setKeranjangModel(KeranjangModel keranjangModel) {
		KeranjangModel = keranjangModel;
	}


}
