package com.example.calculadoraapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculadoraapiApplicationTests {
	CalculadoraapiApplication objcalcu = new CalculadoraapiApplication();


	@Test
	public void sumaTest1 (){
		assertEquals(objcalcu.calcular(2,2,0,1), 4);
	}


	@Test
	public void sumaTest1 (){
		assertEquals(objcalcu.calcular(2,2,0,4), 1);
	}

}
