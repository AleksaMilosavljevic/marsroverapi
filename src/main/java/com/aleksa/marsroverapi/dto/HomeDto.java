package com.aleksa.marsroverapi.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mars_api_preferences")
public class HomeDto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String marsApiRoverData;
    private Integer marsSol;
    private Boolean cameraFhaz;
    private Boolean cameraRhaz;
    private Boolean cameraMast;
    private Boolean cameraChemcam;
    private Boolean cameraMhali;
    private Boolean cameraMardi;
    private Boolean cameraNavcam;
    private Boolean cameraPancam;
    private Boolean cameraMinites;
    private boolean rememberPreferences;

    
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    public boolean isRememberPreferences() {
        return this.rememberPreferences;
    }

    public boolean getRememberPreferences() {
        return this.rememberPreferences;
    }

    public void setRememberPreferences(boolean rememberPreferences) {
        this.rememberPreferences = rememberPreferences;
    }

    @Column(length = 20)
    public String getMarsApiRoverData() {
        return this.marsApiRoverData;
    }

    public void setMarsApiRoverData(String marsApiRoverData) {
        this.marsApiRoverData = marsApiRoverData;
    }

    public Integer getMarsSol() {
        return this.marsSol;
    }

    public void setMarsSol(Integer marsSol) {
        this.marsSol = marsSol;
    }


    public Boolean isCameraFhaz() {
        return this.cameraFhaz;
    }

    public Boolean getCameraFhaz() {
        return this.cameraFhaz;
    }

    public void setCameraFhaz(Boolean cameraFhaz) {
        this.cameraFhaz = cameraFhaz;
    }

    public Boolean isCameraMast() {
        return this.cameraMast;
    }

    public Boolean isCameraRhaz() {
        return this.cameraRhaz;
    }

    public Boolean getCameraRhaz() {
        return this.cameraRhaz;
    }

    public void setCameraRhaz(Boolean cameraRhaz) {
        this.cameraRhaz = cameraRhaz;
    }

    public Boolean getCameraMast() {
        return this.cameraMast;
    }

    public void setCameraMast(Boolean cameraMast) {
        this.cameraMast = cameraMast;
    }

    public Boolean isCameraChemcam() {
        return this.cameraChemcam;
    }

    public Boolean getCameraChemcam() {
        return this.cameraChemcam;
    }

    public void setCameraChemcam(Boolean cameraChemcam) {
        this.cameraChemcam = cameraChemcam;
    }

    public Boolean isCameraMhali() {
        return this.cameraMhali;
    }

    public Boolean getCameraMhali() {
        return this.cameraMhali;
    }

    public void setCameraMhali(Boolean cameraMhali) {
        this.cameraMhali = cameraMhali;
    }

    public Boolean isCameraMardi() {
        return this.cameraMardi;
    }

    public Boolean getCameraMardi() {
        return this.cameraMardi;
    }

    public void setCameraMardi(Boolean cameraMardi) {
        this.cameraMardi = cameraMardi;
    }

    public Boolean isCameraNavcam() {
        return this.cameraNavcam;
    }

    public Boolean getCameraNavcam() {
        return this.cameraNavcam;
    }

    public void setCameraNavcam(Boolean cameraNavcam) {
        this.cameraNavcam = cameraNavcam;
    }

    public Boolean isCameraPancam() {
        return this.cameraPancam;
    }

    public Boolean getCameraPancam() {
        return this.cameraPancam;
    }

    public void setCameraPancam(Boolean cameraPancam) {
        this.cameraPancam = cameraPancam;
    }

    public Boolean isCameraMinites() {
        return this.cameraMinites;
    }

    public Boolean getCameraMinites() {
        return this.cameraMinites;
    }

    public void setCameraMinites(Boolean cameraMinites) {
        this.cameraMinites = cameraMinites;
    }
   

    @Override
    public String toString() {
        return "{" +
            " userId='" + getUserId() + "'" +
            ", marsApiRoverData='" + getMarsApiRoverData() + "'" +
            ", marsSol='" + getMarsSol() + "'" +
            ", cameraFhaz='" + isCameraFhaz() + "'" +
            ", cameraRhaz='" + isCameraRhaz() + "'" +
            ", cameraMast='" + isCameraMast() + "'" +
            ", cameraChemcam='" + isCameraChemcam() + "'" +
            ", cameraMhali='" + isCameraMhali() + "'" +
            ", cameraMardi='" + isCameraMardi() + "'" +
            ", cameraNavcam='" + isCameraNavcam() + "'" +
            ", cameraPancam='" + isCameraPancam() + "'" +
            ", cameraMinites='" + isCameraMinites() + "'" +
            ", rememberPreferences='" + isRememberPreferences() + "'" +
            "}";
    }
    

}
