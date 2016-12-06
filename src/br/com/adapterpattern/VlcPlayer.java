package br.com.adapterpattern;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing the vlc file: "+ fileName);
	}

	@Override
	public void playMp4(String fileName) {
	}

}
