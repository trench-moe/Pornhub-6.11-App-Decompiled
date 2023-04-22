package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Objects;

/* loaded from: classes.dex */
public class a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TimePickerView f7854c;

    public a(TimePickerView timePickerView) {
        this.f7854c = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView timePickerView = this.f7854c;
        int i10 = TimePickerView.M;
        Objects.requireNonNull(timePickerView);
        return false;
    }
}
