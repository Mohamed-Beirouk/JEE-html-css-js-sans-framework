package com.rim.services.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "entree")
public class Entree {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
 	@Column(name = "id")
    private Long id;
 	@Column(name = "date")
    private Date date;
 	@Column(name = "description")
    private String description;
	
	
	
 /*	@OneToMany
    @JoinColumn(name="id_entree")
 	private List<Entree_detail> entree_detail;
 	*/
	public Entree() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entree(Long id, Date date, String description) {
		super();
		this.id = id;
		this.date = date;
		this.description = description;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
