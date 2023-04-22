package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import b7.k;
import j.a;

/* loaded from: classes.dex */
public abstract class ActionBar {

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f449a;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f449a = 0;
            this.f449a = 8388627;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f449a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f3605u);
            this.f449a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f449a = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f449a = 0;
            this.f449a = layoutParams.f449a;
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z10);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g(Configuration configuration);

    public void h() {
    }

    public abstract boolean i(int i10, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(boolean z10);

    public abstract void m(boolean z10);

    public abstract void n(boolean z10);

    public abstract void o(boolean z10);

    public abstract void p(CharSequence charSequence);

    public j.a q(a.InterfaceC0159a interfaceC0159a) {
        return null;
    }
}
