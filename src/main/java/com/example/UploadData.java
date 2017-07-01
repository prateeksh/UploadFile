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
    @Column(name = "teach_id")
    private long teach_id;

    @NotEmpty
    @Column(name = "image")
    private String image;

    @NotEmpty
    @Column(name = "video")
    private String video;

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

    public long getTeach_id() {
        return teach_id;
    }

    public void setTeach_id(long teach_id) {
        this.teach_id = teach_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }
}

