package ru.job4j.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortedTest {
    @Test
    public void whenSorted() {
        assertThat(
                Sorted.isSorted(new int[] {1, 2, 3})
        ).isTrue();
    }

    @Test
    public void whenNotSorted() {
        assertThat(
                Sorted.isSorted(new int[] {1, 3, 2})
        ).isFalse();
    }
}