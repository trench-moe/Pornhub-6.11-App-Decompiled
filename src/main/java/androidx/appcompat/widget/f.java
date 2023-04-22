package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final CheckedTextView f983a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f984b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f985c = null;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f986e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f987f;

    public f(CheckedTextView checkedTextView) {
        this.f983a = checkedTextView;
    }

    public void a() {
        Drawable checkMarkDrawable = this.f983a.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.d || this.f986e) {
                Drawable mutate = f0.a.h(checkMarkDrawable).mutate();
                if (this.d) {
                    mutate.setTintList(this.f984b);
                }
                if (this.f986e) {
                    mutate.setTintMode(this.f985c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f983a.getDrawableState());
                }
                this.f983a.setCheckMarkDrawable(mutate);
            }
        }
    }
}
