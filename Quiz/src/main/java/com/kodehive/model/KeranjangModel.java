package com.kodehive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Keranjang")
public class KeranjangModel {

	// property
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idKeranjang")
	private int idKeranjang;
	
	@Column(name="tipeKeranjang")
	private String tipeKeranjang;

	public int getIdKeranjang() {
		return idKeranjang;
	}

	public void setIdKeranjang(int idKeranjang) {
		this.idKeranjang = idKeranjang;
	}

	public String getTipeKeranjang() {
		return tipeKeranjang;
	}

	public void setTipeKeranjang(String tipeKeranjang) {
		this.tipeKeranjang = tipeKeranjang;
	}
	
}
