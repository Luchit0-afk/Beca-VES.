package testEvelia;



import java.io.IOException;
import static testEvelia.TestEvelia.*;

import org.openqa.selenium.By;

import junit.framework.Assert;

public class RendirExamen {
	/*
	// BOTONES - SERVIDOR DE PRUEBA
	// Botones comunes
	private static By evaluaciones = By.xpath("//*[@id=\"listado\"]/div[14]/a");
	private static By rendirExamen = By.xpath("//*[@id=\"examenDisp\"]/tbody/tr/td[4]/center/button");
	private static By siguiente = By.xpath("//*[@id=\"pregunta\"]/div[3]/div[2]/center/button");
	private static By entregar = By.xpath("//*[@id=\"FinalizExamen\"]");
	
	// Botones de opcion multiple
	private static By opcionUno = By.xpath("//*[@id=\"tablaPreguntaEx\"]/div/div[2]/div[1]/div/div[1]/label");
	private static By opcionDos = By.xpath("//*[@id=\"tablaPreguntaEx\"]/div/div[2]/div[2]/div/div[1]/label");
	
	// Botones de verdadero falso
	private static By verdadero = By.xpath("//*[@id=\"tablaPreguntaEx\"]/div/div[2]/div/div[1]/label");
	private static By falso = By.xpath("//*[@id=\"tablaPreguntaEx\"]/div/div[2]/div/div[2]/label");
	
	// Botones de respuesta numerica
	private static By escribir = By.xpath("//*[@id=\"rtaNC1\"]");
	// APRENDER A ESCRIBIR O PASAR CADENAS POR EXCEL
	*/
	// BOTONES - SERVIDOR DE PRUEBA
	private static By evaluaciones = By.xpath("//*[@id=\"listado\"]/div[9]/a");
	// LAS DE ABAJO SON IGUALES
	private static By rendirExamen = By.xpath("//*[@id=\"examenDisp\"]/tbody/tr/td[4]/center/button");
	private static By siguiente = By.xpath("//*[@id=\"pregunta\"]/div[3]/div[2]/center/button");
	private static By entregar = By.xpath("//*[@id=\"FinalizExamen\"]");
	
	private static By opcionUno = By.xpath("//*[@id=\"tablaPreguntaEx\"]/div/div[2]/div[1]/div/div[1]/label");
	private static By opcionDos = By.xpath("//*[@id=\"tablaPreguntaEx\"]/div/div[2]/div[2]/div/div[1]/label");
	
	private static void ingresoExamen() throws IOException, InterruptedException {
		//TestIniciarSesion.entrarAulaSimulacroEvaluaciones(false);
		TestIniciarSesion.entrarAulaTestingAutomatizadoAlumno();
		
		driver.findElement(evaluaciones).click();
		driver.findElement(rendirExamen).click();
	}
	
	// OPCION MULTIPLE CON DOS RESPUESTAS
	public static void opcionMultiple(int cantidadPreguntas, int[] respuestas) throws IOException, InterruptedException {
		
		ingresoExamen();
		
		for (int i = 0; i < cantidadPreguntas; i++) {
			if (respuestas[i] == 1) {
				driver.findElement(opcionUno).click();
				//Thread.sleep(500);
			} else {
				driver.findElement(opcionDos).click();
				//Thread.sleep(500);
			}
			driver.findElement(siguiente).click();
			//Thread.sleep(500);
		}
		
		driver.findElement(entregar).click();
		//Thread.sleep(500);
		//driver.switchTo().alert().accept();
		
		System.out.println("Evaluacion rendida exitosamente");
	}
	
	/*
	public static void verdaderoFalso(int cantidadPreguntas, boolean[] respuestas) throws IOException, InterruptedException {
		
		ingresoExamen();
		
		for (int i = 0; i < cantidadPreguntas; i++) {
			if (respuestas[i] == true) {
				driver.findElement(verdadero).click();
			} else {
				driver.findElement(falso).click();
			}
			driver.findElement(siguiente).click();
		}

		driver.findElement(entregar).click();
	}
	*/
	

}
