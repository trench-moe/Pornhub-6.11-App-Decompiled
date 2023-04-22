package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* loaded from: classes.dex */
public class b implements View.OnTouchListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f7855c;

    public b(TimePickerView timePickerView, GestureDetector gestureDetector) {
        this.f7855c = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f7855c.onTouchEvent(motionEvent);
        }
        return false;
    }
}
