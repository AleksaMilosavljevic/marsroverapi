package com.aleksa.marsroverapi.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsCamera {

    private Long id;
    private String name;
    @JsonProperty("rover_id")
    private Long roverId;
    @JsonProperty("full_name")
    private String fullName;


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", roverId='" + getRoverId() + "'" +
            ", fullName='" + getFullName() + "'" +
            "}";
    }


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

    public Long getRoverId() {
        return this.roverId;
    }

    public void setRoverId(Long roverId) {
        this.roverId = roverId;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
