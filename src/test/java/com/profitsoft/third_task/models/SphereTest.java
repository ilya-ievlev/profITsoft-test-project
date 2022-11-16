package com.profitsoft.third_task.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SphereTest {
    @Test
    void throwIllegalArgumentExceptionIfCreatingObjectWithNegativeParam() {
        assertThrows(IllegalArgumentException.class, () -> new Sphere(-1));
    }
}
