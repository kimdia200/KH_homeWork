package com.collection.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.collection.list.music.controller.MusicManager;
import com.collection.list.music.model.vo.Music;
import com.collection.list.music.model.vo.MusicSingerAscending;
import com.collection.list.music.model.vo.MusicTitleAscending;

public class MusicMenu {

	private Scanner sc = new Scanner(System.in);
	private MusicManager manager = new MusicManager();
	

	public void mainMenu() {
		String menu = "    ================ Music Playlist Menu ================\r\n" + 
					"    1.목록보기\r\n" + 
					"    2.마지막에 음악추가\r\n" + 
					"    3.맨처음에 음악추가\r\n" + 
					"    4.곡삭제\r\n" + 
					"    5.곡변경\r\n" + 
					"    6.곡명검색\r\n" + 
					"    7.가수검색\r\n" + 
					"    8.목록정렬(곡명오름차순)\r\n" + 
					"    0.종료\r\n" + 
					"    ================================================================\r\n" + 
					"    >> 메뉴선택 : "; 
		do {
			System.out.print(menu);
			int num=sc.nextInt();
			
			if(num==1) {
				//목록보기
				System.out.println("노래목록");
				printList(manager.selectList());
			}else if(num==2) {
				//마지막에 음악추가
				System.out.println("마지막 위치에 노래를 추가합니다");
				manager.addList(inputMusic());
			}else if(num==3) {
				//맨처음에 음악추가
				System.out.println("처음 위치에 노래를 추가합니다.");
				manager.addAtZero(inputMusic());
			}else if(num==4) {
				//곡삭제
				System.out.println("노래를 삭제합니다");
				manager.removeMusic(inputTitle());
			}else if(num==5) {
				//곡변경
				sc.nextLine(); //개행문자 처리
				System.out.println("A노래를 B노래로 바꿉니다");
				manager.replaceMusic(inputMusic(), inputMusic());
			}else if(num==6) {
				//곡명검색
				System.out.println("곡을 검색합니다.");
				printList(manager.searchMusicByTitle(inputTitle()));;
			}else if(num==7) {
				//가수검색
				System.out.println("가수를 검색합니다.");
				printList(manager.searchMusicBySinger(inputSinger()));
			}else if(num==8) {
				//목록정렬
				sortMenu();
			}else if(num==0) {
				//종료
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}	
		}while(true);
	}
	
	public void sortMenu() {
		String menu = "    ================== 정렬 메뉴 ===================\r\n" + 
					"	1. 가수명 오름차순\r\n" + 
					"	2. 가수명 내림차순\r\n" + 
					"	3. 곡명 오름차순\r\n" + 
					"	4. 곡명 내림차순\r\n" + 
					"	5. 메인메뉴 돌아가기\r\n" + 
					"	================================================\r\n" + 
					"	>> 메뉴선택 : ";
		do {
			System.out.print(menu);
			int num=sc.nextInt();
			
			if(num==1) {
				//가수명 오름차순
				manager.orderBy(new MusicSingerAscending());
				break;
			}else if(num==2) {
				//가수명 내림차순
				
				manager.orderBy(new MusicSingerAscending().reversed());
				break;
			}else if(num==3) {
				//곡명 오름차순
				manager.orderBy(new MusicTitleAscending());
				break;
			}else if(num==4) {
				//곡명 내림차순
				manager.orderBy(new MusicTitleAscending().reversed());
				break;
			}else if(num==5) {
				//메인메뉴 돌아가기
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}while(true);
	}
//	a. 리스트 출력메소드
//	+ printList(List<Music>) : void
	public void printList(List<Music> list) {
		for(Music m : list){
			System.out.println(m);
		}
	}
//	b. 곡명 입력메소드
	public String inputTitle() {
		sc.nextLine(); //개행문자 처리
		System.out.print("곡명 입력 : ");
		return sc.nextLine();
	}
//	c. 가수 입력메소드
	public String inputSinger() {
		sc.nextLine(); //개행문자 처리
		System.out.print("가수 입력 : ");
		return sc.nextLine();
	}
//	d. 음악 입력메소드(곡명, 가수 모두 입력)
	public Music inputMusic() {
		System.out.print("곡명 입력 : ");
		String song = sc.nextLine();
		System.out.print("가수 입력 : ");
		String singer = sc.nextLine();
		return new Music(song,singer);
	}	
}