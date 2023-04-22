package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* renamed from: f  reason: collision with root package name */
    public final g f1976f;

    /* renamed from: c  reason: collision with root package name */
    public final Paint.FontMetricsInt f1975c = new Paint.FontMetricsInt();

    /* renamed from: j  reason: collision with root package name */
    public short f1977j = -1;

    /* renamed from: m  reason: collision with root package name */
    public float f1978m = 1.0f;

    public i(g gVar) {
        cb.e.u(gVar, "metadata cannot be null");
        this.f1976f = gVar;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f1975c);
        Paint.FontMetricsInt fontMetricsInt2 = this.f1975c;
        this.f1978m = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f1976f.c();
        this.f1976f.c();
        y0.a e10 = this.f1976f.e();
        int a10 = e10.a(12);
        short s10 = (short) ((a10 != 0 ? e10.f18382b.getShort(a10 + e10.f18381a) : (short) 0) * this.f1978m);
        this.f1977j = s10;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f1975c;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s10;
    }
}
