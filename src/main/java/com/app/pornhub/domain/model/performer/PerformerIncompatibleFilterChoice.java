package com.app.pornhub.domain.model.performer;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/app/pornhub/domain/model/performer/PerformerIncompatibleFilterChoice;", BuildConfig.FLAVOR, "option", BuildConfig.FLAVOR, "filterValues", BuildConfig.FLAVOR, "(Ljava/lang/String;Ljava/util/List;)V", "getFilterValues", "()Ljava/util/List;", "getOption", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PerformerIncompatibleFilterChoice {
    private final List<String> filterValues;
    private final String option;

    public PerformerIncompatibleFilterChoice(String option, List<String> filterValues) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(filterValues, "filterValues");
        this.option = option;
        this.filterValues = filterValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerformerIncompatibleFilterChoice copy$default(PerformerIncompatibleFilterChoice performerIncompatibleFilterChoice, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = performerIncompatibleFilterChoice.option;
        }
        if ((i10 & 2) != 0) {
            list = performerIncompatibleFilterChoice.filterValues;
        }
        return performerIncompatibleFilterChoice.copy(str, list);
    }

    public final String component1() {
        return this.option;
    }

    public final List<String> component2() {
        return this.filterValues;
    }

    public final PerformerIncompatibleFilterChoice copy(String option, List<String> filterValues) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(filterValues, "filterValues");
        return new PerformerIncompatibleFilterChoice(option, filterValues);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerformerIncompatibleFilterChoice) {
            PerformerIncompatibleFilterChoice performerIncompatibleFilterChoice = (PerformerIncompatibleFilterChoice) obj;
            return Intrinsics.areEqual(this.option, performerIncompatibleFilterChoice.option) && Intrinsics.areEqual(this.filterValues, performerIncompatibleFilterChoice.filterValues);
        }
        return false;
    }

    public final List<String> getFilterValues() {
        return this.filterValues;
    }

    public final String getOption() {
        return this.option;
    }

    public int hashCode() {
        return this.filterValues.hashCode() + (this.option.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("PerformerIncompatibleFilterChoice(option=");
        m10.append(this.option);
        m10.append(", filterValues=");
        return android.support.v4.media.a.k(m10, this.filterValues, ')');
    }
}
