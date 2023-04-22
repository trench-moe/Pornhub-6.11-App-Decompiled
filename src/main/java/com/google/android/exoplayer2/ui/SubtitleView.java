package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import k8.c0;
import y7.a;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements y7.i {

    /* renamed from: c  reason: collision with root package name */
    public List<y7.a> f6573c;

    /* renamed from: f  reason: collision with root package name */
    public com.google.android.exoplayer2.ui.a f6574f;

    /* renamed from: j  reason: collision with root package name */
    public int f6575j;

    /* renamed from: m  reason: collision with root package name */
    public float f6576m;
    public float n;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6577t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6578u;

    /* renamed from: w  reason: collision with root package name */
    public int f6579w;
    public a y;

    /* renamed from: z  reason: collision with root package name */
    public View f6580z;

    /* loaded from: classes.dex */
    public interface a {
        void a(List<y7.a> list, com.google.android.exoplayer2.ui.a aVar, float f10, int i10, float f11);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6573c = Collections.emptyList();
        this.f6574f = com.google.android.exoplayer2.ui.a.f6597g;
        this.f6575j = 0;
        this.f6576m = 0.0533f;
        this.n = 0.08f;
        this.f6577t = true;
        this.f6578u = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, null);
        this.y = canvasSubtitleOutput;
        this.f6580z = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f6579w = 1;
    }

    private List<y7.a> getCuesWithStylingPreferencesApplied() {
        Object[] spans;
        if (this.f6577t && this.f6578u) {
            return this.f6573c;
        }
        ArrayList arrayList = new ArrayList(this.f6573c.size());
        for (int i10 = 0; i10 < this.f6573c.size(); i10++) {
            a.b a10 = this.f6573c.get(i10).a();
            if (!this.f6577t) {
                a10.n = false;
                CharSequence charSequence = a10.f18527a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        a10.f18527a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = a10.f18527a;
                    Objects.requireNonNull(charSequence2);
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof c8.b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                n.a(a10);
            } else if (!this.f6578u) {
                n.a(a10);
            }
            arrayList.add(a10.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (c0.f11939a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private com.google.android.exoplayer2.ui.a getUserCaptionStyle() {
        int i10 = c0.f11939a;
        if (i10 < 19 || isInEditMode()) {
            return com.google.android.exoplayer2.ui.a.f6597g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return com.google.android.exoplayer2.ui.a.f6597g;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i10 >= 21) {
            return new com.google.android.exoplayer2.ui.a(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new com.google.android.exoplayer2.ui.a(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & a> void setView(T t2) {
        removeView(this.f6580z);
        View view = this.f6580z;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).f6591f.destroy();
        }
        this.f6580z = t2;
        this.y = t2;
        addView(t2);
    }

    @Override // y7.i
    public void R(List<y7.a> list) {
        setCues(list);
    }

    public void a() {
        setStyle(getUserCaptionStyle());
    }

    public void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.y.a(getCuesWithStylingPreferencesApplied(), this.f6574f, this.f6576m, this.f6575j, this.n);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f6578u = z10;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f6577t = z10;
        c();
    }

    public void setBottomPaddingFraction(float f10) {
        this.n = f10;
        c();
    }

    public void setCues(List<y7.a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f6573c = list;
        c();
    }

    public void setFractionalTextSize(float f10) {
        this.f6575j = 0;
        this.f6576m = f10;
        c();
    }

    public void setStyle(com.google.android.exoplayer2.ui.a aVar) {
        this.f6574f = aVar;
        c();
    }

    public void setViewType(int i10) {
        if (this.f6579w == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new CanvasSubtitleOutput(getContext(), null));
        } else if (i10 != 2) {
            throw new IllegalArgumentException();
        } else {
            setView(new WebViewSubtitleOutput(getContext(), null));
        }
        this.f6579w = i10;
    }
}
