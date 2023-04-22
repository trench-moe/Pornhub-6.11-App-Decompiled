package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import java.util.Objects;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f823c;

    /* renamed from: f  reason: collision with root package name */
    public TypedValue f824f;

    /* renamed from: j  reason: collision with root package name */
    public TypedValue f825j;

    /* renamed from: m  reason: collision with root package name */
    public TypedValue f826m;
    public TypedValue n;

    /* renamed from: t  reason: collision with root package name */
    public TypedValue f827t;

    /* renamed from: u  reason: collision with root package name */
    public final Rect f828u;

    /* renamed from: w  reason: collision with root package name */
    public a f829w;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f828u = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.n == null) {
            this.n = new TypedValue();
        }
        return this.n;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f827t == null) {
            this.f827t = new TypedValue();
        }
        return this.f827t;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f825j == null) {
            this.f825j = new TypedValue();
        }
        return this.f825j;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f826m == null) {
            this.f826m = new TypedValue();
        }
        return this.f826m;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f823c == null) {
            this.f823c = new TypedValue();
        }
        return this.f823c;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f824f == null) {
            this.f824f = new TypedValue();
        }
        return this.f824f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f829w;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f829w;
        if (aVar != null) {
            androidx.appcompat.app.d dVar = ((e.j) aVar).f8933a;
            t tVar = dVar.A;
            if (tVar != null) {
                tVar.i();
            }
            if (dVar.F != null) {
                dVar.n.getDecorView().removeCallbacks(dVar.G);
                if (dVar.F.isShowing()) {
                    try {
                        dVar.F.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                dVar.F = null;
            }
            dVar.K();
            androidx.appcompat.view.menu.e eVar = dVar.P(0).f542h;
            if (eVar != null) {
                eVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f829w = aVar;
    }
}
