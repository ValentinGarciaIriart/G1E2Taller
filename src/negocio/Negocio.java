package negocio;

import excepciones.CombustibleInsuficienteException;
import excepciones.ExcedeCombustibleException;
import modelo.Surtidor;

public class Negocio {
	
	private Surtidor s = new Surtidor();
	
	public String inicializaSurtidor(double carga) {
		this.s.inicializarSurtidor(carga);
		return "Operación Exitosa"; 
		
	}
	public String cargaSurtidor(double carga) throws ExcedeCombustibleException {
		this.s.cargaSurtidor(carga);
		return "Carga Exitosa";
		
	}
	public String activaManguera() {
		this.s.activaManguera();
		return "Operación Exitosa";
	}

	public void desactivaManguera() {
		this.s.desactivaManguera();
	}

	public String descargaManguera(double carga) throws CombustibleInsuficienteException {
		this.s.descargaManguera(carga);
		return "Descarga Exitosa";
	}
	
	public double getExistenciaDeposito() {
		return this.s.getExistenciaDeposito();
	}
	public double getAcumuladoManguera() {
		return this.s.getAcumuladoManguera();
	}

	public double getUltimaVentaMG() {
		return this.s.getUltimaVentaMG();
	}
	
	

}
