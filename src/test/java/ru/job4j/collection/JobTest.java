package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

class JobTest {
    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> name = new JobDescByName();
        int result = name.compare(
                new Job("Tasks", 5),
                new Job("Bugreport", 1)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> priority = new JobDescByPriority();
        int result = priority.compare(
                new Job("Tasks", 5),
                new Job("Bugreport", 1)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenComparatorUpByName() {
        Comparator<Job> name = new JobUpByName();
        int result = name.compare(
                new Job("Tasks", 5),
                new Job("Bugreport", 1)
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenComparatorUpByPriority() {
        Comparator<Job> priority = new JobUpByPriority();
        int result = priority.compare(
                new Job("Tasks", 5),
                new Job("Bugreport", 1)
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenComparatorDescByNameAndPriority() {
        Comparator<Job> nameandpriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int result = nameandpriority.compare(
                new Job("Tasks", 5),
                new Job("Bugreport", 1)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenComparatorUpByNameAndPriority() {
        Comparator<Job> nameandpriority = new JobUpByName().thenComparing(new JobUpByPriority());
        int result = nameandpriority.compare(
                new Job("Tasks", 5),
                new Job("Tasks", 1)
        );
        assertThat(result).isGreaterThan(0);
    }

}