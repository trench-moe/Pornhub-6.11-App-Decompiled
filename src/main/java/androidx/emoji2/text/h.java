package androidx.emoji2.text;

import android.text.TextPaint;
import android.util.SparseArray;
import androidx.emoji2.text.d;
import androidx.emoji2.text.m;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final d.i f1965a;

    /* renamed from: b  reason: collision with root package name */
    public final m f1966b;

    /* renamed from: c  reason: collision with root package name */
    public d.InterfaceC0027d f1967c;

    /* loaded from: classes.dex */
    public static class a implements d.InterfaceC0027d {

        /* renamed from: b  reason: collision with root package name */
        public static final ThreadLocal<StringBuilder> f1968b = new ThreadLocal<>();

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f1969a;

        public a() {
            TextPaint textPaint = new TextPaint();
            this.f1969a = textPaint;
            textPaint.setTextSize(10.0f);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1970a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final m.a f1971b;

        /* renamed from: c  reason: collision with root package name */
        public m.a f1972c;
        public m.a d;

        /* renamed from: e  reason: collision with root package name */
        public int f1973e;

        /* renamed from: f  reason: collision with root package name */
        public int f1974f;

        public b(m.a aVar, boolean z10, int[] iArr) {
            this.f1971b = aVar;
            this.f1972c = aVar;
        }

        public int a(int i10) {
            SparseArray<m.a> sparseArray = this.f1972c.f1995a;
            m.a aVar = sparseArray == null ? null : sparseArray.get(i10);
            int i11 = 3;
            if (this.f1970a == 2) {
                if (aVar != null) {
                    this.f1972c = aVar;
                    this.f1974f++;
                } else {
                    if (i10 == 65038) {
                        b();
                    } else {
                        if (!(i10 == 65039)) {
                            m.a aVar2 = this.f1972c;
                            if (aVar2.f1996b == null) {
                                b();
                            } else if (this.f1974f != 1) {
                                this.d = aVar2;
                                b();
                            } else if (c()) {
                                this.d = this.f1972c;
                                b();
                            } else {
                                b();
                            }
                        }
                    }
                    i11 = 1;
                }
                i11 = 2;
            } else if (aVar == null) {
                b();
                i11 = 1;
            } else {
                this.f1970a = 2;
                this.f1972c = aVar;
                this.f1974f = 1;
                i11 = 2;
            }
            this.f1973e = i10;
            return i11;
        }

        public final int b() {
            this.f1970a = 1;
            this.f1972c = this.f1971b;
            this.f1974f = 0;
            return 1;
        }

        public final boolean c() {
            y0.a e10 = this.f1972c.f1996b.e();
            int a10 = e10.a(6);
            if ((a10 == 0 || e10.f18382b.get(a10 + e10.f18381a) == 0) ? false : true) {
                return true;
            }
            return this.f1973e == 65039;
        }
    }

    public h(m mVar, d.i iVar, d.InterfaceC0027d interfaceC0027d, boolean z10, int[] iArr) {
        this.f1965a = iVar;
        this.f1966b = mVar;
        this.f1967c = interfaceC0027d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.text.Editable r10, android.view.KeyEvent r11, boolean r12) {
        /*
            r7 = r10
            int r11 = r11.getMetaState()
            boolean r9 = android.view.KeyEvent.metaStateHasNoModifiers(r11)
            r11 = r9
            r0 = 1
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r11 = r11 ^ r0
            r9 = 6
            r1 = 0
            if (r11 == 0) goto L13
            return r1
        L13:
            r9 = 2
            int r11 = android.text.Selection.getSelectionStart(r7)
            int r9 = android.text.Selection.getSelectionEnd(r7)
            r2 = r9
            r9 = -1
            r3 = r9
            if (r11 == r3) goto L2b
            r9 = 7
            if (r2 == r3) goto L2b
            r9 = 4
            if (r11 == r2) goto L28
            goto L2c
        L28:
            r9 = 3
            r3 = 0
            goto L2e
        L2b:
            r9 = 2
        L2c:
            r9 = 1
            r3 = r9
        L2e:
            if (r3 == 0) goto L31
            return r1
        L31:
            java.lang.Class<androidx.emoji2.text.i> r3 = androidx.emoji2.text.i.class
            java.lang.Object[] r2 = r7.getSpans(r11, r2, r3)
            androidx.emoji2.text.i[] r2 = (androidx.emoji2.text.i[]) r2
            if (r2 == 0) goto L6a
            int r3 = r2.length
            if (r3 <= 0) goto L6a
            r9 = 4
            int r3 = r2.length
            r9 = 1
            r9 = 0
            r4 = r9
        L43:
            if (r4 >= r3) goto L6a
            r9 = 7
            r5 = r2[r4]
            int r9 = r7.getSpanStart(r5)
            r6 = r9
            int r9 = r7.getSpanEnd(r5)
            r5 = r9
            if (r12 == 0) goto L57
            if (r6 == r11) goto L62
            r9 = 4
        L57:
            r9 = 7
            if (r12 != 0) goto L5c
            if (r5 == r11) goto L62
        L5c:
            if (r11 <= r6) goto L66
            r9 = 7
            if (r11 >= r5) goto L66
            r9 = 7
        L62:
            r7.delete(r6, r5)
            return r0
        L66:
            int r4 = r4 + 1
            r9 = 6
            goto L43
        L6a:
            r9 = 3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.h.a(android.text.Editable, android.view.KeyEvent, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.CharSequence r12, int r13, int r14, androidx.emoji2.text.g r15) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.h.b(java.lang.CharSequence, int, int, androidx.emoji2.text.g):boolean");
    }
}
