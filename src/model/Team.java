package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teamId")
	private int teamId;
	@Column(name = "teamName")
	private String teamName;
	@Column(name = "teamType")
	private String teamType;
	@Column(name = "preferredNight")
	private String preferredNight;
	
	public Team() {
		
	}
	
	public Team(String name) {
		this.setTeamName(name);
	}

	public Team(String name, String type, String night) {
		this.teamName = name;
		this.teamType = type;
		this.preferredNight = night;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamType() {
		return teamType;
	}

	public void setTeamType(String teamType) {
		this.teamType = teamType;
	}

	public String getPreferredNight() {
		return preferredNight;
	}

	public void setPreferredNight(String preferredNight) {
		this.preferredNight = preferredNight;
	}
}
