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
 * VlcPlayer plays the vlcMedia content through playVlc method and leaves the playMp4
 * method as it is.
 * @author optimus118
 *
 */
public class VlcPlayer implements AdvancedMediaPlayer{

	//playVlc content.
	@Override
	public void playVlc(String fileName) {
System.out.println("Playing file name "+fileName +" via vlc media player");		
	}
	//leave this function for other implementor.
	@Override
	public void playMp4(String fileName) {
				
	}

}
