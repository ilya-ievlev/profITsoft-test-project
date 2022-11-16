package com.profitsoft.first_second_lectures_task.third_task.models;

import com.profitsoft.first_second_lectures_task.third_task.models.Sphere;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SphereTest {
    @Test
    void throwIllegalArgumentExceptionIfCreatingObjectWithNegativeParam() {
        assertThrows(IllegalArgumentException.class, () -> new Sphere(-1));
    }
}
