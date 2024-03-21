package com.example.heyyy.Domain;

public class trading {

    private String brandname;
    private String rate;
    private String prerate;
    private String percent;

    public trading(String apple, String rate, String prerate, String percent, String graph,String picpath , String picpath2) {
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getPrerate() {
        return prerate;
    }

    public void setPrerate(String prerate) {
        this.prerate = prerate;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }

    public String getPicpath2() {
        return picpath2;
    }

    public void setPicpath2(String picpath2) {
        this.picpath2 = picpath2;
    }

    public trading(String brandname, String rate, String prerate, String percent, String picpath , String picpath2) {
        this.brandname = brandname;
        this.rate = rate;
        this.prerate = prerate;
        this.percent = percent;
        this.picpath = picpath;
        this.picpath2 = picpath2;
    }
    private String picpath;
    private String picpath2;
}
