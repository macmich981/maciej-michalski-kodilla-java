package com.kodilla.good.patterns.food2door;

public class Contractor {
    private Contractors contractorName;
    private String contractorAddress;

    public Contractor(Contractors contractorName, String contractorAddress) {
        this.contractorName = contractorName;
        this.contractorAddress = contractorAddress;
    }

    public Contractors getContractorName() {
        return contractorName;
    }

    public String getContractorAddress() {
        return contractorAddress;
    }
}
