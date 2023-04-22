package com.app.pornhub.data.model.sections;

import a1.a;
import com.app.pornhub.data.model.dvds.DvdModel;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/app/pornhub/data/model/sections/DvdContainerModel;", BuildConfig.FLAVOR, "title", BuildConfig.FLAVOR, "dvds", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/dvds/DvdModel;", "(Ljava/lang/String;Ljava/util/List;)V", "getDvds", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DvdContainerModel {
    private final List<DvdModel> dvds;
    private final String title;

    public DvdContainerModel(String title, List<DvdModel> dvds) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dvds, "dvds");
        this.title = title;
        this.dvds = dvds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DvdContainerModel copy$default(DvdContainerModel dvdContainerModel, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dvdContainerModel.title;
        }
        if ((i10 & 2) != 0) {
            list = dvdContainerModel.dvds;
        }
        return dvdContainerModel.copy(str, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List<DvdModel> component2() {
        return this.dvds;
    }

    public final DvdContainerModel copy(String title, List<DvdModel> dvds) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dvds, "dvds");
        return new DvdContainerModel(title, dvds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DvdContainerModel) {
            DvdContainerModel dvdContainerModel = (DvdContainerModel) obj;
            if (Intrinsics.areEqual(this.title, dvdContainerModel.title) && Intrinsics.areEqual(this.dvds, dvdContainerModel.dvds)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List<DvdModel> getDvds() {
        return this.dvds;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.dvds.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("DvdContainerModel(title=");
        m10.append(this.title);
        m10.append(", dvds=");
        return android.support.v4.media.a.k(m10, this.dvds, ')');
    }
}
