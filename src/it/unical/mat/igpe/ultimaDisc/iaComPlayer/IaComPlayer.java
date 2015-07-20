package it.unical.mat.igpe.ultimaDisc.iaComPlayer;

import java.util.Random;

import it.unical.mat.igpe.graphics.CenterGamePanel;
import it.unical.mat.igpe.graphics.ShotComPlayer;
import it.unical.mat.igpe.ultimateDisc.GameManager;
import it.unical.mat.igpe.ultimateDisc.movingObject.Player;

public class IaComPlayer {
	
	
	static GameManager gameManager;
	static int valueOfDifficulty;
	
	public IaComPlayer(GameManager gameManagerNew){ //nel costruttore dovremmo passare anche la difficoltà
		gameManager=gameManagerNew;
		valueOfDifficulty = (int)(Player.getWithimage()*0.20);
	}
	
	public void moveComPlayer() {

//		if (gameManager.getComPlayer().getX()>gameManager.getComPlayer().getWidthComponent())
			if(gameManager.getDisc().getY() != gameManager.getComPlayer().getY())
			{
				final int differenceDiscX = (int)gameManager.getDisc().getX() - (int)gameManager.getComPlayer().getX();
				final int differenceDiscY = (int)gameManager.getDisc().getY() - (int)gameManager.getComPlayer().getY();
				
				final int differencePlayerX = (int)gameManager.getComPlayer().getX() - (int)gameManager.getDisc().getX();
				final int differencePlayerY = (int)gameManager.getComPlayer().getY() - (int)gameManager.getDisc().getY();
				
				//UP
				if(differencePlayerY>25 && differencePlayerX>35)
				{
					gameManager.getComPlayer().setDirection(0);//up
					CenterGamePanel.setComPlayerImage(CenterGamePanel.getImageProvider().getComPlayerDirection(Player.UP));
				}
				//UPLEFT
				else if(differencePlayerY>5 && differencePlayerX>=35)
				{
					if (gameManager.getComPlayer().getX()>gameManager.getComPlayer().getWidthComponent())
					{
						gameManager.getComPlayer().setDirection(5);//UPLEFT
						CenterGamePanel.setComPlayerImage(CenterGamePanel.getImageProvider().getComPlayerDirection(Player.UPLEFT));
					}
				}
				
				//DOWN
				else if(differenceDiscY>25 && differencePlayerX>35)
				{
					gameManager.getComPlayer().setDirection(1);//down
					CenterGamePanel.setComPlayerImage(CenterGamePanel.getImageProvider().getComPlayerDirection(Player.DOWN));
				}
				//DOWNLEFT
				else if(differenceDiscY>5 && differencePlayerX>=35)
				{
					if (gameManager.getComPlayer().getX()>gameManager.getComPlayer().getWidthComponent())
					{
						gameManager.getComPlayer().setDirection(7);//DOWNLEFT
						CenterGamePanel.setComPlayerImage(CenterGamePanel.getImageProvider().getComPlayerDirection(Player.DOWNLEFT));
					}
				}
				
				//UPRIGHT
				else if(differencePlayerY>5 && differenceDiscX>=10)
				{
					gameManager.getComPlayer().setDirection(4);//UPRIGHT
					CenterGamePanel.setComPlayerImage(CenterGamePanel.getImageProvider().getComPlayerDirection(Player.UPRIGHT));
				}
				//DOWNRIGHT
				else if(differenceDiscY>5 && differenceDiscX>=10)
				{
					gameManager.getComPlayer().setDirection(6);//DOWNRIGHT
					CenterGamePanel.setComPlayerImage(CenterGamePanel.getImageProvider().getComPlayerDirection(Player.DOWNRIGHT));
				}
			}
		gameManager.getComPlayer().update();
	}

	public static  void shoot() {
//		System.out.println("gameManager.getComPlayer().getX(): "+gameManager.getComPlayer().getX()+" valueOfDifficulty: "+valueOfDifficulty);
		gameManager.getDisc().setPositionCom(gameManager.getComPlayer().getX()-(valueOfDifficulty*2), gameManager.getComPlayer().getY());
//		gameManager.getDisc().setPositionCom(gameManager.getComPlayer().getX()-(int)(ComPlayer.getWithimage()*0.5), gameManager.getComPlayer().getY());
		shootCom();
		gameManager.getDisc().setAvailableForComPlayer(false);
	}

	public static void resetPositionComPlayer() {
			double x = gameManager.getComPlayer().getX();
			double y = gameManager.getComPlayer().getY();
			
			if(((y+20)<gameManager.getComPlayer().getStartPositionY()) && ((x+20)<gameManager.getComPlayer().getStartPositionX())){
				for (int i = 0; i < 14; i++) {
					gameManager.getComPlayer().setDirection(6);//DOWNRIGHT
					CenterGamePanel.setComPlayerImage(CenterGamePanel.getImageProvider().getComPlayerDirection(Player.DOWNRIGHT));
					gameManager.getComPlayer().update();
					try {
						Thread.sleep(25);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			else if (((x-20)>gameManager.getComPlayer().getStartPositionX())&& ((y+20)<gameManager.getComPlayer().getStartPositionY())){
				for (int i = 0; i < 14; i++) {
					gameManager.getComPlayer().setDirection(7);//DOWNLEFT
					CenterGamePanel.setComPlayerImage(CenterGamePanel.getImageProvider().getComPlayerDirection(Player.DOWNLEFT));
					gameManager.getComPlayer().update();
					try {
						Thread.sleep(25);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			else if (((x+20)<gameManager.getComPlayer().getStartPositionX()) && ((y-20)>gameManager.getComPlayer().getStartPositionY())){
				for (int i = 0; i < 14; i++) {
					gameManager.getComPlayer().setDirection(4);//UPRIGHT
					CenterGamePanel.setComPlayerImage(CenterGamePanel.getImageProvider().getComPlayerDirection(Player.UPRIGHT));
					gameManager.getComPlayer().update();
					try {
						Thread.sleep(25);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			else if (((x-20)>gameManager.getComPlayer().getStartPositionX()) && ((y-20)>gameManager.getComPlayer().getStartPositionY())){
				for (int i = 0; i < 14; i++) {
					gameManager.getComPlayer().setDirection(5);//UPLEFT
					CenterGamePanel.setComPlayerImage(CenterGamePanel.getImageProvider().getComPlayerDirection(Player.UPLEFT));
					gameManager.getComPlayer().update();
					try {
						Thread.sleep(25);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
//			if((x+20)<gameManager.getComPlayer().getStartPositionX()){
//				for (int i = 0; i < 14; i++) {
//					gameManager.getComPlayer().setDirection(3);//RIGHT
//					CenterGamePanel.setComPlayerImage(CenterGamePanel.getImageProvider().getComPlayerDirection(Player.RIGHT));
//					gameManager.getComPlayer().update();
//					try {
//						Thread.sleep(25);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//			else if((x-20)>gameManager.getComPlayer().getStartPositionX()){
//				for (int i = 0; i < 14; i++) {
//					gameManager.getComPlayer().setDirection(2);//LEFT
//					CenterGamePanel.setComPlayerImage(CenterGamePanel.getImageProvider().getComPlayerDirection(Player.LEFT));
//					gameManager.getComPlayer().update();
//					try {
//						Thread.sleep(25);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//			if((y-20)>gameManager.getComPlayer().getStartPositionY()){
//				for (int i = 0; i < 14; i++) {
//					gameManager.getComPlayer().setDirection(0);//UP
//					CenterGamePanel.setComPlayerImage(CenterGamePanel.getImageProvider().getComPlayerDirection(Player.UP));
//					gameManager.getComPlayer().update();
//					try {
//						Thread.sleep(25);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//			else if((y+20)<gameManager.getComPlayer().getStartPositionY()){
//				for (int i = 0; i < 14; i++) {
//					gameManager.getComPlayer().setDirection(1);//DOWN
//					CenterGamePanel.setComPlayerImage(CenterGamePanel.getImageProvider().getComPlayerDirection(Player.DOWN));
//					gameManager.getComPlayer().update();
//					try {
//						Thread.sleep(25);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//			System.out.println("X: "+x+" y: "+y+" posX:"+gameManager.getComPlayer().getX()+" posY "+gameManager.getComPlayer().getY());
			
			CenterGamePanel.comPlayerImage = CenterGamePanel.imageProvider.getComPlayerLeftMotionLess();
	}
	
    public static void shootCom() 
    {
//		this.loadShoot = loadShoot;

		double randomY=0;
//    			randomY = -30+new Random().nextInt(60);
//				randomX = -40+new Random().nextInt(35);
		
//    			int startPositionPlayerX = 192;
		int startPositionPlayerY = 270;
		
//    			int xPlayer = gameManager.getMyPlayer().getX();
		int yPlayer = (int)gameManager.getMyPlayer().getY();
		
		// LA y VARIA TRA 0.1 E 0.5
		
		//EASY
		// y impostata a 0.2 fissa
		if(GameManager.getDifficultyLevel() == 0){
			if(yPlayer>(startPositionPlayerY+10)){
				randomY=-0.2;
			}
			else if (yPlayer<=(startPositionPlayerY+10)){
				randomY=0.2;
			}
		}
		//MEDIUM
		// y varia tra 0.1 e 0.4 presi random
		else if(GameManager.getDifficultyLevel() == 1){
			if(yPlayer>(startPositionPlayerY+10)){
				randomY = -(0.1 + (0.4 - 0.1) * new Random().nextDouble());
			}
			else if (yPlayer<=(startPositionPlayerY+10)){
				randomY = 0.1 + (0.4 - 0.1) * new Random().nextDouble();
			}
		}
		//HARD
		// y varia tra 0.4 e 0.5 presi random
		else if(GameManager.getDifficultyLevel() == 2){
			if(yPlayer>(startPositionPlayerY+10)){
				randomY = -(0.4 + (0.51 - 0.4) * new Random().nextDouble());
			}
			else if (yPlayer<=(startPositionPlayerY+10)){
				randomY = 0.4 + (0.51 - 0.4) * new Random().nextDouble();
			}
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	ShotComPlayer s= new ShotComPlayer();
    	s.start();
    	gameManager.getDisc().setDirection(-1, randomY);
	
	}

	public static int getValueOfDifficulty() {
		return valueOfDifficulty;
	}

	public static void setValueOfDifficulty(int valueOfDifficulty) {
		IaComPlayer.valueOfDifficulty = valueOfDifficulty;
	}

}
