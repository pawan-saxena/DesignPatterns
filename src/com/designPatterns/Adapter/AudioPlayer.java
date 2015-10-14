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
 * The AudioPalyer Class implements the MediaPlayer Interface 
 * and defines the play method .This class plays mp3 by default and we
 * need it to play other formats as well such as "VLC" and "mp4"
 * To achieve this we keep an instance of MediaAdapter.
 * @author optimus118
 *
 */
public class AudioPlayer implements MediaPlayer{
	//reference of mediaAdapter interface to use object composition.
	MediaAdapter mediaAdapter;
	@Override
	public void play(String audioType, String fileName) {

		 //inbuilt support to play mp3 music files
	      if(audioType.equalsIgnoreCase("mp3")){
	         System.out.println("Playing mp3 file. Name: " + fileName+" via Audio Player");			
	      } 
	      
	      //mediaAdapter is providing support to play other file formats
	      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
	         mediaAdapter = new MediaAdapter(audioType);
	         mediaAdapter.play(audioType, fileName);
	      }
	      //SHow error message if invalid file format is given.
	      else{
	         System.out.println("Invalid media. " + audioType + " format not supported");
	      }
}
}
