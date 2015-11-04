package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="film_actor")
@NamedQuery(name="FilmActor.findAll", query="SELECT fa FROM FilmActor fa")
public class FilmActor implements Serializable{
	
	@Id
	@Column(name="film_id",nullable=false)
	private int filmId;

	@Id
	@Column(name="actor_id",nullable=false)
	private int actorId;

	@Column(name="last_update",nullable=false)
	private Timestamp lastUpdate;
	
	public int getActorId() {
		return this.actorId;
	}

	public void setActorId(int actorId) {
			this.actorId=actorId;
	}

	public int getFilmId() {
		return this.filmId;
	}

	public void setFilmId(int filmId) {
			this.filmId=filmId;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
