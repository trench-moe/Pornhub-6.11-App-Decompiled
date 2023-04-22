package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public class r implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TextView f1074c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Typeface f1075f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f1076j;

    public r(q qVar, TextView textView, Typeface typeface, int i10) {
        this.f1074c = textView;
        this.f1075f = typeface;
        this.f1076j = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1074c.setTypeface(this.f1075f, this.f1076j);
    }
}
