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
 * Mp4Player class defines only playMp4 method as its sole
 * responsibility is to play Mp4 content so we leave the playVlc method as it is.
 * @author optimus118
 *
 */
public class Mp4Player implements AdvancedMediaPlayer {
	
	//to playVlc content.
	@Override
	public void playVlc(String fileName) {
		
	}
	
	//to playMp4 content of given file.
	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing file name "+fileName +" via Mp4 media player");		
	}

}
