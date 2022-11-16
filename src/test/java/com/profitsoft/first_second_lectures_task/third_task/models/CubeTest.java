package com.profitsoft.first_second_lectures_task.third_task.models;

import com.profitsoft.first_second_lectures_task.third_task.models.Cube;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CubeTest {
    @Test
    void throwIllegalArgumentExceptionIfCreatingObjectWithNegativeParam() {
        assertThrows(IllegalArgumentException.class, () -> new Cube(-1, -3, -3));
    }
}
