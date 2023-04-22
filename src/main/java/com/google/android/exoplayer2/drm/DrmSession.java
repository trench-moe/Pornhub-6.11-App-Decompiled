package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.c;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes.dex */
public interface DrmSession {

    /* loaded from: classes.dex */
    public static class DrmSessionException extends IOException {
        public final int errorCode;

        public DrmSessionException(Throwable th, int i10) {
            super(th);
            this.errorCode = i10;
        }
    }

    void a(c.a aVar);

    void b(c.a aVar);

    UUID c();

    boolean d();

    b7.h e();

    DrmSessionException getError();

    int getState();
}
