package com.jspiders.musciplayer.main;

import java.util.Scanner;


import com.jspiders.musciplayer.song.SongOperations;

public class MusicPlayer { 
     private static Scanner scanner=new Scanner(System.in);
     private static int choice;
     private static SongOperations song1=new SongOperations();
     public static void main(String[] args) {
		boolean exit=true;
		while(exit) {
			System.out.println("========MENU========\n 1.Play Song \n 2.Add/Remove Song \n 3.Edit Song \n 4.Exit");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:{
				boolean exit2=true;
				while(exit2) {
					System.out.println("1.Play All Songs \n 2.Play Random Song \n 3.Choose song to play \n 4.Go Back");
					choice=scanner.nextInt();
			switch(choice) {
			case 1:{
				song1.displayAllSongs();
			}
			break;
			case 2:{
				song1=playRandomSong();
			}
			break;
			case 3:{
				if (song1.arrayListSize()!=0) {
					System.out.println("Enter Number of song to play...");
					song1.displayAllSongs();
					int songno=scanner.nextInt();
					song1.chooseSongToPlay(songno);
				}
				else
					System.out.println("Song are not available");
			}
			break;
			case 4:{
				exit2=false;
			}
			break;
			default:System.out.println("Invalid Choice Please try again..!!");
			}	
		}
			
	}
   
		break;
		case 2:{
			Boolean exit2=true;
			while(exit2) {
				System.out.println("1.Add Song \n 2.Remove Song \n 3.Go Back");
				choice=scanner.nextInt();
				switch (choice) {
				case 1:{
					song1.addsongToPlayList();
				}
			    break;
				case 2:{
					if (song1.arrayListSize()!=0) {
						song1.removeSong();
						
					}
					else
						System.out.println("Song are not available.....");
				}
				break;
				case 3:{
					exit2=false;
				}
				break;
				default:System.out.println("Invalid Choice Plaese try again...!!");
				}
			}
		}
		break;
		case 3:{
			if (song1.arrayListSize()!=0) {
				System.out.println("Select song Number to edit");
				song1.displayAllSongs();
				int songno=scanner.nextInt();
				song1.editSong(songno);	
			}
			else
				System.out.println("Songs are not available");
		}
		break;
		case 4:{
			exit=false;
			System.out.println("Thank you...!!!");
		}
		break;
		default:System.out.println("Invalid Choice Please try again...!!");
	}
		}
		
     }
	private static SongOperations playRandomSong() {
		// TODO Auto-generated method stub
		return null;
	}
}

