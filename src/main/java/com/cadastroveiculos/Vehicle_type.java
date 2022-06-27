package com.cadastroveiculos;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle_type {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long vtypeid;
	private String vtypename;
	private String vtypedesc;
	public long getId() {
		return vtypeid;
	}
	public void setId(long id) {
		this.vtypeid = id;
	}
	public String getName() {
		return vtypename;
	}
	public void setName(String name) {
		this.vtypename = name;
	}
	public String getDesc() {
		return vtypedesc;
	}
	public void setDesc(String desc) {
		this.vtypedesc = desc;
	}
	@Override
	public int hashCode() {
		return Objects.hash(vtypeid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle_type other = (Vehicle_type) obj;
		return vtypeid == other.vtypeid;
	}

}
