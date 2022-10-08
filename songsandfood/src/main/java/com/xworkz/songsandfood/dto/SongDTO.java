package com.xworkz.songsandfood.dto;

public class SongDTO {
	
	private String name;
	private String singer;
	private String duration;
	private String producer;
	private String lyrics;
	private String language;
	private String type;
	@Override
	public String toString() {
		return "SongDTO [name=" + name + ", singer=" + singer + ", duration=" + duration + ", producer=" + producer
				+ ", lyrics=" + lyrics + ", language=" + language + ", type=" + type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
