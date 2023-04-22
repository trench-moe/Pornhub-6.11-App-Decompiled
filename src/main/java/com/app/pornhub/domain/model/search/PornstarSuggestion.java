package com.app.pornhub.domain.model.search;

import a0.a;
import android.support.v4.media.b;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/app/pornhub/domain/model/search/PornstarSuggestion;", BuildConfig.FLAVOR, "slug", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.NAME, "rank", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getRank", "getSlug", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PornstarSuggestion {
    private final String name;
    private final String rank;
    private final String slug;

    public PornstarSuggestion(String str, String str2, String str3) {
        a.u(str, "slug", str2, AppMeasurementSdk.ConditionalUserProperty.NAME, str3, "rank");
        this.slug = str;
        this.name = str2;
        this.rank = str3;
    }

    public static /* synthetic */ PornstarSuggestion copy$default(PornstarSuggestion pornstarSuggestion, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pornstarSuggestion.slug;
        }
        if ((i10 & 2) != 0) {
            str2 = pornstarSuggestion.name;
        }
        if ((i10 & 4) != 0) {
            str3 = pornstarSuggestion.rank;
        }
        return pornstarSuggestion.copy(str, str2, str3);
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

    public final PornstarSuggestion copy(String slug, String name, String rank) {
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(rank, "rank");
        return new PornstarSuggestion(slug, name, rank);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PornstarSuggestion) {
            PornstarSuggestion pornstarSuggestion = (PornstarSuggestion) obj;
            return Intrinsics.areEqual(this.slug, pornstarSuggestion.slug) && Intrinsics.areEqual(this.name, pornstarSuggestion.name) && Intrinsics.areEqual(this.rank, pornstarSuggestion.rank);
        }
        return false;
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
        return this.rank.hashCode() + a1.a.b(this.name, this.slug.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("PornstarSuggestion(slug=");
        m10.append(this.slug);
        m10.append(", name=");
        m10.append(this.name);
        m10.append(", rank=");
        return b.l(m10, this.rank, ')');
    }
}
