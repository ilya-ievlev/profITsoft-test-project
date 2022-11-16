package com.profitsoft.first_second_lectures_task.third_task.models;

import com.profitsoft.first_second_lectures_task.third_task.models.Cylinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CylinderTest {
    @Test
    void throwIllegalArgumentExceptionIfCreatingObjectWithNegativeParam() {
        assertThrows(IllegalArgumentException.class, () -> new Cylinder(-1, -3));
    }
}
