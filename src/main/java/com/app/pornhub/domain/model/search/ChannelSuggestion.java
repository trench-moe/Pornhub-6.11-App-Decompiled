package com.app.pornhub.domain.model.search;

import a0.a;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/app/pornhub/domain/model/search/ChannelSuggestion;", BuildConfig.FLAVOR, "slug", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.NAME, "rank", "id", BuildConfig.FLAVOR, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getRank", "getSlug", "component1", "component2", "component3", "component4", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelSuggestion {

    /* renamed from: id  reason: collision with root package name */
    private final int f4907id;
    private final String name;
    private final String rank;
    private final String slug;

    public ChannelSuggestion(String str, String str2, String str3, int i10) {
        a.u(str, "slug", str2, AppMeasurementSdk.ConditionalUserProperty.NAME, str3, "rank");
        this.slug = str;
        this.name = str2;
        this.rank = str3;
        this.f4907id = i10;
    }

    public static /* synthetic */ ChannelSuggestion copy$default(ChannelSuggestion channelSuggestion, String str, String str2, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = channelSuggestion.slug;
        }
        if ((i11 & 2) != 0) {
            str2 = channelSuggestion.name;
        }
        if ((i11 & 4) != 0) {
            str3 = channelSuggestion.rank;
        }
        if ((i11 & 8) != 0) {
            i10 = channelSuggestion.f4907id;
        }
        return channelSuggestion.copy(str, str2, str3, i10);
    }

    public final String component1() {
        return this.slug;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.rank;
    }

    public final int component4() {
        return this.f4907id;
    }

    public final ChannelSuggestion copy(String slug, String name, String rank, int i10) {
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(rank, "rank");
        return new ChannelSuggestion(slug, name, rank, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChannelSuggestion) {
            ChannelSuggestion channelSuggestion = (ChannelSuggestion) obj;
            return Intrinsics.areEqual(this.slug, channelSuggestion.slug) && Intrinsics.areEqual(this.name, channelSuggestion.name) && Intrinsics.areEqual(this.rank, channelSuggestion.rank) && this.f4907id == channelSuggestion.f4907id;
        }
        return false;
    }

    public final int getId() {
        return this.f4907id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRank() {
        return this.rank;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return a1.a.b(this.rank, a1.a.b(this.name, this.slug.hashCode() * 31, 31), 31) + this.f4907id;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ChannelSuggestion(slug=");
        m10.append(this.slug);
        m10.append(", name=");
        m10.append(this.name);
        m10.append(", rank=");
        m10.append(this.rank);
        m10.append(", id=");
        return android.support.v4.media.a.i(m10, this.f4907id, ')');
    }
}
