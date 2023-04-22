package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import b7.k;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements g {
    @Override // com.google.android.exoplayer2.drm.g
    public void a() {
    }

    @Override // com.google.android.exoplayer2.drm.g
    public Class<k> b() {
        return k.class;
    }

    @Override // com.google.android.exoplayer2.drm.g
    public Map<String, String> c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public b7.h d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public g.d e() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public byte[] f() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.g
    public void g(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public void h(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.g
    public void i(g.b bVar) {
    }

    @Override // com.google.android.exoplayer2.drm.g
    public byte[] j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public void k(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public g.a l(byte[] bArr, List<b.C0080b> list, int i10, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }
}
