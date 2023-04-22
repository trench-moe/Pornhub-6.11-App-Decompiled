package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.c;
import java.util.UUID;

/* loaded from: classes.dex */
public final class f implements DrmSession {

    /* renamed from: a  reason: collision with root package name */
    public final DrmSession.DrmSessionException f6188a;

    public f(DrmSession.DrmSessionException drmSessionException) {
        this.f6188a = drmSessionException;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void a(c.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void b(c.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID c() {
        return w6.g.f16588a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean d() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public b7.h e() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public DrmSession.DrmSessionException getError() {
        return this.f6188a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
        return 1;
    }
}
