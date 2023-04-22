package x;

import android.os.Bundle;
import android.util.Log;
import com.app.pornhub.R;
import t9.o1;

/* loaded from: classes2.dex */
public class c implements tb.a, ec.a, o1 {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f17613c = {16842948, 16842987, 16842993, R.attr.fastScrollEnabled, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.layoutManager, R.attr.reverseLayout, R.attr.spanCount, R.attr.stackFromEnd};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f17614f = {R.attr.swipeRefreshLayoutProgressSpinnerBackgroundColor};

    /* renamed from: j  reason: collision with root package name */
    public static final o1 f17615j = new c();

    /* renamed from: m  reason: collision with root package name */
    public static final o1 f17616m = new c();
    public static final o1 n = new c();

    /* renamed from: t  reason: collision with root package name */
    public static final o1 f17617t = new c();

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f17618u = {R.attr.elevation};

    public /* synthetic */ c() {
    }

    public /* synthetic */ c(int i10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StackTraceElement[] a(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 0
            r3 = 1
            r4 = 7
            r4 = 0
            r5 = 1
            r5 = 0
            r6 = 1
        Lf:
            int r7 = r15.length
            if (r4 >= r7) goto L6c
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L59
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L28
            goto L39
        L28:
            r11 = 0
        L29:
            if (r11 >= r10) goto L3f
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L3c
        L39:
            r9 = 5
            r9 = 0
            goto L40
        L3c:
            int r11 = r11 + 1
            goto L29
        L3f:
            r9 = 1
        L40:
            if (r9 != 0) goto L43
            goto L59
        L43:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 30278(0x7646, float:4.2429E-41)
            r9 = 10
            if (r6 >= r9) goto L55
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L55:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L62
        L59:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r8 = r4
            r6 = 2
            r6 = 1
        L62:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Lf
        L6c:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L75
            return r0
        L75:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: x.c.a(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // tb.a
    public void f(String str, Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }
}
