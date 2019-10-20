package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.BuyPredictor;

public class AggressivePredictor implements BuyPredictor {
    @Override
    public String whatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}
