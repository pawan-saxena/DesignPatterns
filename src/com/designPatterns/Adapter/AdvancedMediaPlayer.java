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
 * The AdvancedmediaPlayer declares two method for
 * playing VLC and Mp4 content which accepts fileName as input parameters.
 * @author optimus118
 *
 */

public interface AdvancedMediaPlayer {
	//playVlc method plays specified file with given fileName.
	public void playVlc(String fileName);
	
	//playMp4 plays specified file with given fileName.
	public void playMp4(String fileName);

}
