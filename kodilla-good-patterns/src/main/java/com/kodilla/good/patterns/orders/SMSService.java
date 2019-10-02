package com.kodilla.good.patterns.orders;

public class SMSService implements InformationService {
    @Override
    public boolean inform(Order order) {
        User user = order.getRequest().getUser();
        String phone = user.getPhoneNumber();

        return true;
    }
}
