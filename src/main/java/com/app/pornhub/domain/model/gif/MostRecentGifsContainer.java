package com.app.pornhub.domain.model.gif;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/app/pornhub/domain/model/gif/MostRecentGifsContainer;", BuildConfig.FLAVOR, "old", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/gif/GifMetaData;", "new", "(Ljava/util/List;Ljava/util/List;)V", "getNew", "()Ljava/util/List;", "getOld", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MostRecentGifsContainer {

    /* renamed from: new  reason: not valid java name */
    private final List<GifMetaData> f2new;
    private final List<GifMetaData> old;

    public MostRecentGifsContainer(List<GifMetaData> old, List<GifMetaData> list) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(list, "new");
        this.old = old;
        this.f2new = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MostRecentGifsContainer copy$default(MostRecentGifsContainer mostRecentGifsContainer, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = mostRecentGifsContainer.old;
        }
        if ((i10 & 2) != 0) {
            list2 = mostRecentGifsContainer.f2new;
        }
        return mostRecentGifsContainer.copy(list, list2);
    }

    public final List<GifMetaData> component1() {
        return this.old;
    }

    public final List<GifMetaData> component2() {
        return this.f2new;
    }

    public final MostRecentGifsContainer copy(List<GifMetaData> old, List<GifMetaData> list) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(list, "new");
        return new MostRecentGifsContainer(old, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MostRecentGifsContainer) {
            MostRecentGifsContainer mostRecentGifsContainer = (MostRecentGifsContainer) obj;
            return Intrinsics.areEqual(this.old, mostRecentGifsContainer.old) && Intrinsics.areEqual(this.f2new, mostRecentGifsContainer.f2new);
        }
        return false;
    }

    public final List<GifMetaData> getNew() {
        return this.f2new;
    }

    public final List<GifMetaData> getOld() {
        return this.old;
    }

    public int hashCode() {
        return this.f2new.hashCode() + (this.old.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("MostRecentGifsContainer(old=");
        m10.append(this.old);
        m10.append(", new=");
        return android.support.v4.media.a.k(m10, this.f2new, ')');
    }
}
