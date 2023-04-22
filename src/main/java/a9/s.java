package a9;

import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.h0;
import com.google.android.gms.common.api.ApiException;
import e9.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import u8.e1;
import u8.l0;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final b f309a;

    /* renamed from: b  reason: collision with root package name */
    public final String f310b;

    /* renamed from: c  reason: collision with root package name */
    public n f311c;
    public final List<q> d;

    public s(String str) {
        a.e(str);
        this.f310b = str;
        b bVar = new b("MediaControlChannel");
        this.f309a = bVar;
        if (!TextUtils.isEmpty(null)) {
            bVar.f256c = TextUtils.isEmpty(null) ? null : String.format("[%s] ", null);
        }
        this.d = Collections.synchronizedList(new ArrayList());
    }

    public final long a() {
        n nVar = this.f311c;
        if (nVar == null) {
            b bVar = this.f309a;
            Log.e(bVar.f254a, bVar.e("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((w8.t) nVar).f17043b.getAndIncrement();
    }

    public final void b(String str, final long j10, String str2) {
        n nVar = this.f311c;
        if (nVar == null) {
            b bVar = this.f309a;
            Log.e(bVar.f254a, bVar.e("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        String str3 = this.f310b;
        final w8.t tVar = (w8.t) nVar;
        e1 e1Var = tVar.f17042a;
        if (e1Var == null) {
            throw new IllegalStateException("Device is not connected");
        }
        l0 l0Var = (l0) e1Var;
        a.e(str3);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str.length() > 524288) {
            b bVar2 = l0.G;
            Log.w(bVar2.f254a, bVar2.e("Message send failed. Message exceeds maximum size", new Object[0]));
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        m.a aVar = new m.a();
        aVar.f9224a = new h0(l0Var, str3, str, 4);
        aVar.d = 8405;
        Object b10 = l0Var.b(1, aVar.a());
        ea.d dVar = new ea.d() { // from class: w8.s
            @Override // ea.d
            public final void q(Exception exc) {
                t tVar2 = t.this;
                long j11 = j10;
                int i10 = exc instanceof ApiException ? ((ApiException) exc).mStatus.f6859f : 13;
                for (a9.q qVar : tVar2.f17044c.f17010c.d) {
                    qVar.b(j11, i10, null);
                }
            }
        };
        ea.u uVar = (ea.u) b10;
        Objects.requireNonNull(uVar);
        uVar.c(ea.i.f9274a, dVar);
    }
}
