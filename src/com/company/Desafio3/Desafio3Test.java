package com.company.Desafio3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Desafio3Test {


        @Test
        public void TestString() {
            assertEquals("Omd luo án", Desafio3.main(new String[]{"olá mundo"}), 0);
        }

}
