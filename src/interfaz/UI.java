package interfaz;

import excepciones.CombustibleInsuficienteException;
import excepciones.ExcedeCombustibleException;
import negocio.Negocio;

public class UI {

	public static void main(String[] args) {

		Negocio YPF = new Negocio();
		String cadena;

		YPF.inicializaSurtidor(1200);
		try{
			cadena = YPF.cargaSurtidor(700);
			System.out.println(cadena);
		}
		catch(ExcedeCombustibleException e) {
			System.out.println(e.getMessage());
		}
		
		cadena = YPF.activaManguera();
		//YPF.desactivaManguera();
		
		System.out.println(cadena);
		try{
			cadena = YPF.descargaManguera(1000);
			System.out.println(cadena);
		}
		catch(CombustibleInsuficienteException ec) {
			System.out.println(ec.getMessage());
		}
		try{
			cadena = YPF.descargaManguera(100);
			System.out.println(cadena);
		}
		catch(CombustibleInsuficienteException ec) {
			System.out.println(ec.getMessage());
		}
	
		System.out.println(YPF.getExistenciaDeposito()+ " de lts actuales en depósito");
		System.out.println(YPF.getAcumuladoManguera()+ " acumulación de litros vendidos");
		System.out.println(YPF.getUltimaVentaMG()+ " cantidad de litros de la ultima venta");
	

		}

}
