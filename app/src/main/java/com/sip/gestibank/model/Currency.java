package com.sip.gestibank.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Currency {

    @SerializedName("success")
    @Expose
    private String success;

    @SerializedName("source")
    @Expose
    private String source;

    public Object getQuotes() {
        return quotes;
    }

    public void setQuotes(Object quotes) {
        this.quotes = quotes;
    }

    @SerializedName("quotes")
    @Expose
    private Object quotes;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }



}
