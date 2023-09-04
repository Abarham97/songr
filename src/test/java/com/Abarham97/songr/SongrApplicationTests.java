package com.Abarham97.songr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SongrApplicationTests {

	private Album album;

	@BeforeEach
	public void setUp() {
		// Create a new Album object before each test
		album = new Album("Album Title", "Artist Name", 10, 3600, "album-image.jpg");
	}

	@Test
	public void testGetTitle() {
		assertEquals("Album Title", album.getTitle());
	}

	@Test
	public void testSetTitle() {
		album.setTitle("New Title");
		assertEquals("New Title", album.getTitle());
	}

	@Test
	public void testGetArtist() {
		assertEquals("Artist Name", album.getArtist());
	}

	@Test
	public void testSetArtist() {
		album.setArtist("New Artist");
		assertEquals("New Artist", album.getArtist());
	}

	@Test
	public void testGetSongCount() {
		assertEquals(10, album.getSongCount());
	}

	@Test
	public void testSetSongCount() {
		album.setSongCount(15);
		assertEquals(15, album.getSongCount());
	}

	@Test
	public void testGetLength() {
		assertEquals(3600, album.getLength());
	}

	@Test
	public void testSetLength() {
		album.setLength(4200);
		assertEquals(4200, album.getLength());
	}

	@Test
	public void testGetImageUrl() {
		assertEquals("album-image.jpg", album.getImageUrl());
	}

	@Test
	public void testSetImageUrl() {
		album.setImageUrl("new-image.jpg");
		assertEquals("new-image.jpg", album.getImageUrl());
	}

}
