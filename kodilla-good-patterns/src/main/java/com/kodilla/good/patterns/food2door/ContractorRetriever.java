package com.kodilla.good.patterns.food2door;

public class ContractorRetriever {
    public ContractorList retrieve() {

        Contractor contractor = new Contractor(Contractors.EXTRA_FOOD_SHOP, "ul. Dodatkowa, Wrocław");
        Contractor contractor1 = new Contractor(Contractors.HEALTHY_SHOP, "ul. Zdrowa, Warszawa");
        Contractor contractor2 = new Contractor(Contractors.GLUTEN_FREE_SHOP, "ul. Glutenowa, Poznań");

        ContractorList contractorList = new ContractorList();
        contractorList.addContractor(contractor);
        contractorList.addContractor(contractor1);
        contractorList.addContractor(contractor2);

        return contractorList;
    }
}
