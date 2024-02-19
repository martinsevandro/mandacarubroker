package com.mandacarubroker;

import com.mandacarubroker.domain.stock.Stock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MandacarubrokerApplicationTests {

	@Test
	void contextLoads() {
		//Arrange
		Stock stock = new Stock("id","simbolo","cia",110);

		//Act
		stock.setPrice(120);

		//Assert
		Assertions.assertEquals(120, stock.getPrice(),"stock price updated");
	}

}
