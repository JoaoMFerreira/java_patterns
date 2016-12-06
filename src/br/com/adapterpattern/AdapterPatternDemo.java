package br.com.adapterpattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "Far Away.mp3");
		audioPlayer.play("mp4", "Save me.mp3");
		audioPlayer.play("mp4", "Game.mp3");
		audioPlayer.play("vlc", "Show.mp3");
		audioPlayer.play("vlc", "Tester.mp3");
		
		
	}
	
}
