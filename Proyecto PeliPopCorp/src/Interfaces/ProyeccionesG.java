package Interfaces;

import java.util.ArrayList;

import Class.Proyecciones;
import Mantenimientos.ProyeccionesM;

public class ProyeccionesG {
	ProyeccionesM proyeccionesM;
	
	public ProyeccionesG(){
		proyeccionesM = new ProyeccionesM();
	}
	public void AgregarPeliculas(Proyecciones proyecciones){
		proyeccionesM.AgregarProyecciones(proyecciones);
	}
	public ArrayList<Proyecciones> ListarProyecciones(){
		return proyeccionesM.ListarProyecciones();
	}
	public void ActualizarProyecciones(Proyecciones proyecciones){
		proyeccionesM.ActualizarProyecciones(proyecciones);
	}
	public void EliminarProyeccion(int codigo){
		proyeccionesM.EliminarProyeccion(codigo);
	}
}
