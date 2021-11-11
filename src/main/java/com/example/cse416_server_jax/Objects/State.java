package com.example.cse416_server_jax.Objects;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.LineSegment;

import java.util.Iterator;
import java.util.List;

public class State {
    private int id;
    private String name;
    private Population[] populations;
    private Election[] electionResults;
    private Geometry geometry;
    private List<DistrictPlan> districtPlans;

//    public State(int it, String name, Population[] populations, Election[] electionResults, Geometry geometry, List<DistrictPlan> districtPlans) {
//        this.it = it;
//        this.name = name;
//        this.populations = populations;
//        this.electionResults = electionResults;
//        this.geometry = geometry;
//        this.districtPlans = districtPlans;
//    }

    public List<DistrictPlan> getDistrictPlans() {
        return districtPlans;
    }

    public void setDistrictPlans(List<DistrictPlan> districtPlans) {
        this.districtPlans = districtPlans;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public State(int id, String name, Population[] populations, Election[] electionResults, Geometry geometry, List<DistrictPlan> districtPlans) {
        this.id = id;
        this.name = name;
        this.populations = populations;
        this.electionResults = electionResults;
        this.geometry = geometry;
        this.districtPlans = districtPlans;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Election[] getElectionResults() {
        return electionResults;
    }

    public void setElectionResults(Election[] electionResults) {
        this.electionResults = electionResults;
    }

    public Population[] getPopulations() {
        return populations;
    }

    public void setPopulations(Population[] populations) {
        this.populations = populations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIt() {
        return id;
    }

    public void setIt(int it) {
        this.id = it;
    }

    public DistrictPlan getEnactedPlan(){
        for (DistrictPlan dp : this.districtPlans) {
            if (dp.isEnacted()) {
                return dp;
            }
        }
        return null;
    }
}
