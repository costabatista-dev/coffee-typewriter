package br.com.paulobc;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class KeyStrokListener implements NativeKeyListener {
	private boolean isPressedKey;

	public void setIsPressedKey(boolean isPressedKey) {
		this.isPressedKey = isPressedKey;
	}

	public boolean getIsPressedKey() {
		return this.isPressedKey;
	}

	public KeyStrokListener() {
		this.setIsPressedKey(false);
	}

	@Override
	public void nativeKeyPressed(NativeKeyEvent key) {
		switch (key.getKeyCode()) {
		case NativeKeyEvent.VC_SPACE:

			if (!this.getIsPressedKey())
				new MusicEvent().executeSpaceBarKeyStrokeSong();
			this.setIsPressedKey(true);

			break;

		case NativeKeyEvent.VC_ENTER:
			if (!this.getIsPressedKey())
				new MusicEvent().executeEnterKeyStrokeSong();
			this.setIsPressedKey(true);
			break;
		case NativeKeyEvent.VC_BACKSPACE:
			if (!this.getIsPressedKey())
				new MusicEvent().executeBackspaceKeySong();
			this.setIsPressedKey(true);
			break;
		case NativeKeyEvent.VC_TAB:
			if(!this.getIsPressedKey())
				new MusicEvent().executeForwardKeySong();
			this.setIsPressedKey(true);
			break;

		default:

			if (!this.getIsPressedKey())
				new MusicEvent().executeKeyStrokeSong();
			this.setIsPressedKey(true);

			break;

		}
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		this.setIsPressedKey(false);

	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {

	}

}
