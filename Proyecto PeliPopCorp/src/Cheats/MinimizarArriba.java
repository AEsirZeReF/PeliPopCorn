package Cheats;

import javax.swing.JPanel;

public class MinimizarArriba extends Thread{
	private JPanel panel;
	private int x;
	private int y;
	private int width;
	private int heightInicial;
	private int heightFinal;
	private int tiempo;
	
	public MinimizarArriba(JPanel panel,int x, int y,int width,int heightInicial,int heightFinal, int tiempo){
		this.panel = panel;
		this.x = x;
		this.y =y;
		this.width = width;
		this.heightInicial = heightInicial;
		this.heightFinal = heightFinal;
		this.tiempo = tiempo;
	}
	@Override
	public void run(){
		try {
			for (int i = heightInicial; i >= heightFinal ; i-=2) {
				panel.setBounds(x, y, width, i);
				//System.out.println(panel.getBounds());
				Thread.sleep(tiempo);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
