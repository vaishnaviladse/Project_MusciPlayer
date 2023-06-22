package com.jspiders.musciplayer.song;

import java.util.Scanner;
import com.jspiders.musciplayer.PlayList.PlayList;
import com.jspiders.musciplayer.Songs.Songs;

public class SongOperations {
    Scanner inScanner= new Scanner(System.in);
    Songs song=new Songs();
    PlayList playList=new PlayList();
    String songName;
    int songId;
    String singerName;
    double songDuration;
   public void addSong() {
	   System.out.println("Enter the name of the song");
	   songName=inScanner.nextLine();
	   System.out.println("Enter Id");
	   songId=inScanner.nextInt();
	   inScanner.nextLine();
	   System.out.println("Enter the singer name");
	   singerName=inScanner.nextLine();
	   System.out.println("Enter the duration of song");
	   songDuration=inScanner.nextDouble();
	   inScanner.nextLine();
   }
   public void addsongToPlayList() {
	addSong();
	System.out.println(playList.addSongs(new Songs(songId, songName, singerName, songDuration)));
}
   public void displayAllSongs() {
	playList.displayAllSongs();
}
   public void removeSong() {
	System.out.println(playList.removeSong());
}
   public void chooseSongToPlay(int songno){
	System.out.println(playList.chooseSongToPlay(songno));
}
   public void playRandomSong() {
	playList.playRandomSong();
}
   public void editSong(int sno) {
	if (playList.arrayListSize()!=0) {
		addSong();
		System.out.println(playList.addSongs(new Songs (songId, songName, singerName, songDuration)));
	}
}
   public int arrayListSize() {
	   return playList.arrayListSize();
   }
     }
  
