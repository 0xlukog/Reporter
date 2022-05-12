package com.xlukog.ReportClient.model;

public class Report {
    private int id;
    private String ReportName;
    private String ReportContent;
    private String Location;

    public int getId() {
        return id;
    }

    public String getReportName() {
        return ReportName;
    }

    public String getReportContent() {
        return ReportContent;
    }

    public String getLocation() {
        return Location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReportName(String reportName) {
        ReportName = reportName;
    }

    public void setReportContent(String reportContent) {
        ReportContent = reportContent;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
