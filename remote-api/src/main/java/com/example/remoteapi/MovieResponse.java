package com.example.remoteapi;

public class MovieResponse {
    private int buget;
    private String original_title;
    private String tagline;
    private String revenue_total;

    public MovieResponse() {
    }



    public MovieResponse(int buget, String original_title, String tagline, String revenue_total) {
        this.buget = buget;
        this.original_title = original_title;
        this.tagline = tagline;
        this.revenue_total = revenue_total;
    }

    public int getBuget() {
        return buget;
    }

    public void setBuget(int buget) {
        this.buget = buget;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getRevenue_total() {
        return revenue_total;
    }

    public void setRevenue_total(String revenue_total) {
        this.revenue_total = revenue_total;
    }
}
