package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends BackendResponse {

    /* renamed from: a  reason: collision with root package name */
    public final BackendResponse.Status f5959a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5960b;

    public a(BackendResponse.Status status, long j10) {
        Objects.requireNonNull(status, "Null status");
        this.f5959a = status;
        this.f5960b = j10;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long b() {
        return this.f5960b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status c() {
        return this.f5959a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BackendResponse) {
            BackendResponse backendResponse = (BackendResponse) obj;
            return this.f5959a.equals(backendResponse.c()) && this.f5960b == backendResponse.b();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f5960b;
        return ((this.f5959a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("BackendResponse{status=");
        m10.append(this.f5959a);
        m10.append(", nextRequestWaitMillis=");
        m10.append(this.f5960b);
        m10.append("}");
        return m10.toString();
    }
}
