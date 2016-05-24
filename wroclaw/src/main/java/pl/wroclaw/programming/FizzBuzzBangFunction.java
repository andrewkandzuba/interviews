package pl.wroclaw.programming;

import java.util.function.IntFunction;

/**
 * Functional mapper @see {@link pl.wroclaw.programming.FizzBuzzBang#getFizzBuzzBang(Integer)} for implementation's details
 */
public class FizzBuzzBangFunction implements IntFunction<String> {
    @Override
    public String apply(int value) {
        return FizzBuzzBang.getFizzBuzzBang(value);
    }
}
