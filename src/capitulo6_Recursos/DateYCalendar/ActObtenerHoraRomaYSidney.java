package capitulo6_Recursos.DateYCalendar;

import java.util.Calendar;
import java.util.TimeZone;

public class ActObtenerHoraRomaYSidney {

	public static void main(String[] args) {
		/*
		 * 2º.- Obtén la hora actual en Roma (Italia), también la hora actual en Sidney
		 * (Australia) y calcula la diferencia horaria entre las dos ciudades.
		 */

		Calendar ahoraEnRoma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		Calendar ahoraEnSidney = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
		
		System.out.println("Hora en Roma: " + ahoraEnRoma.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora en Sidney: " + ahoraEnSidney.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("La diferencia horaria entre Roma y Sidney es de: " + (ahoraEnRoma.get(Calendar.HOUR_OF_DAY)-ahoraEnSidney.get(Calendar.HOUR_OF_DAY)) + " horas.");
	}

}
