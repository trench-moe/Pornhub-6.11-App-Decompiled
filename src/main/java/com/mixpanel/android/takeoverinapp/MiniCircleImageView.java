package com.mixpanel.android.takeoverinapp;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class MiniCircleImageView extends ImageView {

    /* renamed from: c  reason: collision with root package name */
    public Paint f8324c;

    public MiniCircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public MiniCircleImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }

    public final void a() {
        Paint paint = new Paint(1);
        this.f8324c = paint;
        if (Build.VERSION.SDK_INT >= 23) {
            paint.setColor(getResources().getColor(17170443, null));
        } else {
            paint.setColor(getResources().getColor(17170443));
        }
        this.f8324c.setStyle(Paint.Style.STROKE);
        this.f8324c.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }
}
