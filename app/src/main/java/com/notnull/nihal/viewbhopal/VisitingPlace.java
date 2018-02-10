package com.notnull.nihal.viewbhopal;

/**
 * Created by nsaxena on 9/2/18.
 */

public class VisitingPlace {
    String title;
    String about;
    String address;
    String goodFor;
    String imageUrl;
    String openingHours;
    String visitDuration;
    String websites;

    @Override
    public String toString() {
        return "VisitingPlace{" +
                "title='" + title + '\'' +
                ", about='" + about + '\'' +
                ", address='" + address + '\'' +
                ", goodFor='" + goodFor + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", openingHours='" + openingHours + '\'' +
                ", visitDuration='" + visitDuration + '\'' +
                ", websites='" + websites + '\'' +
                '}';
    }

    public VisitingPlace(String title, String about, String address, String goodFor, String imageUrl, String openingHours, String visitDuration, String websites) {
        this.title = title;
        this.about = about;
        this.address = address;
        this.goodFor = goodFor;
        this.imageUrl = imageUrl;
        this.openingHours = openingHours;
        this.visitDuration = visitDuration;
        this.websites = websites;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGoodFor() {
        return goodFor;
    }

    public void setGoodFor(String goodFor) {
        this.goodFor = goodFor;
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

    public String getVisitDuration() {
        return visitDuration;
    }

    public void setVisitDuration(String visitDuration) {
        this.visitDuration = visitDuration;
    }

    public String getWebsites() {
        return websites;
    }

    public void setWebsites(String websites) {
        this.websites = websites;
    }
}
