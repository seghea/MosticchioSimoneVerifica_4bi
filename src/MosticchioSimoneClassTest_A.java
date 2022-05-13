import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MosticchioSimoneClassTest_A {

	@Test
	public void test1() {
		MosticchioSimoneClass f = new MosticchioSimoneClass ();
		int risAtteso = 210;
		int risOttenuto = f.MosticchioMet(5, 7);
		System.out.println(risOttenuto);
		assertEquals(risAtteso,risOttenuto);
	}
	@Test
	public void test2() {
		MosticchioSimoneClass f = new MosticchioSimoneClass ();
		int risAtteso = 30;
		int risOttenuto = f.MosticchioMet(5, 6);
		System.out.println(risOttenuto);
		assertEquals(risAtteso,risOttenuto);
	}
	@Test
	public void test3() {
		MosticchioSimoneClass f = new MosticchioSimoneClass ();
		int risAtteso = 24;
		int risOttenuto = f.MosticchioMet(2, 4);
		System.out.println(risOttenuto);
		assertEquals(risAtteso,risOttenuto);
	}

}
