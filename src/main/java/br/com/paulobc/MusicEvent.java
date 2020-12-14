package br.com.paulobc;

import java.io.File;

import jaco.mp3.player.MP3Player;

public class MusicEvent {

	private MP3Player getSongResource(String songFileName) {
		StringBuilder builder = new StringBuilder();
		builder.append(System.getProperty("user.dir")).append("\\classes\\song\\").append(songFileName);
		songFileName = builder.toString();
		System.out.println(songFileName);

		File resourceFile;
		resourceFile = new File(songFileName);

		MP3Player songResource = new MP3Player(resourceFile);
 
		return songResource;
	}

	public void executeKeyStrokeSong() {
		String songFileName;

		songFileName = "typewriter-key.mp3";
		MP3Player song = this.getSongResource(songFileName);
		song.play();
	}

	public void executeSpaceBarKeyStrokeSong() {
		String songFileName = "typewriter-space-bar.mp3";
		MP3Player song = this.getSongResource(songFileName);
		song.play();
	}

	public void executeEnterKeyStrokeSong() {
		String songFileName = "typewriter-return.mp3";
		MP3Player song = this.getSongResource(songFileName);
		song.play();
	}

	public void executeBackspaceKeySong() {
		String songFileName = "typewriter-backspace.mp3";
		MP3Player song = this.getSongResource(songFileName);
		song.play();
	}
	
	public void executeForwardKeySong() {
		String songFileName = "typewriter-forward.mp3";
		MP3Player song = this.getSongResource(songFileName);
		song.play();
	}
	

}
