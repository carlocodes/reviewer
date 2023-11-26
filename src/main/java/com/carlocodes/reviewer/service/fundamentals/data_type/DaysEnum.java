package com.carlocodes.reviewer.service.fundamentals.data_type;

public enum DaysEnum {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    DaysEnum(int value) {
        this.value = value;
    }

    private final int value;

    public int getValue() {
        return value;
    }
}
