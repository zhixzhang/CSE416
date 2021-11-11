package com.example.cse416_server_jax.Persistence;
import com.example.cse416_server_jax.Objects.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StateRepo {
    public static State findStateByName(String stateName){
        // #####
        // to be continued
        // get data from DB and create a state
        //ArrayList<Population> Ps=new ArrayList<Population>();
        Population p1=new Population(), p2=new Population();
        Population[] Ps={p1,p2};
        DistrictPlan plan1=new DistrictPlan(true), plan2=new DistrictPlan(false);
        List<DistrictPlan> Plans= List.of(plan1,plan2);
        State state= new State(1,stateName, Ps, null, null, Plans);
        // #####
        return state;
    }
}
