package modelo;

import excepciones.CombustibleInsuficienteException;
import excepciones.ExcedeCombustibleException;

public class Surtidor {
	
	private final double capacidadMaxima = 2000;
	private double acumVentas,ultimaVenta,combustible;
	private char mangueraAct;
	
	
   // si excede el combustible tiro una excepcion porque se podría arreglar, no creo que haga falta tirar todo


	public void inicializarSurtidor(double carga) {
		this.acumVentas=0;
		this.ultimaVenta=0;
		this.combustible=carga;
		
	}
	
	public void cargaSurtidor (double carga)throws ExcedeCombustibleException {
		if(carga+this.combustible>this.capacidadMaxima)
			throw new ExcedeCombustibleException("El surtidor excede los 2000 lts de capacidad");
		else
			this.combustible+=carga;
			
	}
	
	public void activaManguera() {
		assert this.combustible>=1:"No hay suficiente combustible";
		this.mangueraAct='A';
		
	}
	
	public void desactivaManguera() {
		this.mangueraAct='D';	
	}
	
	
	public void descargaManguera(double carga) throws CombustibleInsuficienteException {
		assert this.mangueraAct=='A': "No es posible descargar";
		if(this.combustible-carga<0)
			throw new CombustibleInsuficienteException("No se puede descarga ya que no hay combustible suficiente");
		else {
			this.combustible-=carga;
			acumVentas+=carga;
			this.ultimaVenta=carga;
		}
	}

	public double getExistenciaDeposito() {
		assert this.combustible>=1: "No hay depósito de combustible";
		return this.combustible; //no se a que pingo se refiere con deposito xdd
		
	}
	public double getAcumuladoManguera() {
		return this.acumVentas;
		
	}
	public double getUltimaVentaMG() {
		return this.ultimaVenta;
	}



	
	
	

}
