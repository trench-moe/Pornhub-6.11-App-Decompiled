package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* loaded from: classes.dex */
public final class d extends NetworkConnectionInfo {

    /* renamed from: a  reason: collision with root package name */
    public final NetworkConnectionInfo.NetworkType f5953a;

    /* renamed from: b  reason: collision with root package name */
    public final NetworkConnectionInfo.MobileSubtype f5954b;

    public d(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype, a aVar) {
        this.f5953a = networkType;
        this.f5954b = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public NetworkConnectionInfo.MobileSubtype a() {
        return this.f5954b;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public NetworkConnectionInfo.NetworkType b() {
        return this.f5953a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r8.b() == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L5
            r6 = 1
            return r0
        L5:
            boolean r1 = r8 instanceof com.google.android.datatransport.cct.internal.NetworkConnectionInfo
            r5 = 3
            r4 = 0
            r2 = r4
            if (r1 == 0) goto L45
            r5 = 7
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r8 = (com.google.android.datatransport.cct.internal.NetworkConnectionInfo) r8
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r1 = r7.f5953a
            r5 = 1
            if (r1 != 0) goto L1b
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r1 = r8.b()
            if (r1 != 0) goto L41
            goto L27
        L1b:
            r5 = 3
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L41
            r5 = 6
        L27:
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r1 = r7.f5954b
            r5 = 6
            if (r1 != 0) goto L35
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r4 = r8.a()
            r8 = r4
            if (r8 != 0) goto L41
            r6 = 6
            goto L44
        L35:
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r4 = r8.a()
            r8 = r4
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L41
            goto L44
        L41:
            r6 = 6
            r4 = 0
            r0 = r4
        L44:
            return r0
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.internal.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.f5953a;
        int hashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f5954b;
        return hashCode ^ (mobileSubtype != null ? mobileSubtype.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("NetworkConnectionInfo{networkType=");
        m10.append(this.f5953a);
        m10.append(", mobileSubtype=");
        m10.append(this.f5954b);
        m10.append("}");
        return m10.toString();
    }
}
