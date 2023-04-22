package com.google.firebase.installations.local;

import com.appsflyer.oaid.BuildConfig;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.b;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends com.google.firebase.installations.local.b {

    /* renamed from: b  reason: collision with root package name */
    public final String f8069b;

    /* renamed from: c  reason: collision with root package name */
    public final PersistedInstallation.RegistrationStatus f8070c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8071e;

    /* renamed from: f  reason: collision with root package name */
    public final long f8072f;

    /* renamed from: g  reason: collision with root package name */
    public final long f8073g;

    /* renamed from: h  reason: collision with root package name */
    public final String f8074h;

    /* loaded from: classes.dex */
    public static final class b extends b.a {

        /* renamed from: a  reason: collision with root package name */
        public String f8075a;

        /* renamed from: b  reason: collision with root package name */
        public PersistedInstallation.RegistrationStatus f8076b;

        /* renamed from: c  reason: collision with root package name */
        public String f8077c;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public Long f8078e;

        /* renamed from: f  reason: collision with root package name */
        public Long f8079f;

        /* renamed from: g  reason: collision with root package name */
        public String f8080g;

        public b() {
        }

        public b(com.google.firebase.installations.local.b bVar, C0103a c0103a) {
            a aVar = (a) bVar;
            this.f8075a = aVar.f8069b;
            this.f8076b = aVar.f8070c;
            this.f8077c = aVar.d;
            this.d = aVar.f8071e;
            this.f8078e = Long.valueOf(aVar.f8072f);
            this.f8079f = Long.valueOf(aVar.f8073g);
            this.f8080g = aVar.f8074h;
        }

        @Override // com.google.firebase.installations.local.b.a
        public com.google.firebase.installations.local.b a() {
            String str = this.f8076b == null ? " registrationStatus" : BuildConfig.FLAVOR;
            if (this.f8078e == null) {
                str = a1.a.l(str, " expiresInSecs");
            }
            if (this.f8079f == null) {
                str = a1.a.l(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.f8075a, this.f8076b, this.f8077c, this.d, this.f8078e.longValue(), this.f8079f.longValue(), this.f8080g, null);
            }
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }

        @Override // com.google.firebase.installations.local.b.a
        public b.a b(PersistedInstallation.RegistrationStatus registrationStatus) {
            Objects.requireNonNull(registrationStatus, "Null registrationStatus");
            this.f8076b = registrationStatus;
            return this;
        }

        public b.a c(long j10) {
            this.f8078e = Long.valueOf(j10);
            return this;
        }

        public b.a d(long j10) {
            this.f8079f = Long.valueOf(j10);
            return this;
        }
    }

    public a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j10, long j11, String str4, C0103a c0103a) {
        this.f8069b = str;
        this.f8070c = registrationStatus;
        this.d = str2;
        this.f8071e = str3;
        this.f8072f = j10;
        this.f8073g = j11;
        this.f8074h = str4;
    }

    @Override // com.google.firebase.installations.local.b
    public String a() {
        return this.d;
    }

    @Override // com.google.firebase.installations.local.b
    public long b() {
        return this.f8072f;
    }

    @Override // com.google.firebase.installations.local.b
    public String c() {
        return this.f8069b;
    }

    @Override // com.google.firebase.installations.local.b
    public String d() {
        return this.f8074h;
    }

    @Override // com.google.firebase.installations.local.b
    public String e() {
        return this.f8071e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r1.equals(r12.c()) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r1.equals(r12.a()) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r7 = r11
            r9 = 1
            r0 = r9
            if (r12 != r7) goto L7
            r9 = 6
            return r0
        L7:
            boolean r1 = r12 instanceof com.google.firebase.installations.local.b
            r2 = 0
            if (r1 == 0) goto L9b
            com.google.firebase.installations.local.b r12 = (com.google.firebase.installations.local.b) r12
            r9 = 1
            java.lang.String r1 = r7.f8069b
            r9 = 3
            if (r1 != 0) goto L1d
            r10 = 2
            java.lang.String r1 = r12.c()
            if (r1 != 0) goto L98
            r9 = 5
            goto L29
        L1d:
            java.lang.String r9 = r12.c()
            r3 = r9
            boolean r10 = r1.equals(r3)
            r1 = r10
            if (r1 == 0) goto L98
        L29:
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = r7.f8070c
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = r12.f()
            boolean r9 = r1.equals(r3)
            r1 = r9
            if (r1 == 0) goto L98
            r9 = 4
            java.lang.String r1 = r7.d
            r10 = 2
            if (r1 != 0) goto L46
            r9 = 1
            java.lang.String r10 = r12.a()
            r1 = r10
            if (r1 != 0) goto L98
            r9 = 4
            goto L51
        L46:
            java.lang.String r10 = r12.a()
            r3 = r10
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L98
        L51:
            java.lang.String r1 = r7.f8071e
            if (r1 != 0) goto L5c
            java.lang.String r1 = r12.e()
            if (r1 != 0) goto L98
            goto L67
        L5c:
            r9 = 3
            java.lang.String r3 = r12.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L98
        L67:
            long r3 = r7.f8072f
            long r5 = r12.b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r10 = 4
            if (r1 != 0) goto L98
            r9 = 1
            long r3 = r7.f8073g
            long r5 = r12.g()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L98
            r10 = 4
            java.lang.String r1 = r7.f8074h
            if (r1 != 0) goto L8b
            r9 = 7
            java.lang.String r12 = r12.d()
            if (r12 != 0) goto L98
            r9 = 5
            goto L9a
        L8b:
            java.lang.String r12 = r12.d()
            boolean r10 = r1.equals(r12)
            r12 = r10
            if (r12 == 0) goto L98
            r9 = 6
            goto L9a
        L98:
            r0 = 0
            r9 = 6
        L9a:
            return r0
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.local.a.equals(java.lang.Object):boolean");
    }

    @Override // com.google.firebase.installations.local.b
    public PersistedInstallation.RegistrationStatus f() {
        return this.f8070c;
    }

    @Override // com.google.firebase.installations.local.b
    public long g() {
        return this.f8073g;
    }

    public int hashCode() {
        String str = this.f8069b;
        int i10 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f8070c.hashCode()) * 1000003;
        String str2 = this.d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8071e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f8072f;
        long j11 = this.f8073g;
        int i11 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f8074h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i11 ^ i10;
    }

    @Override // com.google.firebase.installations.local.b
    public b.a j() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("PersistedInstallationEntry{firebaseInstallationId=");
        m10.append(this.f8069b);
        m10.append(", registrationStatus=");
        m10.append(this.f8070c);
        m10.append(", authToken=");
        m10.append(this.d);
        m10.append(", refreshToken=");
        m10.append(this.f8071e);
        m10.append(", expiresInSecs=");
        m10.append(this.f8072f);
        m10.append(", tokenCreationEpochInSecs=");
        m10.append(this.f8073g);
        m10.append(", fisError=");
        return android.support.v4.media.b.m(m10, this.f8074h, "}");
    }
}
