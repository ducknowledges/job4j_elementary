package ru.job4j.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MergeTest {

    @Test
    public void whenBothEmpty() {
        int[] expect = new int[0];
        int[] result = Merge.merge(
                new int[0],
                new int[0]
        );
        assertThat(result).containsExactly(expect);
    }

    @Test
    public void whenReorder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 3},
                new int[] {2, 4}
        );
        assertThat(result).containsExactly(expect);
    }

    @Test
    public void whenAscOrder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result).containsExactly(expect);
    }

    @Test
    public void whenLeftLess() {
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result).containsExactly(expect);
    }

    @Test
    public void whenLeftGreat() {
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = Merge.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result).isEqualTo(expect);
    }

    @Test
    public void whenLeftEmpty() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result).isEqualTo(expect);
    }
}