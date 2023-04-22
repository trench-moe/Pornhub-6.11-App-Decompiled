package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.appcompat.widget.q0;
import q0.d;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f1881j = 0;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f1882c;

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f1883f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1882c = new d(this, 0);
        this.f1883f = new q0(this, 1);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f1882c);
        removeCallbacks(this.f1883f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1882c);
        removeCallbacks(this.f1883f);
    }
}
