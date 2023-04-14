package com.aleksa.marsroverapi.response;



import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsRover {

    private Long id;
    private String name;
    @JsonProperty("landing_date")
    private String landingDate;
    

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public String getLandingDate() {
        return this.landingDate;
    }

    public void setLandingDate(String landingDate) {
        this.landingDate = landingDate;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", landingDate='" + getLandingDate() + "'" +
            "}";
    }

}
