package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ClientInfo;

/* loaded from: classes.dex */
public final class c extends ClientInfo {

    /* renamed from: a  reason: collision with root package name */
    public final ClientInfo.ClientType f5951a;

    /* renamed from: b  reason: collision with root package name */
    public final k6.a f5952b;

    public c(ClientInfo.ClientType clientType, k6.a aVar, a aVar2) {
        this.f5951a = clientType;
        this.f5952b = aVar;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public k6.a a() {
        return this.f5952b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public ClientInfo.ClientType b() {
        return this.f5951a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r1.equals(r9.b()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r4 = r8
            r7 = 1
            r0 = r7
            if (r9 != r4) goto L7
            r7 = 3
            return r0
        L7:
            r6 = 4
            boolean r1 = r9 instanceof com.google.android.datatransport.cct.internal.ClientInfo
            r6 = 7
            r2 = 0
            r7 = 4
            if (r1 == 0) goto L48
            r7 = 6
            com.google.android.datatransport.cct.internal.ClientInfo r9 = (com.google.android.datatransport.cct.internal.ClientInfo) r9
            com.google.android.datatransport.cct.internal.ClientInfo$ClientType r1 = r4.f5951a
            if (r1 != 0) goto L1f
            r7 = 2
            com.google.android.datatransport.cct.internal.ClientInfo$ClientType r1 = r9.b()
            if (r1 != 0) goto L44
            r6 = 3
            goto L2a
        L1f:
            com.google.android.datatransport.cct.internal.ClientInfo$ClientType r3 = r9.b()
            boolean r6 = r1.equals(r3)
            r1 = r6
            if (r1 == 0) goto L44
        L2a:
            k6.a r1 = r4.f5952b
            r7 = 4
            if (r1 != 0) goto L37
            r7 = 5
            k6.a r9 = r9.a()
            if (r9 != 0) goto L44
            goto L47
        L37:
            k6.a r7 = r9.a()
            r9 = r7
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L44
            r7 = 5
            goto L47
        L44:
            r6 = 2
            r7 = 0
            r0 = r7
        L47:
            return r0
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.internal.c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ClientInfo.ClientType clientType = this.f5951a;
        int i10 = 0;
        int hashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        k6.a aVar = this.f5952b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ClientInfo{clientType=");
        m10.append(this.f5951a);
        m10.append(", androidClientInfo=");
        m10.append(this.f5952b);
        m10.append("}");
        return m10.toString();
    }
}
