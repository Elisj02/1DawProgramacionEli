package capitulo6_Recursos.DateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class ActIntroducirFecha {

	public static void main(String[] args) {
		/*
		 * 1º.- Crea un programa en Java que pida al usuario la introducción de una
		 * fecha a través de JOptionPane. El usuario te especificará un dato de tipo
		 * String y tú debes convertirlo a un objeto de tipo java.util.Date utilizando
		 * SimpleDateFormat. A continuación realiza las siguientes acciones - Con el
		 * objeto java.util.Date, crea un objeto de tipo Calendar y que represente la
		 * misma fecha que ha introducido el usuario. - Obtén en pantalla los siguientes
		 * campos: año, mes, día, hora, minuto y segundo. Cada campo debe aparecer en
		 * una línea de la consola. Debes obtener cada campo desde el objeto
		 * java.util.Date y desde el objeto Calendar. Es decir, cada campo debe ser
		 * obtenido dos veces en pantalla. - Utiliza el objeto de tipo Calendar para
		 * obtener nuevas fechas e imprimirlas en pantalla: suma 3 días, resta 2
		 * semanas, suma 300 días, suma 4 años.
		 */

		String strFecha = JOptionPane.showInputDialog("Introduce una fecha: ");
		Calendar calendar = Calendar.getInstance();
		Date fecha = null;
		
		try {
			fecha = new SimpleDateFormat("d MMM yyyy").parse(strFecha);
			System.out.println(fecha);
			
		} 
		
		catch (ParseException e) {
			
			System.out.println("ParseException occured: " + e.getMessage());
		}
		
		System.out.println("Fecha introducida por el usuario: " + strFecha);
		System.out.println("Fecha parseada : " + fecha);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("CALENDAR : ");
		System.out.println("Año: " + calendar.get(Calendar.YEAR));
		System.out.println("MES: " + calendar.get(Calendar.MONTH));
		System.out.println("DIA: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("HORA: " + calendar.get(Calendar.HOUR));
		System.out.println("MINUTO: " + calendar.get(Calendar.MINUTE));
		System.out.println("SEGUNDO: " + calendar.get(Calendar.SECOND));
		System.out.println("\nDATE : ");
		System.out.println("Año: " + new SimpleDateFormat("yyyy").format(fecha));
		System.out.println("MES: " + new SimpleDateFormat("MM").format(fecha));
		System.out.println("DIA: " + new SimpleDateFormat("dd").format(fecha));
		System.out.println("HORA: " + new SimpleDateFormat("HH").format(fecha));
		System.out.println("MINUTO: " + new SimpleDateFormat("mm").format(fecha));
		System.out.println("SEGUNDO: " +new SimpleDateFormat("ss").format(fecha));
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("Suma 3 días : "  + calendar.getTime());
		
		calendar.add(Calendar.WEEK_OF_MONTH, -2);
		System.out.println("Resto 2 semanas : "  + calendar.getTime());
		
		calendar.add(Calendar.DAY_OF_MONTH, 300);
		System.out.println("Suma 300 dias : "  + calendar.getTime());
		
		calendar.add(Calendar.YEAR, 4);
		System.out.println("Suma 4 años : "  + calendar.getTime());
	}
}