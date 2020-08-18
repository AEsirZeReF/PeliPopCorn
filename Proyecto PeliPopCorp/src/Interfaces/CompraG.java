package Interfaces;

import java.util.ArrayList;

import Class.Compra;
import Class.ListaFactura;
import Class.ListaTicket;
import Mantenimientos.CompraM;

public class CompraG {
	CompraM compraM;
	public CompraG(){
		compraM = new CompraM();
	}
	public ArrayList<ListaTicket> ListarTicket(){
 		return compraM.ListarTicket();
	}
	public ArrayList<ListaFactura> ListarFactura(){
		return compraM.ListarFactura();
	}
	public void ComprarTicket(Compra compra){
		compraM.ComprarTicket(compra);
	}
	public void GenerarTicketyBocado(Compra compra){
		compraM.GenerarTicketyBocado(compra);
	}
}
