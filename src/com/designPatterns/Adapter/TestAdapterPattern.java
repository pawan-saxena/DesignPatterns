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
 * TestAdapterPattern gets the user input and then executes 
 * the required methods of AudioPlayer to play different content types.
 * 
 * @author optimus118
 *
 */
public class TestAdapterPattern {
	 public static void main(String[] args) {
	    
		 //audioPlayer instance now plays mp3,mp4 and VLC content by using mediaAdapter to harness advancedMediaPlayer capabilities.
		 AudioPlayer audioPlayer = new AudioPlayer();

	      audioPlayer.play("mp3", "beyond the horizon.mp3");
	      audioPlayer.play("mp4", "Open Wide.mp4");
	      audioPlayer.play("vlc", "far far away.vlc");
	      audioPlayer.play("avi", "CheerLeader.avi");
	   }

}
