package com.app.pornhub.data.model.channels;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.ErrorModel;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import java.util.Map;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/app/pornhub/data/model/channels/ChannelListResponse;", BuildConfig.FLAVOR, "channels", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/channels/ChannelModel;", "count", BuildConfig.FLAVOR, "orders", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(Ljava/util/List;ILjava/util/Map;Lcom/app/pornhub/data/model/ErrorModel;)V", "getChannels", "()Ljava/util/List;", "getCount", "()I", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "getOrders", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelListResponse {
    private final List<ChannelModel> channels;
    private final int count;
    private final ErrorModel error;
    private final Map<String, String> orders;

    public ChannelListResponse(List<ChannelModel> channels, int i10, Map<String, String> map, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(channels, "channels");
        this.channels = channels;
        this.count = i10;
        this.orders = map;
        this.error = errorModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelListResponse copy$default(ChannelListResponse channelListResponse, List list, int i10, Map map, ErrorModel errorModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = channelListResponse.channels;
        }
        if ((i11 & 2) != 0) {
            i10 = channelListResponse.count;
        }
        if ((i11 & 4) != 0) {
            map = channelListResponse.orders;
        }
        if ((i11 & 8) != 0) {
            errorModel = channelListResponse.error;
        }
        return channelListResponse.copy(list, i10, map, errorModel);
    }

    public final List<ChannelModel> component1() {
        return this.channels;
    }

    public final int component2() {
        return this.count;
    }

    public final Map<String, String> component3() {
        return this.orders;
    }

    public final ErrorModel component4() {
        return this.error;
    }

    public final ChannelListResponse copy(List<ChannelModel> channels, int i10, Map<String, String> map, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(channels, "channels");
        return new ChannelListResponse(channels, i10, map, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChannelListResponse) {
            ChannelListResponse channelListResponse = (ChannelListResponse) obj;
            if (Intrinsics.areEqual(this.channels, channelListResponse.channels) && this.count == channelListResponse.count && Intrinsics.areEqual(this.orders, channelListResponse.orders) && Intrinsics.areEqual(this.error, channelListResponse.error)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List<ChannelModel> getChannels() {
        return this.channels;
    }

    public final int getCount() {
        return this.count;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final Map<String, String> getOrders() {
        return this.orders;
    }

    public int hashCode() {
        int hashCode = ((this.channels.hashCode() * 31) + this.count) * 31;
        Map<String, String> map = this.orders;
        int i10 = 0;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        ErrorModel errorModel = this.error;
        if (errorModel != null) {
            i10 = errorModel.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        StringBuilder m10 = a.m("ChannelListResponse(channels=");
        m10.append(this.channels);
        m10.append(", count=");
        m10.append(this.count);
        m10.append(", orders=");
        m10.append(this.orders);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
