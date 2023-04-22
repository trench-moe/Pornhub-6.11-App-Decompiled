package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.InstallationResponse;

/* loaded from: classes.dex */
public final class a extends InstallationResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f8089a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8090b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8091c;
    public final TokenResult d;

    /* renamed from: e  reason: collision with root package name */
    public final InstallationResponse.ResponseCode f8092e;

    public a(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode, C0104a c0104a) {
        this.f8089a = str;
        this.f8090b = str2;
        this.f8091c = str3;
        this.d = tokenResult;
        this.f8092e = responseCode;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public TokenResult a() {
        return this.d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String b() {
        return this.f8090b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String c() {
        return this.f8091c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public InstallationResponse.ResponseCode d() {
        return this.f8092e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String e() {
        return this.f8089a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r8.e() == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r8.b() == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
        if (r1.equals(r8.a()) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r4 = r7
            r6 = 1
            r0 = r6
            if (r8 != r4) goto L7
            r6 = 2
            return r0
        L7:
            boolean r1 = r8 instanceof com.google.firebase.installations.remote.InstallationResponse
            r6 = 3
            r6 = 0
            r2 = r6
            if (r1 == 0) goto L98
            r6 = 1
            com.google.firebase.installations.remote.InstallationResponse r8 = (com.google.firebase.installations.remote.InstallationResponse) r8
            java.lang.String r1 = r4.f8089a
            if (r1 != 0) goto L1c
            java.lang.String r1 = r8.e()
            if (r1 != 0) goto L94
            goto L2a
        L1c:
            r6 = 6
            java.lang.String r6 = r8.e()
            r3 = r6
            boolean r6 = r1.equals(r3)
            r1 = r6
            if (r1 == 0) goto L94
            r6 = 7
        L2a:
            java.lang.String r1 = r4.f8090b
            r6 = 7
            if (r1 != 0) goto L37
            r6 = 6
            java.lang.String r1 = r8.b()
            if (r1 != 0) goto L94
            goto L43
        L37:
            java.lang.String r3 = r8.b()
            boolean r6 = r1.equals(r3)
            r1 = r6
            if (r1 == 0) goto L94
            r6 = 6
        L43:
            java.lang.String r1 = r4.f8091c
            r6 = 7
            if (r1 != 0) goto L52
            r6 = 1
            java.lang.String r6 = r8.c()
            r1 = r6
            if (r1 != 0) goto L94
            r6 = 3
            goto L5f
        L52:
            r6 = 1
            java.lang.String r6 = r8.c()
            r3 = r6
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L94
            r6 = 1
        L5f:
            com.google.firebase.installations.remote.TokenResult r1 = r4.d
            r6 = 6
            if (r1 != 0) goto L6d
            r6 = 1
            com.google.firebase.installations.remote.TokenResult r1 = r8.a()
            if (r1 != 0) goto L94
            r6 = 3
            goto L79
        L6d:
            r6 = 7
            com.google.firebase.installations.remote.TokenResult r6 = r8.a()
            r3 = r6
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L94
        L79:
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r1 = r4.f8092e
            if (r1 != 0) goto L86
            r6 = 3
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r6 = r8.d()
            r8 = r6
            if (r8 != 0) goto L94
            goto L97
        L86:
            r6 = 5
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r6 = r8.d()
            r8 = r6
            boolean r6 = r1.equals(r8)
            r8 = r6
            if (r8 == 0) goto L94
            goto L97
        L94:
            r6 = 1
            r0 = 0
            r6 = 3
        L97:
            return r0
        L98:
            r6 = 5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f8089a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f8090b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8091c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.d;
        int hashCode4 = (hashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f8092e;
        return hashCode4 ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("InstallationResponse{uri=");
        m10.append(this.f8089a);
        m10.append(", fid=");
        m10.append(this.f8090b);
        m10.append(", refreshToken=");
        m10.append(this.f8091c);
        m10.append(", authToken=");
        m10.append(this.d);
        m10.append(", responseCode=");
        m10.append(this.f8092e);
        m10.append("}");
        return m10.toString();
    }
}
