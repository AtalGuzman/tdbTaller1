package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the actor database table.
 * 
 */
@Entity
@Table(name="film")
@NamedQuery(name="Film.findAll", query="SELECT f FROM Film f")
public class Film implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="film_id", unique=true, nullable=false)
	private int filmId;

	@Column(name="title", nullable=false, length=45)
	private String title;

	@Column(name="description", nullable=true, length=255)
	private String description;

	@Column(name="release_year",nullable=true)
	private int releaseYear;

	@Column(name="language_id", nullable=false)
	private int languageId;

	@Column(name="original_language_id",nullable=true)
	private int originalLanguageId;

	@Column(name="rental_duration",nullable=false)
	private int rentalDuration;

	@Column(name="rental_rate",nullable=false)
	private float rentalRate;
	
	@Column(name="length",nullable=false)
	private int length;
	
	@Column(name="replacement_cost",nullable=false)
	private float replacementCost;

	@Column(name="rating",nullable=false)
	private String rating;

	@Column(name="special_features",nullable=false)
	private String specialFeatures;

	@Column(name="last_update",nullable=false)
	private Timestamp lastUpdate;

	public String getSpecialFeatures() {
		return this.specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures){
		this.specialFeatures = specialFeatures;
	}	

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating){
		this.rating = rating;
	}	

	public float getReplacementCost() {
		return this.replacementCost;
	}

	public void setReplacementCost(float replacementCost){
		this.replacementCost = replacementCost;
	}	

	public int getLength() {
		return this.length;
	}

	public void setLength(int length){
		this.length = length;
	}	

	public float getRentalRate() {
		return this.rentalRate;
	}

	public void setRentalRate(float rentalRate){
		this.rentalRate = rentalRate;
	}	

	public int getRentalDuration() {
		return this.rentalDuration;
	}

	public void setRentalDuration(int rentalDuration){
		this.rentalDuration = rentalDuration;
	}	
	
	public int getOriginalLanguageId() {
		return this.originalLanguageId;
	}

	public void setOriginalLanguageId(int originalLanguageId){
		this.originalLanguageId = originalLanguageId;
	}

	public Film() {
	}

	public int getFilmId() {
		return this.filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public int getReleaseYear() {
		return this.releaseYear;
	}

	public void setReleaseYear(int release_year){
		this.releaseYear = releaseYear;
	}

	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId){
		this.languageId = languageId;
	}
	
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}
	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
