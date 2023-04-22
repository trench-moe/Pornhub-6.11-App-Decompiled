package com.google.vrtoolkit.cardboard;

import a1.a;
import android.util.DisplayMetrics;
import android.view.Display;
import com.google.vrtoolkit.cardboard.proto.Phone;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ScreenParams {
    private static final float DEFAULT_BORDER_SIZE_METERS = 0.003f;
    private static final float METERS_PER_INCH = 0.0254f;
    private float borderSizeMeters;
    private int height;
    private int width;
    private float xMetersPerPixel;
    private float yMetersPerPixel;

    public ScreenParams(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            display.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            display.getMetrics(displayMetrics);
        }
        float f10 = METERS_PER_INCH / displayMetrics.xdpi;
        this.xMetersPerPixel = f10;
        float f11 = METERS_PER_INCH / displayMetrics.ydpi;
        this.yMetersPerPixel = f11;
        int i10 = displayMetrics.widthPixels;
        this.width = i10;
        int i11 = displayMetrics.heightPixels;
        this.height = i11;
        this.borderSizeMeters = DEFAULT_BORDER_SIZE_METERS;
        if (i11 > i10) {
            this.width = i11;
            this.height = i10;
            this.xMetersPerPixel = f11;
            this.yMetersPerPixel = f10;
        }
    }

    public ScreenParams(ScreenParams screenParams) {
        this.width = screenParams.width;
        this.height = screenParams.height;
        this.xMetersPerPixel = screenParams.xMetersPerPixel;
        this.yMetersPerPixel = screenParams.yMetersPerPixel;
        this.borderSizeMeters = screenParams.borderSizeMeters;
    }

    public static ScreenParams createFromInputStream(Display display, InputStream inputStream) {
        Phone.PhoneParams readFromInputStream = PhoneParams.readFromInputStream(inputStream);
        if (readFromInputStream == null) {
            return null;
        }
        return fromProto(display, readFromInputStream);
    }

    public static ScreenParams fromProto(Display display, Phone.PhoneParams phoneParams) {
        if (phoneParams == null) {
            return null;
        }
        ScreenParams screenParams = new ScreenParams(display);
        if (phoneParams.hasXPpi()) {
            screenParams.xMetersPerPixel = METERS_PER_INCH / phoneParams.getXPpi();
        }
        if (phoneParams.hasYPpi()) {
            screenParams.yMetersPerPixel = METERS_PER_INCH / phoneParams.getYPpi();
        }
        if (phoneParams.hasBottomBezelHeight()) {
            screenParams.borderSizeMeters = phoneParams.getBottomBezelHeight();
        }
        return screenParams;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof ScreenParams) {
            ScreenParams screenParams = (ScreenParams) obj;
            return this.width == screenParams.width && this.height == screenParams.height && this.xMetersPerPixel == screenParams.xMetersPerPixel && this.yMetersPerPixel == screenParams.yMetersPerPixel && this.borderSizeMeters == screenParams.borderSizeMeters;
        }
        return false;
    }

    public float getBorderSizeMeters() {
        return this.borderSizeMeters;
    }

    public int getHeight() {
        return this.height;
    }

    public float getHeightMeters() {
        return this.height * this.yMetersPerPixel;
    }

    public int getWidth() {
        return this.width;
    }

    public float getWidthMeters() {
        return this.width * this.xMetersPerPixel;
    }

    public void setBorderSizeMeters(float f10) {
        this.borderSizeMeters = f10;
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }

    public String toString() {
        StringBuilder m10 = a.m("{\n");
        int i10 = this.width;
        StringBuilder sb2 = new StringBuilder(22);
        sb2.append("  width: ");
        sb2.append(i10);
        sb2.append(",\n");
        m10.append(sb2.toString());
        int i11 = this.height;
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append("  height: ");
        sb3.append(i11);
        sb3.append(",\n");
        m10.append(sb3.toString());
        float f10 = this.xMetersPerPixel;
        StringBuilder sb4 = new StringBuilder(39);
        sb4.append("  x_meters_per_pixel: ");
        sb4.append(f10);
        sb4.append(",\n");
        m10.append(sb4.toString());
        float f11 = this.yMetersPerPixel;
        StringBuilder sb5 = new StringBuilder(39);
        sb5.append("  y_meters_per_pixel: ");
        sb5.append(f11);
        sb5.append(",\n");
        m10.append(sb5.toString());
        float f12 = this.borderSizeMeters;
        StringBuilder sb6 = new StringBuilder(39);
        sb6.append("  border_size_meters: ");
        sb6.append(f12);
        sb6.append(",\n");
        m10.append(sb6.toString());
        m10.append("}");
        return m10.toString();
    }
}
