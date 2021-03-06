package com.adp.business.dao;

import java.util.List;

import com.adp.entities.TeamEntity;
import com.adp.exceptions.ADPException;

public interface TeamDAO extends GenericDAO<TeamEntity> {
	
	public TeamEntity addTeam(TeamEntity p) throws ADPException ;
	public TeamEntity getTeam(Long idTeam) throws ADPException ;
	public void updateTeam(TeamEntity p) throws ADPException ;
	public void deleteTeam(Long idTeam) throws ADPException ;
	List<TeamEntity> getAllTeams()throws ADPException ;
	public TeamEntity getTeamByName(String name)throws ADPException ;
	
}
