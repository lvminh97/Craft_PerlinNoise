package h13.noise;

import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import java.util.Random;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * A simple implementation of the Perlin noise algorithm.
 *
 * @author Nhan Huynh
 */
public class SimplePerlinNoise extends AbstractPerlinNoise implements PerlinNoise {

    /**
     * Constructs a simple Perlin noise object with the specified noise domain width, height, frequency and seed.
     *
     * @param width           the width of the noise domain
     * @param height          the height of the noise domain
     * @param frequency       the frequency of the Perlin noise
     * @param randomGenerator the random generator used for generating gradient vectors
     */
    public SimplePerlinNoise(int width, int height, double frequency, Random randomGenerator) {
        super(width, height, frequency, randomGenerator);
    }

    /**
     * Constructs a simple Perlin noise object with the specified noise domain width, height and seed.
     *
     * @param width           the width of the noise domain
     * @param height          the height of the noise domain
     * @param randomGenerator the random generator used for generating gradient vectors
     */
    public SimplePerlinNoise(int width, int height, Random randomGenerator) {
        super(width, height, randomGenerator);
    }

    @Override
    public double compute(int x, int y) {
        double f = getFrequency();
        return compute(x * f, y * f);
    }

    @Override
    @StudentImplementationRequired
    public double compute(double x, double y) {
        return crash(); // TODO: H1.3 - remove if implemented
    }

    @Override
    @StudentImplementationRequired
    public double fade(double t) {
        return crash(); // TODO: H1.2 - remove if implemented
    }

    /**
     * Performs linear interpolation between two values.
     *
     * @param x1    The first value.
     * @param x2    The second value.
     * @param alpha The interpolation factor, typically in the range [0, 1].
     * @return the interpolated value
     */
    @Override
    @StudentImplementationRequired
    public double interpolate(double x1, double x2, double alpha) {
        return crash(); // TODO: H1.2 - remove if implemented
    }
}
