package com.app.pornhub.data.model.sections;

import a1.a;
import com.app.pornhub.data.model.pornstar.PerformerModel;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/app/pornhub/data/model/sections/PerformerContainerModel;", BuildConfig.FLAVOR, "title", BuildConfig.FLAVOR, "performers", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/pornstar/PerformerModel;", "(Ljava/lang/String;Ljava/util/List;)V", "getPerformers", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PerformerContainerModel {
    private final List<PerformerModel> performers;
    private final String title;

    public PerformerContainerModel(String title, List<PerformerModel> performers) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(performers, "performers");
        this.title = title;
        this.performers = performers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerformerContainerModel copy$default(PerformerContainerModel performerContainerModel, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = performerContainerModel.title;
        }
        if ((i10 & 2) != 0) {
            list = performerContainerModel.performers;
        }
        return performerContainerModel.copy(str, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List<PerformerModel> component2() {
        return this.performers;
    }

    public final PerformerContainerModel copy(String title, List<PerformerModel> performers) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(performers, "performers");
        return new PerformerContainerModel(title, performers);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerformerContainerModel) {
            PerformerContainerModel performerContainerModel = (PerformerContainerModel) obj;
            return Intrinsics.areEqual(this.title, performerContainerModel.title) && Intrinsics.areEqual(this.performers, performerContainerModel.performers);
        }
        return false;
    }

    public final List<PerformerModel> getPerformers() {
        return this.performers;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.performers.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("PerformerContainerModel(title=");
        m10.append(this.title);
        m10.append(", performers=");
        return android.support.v4.media.a.k(m10, this.performers, ')');
    }
}
