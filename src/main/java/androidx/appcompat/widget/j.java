package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1023a;

    /* renamed from: b  reason: collision with root package name */
    public final z0.f f1024b;

    public j(TextView textView) {
        this.f1023a = textView;
        this.f1024b = new z0.f(textView, false);
    }

    /* JADX WARN: Finally extract failed */
    public void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1023a.getContext().obtainStyledAttributes(attributeSet, b7.k.E, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            b(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void b(boolean z10) {
        this.f1024b.f18680a.d(z10);
    }
}
