package com.profitsoft.third_task.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CylinderTest {
    @Test
    void throwIllegalArgumentExceptionIfCreatingObjectWithNegativeParam() {
        assertThrows(IllegalArgumentException.class, () -> new Cylinder(-1, -3));
    }
}
