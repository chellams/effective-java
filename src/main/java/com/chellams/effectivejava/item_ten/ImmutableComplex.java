package com.chellams.effectivejava.item_ten;

import java.util.Objects;

public final class ImmutableComplex {
    private final double real;
    private final double image;

    public ImmutableComplex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }

    public ImmutableComplex add(ImmutableComplex c) {
        return new ImmutableComplex(real + c.getReal(), image + c.getImage());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableComplex that = (ImmutableComplex) o;
        return Double.compare(that.real, real) == 0 && Double.compare(that.image, image) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, image);
    }

    @Override
    public String toString() {
        return "ImmutableComplex{" +
                "real=" + real +
                ", image=" + image +
                '}';
    }
}
