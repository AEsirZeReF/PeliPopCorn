package Cheats;

import javax.swing.JDialog;

public class Delay extends Thread{
	
	private JDialog dialog;
	
	public Delay(JDialog dialog){
		this.dialog= dialog;
	}
	@Override
	public void run() {
		try {
			
			dialog.setVisible(true);
			dialog.setLocationRelativeTo(null);
			
			double opacity = 0.1;
			while(opacity < 1.0){
				dialog.setOpacity((float) opacity);
				opacity += 0.1;
				Thread.sleep(50);
			}
			//Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
