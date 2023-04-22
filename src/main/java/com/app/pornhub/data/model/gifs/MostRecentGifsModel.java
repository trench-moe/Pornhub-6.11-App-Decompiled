package com.app.pornhub.data.model.gifs;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/app/pornhub/data/model/gifs/MostRecentGifsModel;", BuildConfig.FLAVOR, "old", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/gifs/GifModel;", "new", "(Ljava/util/List;Ljava/util/List;)V", "getNew", "()Ljava/util/List;", "getOld", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MostRecentGifsModel {

    /* renamed from: new  reason: not valid java name */
    private final List<GifModel> f1new;
    private final List<GifModel> old;

    public MostRecentGifsModel(List<GifModel> list, List<GifModel> list2) {
        this.old = list;
        this.f1new = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MostRecentGifsModel copy$default(MostRecentGifsModel mostRecentGifsModel, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = mostRecentGifsModel.old;
        }
        if ((i10 & 2) != 0) {
            list2 = mostRecentGifsModel.f1new;
        }
        return mostRecentGifsModel.copy(list, list2);
    }

    public final List<GifModel> component1() {
        return this.old;
    }

    public final List<GifModel> component2() {
        return this.f1new;
    }

    public final MostRecentGifsModel copy(List<GifModel> list, List<GifModel> list2) {
        return new MostRecentGifsModel(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MostRecentGifsModel) {
            MostRecentGifsModel mostRecentGifsModel = (MostRecentGifsModel) obj;
            return Intrinsics.areEqual(this.old, mostRecentGifsModel.old) && Intrinsics.areEqual(this.f1new, mostRecentGifsModel.f1new);
        }
        return false;
    }

    public final List<GifModel> getNew() {
        return this.f1new;
    }

    public final List<GifModel> getOld() {
        return this.old;
    }

    public int hashCode() {
        List<GifModel> list = this.old;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<GifModel> list2 = this.f1new;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        StringBuilder m10 = a.m("MostRecentGifsModel(old=");
        m10.append(this.old);
        m10.append(", new=");
        return android.support.v4.media.a.k(m10, this.f1new, ')');
    }
}
