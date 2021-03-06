package com.oop.movie.model.entity;

import java.util.Calendar;

/**
 * @실습문제1 : 영화클래스 만들기
- 클래스명 : com.oop.movie.model.entity.Movie.java
- 멤버변수 : 반드시 캡슐화를 적용할 것
    - movieTitle : String                   //영화제목
    - director : String                     //감독이름
    - casting : String[]                    //출연배우 최대5명까지
    - release : Calendar                    //개봉일
- 각 멤버변수별 getter, setter
- 영화정보를 담은 information():String
- 파라미터 생성자.
    1. movieTitle
    2. movieTitle, director
    3. movieTitle, director, casting
    4. movieTitle, director, casting, release
생성자간 생성자호출 this()를 활용할 것.
영화4편을 각각의 생성자를 통해 생성한 후에 출력한다.
 * @author family
 *
 */
public class Movie {
	private String movieTitle="";
	private String director="";
	private String[] casting = {"","","","",""};
	private Calendar release=null;
//	파라미터 생성자.
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
			System.out.println("배열에 문제있음");
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
		
		String temp = "제목 : "+ getMovieTitle()+
				"\n감독 : " + getDirector()+
				"\n출연진 : " + cast;
		
		if(release!=null)
			temp= temp + "\n개봉일 : " + getRelease().get(Calendar.YEAR)+"년 "+getRelease().get(Calendar.MONTH)+"월 "+
					getRelease().get(Calendar.DAY_OF_MONTH);
		
		return temp;
	}
}