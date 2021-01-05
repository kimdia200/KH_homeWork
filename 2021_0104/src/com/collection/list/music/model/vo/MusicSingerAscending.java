package com.collection.list.music.model.vo;

import java.util.Comparator;

public class MusicSingerAscending implements Comparator<Music> {

	@Override
	public int compare(Music m1, Music m2) {
		return m1.getSinger().compareTo(m2.getSinger()	);
	}
}
