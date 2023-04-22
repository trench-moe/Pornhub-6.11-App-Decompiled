package com.app.pornhub.view.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;
import kf.a;

/* loaded from: classes.dex */
public class VideoViewCustom extends VideoView {

    /* renamed from: c  reason: collision with root package name */
    public int f4989c;

    /* renamed from: f  reason: collision with root package name */
    public int f4990f;

    public VideoViewCustom(Context context) {
        super(context);
    }

    public VideoViewCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoViewCustom(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.f4989c;
        if (i12 <= 0 || this.f4990f <= 0) {
            super.onMeasure(i10, i11);
            return;
        }
        int defaultSize = VideoView.getDefaultSize(i12, i10);
        int defaultSize2 = VideoView.getDefaultSize(this.f4990f, i11);
        int i13 = this.f4989c;
        int i14 = i13 * defaultSize2;
        int i15 = this.f4990f;
        if (i14 > defaultSize * i15) {
            a.f12078a.e("image too tall, correcting", new Object[0]);
            defaultSize2 = (this.f4990f * defaultSize) / this.f4989c;
        } else if (i13 * defaultSize2 < i15 * defaultSize) {
            a.f12078a.e("image too wide, correcting", new Object[0]);
            defaultSize = (this.f4989c * defaultSize2) / this.f4990f;
        } else {
            a.f12078a.e("aspect ratio is correct: %s/%s=%s/%s", Integer.valueOf(defaultSize), Integer.valueOf(defaultSize2), Integer.valueOf(this.f4989c), Integer.valueOf(this.f4990f));
        }
        a.f12078a.e("setting size: %s x %s", Integer.valueOf(defaultSize), Integer.valueOf(defaultSize2));
        setMeasuredDimension(defaultSize, defaultSize2);
    }
}
