package Cheats;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cheats {
	
	public Cheats(){
		
	}
	
	public boolean ValidarTxt(String cajaDeTexto,String regex){
		boolean respuesta= false;
		Pattern patron = Pattern.compile(regex);
		Matcher matcher = patron.matcher(cajaDeTexto);
		if (matcher.matches()) {
			return respuesta = true;
		}else {
			return respuesta = false;
		}
	}
	public void Mensaje(String mensaje){
		JOptionPane.showMessageDialog(null, mensaje);
		
	}
	public void DireccionDeImagen(JLabel label,String img){
		label.setIcon(new ImageIcon("C:\\Users\\rev-x\\Desktop\\PeliPopCorn-v5\\Proyecto PeliPopCorp\\Img\\"+img));
	}
}
