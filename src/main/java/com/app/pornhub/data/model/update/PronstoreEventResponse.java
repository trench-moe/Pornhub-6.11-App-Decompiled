package com.app.pornhub.data.model.update;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.f;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003JH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lcom/app/pornhub/data/model/update/PronstoreEventResponse;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "status", BuildConfig.FLAVOR, "version", "ip", BuildConfig.FLAVOR, "deviceId", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getId", "()J", "getIp", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVersion", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/app/pornhub/data/model/update/PronstoreEventResponse;", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PronstoreEventResponse {
    private final String deviceId;

    /* renamed from: id  reason: collision with root package name */
    private final long f4347id;
    private final String ip;
    private final Integer status;
    private final Integer version;

    public PronstoreEventResponse(long j10, Integer num, Integer num2, String str, @f(name = "device_id") String str2) {
        this.f4347id = j10;
        this.status = num;
        this.version = num2;
        this.ip = str;
        this.deviceId = str2;
    }

    public static /* synthetic */ PronstoreEventResponse copy$default(PronstoreEventResponse pronstoreEventResponse, long j10, Integer num, Integer num2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = pronstoreEventResponse.f4347id;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            num = pronstoreEventResponse.status;
        }
        Integer num3 = num;
        if ((i10 & 4) != 0) {
            num2 = pronstoreEventResponse.version;
        }
        Integer num4 = num2;
        if ((i10 & 8) != 0) {
            str = pronstoreEventResponse.ip;
        }
        String str3 = str;
        if ((i10 & 16) != 0) {
            str2 = pronstoreEventResponse.deviceId;
        }
        return pronstoreEventResponse.copy(j11, num3, num4, str3, str2);
    }

    public final long component1() {
        return this.f4347id;
    }

    public final Integer component2() {
        return this.status;
    }

    public final Integer component3() {
        return this.version;
    }

    public final String component4() {
        return this.ip;
    }

    public final String component5() {
        return this.deviceId;
    }

    public final PronstoreEventResponse copy(long j10, Integer num, Integer num2, String str, @f(name = "device_id") String str2) {
        return new PronstoreEventResponse(j10, num, num2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PronstoreEventResponse) {
            PronstoreEventResponse pronstoreEventResponse = (PronstoreEventResponse) obj;
            return this.f4347id == pronstoreEventResponse.f4347id && Intrinsics.areEqual(this.status, pronstoreEventResponse.status) && Intrinsics.areEqual(this.version, pronstoreEventResponse.version) && Intrinsics.areEqual(this.ip, pronstoreEventResponse.ip) && Intrinsics.areEqual(this.deviceId, pronstoreEventResponse.deviceId);
        }
        return false;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final long getId() {
        return this.f4347id;
    }

    public final String getIp() {
        return this.ip;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        long j10 = this.f4347id;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        Integer num = this.status;
        int i11 = 0;
        int hashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.version;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.ip;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceId;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        StringBuilder m10 = a.m("PronstoreEventResponse(id=");
        m10.append(this.f4347id);
        m10.append(", status=");
        m10.append(this.status);
        m10.append(", version=");
        m10.append(this.version);
        m10.append(", ip=");
        m10.append((Object) this.ip);
        m10.append(", deviceId=");
        m10.append((Object) this.deviceId);
        m10.append(')');
        return m10.toString();
    }
}
