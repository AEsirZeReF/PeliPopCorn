package Interfaces;

import java.util.ArrayList;

import Class.Peliculas;
import Mantenimientos.PeliculasM;

public class PeliculasG {
	PeliculasM peliculasM;
	
	public PeliculasG(){
		peliculasM = new PeliculasM();
	}
	public void AgregarPelicuas(Peliculas peliculas){
		peliculasM.AgregarPeliculas(peliculas);
	}
	public ArrayList<Peliculas> ListarPeliculas(){
		return peliculasM.ListarPeliculas();
	}
	public void ActualizarPeliculas(Peliculas pelicula){
		
		peliculasM.ActualizarPeliculas(pelicula);
	}
	public void EliminarPeliculas(int codigo){
		peliculasM.EliminarPeliculas(codigo);
	}

}
