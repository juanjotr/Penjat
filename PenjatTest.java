import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;


public class PenjatTest {
	
	Penjat pen;
	char letra;

	
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testNova_lletra() {
		
		pen=new Penjat();
		Scanner reader = new Scanner(System.in);
		String paraules[] = {"hola","programació","casa"};
		int index;
		String p;
		int num_errors=0;
		letra='a';
		
		assertTrue("PRUEBA envio letra a",Penjat.nova_lletra(letra));
		
		
	}

}
