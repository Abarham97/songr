package com.abarham97.demo;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Title must not be blank")
    private String title;

    @Positive(message = "length must be a positive number")
    private int length;
    @Positive (message = "tracknumber must be a positive number")
    private int tracknumber;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;


public Song(){


}
    public Song(Long id, String title, int length, int tracknumber) {
        this.id = id;
        this.title = title;
        this.length = length;
        this.tracknumber = tracknumber;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public int getTracknumber() {
        return tracknumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setTracknumber(int tracknumber) {
        this.tracknumber = tracknumber;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
