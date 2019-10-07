package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ContractorList {
    private List<Contractor> contractorList = new ArrayList<>();

    public void addContractor(Contractor contractor) {
        contractorList.add(contractor);
    }

    public List<Contractor> getContractorList() {
        return contractorList;
    }
}
