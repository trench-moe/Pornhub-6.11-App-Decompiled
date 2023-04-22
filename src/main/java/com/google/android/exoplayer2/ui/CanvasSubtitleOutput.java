package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.a {

    /* renamed from: c  reason: collision with root package name */
    public final List<m> f6444c;

    /* renamed from: f  reason: collision with root package name */
    public List<y7.a> f6445f;

    /* renamed from: j  reason: collision with root package name */
    public int f6446j;

    /* renamed from: m  reason: collision with root package name */
    public float f6447m;
    public a n;

    /* renamed from: t  reason: collision with root package name */
    public float f6448t;

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6444c = new ArrayList();
        this.f6445f = Collections.emptyList();
        this.f6446j = 0;
        this.f6447m = 0.0533f;
        this.n = a.f6597g;
        this.f6448t = 0.08f;
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<y7.a> list, a aVar, float f10, int i10, float f11) {
        this.f6445f = list;
        this.n = aVar;
        this.f6447m = f10;
        this.f6446j = i10;
        this.f6448t = f11;
        while (this.f6444c.size() < list.size()) {
            this.f6444c.add(new m(getContext()));
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0403, code lost:
        if (r3 < r6) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04c9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchDraw(android.graphics.Canvas r40) {
        /*
            Method dump skipped, instructions count: 1279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.CanvasSubtitleOutput.dispatchDraw(android.graphics.Canvas):void");
    }
}
