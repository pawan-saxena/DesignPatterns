package com.designPatterns.Adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
System.out.println("Playing file name "+fileName +" via vlc media player");		
	}

	@Override
	public void playMp4(String fileName) {
				
	}

}
