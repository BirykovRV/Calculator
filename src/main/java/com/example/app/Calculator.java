package com.example.app;

public class Calculator {

    public float operation(float x, float y, TypeOfOperation type){
        float result = 0;
        switch (type){
            case ADD:
                result = x+y;
                break;
            case DIVIDE:
                result = x/y;
                break;
            case MULTIPLY:
                result = x*y;
                break;
        }
        return result;
    }
}
