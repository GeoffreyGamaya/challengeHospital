package com.edgelab.hospital.states;

import com.edgelab.hospital.drugs.Drug;

public class Healthy implements State {

    @Override
    public State applyDrug(Drug drug) {
        return null;
    }
}