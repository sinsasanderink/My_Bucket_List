package com.ursinasanderink.mybucketlist;

import androidx.annotation.DrawableRes;

public class BucketListEntry {

    String heading;
    String description;
    int image;
    // use double if you need many decimal numbers (e.g. 6.2222222222), and use float if you only need a few (e.g. 6.2)
    float  rating;

    //  @DrawableRes int prevents it from breaking down because user can only input valid image numbers instead of all kind of numbers
    public BucketListEntry(String heading, String description, @DrawableRes int image, float rating) {
        this.heading = heading;
        this.description = description;
        this.image = image;
        this.rating = rating;
    }
}
