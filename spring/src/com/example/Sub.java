package com.example;

public class Sub implements MathOp {
    @Override
    public int perform(int x, int y) {
        return x-y;
    }
}
