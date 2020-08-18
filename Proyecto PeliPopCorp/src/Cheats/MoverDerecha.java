package Cheats;

import javax.swing.JPanel;

public class MoverDerecha extends Thread {
	private JPanel panel;
	private int  inicio;
	private int fin;
	private int tiempo;
	private int ancho;
	private int alto;
	
	public MoverDerecha(JPanel panel, int inicio, int fin, int tiempo,int ancho,int alto){
		this.panel = panel;
		this.inicio = inicio;
		this.fin = fin;
		this.tiempo = tiempo;
		this.ancho = ancho;
		this.alto = alto;
	}
	@Override
	public void run(){
		int y = (int) panel.getBounds().getY();
		try {	
			for (int i = inicio; i <= fin; i+=4) {
				panel.setBounds(i, y, ancho, alto);
				//panel.setBounds(arg0, arg1, arg2, arg3);
				//System.out.println(panel.getBounds());
				Thread.sleep(tiempo);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
