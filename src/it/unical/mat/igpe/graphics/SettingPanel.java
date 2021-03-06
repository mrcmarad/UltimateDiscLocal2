package it.unical.mat.igpe.graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

// PANEL OF SETTING GAME
public class SettingPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static ImageProvider image = new ImageProvider();
	private static Image background = image.getIntroBackground();
	private static Image difficulty = image.getDifficulty();
	private Screen screen = Screen.getInstance();
	
	public SettingPanel(final MainFrame mainFrame){
		addMouseListener(new MouseAdapter() {
			@Override
		    public void mouseReleased(final MouseEvent e){
				
				 final int x = e.getX();
			     final int y = e.getY();
			     
			     //difficulty
			     if((x>screen.getWidth()*0.32) && (x<screen.getWidth()*0.75) && (y>screen.getHeight()*0.42) && (y<screen.getHeight()*0.60)){
			    	 mainFrame.goToChooseDifficultyPanel();
			    	 AudioProvider.clickAudio();
			     }
			     //Audio
			     else if((x>screen.getWidth()*0.32) && (x<screen.getWidth()*0.75) && (y>screen.getHeight()*0.65) && (y<screen.getHeight()*0.85)){
			    	 mainFrame.goToAudioPanel();
			    	 AudioProvider.clickAudio();
			     }
			   //back
			     else if((x>screen.getWidth()*0.10) && (x<screen.getWidth()*0.35) && (y>screen.getHeight()*0.68) && (y<screen.getHeight()*0.75)){
			    	 MainFrame.goToMenuPanel();
			    	 AudioProvider.clickAudio();
			     }
			}
		});
		
		
	}
	
	
	@Override
	public void paintComponent(final Graphics g) {
	    super.paintComponent(g);
	    g.drawImage(background, 0, 0, getWidth(),getHeight(),this);
	    g.drawImage(difficulty, 0, 0, getWidth(),getHeight(),this);
	    
	}

}
