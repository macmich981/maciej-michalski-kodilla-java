package com.kodilla.good.patterns.food2door;

public class Contractor {
    private String contractorName;
    private String contractorAddress;

    public Contractor(String contractorName, String contractorAddress) {
        this.contractorName = contractorName;
        this.contractorAddress = contractorAddress;
    }

    public String getContractorName() {
        return contractorName;
    }

    public String getContractorAddress() {
        return contractorAddress;
    }
}
