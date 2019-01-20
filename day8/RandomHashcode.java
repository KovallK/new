package pl.sda.javastart.day8;

import org.apache.commons.lang3.RandomUtils;

import java.util.Objects;

public class RandomHashcode {
    private String value;

    public RandomHashcode(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RandomHashcode that = (RandomHashcode) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return RandomUtils.nextInt(1,10);
    }
}
