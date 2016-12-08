package cz.uhk.ppro.inzeraty;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import cz.uhk.ppro.inzeraty.model.Inzerat;
import cz.uhk.ppro.inzeraty.sluzby.PametoveUlozisteInzeratu;
import cz.uhk.ppro.inzeraty.sluzby.UlozisteInzeratu;

@SpringBootApplication
public class InzeratyApplication {

	public static void main(String[] args) {
		SpringApplication.run(InzeratyApplication.class, args);
	}
	
	@Bean
	public UlozisteInzeratu ulozisteInzeratu() {
		PametoveUlozisteInzeratu u = new PametoveUlozisteInzeratu();
		Inzerat i1 = new Inzerat();
		i1.setText("Prodam kolo");
		i1.setCena(new BigDecimal("12345.23"));
		u.pridej(i1);
		Inzerat i2 = new Inzerat();
		i2.setText("Prodam mobil");
		i2.setCena(new BigDecimal("5000"));
		u.pridej(i2);
		return u;
	}
}
