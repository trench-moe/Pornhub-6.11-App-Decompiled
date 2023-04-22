package com.app.pornhub.domain.model.photo;

import a1.a;
import android.support.v4.media.b;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0016\u001a\u00020\u0004J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/app/pornhub/domain/model/photo/AlbumFilters;", BuildConfig.FLAVOR, "segmentSelection", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "tag", BuildConfig.FLAVOR, "(Ljava/util/List;Ljava/lang/String;)V", "getSegmentSelection", "()Ljava/util/List;", "setSegmentSelection", "(Ljava/util/List;)V", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "getFiltersCount", "hashCode", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlbumFilters {
    private List<Integer> segmentSelection;
    private String tag;

    public AlbumFilters() {
        this(null, null, 3, null);
    }

    public AlbumFilters(List<Integer> list, String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.segmentSelection = list;
        this.tag = tag;
    }

    public /* synthetic */ AlbumFilters(List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? BuildConfig.FLAVOR : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlbumFilters copy$default(AlbumFilters albumFilters, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = albumFilters.segmentSelection;
        }
        if ((i10 & 2) != 0) {
            str = albumFilters.tag;
        }
        return albumFilters.copy(list, str);
    }

    public final List<Integer> component1() {
        return this.segmentSelection;
    }

    public final String component2() {
        return this.tag;
    }

    public final AlbumFilters copy(List<Integer> list, String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new AlbumFilters(list, tag);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlbumFilters) {
            AlbumFilters albumFilters = (AlbumFilters) obj;
            return Intrinsics.areEqual(this.segmentSelection, albumFilters.segmentSelection) && Intrinsics.areEqual(this.tag, albumFilters.tag);
        }
        return false;
    }

    public final int getFiltersCount() {
        return this.tag.length() > 0 ? 1 : 0;
    }

    public final List<Integer> getSegmentSelection() {
        return this.segmentSelection;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        List<Integer> list = this.segmentSelection;
        return this.tag.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final void setSegmentSelection(List<Integer> list) {
        this.segmentSelection = list;
    }

    public final void setTag(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tag = str;
    }

    public String toString() {
        StringBuilder m10 = a.m("AlbumFilters(segmentSelection=");
        m10.append(this.segmentSelection);
        m10.append(", tag=");
        return b.l(m10, this.tag, ')');
    }
}
