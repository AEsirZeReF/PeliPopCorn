package Cheats;

import javax.swing.JPanel;

public class MoverAbajo extends Thread{
	private JPanel panel;
	private int x;
	private int  y;
	private int fin;
	private int tiempo;
	private int ancho;
	private int alto;
	//private int nano;
	
	public MoverAbajo(JPanel panel,int x, int y, int fin, int tiempo,int ancho,int alto){
		this.panel = panel;
		this.x = x;
		this.y = y;
		this.fin = fin;
		this.tiempo = tiempo;
		this.ancho = ancho;
		this.alto = alto;
		//this.nano = nano;
	}
	@Override
	public void run(){
		try {	
			for (int i = y; i <= fin; i+=2) {
				panel.setBounds(x, i, ancho, alto);
				//System.out.println(panel.getBounds());
				Thread.sleep(tiempo);
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
