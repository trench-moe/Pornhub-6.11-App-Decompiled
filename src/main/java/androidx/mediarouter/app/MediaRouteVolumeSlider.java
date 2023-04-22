package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.app.pornhub.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MediaRouteVolumeSlider extends AppCompatSeekBar {

    /* renamed from: f  reason: collision with root package name */
    public final float f2454f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2455j;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f2456m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public int f2457t;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2454f = p.d(context);
    }

    public void a(int i10, int i11) {
        if (this.n != i10) {
            if (Color.alpha(i10) != 255) {
                StringBuilder m10 = a1.a.m("Volume slider progress and thumb color cannot be translucent: #");
                m10.append(Integer.toHexString(i10));
                Log.e("MediaRouteVolumeSlider", m10.toString());
            }
            this.n = i10;
        }
        if (this.f2457t != i11) {
            if (Color.alpha(i11) != 255) {
                StringBuilder m11 = a1.a.m("Volume slider background color cannot be translucent: #");
                m11.append(Integer.toHexString(i11));
                Log.e("MediaRouteVolumeSlider", m11.toString());
            }
            this.f2457t = i11;
        }
    }

    public void b(boolean z10) {
        if (this.f2455j == z10) {
            return;
        }
        this.f2455j = z10;
        super.setThumb(z10 ? null : this.f2456m);
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i10 = isEnabled() ? 255 : (int) (this.f2454f * 255.0f);
        this.f2456m.setColorFilter(this.n, PorterDuff.Mode.SRC_IN);
        this.f2456m.setAlpha(i10);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.f2457t, PorterDuff.Mode.SRC_IN);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.n, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i10);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.f2456m = drawable;
        if (this.f2455j) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
