package com.collection.list.music.model.vo;

import java.util.Objects;

public class Music {

	private String title;
	private String singer;
	public Music() {
		super();
	}
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "Music [title=" + title + ", Singer=" + singer + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(title,singer);
	}
	
}
