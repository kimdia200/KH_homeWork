package com.oop.movie.model.entity;

import java.util.Calendar;

/**
 * @�ǽ�����1 : ��ȭŬ���� �����
- Ŭ������ : com.oop.movie.model.entity.Movie.java
- ������� : �ݵ�� ĸ��ȭ�� ������ ��
    - movieTitle : String                   //��ȭ����
    - director : String                     //�����̸�
    - casting : String[]                    //�⿬��� �ִ�5������
    - release : Calendar                    //������
- �� ��������� getter, setter
- ��ȭ������ ���� information():String
- �Ķ���� ������.
    1. movieTitle
    2. movieTitle, director
    3. movieTitle, director, casting
    4. movieTitle, director, casting, release
�����ڰ� ������ȣ�� this()�� Ȱ���� ��.
��ȭ4���� ������ �����ڸ� ���� ������ �Ŀ� ����Ѵ�.
 * @author family
 *
 */
public class Movie {
	private String movieTitle="";
	private String director="";
	private String[] casting = {"","","","",""};
	private Calendar release=null;
//	�Ķ���� ������.
//    1. movieTitle
	public Movie(String moiveTitle) {
		this.movieTitle = moiveTitle;
	}
//    2. movieTitle, director
	public Movie(String movietitle, String director) {
		this(movietitle);
		this.director = director;
	}
//    3. movieTitle, director, casting
	public Movie(String movieTitle, String director, String[] casting) {
		this(movieTitle, director);
		setCasting(casting);
	}
//    4. movieTitle, director, casting, release
	public Movie(String movieTitle, String director, String[] casting, Calendar release) {
		this(movieTitle, director, casting);
		this.release = release;
	}
	
	
	//setter, getter
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setCasting(String[] casting) {
		if(casting.length>5) {
			for(int i=0; i<5; i++) {
				this.casting[i] = casting[i];
			}
		}else if(casting.length>0 && casting.length<=5) {
			for(int i=0; i<casting.length; i++) {
				this.casting[i] = casting[i];
			}
		}else
			System.out.println("�迭�� ��������");
	}
	public void setRelease(Calendar release) {
		this.release = release;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public String getDirector() {
		return director;
	}
	public String[] getCasting() {
		return casting;
	}
	public Calendar getRelease() {
		return release;
	}
	
	public String information() {
		String cast = "";
		for(int i=0; i<getCasting().length; i++) {
			cast = cast+getCasting()[i]+ (i!=getCasting().length-1 ? ", " : "");
		}
		
		String temp = "���� : "+ getMovieTitle()+
				"\n���� : " + getDirector()+
				"\n�⿬�� : " + cast;
		
		if(release!=null)
			temp= temp + "\n������ : " + getRelease().get(Calendar.YEAR)+"�� "+getRelease().get(Calendar.MONTH)+"�� "+
					getRelease().get(Calendar.DAY_OF_MONTH);
		
		return temp;
	}
}