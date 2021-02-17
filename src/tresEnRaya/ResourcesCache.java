package tresEnRaya;


import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

/**
 * 
 * @author R
 *
 */
public class ResourcesCache {

	// HashMap que actúa como almacén de imágenes
	private HashMap<String, BufferedImage> recursos = new HashMap<String, BufferedImage>();
	// Carpetas en la que se encuentran todos los recursos

	// Instancia Singleton
	private static ResourcesCache instance = null;

	private static String RESOURCES_FOLDER = "../tresEnRaya/resources/";

	/**
	 * Getter Singleton
	 * 
	 * @return
	 */
	public static ResourcesCache getInstance() {
		if (instance == null) {
			instance = new ResourcesCache();
		}
		return instance;
	}

	private BufferedImage loadImage(String resourceName) {
		URL url = null;
		try {
			url = getClass().getResource(resourceName);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen" + resourceName + " de " + url);
		}
		return null;

	}

	/**
	 * Mediante este método casteamos a imagen el recurso que nos proporciona el
	 * supertipo
	 * 
	 * @param name
	 * @return
	 */
	public BufferedImage getImagen(String resourceName) {
		BufferedImage img = recursos.get(resourceName);

		if (img == null) {
			img = loadImage(RESOURCES_FOLDER + resourceName);
			recursos.put(resourceName, img);
		}
		return img;
	}

}
