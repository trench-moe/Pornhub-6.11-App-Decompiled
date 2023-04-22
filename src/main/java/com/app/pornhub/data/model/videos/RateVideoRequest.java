package com.app.pornhub.data.model.videos;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/app/pornhub/data/model/videos/RateVideoRequest;", BuildConfig.FLAVOR, "vkey", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.VALUE, BuildConfig.FLAVOR, "(Ljava/lang/String;I)V", "getValue", "()I", "getVkey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RateVideoRequest {
    private final int value;
    private final String vkey;

    public RateVideoRequest(String vkey, int i10) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        this.vkey = vkey;
        this.value = i10;
    }

    public static /* synthetic */ RateVideoRequest copy$default(RateVideoRequest rateVideoRequest, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rateVideoRequest.vkey;
        }
        if ((i11 & 2) != 0) {
            i10 = rateVideoRequest.value;
        }
        return rateVideoRequest.copy(str, i10);
    }

    public final String component1() {
        return this.vkey;
    }

    public final int component2() {
        return this.value;
    }

    public final RateVideoRequest copy(String vkey, int i10) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        return new RateVideoRequest(vkey, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RateVideoRequest) {
            RateVideoRequest rateVideoRequest = (RateVideoRequest) obj;
            return Intrinsics.areEqual(this.vkey, rateVideoRequest.vkey) && this.value == rateVideoRequest.value;
        }
        return false;
    }

    public final int getValue() {
        return this.value;
    }

    public final String getVkey() {
        return this.vkey;
    }

    public int hashCode() {
        return (this.vkey.hashCode() * 31) + this.value;
    }

    public String toString() {
        StringBuilder m10 = a.m("RateVideoRequest(vkey=");
        m10.append(this.vkey);
        m10.append(", value=");
        return android.support.v4.media.a.i(m10, this.value, ')');
    }
}
