package com.aleksa.marsroverapi.response;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverApiResponse {

    List<MarsPhoto> photos = new ArrayList<>();


    public List<MarsPhoto> getPhotos() {
        return this.photos;
    }

    public void setPhotos(List<MarsPhoto> photos) {
        this.photos = photos;
    }


    @Override
    public String toString() {
        return "{" +
            " photos='" + photos + "'" +
            "}";
    }

    
}
