package com.google.android.exoplayer2.ui;

/* loaded from: classes.dex */
public final class n {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(y7.a.b r10) {
        /*
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r10.f18536k = r0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6
            r10.f18535j = r0
            r9 = 4
            java.lang.CharSequence r0 = r10.f18527a
            r7 = 3
            boolean r1 = r0 instanceof android.text.Spanned
            r8 = 6
            if (r1 == 0) goto L5d
            r7 = 1
            boolean r1 = r0 instanceof android.text.Spannable
            r9 = 3
            if (r1 != 0) goto L21
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r0)
            r10.f18527a = r0
        L21:
            java.lang.CharSequence r10 = r10.f18527a
            r8 = 3
            java.util.Objects.requireNonNull(r10)
            android.text.Spannable r10 = (android.text.Spannable) r10
            int r6 = r10.length()
            r0 = r6
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r6 = 0
            r2 = r6
            java.lang.Object[] r0 = r10.getSpans(r2, r0, r1)
            int r1 = r0.length
            r9 = 2
            r6 = 0
            r3 = r6
        L3a:
            if (r3 >= r1) goto L5d
            r8 = 7
            r4 = r0[r3]
            r8 = 4
            boolean r5 = r4 instanceof android.text.style.AbsoluteSizeSpan
            r8 = 3
            if (r5 != 0) goto L4f
            boolean r5 = r4 instanceof android.text.style.RelativeSizeSpan
            if (r5 == 0) goto L4b
            r8 = 2
            goto L50
        L4b:
            r9 = 5
            r6 = 0
            r5 = r6
            goto L52
        L4f:
            r9 = 2
        L50:
            r5 = 1
            r8 = 4
        L52:
            if (r5 == 0) goto L58
            r10.removeSpan(r4)
            r7 = 3
        L58:
            r8 = 6
            int r3 = r3 + 1
            r9 = 5
            goto L3a
        L5d:
            r8 = 1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.n.a(y7.a$b):void");
    }

    public static float b(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else if (i10 != 1) {
            if (i10 != 2) {
                return -3.4028235E38f;
            }
            return f10;
        } else {
            f11 = i11;
        }
        return f10 * f11;
    }
}
