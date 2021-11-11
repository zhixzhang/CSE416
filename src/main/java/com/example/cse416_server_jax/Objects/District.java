package com.example.cse416_server_jax.Objects;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.vividsolutions.jts.geom.Geometry;
import org.springframework.web.servlet.tags.form.SelectTag;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class District {
    private int id;
    private String name;
    private Population population;
    private Election[] electionResult;
    private List<District> neighbors;
    private Geometry geometry;
    private boolean majorityMinority;
    private Set<CensusBlock> borderCensusBlocks;
    private List<CensusBlock> removed;
    private List<CensusBlock> added;
    private List<CensusBlock> censusBlocks;
    private List<Precinct> precincts;

    public District(int id, String name, Population population, Election[] electionResult, List<District> neighbors,
                    Geometry geometry, boolean majorityMinority, Set<CensusBlock> borderCensusBlocks,
                    List<CensusBlock> removed, List<CensusBlock> added, List<CensusBlock> censusBlocks,
                    List<Precinct> precincts){
        this.id=id;
        this.name=name;
        this.population=population;
        this.electionResult=electionResult;
        this.neighbors=neighbors;
        this.geometry=geometry;
        this.majorityMinority=majorityMinority;
        this.borderCensusBlocks=borderCensusBlocks;
        this.removed=removed;
        this.added=added;
        this.censusBlocks=censusBlocks;
        this.precincts=precincts;
    }
    public int getId() {return id;}
    public String getName() {return name;}
    public Population getPopulation() {return population;}
    public Election[] getElectionResult() {return electionResult;}
    public List<District> getNeighbors() {return neighbors;}
    public Geometry getGeometry() {return geometry;}
    public Set<CensusBlock> getBorderCensusBlocks() {return  borderCensusBlocks;}
    public List<CensusBlock> getRemoved() {return removed;}
    public List<CensusBlock> getAdded() {return added;}

    public List<CensusBlock> getCensusBlocks() {
        return censusBlocks;
    }

    public List<Precinct> getPrecincts() {
        return precincts;
    }

    public boolean isMajorityMinority() {
        return majorityMinority;
    }

    public void setPrecincts(List<Precinct> precincts) {
        this.precincts = precincts;
    }

    public void setCensusBlocks(List<CensusBlock> censusBlocks) {
        this.censusBlocks = censusBlocks;
    }

    public void setAdded(List<CensusBlock> added) {
        this.added = added;
    }

    public void setRemoved(List<CensusBlock> removed) {
        this.removed = removed;
    }

    public void setBorderCensusBlocks(Set<CensusBlock> borderCensusBlocks) {
        this.borderCensusBlocks = borderCensusBlocks;
    }

    public void setMajorityMinority(boolean majorityMinority) {
        this.majorityMinority = majorityMinority;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public void setNeighbors(List<District> neighbors) {
        this.neighbors = neighbors;
    }

    public void setElectionResult(Election[] electionResult) {
        this.electionResult = electionResult;
    }

    public void setPopulation(Population population) {
        this.population = population;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public CensusBlock getRandomCensusBlock(List<CensusBlock> CBs){
        Random rand = new Random();
        return CBs.get(rand.nextInt(CBs.size()));
    }
    public void addCensusBlock(CensusBlock cb){
        censusBlocks.add(cb);
    }

    public void removeCensusBlock(CensusBlock cb){
        censusBlocks.removeIf(item -> item.equals(cb));
    }

    public int findMostPopulousDistrict(List<District> districts){
        //是不是该放district controller
        return -1;
    }

    public List<District> updateDistricts(List<District> districts){
        return null;
    }

    public void calAllDemographic(CensusBlock censusBlock, List<District> districts){

    }

    public void updateBorder(){

    }

    public List<CensusBlock> CBsInDistrict(List<CensusBlock> censusBlocks, District distirct){
        return null;
        // district 那里在class diagram上写的是congressionalDistrict，
    }

    public void changeDistrict(List<CensusBlock> censusBlocks){

    }

    public void getUnionOfRemovedCB(){

    }

    public List<CensusBlock> findCensusBlocksInDistrict(District district,int CBid){
        return null;
    }
}











