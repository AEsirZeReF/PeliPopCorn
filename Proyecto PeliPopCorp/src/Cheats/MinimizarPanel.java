package Cheats;

import javax.swing.JPanel;

public class MinimizarPanel extends Thread{
	private JPanel panel;
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private int fin;
	private int tiempo;
	
	public MinimizarPanel(JPanel panel,int x,int y,int ancho,int alto,int fin, int tiempo){
		this.panel = panel;
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		this.fin = fin;
		this.tiempo = tiempo;
	}
	@Override
	public void run(){
		try {
			for (int i = ancho; i >= fin ; i-=6) {
				panel.setBounds(x, y, i, i);
				//System.out.println(panel.getBounds());
				Thread.sleep(tiempo);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
