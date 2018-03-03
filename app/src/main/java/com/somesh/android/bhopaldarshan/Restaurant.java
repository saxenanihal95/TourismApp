package com.somesh.android.bhopaldarshan;

import java.io.Serializable;
import java.util.List;

/**
 * Created by nsaxena on 28/2/18.
 */

public class Restaurant implements Serializable {
    private static final long serialVersionUID=1L;

    String title;
    String address;
    String cuisines;
    String imageUrl;
    String openingHours;
    String highlights;
    String cost;
    List<String> menuImages;
    String latitude;
    String longitude;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getHighlights() {
        return highlights;
    }

    public void setHighlights(String highlights) {
        this.highlights = highlights;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public List<String> getMenuImages() {
        return menuImages;
    }

    public void setMenuImages(List<String> menuImages) {
        this.menuImages = menuImages;
    }
}
