package com.collection.list.music.model.vo;

import java.util.Comparator;

public class MusicTitleAscending implements Comparator<Music>{
	
	@Override
	public int compare(Music m1, Music m2) {
		return m1.getTitle().compareTo(m2.getTitle());
	}

}
