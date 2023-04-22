package h9;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.api.Scope;
import d9.a;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class f<T extends IInterface> extends b<T> implements a.f {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Scope> f10311a;

    /* renamed from: b  reason: collision with root package name */
    public final Account f10312b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.content.Context r10, android.os.Looper r11, int r12, h9.c r13, e9.c r14, e9.i r15) {
        /*
            r9 = this;
            h9.g r3 = h9.g.a(r10)
            java.lang.Object r0 = c9.e.f3872c
            c9.e r4 = c9.e.d
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r14, r0)
            java.util.Objects.requireNonNull(r15, r0)
            h9.a0 r6 = new h9.a0
            r6.<init>(r14)
            h9.b0 r7 = new h9.b0
            r7.<init>(r15)
            java.lang.String r8 = r13.f10286f
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            android.accounts.Account r10 = r13.f10282a
            r9.f10312b = r10
            java.util.Set<com.google.android.gms.common.api.Scope> r10 = r13.f10284c
            java.util.Iterator r11 = r10.iterator()
        L2d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L48
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L40
            goto L2d
        L40:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L48:
            r9.f10311a = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.f.<init>(android.content.Context, android.os.Looper, int, h9.c, e9.c, e9.i):void");
    }

    @Override // d9.a.f
    public Set<Scope> a() {
        return requiresSignIn() ? this.f10311a : Collections.emptySet();
    }

    @Override // h9.b
    public final Account getAccount() {
        return this.f10312b;
    }

    @Override // h9.b
    public final Executor getBindServiceExecutor() {
        return null;
    }

    @Override // h9.b
    public final Set<Scope> getScopes() {
        return this.f10311a;
    }
}
