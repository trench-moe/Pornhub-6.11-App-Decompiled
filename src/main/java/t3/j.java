package t3;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends UnderlineSpan {
    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setUnderlineText(false);
    }
}
