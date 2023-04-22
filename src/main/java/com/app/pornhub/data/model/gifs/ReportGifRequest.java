package com.app.pornhub.data.model.gifs;

import a0.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/app/pornhub/data/model/gifs/ReportGifRequest;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "flagType", "reason", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFlagType", "()Ljava/lang/String;", "getId", "getReason", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReportGifRequest {
    private final String flagType;

    /* renamed from: id  reason: collision with root package name */
    private final String f4339id;
    private final String reason;

    public ReportGifRequest(String str, String str2, String str3) {
        a.u(str, "id", str2, "flagType", str3, "reason");
        this.f4339id = str;
        this.flagType = str2;
        this.reason = str3;
    }

    public static /* synthetic */ ReportGifRequest copy$default(ReportGifRequest reportGifRequest, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = reportGifRequest.f4339id;
        }
        if ((i10 & 2) != 0) {
            str2 = reportGifRequest.flagType;
        }
        if ((i10 & 4) != 0) {
            str3 = reportGifRequest.reason;
        }
        return reportGifRequest.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f4339id;
    }

    public final String component2() {
        return this.flagType;
    }

    public final String component3() {
        return this.reason;
    }

    public final ReportGifRequest copy(String id2, String flagType, String reason) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(flagType, "flagType");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new ReportGifRequest(id2, flagType, reason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReportGifRequest) {
            ReportGifRequest reportGifRequest = (ReportGifRequest) obj;
            return Intrinsics.areEqual(this.f4339id, reportGifRequest.f4339id) && Intrinsics.areEqual(this.flagType, reportGifRequest.flagType) && Intrinsics.areEqual(this.reason, reportGifRequest.reason);
        }
        return false;
    }

    public final String getFlagType() {
        return this.flagType;
    }

    public final String getId() {
        return this.f4339id;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode() + a1.a.b(this.flagType, this.f4339id.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ReportGifRequest(id=");
        m10.append(this.f4339id);
        m10.append(", flagType=");
        m10.append(this.flagType);
        m10.append(", reason=");
        return b.l(m10, this.reason, ')');
    }
}
