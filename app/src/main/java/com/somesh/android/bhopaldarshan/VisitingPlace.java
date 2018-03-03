package com.somesh.android.bhopaldarshan;

import java.io.Serializable;

/**
 * Created by nsaxena on 9/2/18.
 */

public class VisitingPlace implements Serializable{

    private static final long serialVersionUID=1L;

    String title;
    String about;
    String address;
    String goodFor;
    String imageUrl;
    String openingHours;
    String visitDuration;
    String websites;
    String entryFee;
    String latitude;
    String longitude;

   public VisitingPlace()
   {

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

    public String getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(String entryFee) {
        this.entryFee = entryFee;
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
                ", entryFee='" + entryFee + '\'' +
                '}';
    }
}
