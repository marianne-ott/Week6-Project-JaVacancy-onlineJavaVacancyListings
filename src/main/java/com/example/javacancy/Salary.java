package com.example.javacancy;

public enum Salary {
    Level1(0,499999), Level2(500000,749999), Level3(750000, 899999), Level4(900000,4000000);

    private int low;
    private int high;

    Salary (int low, int high){
        this.low = low;
        this.high = high;
    }

    @Override
    public String toString() {
        return low + "-" + high;
    }
}
