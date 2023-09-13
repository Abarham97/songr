package com.abarham97.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@AutoConfigureMockMvc

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;





	@Test
	void contextLoads() {
	}

	@Test
	void testConstructor() {
		Album album = new Album("Album1", "Name", 1, 300, "album.jpg");
		assertEquals("Album1", album.getTitle());
		assertEquals("Name", album.getArtist());
		assertEquals(1, album.getSongCount());
		assertEquals(300, album.getLength());
		assertEquals("album.jpg", album.getImageUrl());

	}

	@Test
	public void testGettersAndSetters() {
		Album album = new Album("Album1", "Name", 1, 300, "album.jpg");

		album.setTitle("New Title");
		assertEquals("New Title", album.getTitle());

		album.setArtist("New Artist");
		assertEquals("New Artist", album.getArtist());

		album.setSongCount(20);
		assertEquals(20, album.getSongCount());


		album.setLength(480);
		assertEquals(480, album.getLength());


		album.setImageUrl("newImage.jpg");
		assertEquals("newImage.jpg", album.getImageUrl());
	}


	@Test
	public void testHelloWorldRoute() throws Exception {
		ResultActions resultActions = mockMvc.perform(get("/hello"));


		resultActions.andExpect(status().isOk());


		resultActions.andExpect(view().name("hello"));


	}

}
