package edu.neu.info5100.assignment06;

import java.text.DecimalFormat;
import java.util.*;

public class Mreview implements Comparable<Mreview> {
    // instance variables
    private String title;   // title of the movie
    private ArrayList<Integer> ratings; // list of ratings stored in a Store object

    public Mreview() {
    }

    public Mreview(String title) {
        this.title = title;
    }

    public Mreview(String title, ArrayList<Integer> ratings) {
        this.title = title;
        this.ratings = ratings;
    }

    // methods
    public void addRating(int r){
        ratings.add(r);
    }

    public double aveRating(){
        DecimalFormat df = new DecimalFormat("#.00");
        double ave = ratings.stream().mapToInt(Integer::intValue).average().getAsDouble();

        double formatAve = Double.parseDouble(df.format(ave));
        return formatAve;
    }

    public int numRatings(){
        int rateSize = ratings.size();
        return rateSize;
    }

    @Override
    public int compareTo(Mreview obj){
        return this.title.compareTo(obj.title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Mreview mreview = (Mreview) obj;
        return Objects.equals(title, mreview.title);
    }

    @Override
    public String toString() {
        return title + ", average " + aveRating() + " out of " + numRatings() + " ratings";
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Integer> getRatings() {
        return ratings;
    }
}

