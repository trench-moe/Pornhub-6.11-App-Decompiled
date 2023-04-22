package le;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f12826a;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r0.equals("on") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r0.equals(com.appsflyer.oaid.BuildConfig.FLAVOR) != false) goto L21;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = a0.b.a0(r0)
            if (r0 == 0) goto L53
            int r1 = r0.hashCode()
            if (r1 == 0) goto L2a
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L21
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L33
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            r0 = 0
            goto L54
        L21:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            goto L53
        L2a:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            goto L53
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L53:
            r0 = 1
        L54:
            le.p.f12826a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: le.p.<clinit>():void");
    }

    public static final q0<?> a(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        q0<?> q0Var = null;
        if (continuation instanceof CoroutineStackFrame) {
            if (coroutineContext.get(r0.f12833c) != null) {
                CoroutineStackFrame coroutineStackFrame = (CoroutineStackFrame) continuation;
                while (true) {
                    if (!(coroutineStackFrame instanceof r) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
                        if (coroutineStackFrame instanceof q0) {
                            q0Var = (q0) coroutineStackFrame;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (q0Var != null) {
                    q0Var.f12830f = coroutineContext;
                    q0Var.f12831j = obj;
                }
                return q0Var;
            }
            return null;
        }
        return null;
    }
}
