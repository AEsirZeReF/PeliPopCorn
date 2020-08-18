package Cheats;

import javax.swing.JDialog;

public class Close extends Thread {
	private JDialog dialog;
	public Close(JDialog dialog){
		this.dialog= dialog;
	}
	
	@Override
	public void run() {
		try {
			
			//dialog.setVisible(true);
			//dialog.setLocationRelativeTo(null);
			
			double opacity = 1.0;
			while(opacity > 0.1){
				dialog.setOpacity((float) opacity);
				opacity -= 0.1;
				Thread.sleep(1000);
			}
			//dialog.dispose();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
