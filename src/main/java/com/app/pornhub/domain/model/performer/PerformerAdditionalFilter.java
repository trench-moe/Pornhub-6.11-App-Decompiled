package com.app.pornhub.domain.model.performer;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/app/pornhub/domain/model/performer/PerformerAdditionalFilter;", BuildConfig.FLAVOR, "title", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.VALUE, "options", BuildConfig.FLAVOR, "incompatibleChoice", "Lcom/app/pornhub/domain/model/performer/PerformerIncompatibleFilterChoice;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getIncompatibleChoice", "()Ljava/util/List;", "getOptions", "getTitle", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PerformerAdditionalFilter {
    private final List<PerformerIncompatibleFilterChoice> incompatibleChoice;
    private final List<String> options;
    private final String title;
    private final String value;

    public PerformerAdditionalFilter(String title, String value, List<String> options, List<PerformerIncompatibleFilterChoice> incompatibleChoice) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(incompatibleChoice, "incompatibleChoice");
        this.title = title;
        this.value = value;
        this.options = options;
        this.incompatibleChoice = incompatibleChoice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerformerAdditionalFilter copy$default(PerformerAdditionalFilter performerAdditionalFilter, String str, String str2, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = performerAdditionalFilter.title;
        }
        if ((i10 & 2) != 0) {
            str2 = performerAdditionalFilter.value;
        }
        if ((i10 & 4) != 0) {
            list = performerAdditionalFilter.options;
        }
        if ((i10 & 8) != 0) {
            list2 = performerAdditionalFilter.incompatibleChoice;
        }
        return performerAdditionalFilter.copy(str, str2, list, list2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.value;
    }

    public final List<String> component3() {
        return this.options;
    }

    public final List<PerformerIncompatibleFilterChoice> component4() {
        return this.incompatibleChoice;
    }

    public final PerformerAdditionalFilter copy(String title, String value, List<String> options, List<PerformerIncompatibleFilterChoice> incompatibleChoice) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(incompatibleChoice, "incompatibleChoice");
        return new PerformerAdditionalFilter(title, value, options, incompatibleChoice);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerformerAdditionalFilter) {
            PerformerAdditionalFilter performerAdditionalFilter = (PerformerAdditionalFilter) obj;
            if (Intrinsics.areEqual(this.title, performerAdditionalFilter.title) && Intrinsics.areEqual(this.value, performerAdditionalFilter.value) && Intrinsics.areEqual(this.options, performerAdditionalFilter.options) && Intrinsics.areEqual(this.incompatibleChoice, performerAdditionalFilter.incompatibleChoice)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List<PerformerIncompatibleFilterChoice> getIncompatibleChoice() {
        return this.incompatibleChoice;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.incompatibleChoice.hashCode() + a.b(this.options, a1.a.b(this.value, this.title.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("PerformerAdditionalFilter(title=");
        m10.append(this.title);
        m10.append(", value=");
        m10.append(this.value);
        m10.append(", options=");
        m10.append(this.options);
        m10.append(", incompatibleChoice=");
        return a.k(m10, this.incompatibleChoice, ')');
    }
}
