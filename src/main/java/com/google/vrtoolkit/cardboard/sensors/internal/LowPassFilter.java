package com.google.vrtoolkit.cardboard.sensors.internal;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class LowPassFilter {
    private static final double NANOS_TO_SECONDS = 1.0d / TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS);
    private long lastTimestampNs;
    private int numSamples;
    private final double timeConstantSecs;
    private final Vector3d filteredData = new Vector3d();
    private final Vector3d temp = new Vector3d();

    public LowPassFilter(double d) {
        this.timeConstantSecs = 1.0d / (d * 6.283185307179586d);
    }

    public void addSample(Vector3d vector3d, long j10) {
        addWeightedSample(vector3d, j10, 1.0d);
    }

    public void addWeightedSample(Vector3d vector3d, long j10, double d) {
        int i10 = this.numSamples + 1;
        this.numSamples = i10;
        if (i10 == 1) {
            this.filteredData.set(vector3d);
            this.lastTimestampNs = j10;
            return;
        }
        double d10 = d * (j10 - this.lastTimestampNs) * NANOS_TO_SECONDS;
        double d11 = d10 / (this.timeConstantSecs + d10);
        this.filteredData.scale(1.0d - d11);
        this.temp.set(vector3d);
        this.temp.scale(d11);
        Vector3d vector3d2 = this.temp;
        Vector3d vector3d3 = this.filteredData;
        Vector3d.add(vector3d2, vector3d3, vector3d3);
        this.lastTimestampNs = j10;
    }

    public Vector3d getFilteredData() {
        return this.filteredData;
    }

    public int getNumSamples() {
        return this.numSamples;
    }
}
