package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.BuyPredictor;

public class BalancedPredictor implements BuyPredictor {
    @Override
    public String whatToBuy() {
        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }
}
