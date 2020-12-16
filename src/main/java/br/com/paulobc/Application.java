package br.com.paulobc;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

public class Application {
	public static void main(String[] args) throws NativeHookException {
		KeyStrokerListener keyStrokListener = new KeyStrokerListener();
		GlobalScreen.registerNativeHook();
		GlobalScreen.addNativeKeyListener(keyStrokListener);
	}
}