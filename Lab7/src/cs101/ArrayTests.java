package cs101;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTests {

	@Test
	void testA() {
		double[] a = ArrayPractice.arrays_a();
		assertEquals(3, a.length);
		assertEquals(1.1, a[0]);
		assertEquals(2.2, a[1]);
		assertEquals(3.3, a[2]);

	}

	@Test
	void testB() {
		int[] b = ArrayPractice.arrays_b();
		assertEquals(100, b.length);

		for (int i = 0; i < 100; i++) {
			assertEquals(99, b[i]);
		}

	}

	@Test
	void testC() {
		double[] c = ArrayPractice.arrays_c();
		assertEquals(4, c.length);

		for (int i = 0; i < 4; i++) {
			assertEquals(0.0, c[i]);
		}

	}

	@Test
	void testD() {
		String[] d = ArrayPractice.arrays_d();
		assertEquals(6, d.length);

		for (int i = 0; i < 6; i++) {
			assert (d[i].equals("hello world"));
		}

	}

	@Test
	void testE() {
		boolean[] e = ArrayPractice.arrays_e();
		assertEquals(50, e.length);

		for (int i = 0; i < e.length; i++) {
			if (i % 2 == 0) {
				assertEquals(true, e[i]);
			} else {
				assertEquals(false, e[i]);
			}
		}

	}

	@Test
	void testF() {
		String[] f = { "first elem", "second elem", "third elem", "fourth elem" };
		assertEquals(4, ArrayPractice.arrays_f(f));

		String[] f2 = new String[1000];
		assertEquals(1000, ArrayPractice.arrays_f(f2));

	}

	@Test
	void testG() {
		String[] g = { "first elem", "second elem", "third elem", "fourth elem" };
		assert (ArrayPractice.arrays_g(g).equals("first elem"));

		String[] g2 = { "g0", "g1" };
		assert (ArrayPractice.arrays_g(g2).equals("g0"));

	}

	@Test
	void testH() {
		int[] h = { 4, 5, 7, 2, 0, 9, 10, 55 };
		assertEquals(9, ArrayPractice.arrays_h(h));

		int[] h2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		assertEquals(5, ArrayPractice.arrays_h(h2));

	}

	@Test
	void testI() {
		int[] i = { 4, 5, 7, 2, 0, 9, 10, 55 };
		assertEquals(2.0, ArrayPractice.arrays_i(i));

		int[] i2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		assertEquals(7.0, ArrayPractice.arrays_i(i2));

	}

	@Test
	void testJ() {
		boolean[] j = { true, true, true };
		equals(j, ArrayPractice.arrays_j(j));

		boolean[] j1_in = { true, true, true, true, true, true, true, true, true, true };
		boolean[] j1_out = { true, true, true, true, false, true, true, true, true, false };
		equals(j1_out, ArrayPractice.arrays_j(j1_in));

		boolean[] j2_in = new boolean[100];
		boolean[] j2_out = new boolean[100];
		for (int k = 4; k < j2_in.length; k += 5) {
			j2_out[k] = false;
		}
		equals(j2_out, ArrayPractice.arrays_j(j2_in));

	}

	// helper
	void equals(boolean[] a, boolean[] b) {
		assertEquals(a.length, b.length);

		for (int i = 0; i < a.length; i++) {
			assertEquals(a[i], b[i]);
		}

	}

}
