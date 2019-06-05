package com.example.user.uberclone;

class Driverlocation {
    double altitude;
    double longitude;
    public Driverlocation() {

    }

    public Driverlocation(double altitude, double longitude) {
        this.altitude = altitude;
        this.longitude = longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
