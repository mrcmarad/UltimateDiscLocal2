package it.unical.mat.igpe.graphics;

// THREAD OF SHOT MY PLAYER
public class Shot extends Thread {

	public void run()
	{
		int count = 0;
		while(count < 15)
		{
			CenterGamePanel.myPlayerImage = CenterGamePanel.imageProvider.getMyPlayerShot(count);
			count++;
			try {
				sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		CenterGamePanel.myPlayerImage = CenterGamePanel.imageProvider.getMyPlayerRightMotionLess();
		CenterGamePanel.frisbeeImage = CenterGamePanel.imageProvider.getFrisbee();
	}
}
