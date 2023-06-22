package com.jspiders.musciplayer.PlayList;

import java.util.ArrayList;
import java.util.Scanner;
import com.jspiders.musciplayer.Songs.Songs;

public class PlayList {
 Scanner scanner = new Scanner(System.in);
 private ArrayList<Songs>songs=new ArrayList<Songs>();
 
 public int arrayListSize(){
	return songs.size();	
}
 public String addSongs(Songs  s) {
	songs.add(s);
	return "Song Added succesfully";	
}
 public void displayAllSongs() {
	if (songs.size()>0) {
		for(int i=0;i<songs.size();i++) {
			int songno=i+1;
			System.out.println(songno+" "+songs.get(i));
		}
	}
		else
			System.out.println("Song are not available..");	
}
 public void playRandomSong() {
	if (songs.size()>0) {
		for(int i=0;i<songs.size();i++) {
			int rno=(int)(Math.random()*songs.size());
			System.out.println(songs.get(rno));
		}
	}
	else
		System.out.println("Songs are not present...");
}

 public String chooseSongToPlay(int songno) {
	if (songs.size()>0) {
		try {
			return " "+songs.get(songno-1);
		} catch (IndexOutOfBoundsException e) {
			return "Invalid song number.... Please Try again";   
		}
	}
	else
		return "Song are not present...";
}
 public String removeSong() {
	System.out.println("Select song number to remove");
	displayAllSongs();
	int songno=scanner.nextInt();
	try {
		songs.remove(songno-1);
		return "Song removed Successfully";
	} catch (IndexOutOfBoundsException e) {
      return "Invalid song number.... Please Try again";   
	}
	
}

 public String editSong(int sno, Songs s) {
	try {
		songs.set(sno-1,s);
		return "Song Edited successfully";
	} catch (Exception e) {
		return "Invalid song number.... Please Try again";
	}
}
}
