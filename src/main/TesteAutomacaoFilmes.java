package main;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import bean.Filme;

public class TesteAutomacaoFilmes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Inmetrics\\Desktop\\ProjetoAutomacao\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Filme filme1 = new Filme("Júlia Rezende", "1986");
		filme1.setNome("De Pernas pro Ar 3");
		filme1.setAnoLancamento("2019 ");

		Filme filme2 = new Filme("Anthony Russo", "3 de fevereiro de 1970");
		filme2.setNome("Vingadores: Guerra Infinita");
		filme2.setAnoLancamento("2018 ");

		Filme filme3 = new Filme("James Wan", " 26 de fevereiro de 1977");
		filme3.setNome("Aquaman");
		filme3.setAnoLancamento("2018");

		ArrayList<Filme> filme = new ArrayList<Filme>();
		filme.add(filme1);
		filme.add(filme2);
		filme.add(filme3);

		driver.get("http://www.google.com.br");

		for (int i = 0; i < filme.size(); i++) {
			WebElement inputPesquisa = driver.findElement(By.ByName.name("q"));
			inputPesquisa.clear();
			inputPesquisa.sendKeys(filme.get(i).getNomeDiretor() + " " + filme.get(i).getDataNascimento() + ", "
					+ filme.get(i).getNome() + " " + filme.get(i).getAnoLancamento());
			inputPesquisa.submit();
			String resultado;
			WebElement resultaStats = driver.findElement(By.id("resultStats"));
			resultado = resultaStats.getText();

			System.out.println(
					"Diretor: " + filme.get(i).getNomeDiretor() + "\nAno Nasc.: " + filme.get(i).getDataNascimento());
			System.out.println(
					"Filme: " + filme.get(i).getNome() + "| Ano Lançamento: " + filme.get(i).getAnoLancamento());
			System.out.println(resultado + "\n");

		}
		driver.close();
	}

}
