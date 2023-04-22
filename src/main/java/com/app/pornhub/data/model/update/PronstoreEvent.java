package com.app.pornhub.data.model.update;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.f;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/app/pornhub/data/model/update/PronstoreEvent;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "status", BuildConfig.FLAVOR, "version", "deviceId", BuildConfig.FLAVOR, "(JIILjava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getId", "()J", "getStatus", "()I", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PronstoreEvent {
    private final String deviceId;

    /* renamed from: id  reason: collision with root package name */
    private final long f4346id;
    private final int status;
    private final int version;

    public PronstoreEvent(long j10, int i10, int i11, @f(name = "device_id") String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.f4346id = j10;
        this.status = i10;
        this.version = i11;
        this.deviceId = deviceId;
    }

    public /* synthetic */ PronstoreEvent(long j10, int i10, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? -1L : j10, i10, (i12 & 4) != 0 ? 2359 : i11, str);
    }

    public static /* synthetic */ PronstoreEvent copy$default(PronstoreEvent pronstoreEvent, long j10, int i10, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j10 = pronstoreEvent.f4346id;
        }
        long j11 = j10;
        if ((i12 & 2) != 0) {
            i10 = pronstoreEvent.status;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = pronstoreEvent.version;
        }
        int i14 = i11;
        if ((i12 & 8) != 0) {
            str = pronstoreEvent.deviceId;
        }
        return pronstoreEvent.copy(j11, i13, i14, str);
    }

    public final long component1() {
        return this.f4346id;
    }

    public final int component2() {
        return this.status;
    }

    public final int component3() {
        return this.version;
    }

    public final String component4() {
        return this.deviceId;
    }

    public final PronstoreEvent copy(long j10, int i10, int i11, @f(name = "device_id") String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return new PronstoreEvent(j10, i10, i11, deviceId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PronstoreEvent) {
            PronstoreEvent pronstoreEvent = (PronstoreEvent) obj;
            if (this.f4346id == pronstoreEvent.f4346id && this.status == pronstoreEvent.status && this.version == pronstoreEvent.version && Intrinsics.areEqual(this.deviceId, pronstoreEvent.deviceId)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final long getId() {
        return this.f4346id;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        long j10 = this.f4346id;
        return this.deviceId.hashCode() + (((((((int) (j10 ^ (j10 >>> 32))) * 31) + this.status) * 31) + this.version) * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("PronstoreEvent(id=");
        m10.append(this.f4346id);
        m10.append(", status=");
        m10.append(this.status);
        m10.append(", version=");
        m10.append(this.version);
        m10.append(", deviceId=");
        return b.l(m10, this.deviceId, ')');
    }
}
