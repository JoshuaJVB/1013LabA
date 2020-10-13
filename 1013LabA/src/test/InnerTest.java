package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.JoshuaVanBaalen.LabA.Outer;

@DisplayName("Inner test")
class InnerTest {

	
	@Test
	void test() {
		Outer out = new Outer(40000);
		assertEquals(out.getTaxes(), 13720.0, "Expected 13720.0");
	}

}