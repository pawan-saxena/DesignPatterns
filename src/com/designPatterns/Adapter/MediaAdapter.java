/**
 * Package name is : com.designPatterns.Adapter
 * This package contains :
 * AdvancedMediaPlayer
 * AudioPlayer
 * MediaAdapter
 * MediaPlayer
 * Mp4Player
 * TestAdapterPattern
 * VlcPlayer
 * 
 */
package com.designPatterns.Adapter;


/**
 * The MediaAdapter implements MediaPlayer and keep and instance of 
 * AdvancedMusicPlayer .The AdavancedMediaPlayer is capable of playing different contents
 * such as mp4 and VLC content.
 * @author optimus118
 *
 */
public class MediaAdapter implements MediaPlayer {
	//advancedMusicPlayer instance is used to implement object composition.
	AdvancedMediaPlayer advancedMusicPlayer;

	//COnstructor get the correct instance of advancedMusciPlayer depending upon the user input.
	public MediaAdapter(String audioType){
		   
		      if(audioType.equalsIgnoreCase("vlc") ){
		         advancedMusicPlayer = new VlcPlayer();			
		         
		      }else if (audioType.equalsIgnoreCase("mp4")){
		         advancedMusicPlayer = new Mp4Player();
		      }	
		   }
	   
	//play method plays the content of the file employing correct music player instance of the advancedMusicPlayer.
	@Override
	public void play(String audioType, String fileName) {
	    if(audioType.equalsIgnoreCase("vlc") )
	    	advancedMusicPlayer.playVlc(fileName);
	    else if(audioType.equalsIgnoreCase("mp4"))
	    	advancedMusicPlayer.playMp4(fileName);
			}
	

}
