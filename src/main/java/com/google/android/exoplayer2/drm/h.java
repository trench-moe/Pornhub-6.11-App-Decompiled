package com.google.android.exoplayer2.drm;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.g;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import k8.c0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h implements g {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f6193a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaDrm f6194b;

    /* renamed from: c  reason: collision with root package name */
    public int f6195c;

    public h(UUID uuid) {
        UUID uuid2;
        Objects.requireNonNull(uuid);
        k8.a.d(!w6.g.f16589b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f6193a = uuid;
        MediaDrm mediaDrm = new MediaDrm((c0.f11939a >= 27 || !w6.g.f16590c.equals(uuid)) ? uuid : uuid2);
        this.f6194b = mediaDrm;
        this.f6195c = 1;
        if (w6.g.d.equals(uuid) && "ASUS_Z00AD".equals(c0.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // com.google.android.exoplayer2.drm.g
    public synchronized void a() {
        int i10 = this.f6195c - 1;
        this.f6195c = i10;
        if (i10 == 0) {
            this.f6194b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.g
    public Class<b7.i> b() {
        return b7.i.class;
    }

    @Override // com.google.android.exoplayer2.drm.g
    public Map<String, String> c(byte[] bArr) {
        return this.f6194b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public b7.h d(byte[] bArr) {
        int i10 = c0.f11939a;
        boolean z10 = i10 < 21 && w6.g.d.equals(this.f6193a) && "L3".equals(this.f6194b.getPropertyString("securityLevel"));
        UUID uuid = this.f6193a;
        if (i10 < 27 && w6.g.f16590c.equals(uuid)) {
            uuid = w6.g.f16589b;
        }
        return new b7.i(uuid, bArr, z10);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public g.d e() {
        MediaDrm.ProvisionRequest provisionRequest = this.f6194b.getProvisionRequest();
        return new g.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.g
    public byte[] f() {
        return this.f6194b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public void g(byte[] bArr, byte[] bArr2) {
        this.f6194b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public void h(byte[] bArr) {
        this.f6194b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public void i(final g.b bVar) {
        this.f6194b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: b7.j
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                com.google.android.exoplayer2.drm.h hVar = com.google.android.exoplayer2.drm.h.this;
                g.b bVar2 = bVar;
                Objects.requireNonNull(hVar);
                DefaultDrmSessionManager.c cVar = ((DefaultDrmSessionManager.b) bVar2).f6161a.f6160x;
                Objects.requireNonNull(cVar);
                cVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.g
    public byte[] j(byte[] bArr, byte[] bArr2) {
        if (w6.g.f16590c.equals(this.f6193a) && c0.f11939a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(c0.l(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = c0.v(sb2.toString());
            } catch (JSONException e10) {
                String l10 = c0.l(bArr2);
                k8.a.i("ClearKeyUtil", l10.length() != 0 ? "Failed to adjust response data: ".concat(l10) : new String("Failed to adjust response data: "), e10);
            }
        }
        return this.f6194b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public void k(byte[] bArr) {
        this.f6194b.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0213, code lost:
        if ("AFTT".equals(r5) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0219, code lost:
        if (r1 != null) goto L38;
     */
    @Override // com.google.android.exoplayer2.drm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.drm.g.a l(byte[] r17, java.util.List<com.google.android.exoplayer2.drm.b.C0080b> r18, int r19, java.util.HashMap<java.lang.String, java.lang.String> r20) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.h.l(byte[], java.util.List, int, java.util.HashMap):com.google.android.exoplayer2.drm.g$a");
    }
}
