package edu.upc.eetac.dsa.yifeige.Ejercicio8;

import java.util.Timer;
import java.util.TimerTask;

public class CuentaAtras extends Thread 
{
	String s;
	private static String  ultimo;// ejercicio 10
	int numero;
	int segundo = 0;

	public CuentaAtras(String id, int num) 
	{
		this.s = id;
		this.numero = num;

	}

	public void run() 
	{

		while (numero >= 0) 
		{
			synchronized(this) //ejercicio 11
			{
			this.ultimo=s; // ejercicio 10
			System.out.printf("El thread %s su numero actual es %d,la ultima escritura por la pantalla es: %s\n", s, numero,this.ultimo);
			numero = numero - 1;
			}
			try 
			{

				this.sleep(1 * 1000);
				segundo = segundo + 1;
				System.out.printf("Para el thread %s Ha pasado %d segundos\n",
						s, segundo);

			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}

	}

}
