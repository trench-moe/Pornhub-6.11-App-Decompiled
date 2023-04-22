package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int M = 0;
    public final Chip I;
    public final Chip J;
    public final MaterialButtonToggleGroup K;
    public final View.OnClickListener L;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i10 = TimePickerView.M;
            Objects.requireNonNull(timePickerView);
        }
    }

    /* loaded from: classes.dex */
    public class b implements MaterialButtonToggleGroup.e {
        public b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.e
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
            TimePickerView timePickerView = TimePickerView.this;
            int i11 = TimePickerView.M;
            Objects.requireNonNull(timePickerView);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.L = aVar;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.K = materialButtonToggleGroup;
        materialButtonToggleGroup.f7264m.add(new b());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.I = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.J = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.g.f(chip, 2);
        x.g.f(chip2, 2);
        com.google.android.material.timepicker.b bVar = new com.google.android.material.timepicker.b(this, new GestureDetector(getContext(), new com.google.android.material.timepicker.a(this)));
        chip.setOnTouchListener(bVar);
        chip2.setOnTouchListener(bVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            x();
        }
    }

    public final void x() {
        if (this.K.getVisibility() == 0) {
            androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
            aVar.f(this);
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            aVar.e(R.id.material_clock_display, x.e.d(this) == 0 ? 2 : 1);
            aVar.c(this, true);
            setConstraintSet(null);
            requestLayout();
        }
    }
}
