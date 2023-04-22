package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o extends i {
    public o(g gVar) {
        super(gVar);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Objects.requireNonNull(d.a());
        g gVar = this.f1976f;
        Typeface typeface = gVar.f1963b.d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i15 = gVar.f1962a * 2;
        canvas.drawText(gVar.f1963b.f1993b, i15, 2, f10, i13, paint);
        paint.setTypeface(typeface2);
    }
}
