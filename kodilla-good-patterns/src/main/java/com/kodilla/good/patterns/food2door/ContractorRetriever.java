package com.kodilla.good.patterns.food2door;

public class ContractorRetriever {
    public ContractorList retrieve() {

        Contractor contractor = new Contractor("ExtraFoodShop", "ul. Dodatkowa, Wrocław");
        Contractor contractor1 = new Contractor("HealthyShop", "ul. Zdrowa, Warszawa");
        Contractor contractor2 = new Contractor("GlutenFreeShop", "ul. Glutenowa, Poznań");

        ContractorList contractorList = new ContractorList();
        contractorList.addContractor(contractor);
        contractorList.addContractor(contractor1);
        contractorList.addContractor(contractor2);

        return contractorList;
    }
}
