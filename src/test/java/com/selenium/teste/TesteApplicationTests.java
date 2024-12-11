package com.selenium.teste;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class TesteApplicationTests {

	@Test
	public void entrarFacebook() {
		//pasta onde está o drive
		System.setProperty("wedriver.chrome.driver", "c:\\drive\\chromedriver.exe");
		//Criar um objeto webdriver para acessar o navegador
		WebDriver navegador = new ChromeDriver();
		//Informarnotempo maximo de resposta
		navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Informar o endereço que quer abrir
		navegador.get("http://facebook.com");
		//Encontrando o elemento email e pass
		navegador.findElement(By.id("email")).sendKeys("ZéDoMorroMocoto@hotmail.com");
		navegador.findElement(By.id("pass")).sendKeys("Jhdjsd54");
		//Encontrando o botão entrar
		navegador.findElement(By.name("login")).click();
		//Botão de clicar


	}

	@Test
	public void entrarAmbienteVirtual() {
		//pasta onde está o drive
		System.setProperty("wedriver.chrome.driver", "c:\\drive\\chromedriver.exe");
		//Criar um objeto webdriver para acessar o navegador
		WebDriver navegador = new ChromeDriver();
		//Informarnotempo maximo de resposta
		navegador.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//Informar o endereço que quer abrir
		navegador.get("https://ava.sesisenai.org.br/login/index.php");
		//Encontrando o elemento email e pass
		navegador.findElement(By.id("username")).sendKeys("flavio_lf_vieira");
		navegador.findElement(By.id("password")).sendKeys("Borutot07.@");
		//Encontrando o botão entrar
		navegador.findElement(By.id("loginbtn")).click();
		//Botão de clicar


	}

	@Test
	public void entrarEspacoEstudante() {
		//pasta onde está o drive
		System.setProperty("wedriver.chrome.driver", "c:\\drive\\chromedriver.exe");
		//Criar um objeto webdriver para acessar o navegador
		WebDriver navegador = new ChromeDriver();
		//Informarnotempo maximo de resposta
		navegador.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//Informar o endereço que quer abrir
		navegador.get("https://estudante.sesisenai.org.br/login");
		//Encontrando o elemento email e pass
		navegador.findElement(By.name("user")).sendKeys("flavio_lf_vieira");
		navegador.findElement(By.name("password")).sendKeys("Borutot07.@");
		//Encontrando o botão entrar
		navegador.findElement(By.className("login__btn")).click();
		//Botão de clicar


	}
	@Test
	public void entrarLeiloes() {
		//pasta onde está o drive
		System.setProperty("wedriver.chrome.driver", "c:\\drive\\chromedriver.exe");
		//Criar um objeto webdriver para acessar o navegador
		WebDriver navegador = new ChromeDriver();
		//Informarnotempo maximo de resposta
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Informar o endereço que quer abrir
		navegador.get("http://localhost:8081/login");
		//Encontrando o elemento email e pass
		navegador.findElement(By.name("username")).sendKeys("fulano");
		navegador.findElement(By.name("password")).sendKeys("pass");
		//Encontrando o botão entrar
		navegador.findElement(By.id("Entrar")).click();
		//Botão de clicar
	}
}

