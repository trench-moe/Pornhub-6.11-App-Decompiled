package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.h1;
import java.io.IOException;
import java.util.logging.Logger;
import t9.j2;
import t9.w0;

/* loaded from: classes.dex */
public abstract class h1<MessageType extends h1<MessageType, BuilderType>, BuilderType extends t9.w0<MessageType, BuilderType>> implements j2 {
    public int zza = 0;

    public int a() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i10) {
        throw null;
    }

    @Override // t9.j2
    public final zzoe g() {
        try {
            l1 l1Var = (l1) this;
            int f10 = l1Var.f();
            zzoe zzoeVar = zzoe.f6957c;
            byte[] bArr = new byte[f10];
            Logger logger = j1.Q;
            i1 i1Var = new i1(bArr, 0, f10);
            l1Var.d(i1Var);
            if (i1Var.I0() == 0) {
                return new zzoc(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException(android.support.v4.media.b.n(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }
}
