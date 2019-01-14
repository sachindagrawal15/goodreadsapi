package com.goodreads.model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "search")
@XmlAccessorType(XmlAccessType.FIELD)
public class Search {
    private String query;
    @XmlElement(name = "results-start")
    private int resultsStart;
    @XmlElement(name = "results-end")
    private int resultsEnd;
    @XmlElement(name = "total-results")
    private int totalResult;

    private String source;
    @XmlElement(name = "query-time-seconds")
    private Double timeTaken;

    @XmlElementWrapper(name="results")
    @XmlElement(name="work")
    private List<Work> works;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getResultsStart() {
        return resultsStart;
    }

    public void setResultsStart(int resultsStart) {
        this.resultsStart = resultsStart;
    }

    public int getResultsEnd() {
        return resultsEnd;
    }

    public void setResultsEnd(int resultsEnd) {
        this.resultsEnd = resultsEnd;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Double getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(Double timeTaken) {
        this.timeTaken = timeTaken;
    }

    public List<Work> getWorks() {
        return works;
    }

    public void setWorks(List<Work> works) {
        this.works = works;
    }
}
