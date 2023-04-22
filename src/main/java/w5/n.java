package w5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final Set<z5.c> f16415a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final Set<z5.c> f16416b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public boolean f16417c;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        r5.clear();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(z5.c r5) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String r3 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            if (r5 != 0) goto L6
            return r0
        L6:
            java.util.Set<z5.c> r1 = r4.f16415a
            r3 = 1
            boolean r3 = r1.remove(r5)
            r1 = r3
            java.util.Set<z5.c> r2 = r4.f16416b
            r3 = 3
            boolean r3 = r2.remove(r5)
            r2 = r3
            if (r2 != 0) goto L1f
            r3 = 7
            if (r1 == 0) goto L1d
            r3 = 1
            goto L1f
        L1d:
            r0 = 0
            r3 = 5
        L1f:
            if (r0 == 0) goto L24
            r5.clear()
        L24:
            r3 = 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.n.a(z5.c):boolean");
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f16415a.size() + ", isPaused=" + this.f16417c + "}";
    }
}
