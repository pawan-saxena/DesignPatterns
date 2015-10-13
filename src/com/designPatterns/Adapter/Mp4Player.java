package com.designPatterns.Adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing file name "+fileName +" via Mp4 media player");		
	}

}
