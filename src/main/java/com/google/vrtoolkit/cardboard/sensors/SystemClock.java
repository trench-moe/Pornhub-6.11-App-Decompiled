package com.google.vrtoolkit.cardboard.sensors;

/* loaded from: classes.dex */
public class SystemClock implements Clock {
    @Override // com.google.vrtoolkit.cardboard.sensors.Clock
    public long nanoTime() {
        return System.nanoTime();
    }
}
