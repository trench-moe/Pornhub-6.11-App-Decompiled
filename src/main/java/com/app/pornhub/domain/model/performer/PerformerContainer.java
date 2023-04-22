package com.app.pornhub.domain.model.performer;

import android.support.v4.media.a;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/app/pornhub/domain/model/performer/PerformerContainer;", BuildConfig.FLAVOR, "performer", "Lcom/app/pornhub/domain/model/performer/Performer;", SearchSuggestionsConfig.sourceVideos, BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/video/VideoMetaData;", "orders", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "premium", "(Lcom/app/pornhub/domain/model/performer/Performer;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V", "getOrders", "()Ljava/util/Map;", "getPerformer", "()Lcom/app/pornhub/domain/model/performer/Performer;", "getPremium", "()Ljava/util/List;", "getVideos", "component1", "component2", "component3", "component4", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PerformerContainer {
    private final Map<String, String> orders;
    private final Performer performer;
    private final List<String> premium;
    private final List<VideoMetaData> videos;

    public PerformerContainer(Performer performer, List<VideoMetaData> videos, Map<String, String> orders, List<String> premium) {
        Intrinsics.checkNotNullParameter(performer, "performer");
        Intrinsics.checkNotNullParameter(videos, "videos");
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(premium, "premium");
        this.performer = performer;
        this.videos = videos;
        this.orders = orders;
        this.premium = premium;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerformerContainer copy$default(PerformerContainer performerContainer, Performer performer, List list, Map map, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            performer = performerContainer.performer;
        }
        if ((i10 & 2) != 0) {
            list = performerContainer.videos;
        }
        if ((i10 & 4) != 0) {
            map = performerContainer.orders;
        }
        if ((i10 & 8) != 0) {
            list2 = performerContainer.premium;
        }
        return performerContainer.copy(performer, list, map, list2);
    }

    public final Performer component1() {
        return this.performer;
    }

    public final List<VideoMetaData> component2() {
        return this.videos;
    }

    public final Map<String, String> component3() {
        return this.orders;
    }

    public final List<String> component4() {
        return this.premium;
    }

    public final PerformerContainer copy(Performer performer, List<VideoMetaData> videos, Map<String, String> orders, List<String> premium) {
        Intrinsics.checkNotNullParameter(performer, "performer");
        Intrinsics.checkNotNullParameter(videos, "videos");
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(premium, "premium");
        return new PerformerContainer(performer, videos, orders, premium);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerformerContainer) {
            PerformerContainer performerContainer = (PerformerContainer) obj;
            return Intrinsics.areEqual(this.performer, performerContainer.performer) && Intrinsics.areEqual(this.videos, performerContainer.videos) && Intrinsics.areEqual(this.orders, performerContainer.orders) && Intrinsics.areEqual(this.premium, performerContainer.premium);
        }
        return false;
    }

    public final Map<String, String> getOrders() {
        return this.orders;
    }

    public final Performer getPerformer() {
        return this.performer;
    }

    public final List<String> getPremium() {
        return this.premium;
    }

    public final List<VideoMetaData> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int b10 = a.b(this.videos, this.performer.hashCode() * 31, 31);
        return this.premium.hashCode() + ((this.orders.hashCode() + b10) * 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("PerformerContainer(performer=");
        m10.append(this.performer);
        m10.append(", videos=");
        m10.append(this.videos);
        m10.append(", orders=");
        m10.append(this.orders);
        m10.append(", premium=");
        return a.k(m10, this.premium, ')');
    }
}
