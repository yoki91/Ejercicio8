package edu.upc.eetac.dsa.yifeige.Ejercicio8;

import java.util.Timer;
import java.util.TimerTask;

public class CuentaAtras extends Thread {
	String s;
	int numero;
	int segundo = 0;

	public CuentaAtras(String id, int num) {
		this.s = id;
		this.numero = num;

	}

	public void run() {

		while (numero >= 0) {
			System.out.printf("El %s su numero actual es %d\n", s, numero);
			numero = numero - 1;
			try {

				this.sleep(1 * 1000);
				segundo = segundo + 1;
				System.out.printf("Para el thread %s Ha pasado %d segundos\n",
						s, segundo);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
