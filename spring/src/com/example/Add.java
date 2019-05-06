package com.example;

public class Add implements MathOp {
    @Override
    public int perform(int x, int y) {
        return x + y;
    }
}
