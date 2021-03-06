package com.adp.entities;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;

@Entity
@Table(name="FMI_THIRDPARTY")
public class ThirdPartyEntity extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName ;
	private String lastName ;
	private String jobTitle ;
	private String phone ;
	private String adresse ;
	private String matricule ;
	private String gender;
	@Lob
	@Column(name="profileImage", nullable=false, columnDefinition="blob")
	private byte[] profileImage ;
	
	@OneToMany(mappedBy="thirdParty",fetch=FetchType.EAGER)
	private Set<AffectationEntity> association = new HashSet<AffectationEntity>() ;
	
	@ManyToOne
	@JoinColumn(name="teamId")
	private TeamEntity team ;
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public byte[] getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	
	
	public TeamEntity getTeam() {
		return team;
	}
	public void setTeam(TeamEntity team) {
		this.team = team;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public ThirdPartyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Set<AffectationEntity> getAssociation() {
		return association;
	}
	public void setAssociation(Set<AffectationEntity> association) {
		this.association = association;
	}
	public ThirdPartyEntity(String firstName, String lastName,String gender ,String jobTitle,
			String phone,String adresse, byte[] profileImage) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender ;
		this.jobTitle = jobTitle;
		this.phone = phone;
		this.adresse = adresse ;
		this.profileImage = profileImage ;
		this.matricule=  UUID.randomUUID().toString();
	}
	
	
	
	
	
	
	
	
}
