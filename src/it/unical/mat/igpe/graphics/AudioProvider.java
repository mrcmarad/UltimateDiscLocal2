package it.unical.mat.igpe.graphics;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;

// CLASS OF AUDIO UPLOAD
public class AudioProvider {
	
	static Clip arena1;
	static Clip arena2;
	static Clip arena3;
	static Clip pause;
	static Clip point;
	static Clip lastShot;
	static Clip stopDisc;
	static Clip shot;
	static Clip round1;
	static Clip round2;
	static Clip finalRound;
	static Clip win;
	static Clip gameOver;
	static Clip round;
	static Clip musicEndMatch;
	
	static Clip musicMainMenu;
	static Clip musicChooser;
	static Clip musicPlay;
	static Clip click;
	static Clip click2;
	static Clip playButton;
	static boolean firstTimeMusicPlay = false;
	static boolean firstTimeMusicChooser = false;
	static boolean firstTimeMainMenu = false;
	static boolean generalAudio = true;
	
	public static void musicPlay(){
		if(generalAudio){
			try {
				if(firstTimeMusicPlay == false){
					AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/playAudio.wav"));
					AudioFormat af = ais.getFormat();
					DataLine.Info info = new DataLine.Info(Clip.class, af);
					
					if (!AudioSystem.isLineSupported(info)) {
						System.out.println("unsupported line");
						System.exit(0);
					}
					musicPlay = (Clip) AudioSystem.getLine(info);
					musicPlay.open(ais);
					
					//controllo volume
					FloatControl audioPlayControl = (FloatControl) musicPlay.getControl(FloatControl.Type.MASTER_GAIN);
					audioPlayControl.setValue(-10.0f);
					firstTimeMusicPlay = true;
				}
				musicPlay.setFramePosition(0);
				musicPlay.start();
				musicPlay.loop(Clip.LOOP_CONTINUOUSLY);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void arena1(){
		if(generalAudio){
			try {
					AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/arena1.wav"));
					AudioFormat af = ais.getFormat();
					DataLine.Info info = new DataLine.Info(Clip.class, af);
					
					if (!AudioSystem.isLineSupported(info)) {
						System.out.println("unsupported line");
						System.exit(0);
					}
					arena1 = (Clip) AudioSystem.getLine(info);
					arena1.open(ais);
					
					//controllo volume
					FloatControl audioPlayControl = (FloatControl) arena1.getControl(FloatControl.Type.MASTER_GAIN);
					audioPlayControl.setValue(-10.0f);
					
				arena1.setFramePosition(0);
				arena1.start();
				arena1.loop(Clip.LOOP_CONTINUOUSLY);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void arena2(){
		if(generalAudio){
			try {
					AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/arena2.wav"));
					AudioFormat af = ais.getFormat();
					DataLine.Info info = new DataLine.Info(Clip.class, af);
					
					if (!AudioSystem.isLineSupported(info)) {
						System.out.println("unsupported line");
						System.exit(0);
					}
					arena2 = (Clip) AudioSystem.getLine(info);
					arena2.open(ais);
					
					//controllo volume
					FloatControl audioPlayControl = (FloatControl) arena2.getControl(FloatControl.Type.MASTER_GAIN);
					audioPlayControl.setValue(-10.0f);

				arena2.setFramePosition(0);
				arena2.start();
				arena2.loop(Clip.LOOP_CONTINUOUSLY);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void arena3(){
		if(generalAudio){
			try {
					AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/arena3.wav"));
					AudioFormat af = ais.getFormat();
					DataLine.Info info = new DataLine.Info(Clip.class, af);
					
					if (!AudioSystem.isLineSupported(info)) {
						System.out.println("unsupported line");
						System.exit(0);
					}
					arena3 = (Clip) AudioSystem.getLine(info);
					arena3.open(ais);
					
					//controllo volume
					FloatControl audioPlayControl = (FloatControl) arena3.getControl(FloatControl.Type.MASTER_GAIN);
					audioPlayControl.setValue(-10.0f);
					
				arena3.setFramePosition(0);
				arena3.start();
				arena3.loop(Clip.LOOP_CONTINUOUSLY);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void musicEndMatch(){
		if(generalAudio){
			try {
					AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/musicEndMatch.wav"));
					AudioFormat af = ais.getFormat();
					DataLine.Info info = new DataLine.Info(Clip.class, af);
					
					if (!AudioSystem.isLineSupported(info)) {
						System.out.println("unsupported line");
						System.exit(0);
					}
					musicEndMatch = (Clip) AudioSystem.getLine(info);
					musicEndMatch.open(ais);
					
					//controllo volume
					FloatControl audioPlayControl = (FloatControl) musicEndMatch.getControl(FloatControl.Type.MASTER_GAIN);
					audioPlayControl.setValue(-10.0f);
					
					musicEndMatch.setFramePosition(0);
					musicEndMatch.start();
					musicEndMatch.loop(Clip.LOOP_CONTINUOUSLY);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void stopMusicPlay(){
		if(generalAudio){
			musicPlay.stop();
		}
	}
	
	public static void musicMainMenu(){
		if(generalAudio){
			try {
				if(firstTimeMainMenu==false){
					AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/mainMenu.wav"));
					AudioFormat af = ais.getFormat();
					DataLine.Info info = new DataLine.Info(Clip.class, af);
					
					if (!AudioSystem.isLineSupported(info)) {
						System.out.println("unsupported line");
						System.exit(0);
					}
					musicMainMenu = (Clip) AudioSystem.getLine(info);
					musicMainMenu.open(ais);
					firstTimeMainMenu = true;
				}
				
				musicMainMenu.setFramePosition(0);
				musicMainMenu.start();
				musicMainMenu.loop(Clip.LOOP_CONTINUOUSLY);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void stopMusicMainMenu(){
		if(generalAudio){
			try {
				musicMainMenu.stop();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void stopMusicChooser(){
		if(generalAudio){
			try {
				musicChooser.stop();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void stopArena1(){
		if(generalAudio){
			try {
				arena1.stop();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void stopArena2(){
		if(generalAudio){
			try {
				arena2.stop();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void stopArena3(){
		if(generalAudio){
			try {
				arena3.stop();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void stopMusicEndMatch(){
		if(generalAudio){
			try {
				musicEndMatch.stop();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void musicChooser(){
		if(generalAudio){
			try {
				if(firstTimeMusicChooser == false){
					AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/chooserMenu.wav"));
					AudioFormat af = ais.getFormat();
					DataLine.Info info = new DataLine.Info(Clip.class, af);
					
					if (!AudioSystem.isLineSupported(info)) {
						System.out.println("unsupported line");
						System.exit(0);
					}
					musicChooser = (Clip) AudioSystem.getLine(info);
					musicChooser.open(ais);
					firstTimeMusicChooser = true;
				}
				
				musicChooser.setFramePosition(0);
				musicChooser.start();
				musicChooser.loop(Clip.LOOP_CONTINUOUSLY);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void clickAudio(){
		if(generalAudio){
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/click.wav"));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				
				if (!AudioSystem.isLineSupported(info)) {
					System.out.println("unsupported line");
					System.exit(0);
				}
				click = (Clip) AudioSystem.getLine(info);
				click.open(ais);
				click.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	public static void clickAudio2(){
		if(generalAudio){
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/click2.wav"));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				
				if (!AudioSystem.isLineSupported(info)) {
					System.out.println("unsupported line");
					System.exit(0);
				}
				click2 = (Clip) AudioSystem.getLine(info);
				click2.open(ais);
				click2.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void pause(){
		if(generalAudio){
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/pause.wav"));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				
				if (!AudioSystem.isLineSupported(info)) {
					System.out.println("unsupported line");
					System.exit(0);
				}
				pause = (Clip) AudioSystem.getLine(info);
				pause.open(ais);
				pause.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void point(){
		if(generalAudio){
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/point.wav"));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				
				if (!AudioSystem.isLineSupported(info)) {
					System.out.println("unsupported line");
					System.exit(0);
				}
				point = (Clip) AudioSystem.getLine(info);
				point.open(ais);
				point.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void lastShot(){
		if(generalAudio){
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/lastShot.wav"));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				
				if (!AudioSystem.isLineSupported(info)) {
					System.out.println("unsupported line");
					System.exit(0);
				}
				lastShot = (Clip) AudioSystem.getLine(info);
				lastShot.open(ais);
				lastShot.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void stopDisc(){
		if(generalAudio){
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/blocca.wav"));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				
				if (!AudioSystem.isLineSupported(info)) {
					System.out.println("unsupported line");
					System.exit(0);
				}
				stopDisc = (Clip) AudioSystem.getLine(info);
				stopDisc.open(ais);
				stopDisc.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void shot(){
		if(generalAudio){
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/shot.wav"));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				
				if (!AudioSystem.isLineSupported(info)) {
					System.out.println("unsupported line");
					System.exit(0);
				}
				shot = (Clip) AudioSystem.getLine(info);
				shot.open(ais);
				shot.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void round1(){
		if(generalAudio){
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/round1.wav"));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				
				if (!AudioSystem.isLineSupported(info)) {
					System.out.println("unsupported line");
					System.exit(0);
				}
				round1 = (Clip) AudioSystem.getLine(info);
				round1.open(ais);
				round1.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void round2(){
		if(generalAudio){
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/round2.wav"));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				
				if (!AudioSystem.isLineSupported(info)) {
					System.out.println("unsupported line");
					System.exit(0);
				}
				round2 = (Clip) AudioSystem.getLine(info);
				round2.open(ais);
				round2.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void finalRound(){
		if(generalAudio){
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/finalRound.wav"));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				
				if (!AudioSystem.isLineSupported(info)) {
					System.out.println("unsupported line");
					System.exit(0);
				}
				finalRound = (Clip) AudioSystem.getLine(info);
				finalRound.open(ais);
				finalRound.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void win(){
		if(generalAudio){
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/win.wav"));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				
				if (!AudioSystem.isLineSupported(info)) {
					System.out.println("unsupported line");
					System.exit(0);
				}
				win = (Clip) AudioSystem.getLine(info);
				win.open(ais);
				win.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void gameOver(){
		if(generalAudio){
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/gameOver.wav"));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				
				if (!AudioSystem.isLineSupported(info)) {
					System.out.println("unsupported line");
					System.exit(0);
				}
				gameOver = (Clip) AudioSystem.getLine(info);
				gameOver.open(ais);
				gameOver.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void round(){
		if(generalAudio){
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/round.wav"));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				
				if (!AudioSystem.isLineSupported(info)) {
					System.out.println("unsupported line");
					System.exit(0);
				}
				round = (Clip) AudioSystem.getLine(info);
				round.open(ais);
				round.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	public static void playButton(){
		if(generalAudio){
			try {
				AudioInputStream ais = AudioSystem.getAudioInputStream(new File("audio/playButton.wav"));
				AudioFormat af = ais.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, af);
				
				if (!AudioSystem.isLineSupported(info)) {
					System.out.println("unsupported line");
					System.exit(0);
				}
				playButton = (Clip) AudioSystem.getLine(info);
				playButton.open(ais);
				
				//controllo volume
				FloatControl audioPlayControl = (FloatControl) playButton.getControl(FloatControl.Type.MASTER_GAIN);
				audioPlayControl.setValue(-10.0f);
				
				playButton.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void audioOn() {
		generalAudio=true;
	}

	public static void audioOff() {
		AudioProvider.stopMusicMainMenu();
		generalAudio=false;
	}

}
