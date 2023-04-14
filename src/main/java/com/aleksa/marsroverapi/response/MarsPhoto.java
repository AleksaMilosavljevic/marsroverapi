package com.aleksa.marsroverapi.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsPhoto {

    private Long id;
    private Integer sol;
    private MarsCamera camera;
    @JsonProperty("img_src")
    private String imgSrc;
    @JsonProperty("earth_date")
    private String earthDate;
    private MarsRover rover;


    public String getEarthDate() {
        return this.earthDate;
    }

    public void setEarthDate(String earthDate) {
        this.earthDate = earthDate;
    }

    public MarsRover getRover() {
        return this.rover;
    }

    public void setRover(MarsRover rover) {
        this.rover = rover;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSol() {
        return this.sol;
    }

    public void setSol(Integer sol) {
        this.sol = sol;
    }

    public MarsCamera getCamera() {
        return this.camera;
    }

    public void setCamera(MarsCamera camera) {
        this.camera = camera;
    }

    public String getImgSrc() {
        return this.imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }


   


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", sol='" + getSol() + "'" +
            ", camera='" + getCamera() + "'" +
            ", imgSrc='" + getImgSrc() + "'" +
            ", earthDate='" + getEarthDate() + "'" +
            ", rover='" + getRover() + "'" +
            "}";
    }
    

}

