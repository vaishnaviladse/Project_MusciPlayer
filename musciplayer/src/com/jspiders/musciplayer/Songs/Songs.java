package com.jspiders.musciplayer.Songs;

public class Songs{
   private int songId;
   private String songName;
   private String singerName;
   private double songDuration;
   public Songs() {
}
   
public Songs(int songId, String songName, String singerName, double songDuration) {
	
	this.songId = songId;
	this.songName = songName;
	this.singerName = singerName;
	this.songDuration = songDuration;
}

public int getSongId() {
	return songId;
}

public String getSongName() {
	return songName;
}

public String getSingerName() {
	return singerName;
}

public double getSongDuration() {
	return songDuration;
}

public void setSongId(int songId) {
	this.songId = songId;
}

public void setSongName(String songName) {
	this.songName = songName;
}

public void setSingerName(String singerName) {
	this.singerName = singerName;
}

public void setSongDuration(double songDuration) {
	this.songDuration = songDuration;
}

@Override
public String toString() {
	return "Song Name: "+ this.songName + "\nSinger Name: "+ this.singerName + "\nSong Duration: "+ this.songDuration + "\nSong Id:"+this.songId; 
}  
}
