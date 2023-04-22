package com.google.vrtoolkit.cardboard;

@UsedByNative
/* loaded from: classes.dex */
public class Eye {
    private float lastZFar;
    private float lastZNear;
    private float[] perspective;
    private final int type;
    private final float[] eyeView = new float[16];
    private final Viewport viewport = new Viewport();
    private final FieldOfView fov = new FieldOfView();
    private volatile boolean projectionChanged = true;

    /* loaded from: classes.dex */
    public static abstract class Type {
        public static final int LEFT = 1;
        public static final int MONOCULAR = 0;
        public static final int RIGHT = 2;
    }

    public Eye(int i10) {
        this.type = i10;
    }

    @UsedByNative
    private void setValues(int i10, int i11, int i12, int i13, float f10, float f11, float f12, float f13) {
        this.viewport.setViewport(i10, i11, i12, i13);
        this.fov.setAngles(f10, f11, f12, f13);
        this.projectionChanged = true;
    }

    @UsedByNative
    public float[] getEyeView() {
        return this.eyeView;
    }

    public FieldOfView getFov() {
        return this.fov;
    }

    public float[] getPerspective(float f10, float f11) {
        if (!this.projectionChanged && this.lastZNear == f10 && this.lastZFar == f11) {
            return this.perspective;
        }
        if (this.perspective == null) {
            this.perspective = new float[16];
        }
        getFov().toPerspectiveMatrix(f10, f11, this.perspective, 0);
        this.lastZNear = f10;
        this.lastZFar = f11;
        this.projectionChanged = false;
        return this.perspective;
    }

    public boolean getProjectionChanged() {
        return this.projectionChanged;
    }

    public int getType() {
        return this.type;
    }

    public Viewport getViewport() {
        return this.viewport;
    }

    public void setProjectionChanged() {
        this.projectionChanged = true;
    }
}
