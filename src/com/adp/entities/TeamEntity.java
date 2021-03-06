package com.adp.entities;


import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="FMI_TEAM")
public class TeamEntity extends AbstractEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String teamName ;
	
	@OneToMany(mappedBy="team")
	private Collection<ThirdPartyEntity> employees;
	
	@ManyToOne
	@JoinColumn(name="projectId")
	private ProjectEntity project ;
	

	public TeamEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Collection<ThirdPartyEntity> getEmployees() {
		return employees;
	}

	public void setEmployees(Collection<ThirdPartyEntity> employees) {
		this.employees = employees;
	}

	public TeamEntity(String teamName) {
		super();
		this.teamName = teamName;
	}

	public ProjectEntity getProject() {
		return project;
	}

	public void setProject(ProjectEntity project) {
		this.project = project;
	}

	
	
	
	
	
	
}
