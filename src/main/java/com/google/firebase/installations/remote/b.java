package com.google.firebase.installations.remote;

import com.appsflyer.oaid.BuildConfig;
import com.google.firebase.installations.remote.TokenResult;

/* loaded from: classes.dex */
public final class b extends TokenResult {

    /* renamed from: a  reason: collision with root package name */
    public final String f8093a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8094b;

    /* renamed from: c  reason: collision with root package name */
    public final TokenResult.ResponseCode f8095c;

    /* renamed from: com.google.firebase.installations.remote.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0105b extends TokenResult.a {

        /* renamed from: a  reason: collision with root package name */
        public String f8096a;

        /* renamed from: b  reason: collision with root package name */
        public Long f8097b;

        /* renamed from: c  reason: collision with root package name */
        public TokenResult.ResponseCode f8098c;

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public TokenResult a() {
            String str = this.f8097b == null ? " tokenExpirationTimestamp" : BuildConfig.FLAVOR;
            if (str.isEmpty()) {
                return new b(this.f8096a, this.f8097b.longValue(), this.f8098c, null);
            }
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public TokenResult.a b(long j10) {
            this.f8097b = Long.valueOf(j10);
            return this;
        }
    }

    public b(String str, long j10, TokenResult.ResponseCode responseCode, a aVar) {
        this.f8093a = str;
        this.f8094b = j10;
        this.f8095c = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.ResponseCode b() {
        return this.f8095c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public String c() {
        return this.f8093a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public long d() {
        return this.f8094b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TokenResult) {
            TokenResult tokenResult = (TokenResult) obj;
            String str = this.f8093a;
            if (str != null ? str.equals(tokenResult.c()) : tokenResult.c() == null) {
                if (this.f8094b == tokenResult.d()) {
                    TokenResult.ResponseCode responseCode = this.f8095c;
                    if (responseCode == null) {
                        if (tokenResult.b() == null) {
                            return true;
                        }
                    } else if (responseCode.equals(tokenResult.b())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8093a;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f8094b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f8095c;
        if (responseCode != null) {
            i10 = responseCode.hashCode();
        }
        return i11 ^ i10;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("TokenResult{token=");
        m10.append(this.f8093a);
        m10.append(", tokenExpirationTimestamp=");
        m10.append(this.f8094b);
        m10.append(", responseCode=");
        m10.append(this.f8095c);
        m10.append("}");
        return m10.toString();
    }
}
