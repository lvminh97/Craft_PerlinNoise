package h13.noise;

import javafx.geometry.Point2D;
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
        // TODO: H1.3
        int x0 = (int) x;
        int x1 = x0 + 1;
        int y0 = (int) y;
        int y1 = y0 + 1;
        Point2D[] g = {
            getGradient(x0, y0),
            getGradient(x1, y0),
            getGradient(x0, y1),
            getGradient(x1, y1)
        };
        Point2D d = new Point2D(x - x0, y - y0);
        double[] S = {
            d.add(0, 0).dotProduct(g[0]),
            d.add(-1, 0).dotProduct(g[1]),
            d.add(0, -1).dotProduct(g[2]),
            d.add(-1, -1).dotProduct(g[3])
        };
        double lx0 = interpolate(S[0], S[1], fade(x - x0));
        double lx1 = interpolate(S[2], S[3], fade(x - x0));
        return interpolate(lx0, lx1, fade(y - y0));
    }

    @Override
    @StudentImplementationRequired
    public double fade(double t) {
        // TODO: H1.2
        return 6 * t * t * t * t * t - 15 * t * t * t * t + 10 * t * t * t;
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
        // TODO: H1.2
        return x1 + alpha * (x2 - x1);
    }
}
