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
 * MediaPlayer interface with the play method accepting 
 * two parameters "AudioType" and "fileName". 
 * @author optimus118
 *
 */

public interface  MediaPlayer {
	//play method plays the specified file with given mediaType.
public void play(String audioType,String fileName);
}
