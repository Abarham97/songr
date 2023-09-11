package com.abarham97.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

	@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
	public class HelloWorldControllerIntegrationTest {

		@LocalServerPort
		private int port;

		private final TestRestTemplate restTemplate = new TestRestTemplate();

		@Test
		public void testHelloEndpoint() {
			String url = "http://localhost:" + port + "/hello";
			String response = restTemplate.getForObject(url, String.class);

			assertThat(response).contains("Hello, World!");
		}
	}

}
