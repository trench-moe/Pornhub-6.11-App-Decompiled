package za;

import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes2.dex */
public class e extends af.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextPaint f21934a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ af.c f21935b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f21936c;

    public e(d dVar, TextPaint textPaint, af.c cVar) {
        this.f21936c = dVar;
        this.f21934a = textPaint;
        this.f21935b = cVar;
    }

    @Override // af.c
    public void n(int i10) {
        this.f21935b.n(i10);
    }

    @Override // af.c
    public void o(Typeface typeface, boolean z10) {
        this.f21936c.g(this.f21934a, typeface);
        this.f21935b.o(typeface, z10);
    }
}
