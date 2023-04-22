package com.app.pornhub.domain.model.channel;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/app/pornhub/domain/model/channel/ChannelListContainer;", BuildConfig.FLAVOR, "channels", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/channel/ChannelMetaData;", "orders", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "(Ljava/util/List;Ljava/util/Map;)V", "getChannels", "()Ljava/util/List;", "getOrders", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelListContainer {
    private final List<ChannelMetaData> channels;
    private final Map<String, String> orders;

    public ChannelListContainer(List<ChannelMetaData> channels, Map<String, String> orders) {
        Intrinsics.checkNotNullParameter(channels, "channels");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.channels = channels;
        this.orders = orders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelListContainer copy$default(ChannelListContainer channelListContainer, List list, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = channelListContainer.channels;
        }
        if ((i10 & 2) != 0) {
            map = channelListContainer.orders;
        }
        return channelListContainer.copy(list, map);
    }

    public final List<ChannelMetaData> component1() {
        return this.channels;
    }

    public final Map<String, String> component2() {
        return this.orders;
    }

    public final ChannelListContainer copy(List<ChannelMetaData> channels, Map<String, String> orders) {
        Intrinsics.checkNotNullParameter(channels, "channels");
        Intrinsics.checkNotNullParameter(orders, "orders");
        return new ChannelListContainer(channels, orders);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChannelListContainer) {
            ChannelListContainer channelListContainer = (ChannelListContainer) obj;
            return Intrinsics.areEqual(this.channels, channelListContainer.channels) && Intrinsics.areEqual(this.orders, channelListContainer.orders);
        }
        return false;
    }

    public final List<ChannelMetaData> getChannels() {
        return this.channels;
    }

    public final Map<String, String> getOrders() {
        return this.orders;
    }

    public int hashCode() {
        return this.orders.hashCode() + (this.channels.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("ChannelListContainer(channels=");
        m10.append(this.channels);
        m10.append(", orders=");
        m10.append(this.orders);
        m10.append(')');
        return m10.toString();
    }
}
