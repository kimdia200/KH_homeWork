package com.io.test4.run;

import com.io.test4.controller.BookManager;

public class TestBookManager {

	public static void main(String[] args) {
		BookManager bm = new BookManager();
		bm.fileSave();
		bm.fileRead();
	}

}
