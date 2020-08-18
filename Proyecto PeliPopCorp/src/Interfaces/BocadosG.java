package Interfaces;

import java.util.ArrayList;

import Class.Bocados;
import Mantenimientos.BocadosM;

public class BocadosG {
	BocadosM bocadosM;
	
	public BocadosG(){
		bocadosM = new BocadosM();
	}
	public ArrayList<Bocados> ListarBocados(){
		return bocadosM.ListarBocados();
	}
	public void AgregarBocados(Bocados bocados){
		bocadosM.AgregarBocados(bocados);
	}
	public void ActualizarBocados(Bocados bocados){
		bocadosM.ActualizarBocados(bocados);
	}
	public void EliminarBocados(int codigo){
		bocadosM.EliminarBocado(codigo);
	}
}
