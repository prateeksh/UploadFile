package com.example;

import org.hibernate.validator.constraints.NotEmpty;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uploadfile")
public class UploadData {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NotEmpty
    @Column(name = "image")
    private byte[] image;

    @NotEmpty
    @Column(name = "video")
    private byte[] video;

    @NotEmpty
    @Column(name = "presen")
    private String presentation;


    public UploadData() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public byte[]  getVideo() {
        return video;
    }

    public void setVideo(byte[]  video) {
        this.video = video;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }
}

