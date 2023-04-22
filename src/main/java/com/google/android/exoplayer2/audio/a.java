package com.google.android.exoplayer2.audio;

import android.os.Handler;
import java.util.Objects;
import w6.y;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: com.google.android.exoplayer2.audio.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0078a {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f5989a;

        /* renamed from: b  reason: collision with root package name */
        public final a f5990b;

        public C0078a(Handler handler, a aVar) {
            if (aVar != null) {
                Objects.requireNonNull(handler);
            } else {
                handler = null;
            }
            this.f5989a = handler;
            this.f5990b = aVar;
        }

        public void a(z6.d dVar) {
            synchronized (dVar) {
            }
            Handler handler = this.f5989a;
            if (handler != null) {
                handler.post(new y6.g(this, dVar, 0));
            }
        }
    }

    void E(z6.d dVar);

    void Q(Exception exc);

    void S(long j10);

    void V(Exception exc);

    void a(boolean z10);

    @Deprecated
    void a0(y yVar);

    void e0(z6.d dVar);

    void f0(int i10, long j10, long j11);

    void o(y yVar, z6.e eVar);

    void x(String str);

    void y(String str, long j10, long j11);
}
