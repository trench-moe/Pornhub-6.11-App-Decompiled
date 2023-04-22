package com.app.pornhub.domain.model.channel;

import a1.a;
import android.support.v4.media.b;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/app/pornhub/domain/model/channel/Channel;", BuildConfig.FLAVOR, "channelMetaData", "Lcom/app/pornhub/domain/model/channel/ChannelMetaData;", "username", BuildConfig.FLAVOR, "joinChannelLink", "website", "joined", "about", "(Lcom/app/pornhub/domain/model/channel/ChannelMetaData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAbout", "()Ljava/lang/String;", "getChannelMetaData", "()Lcom/app/pornhub/domain/model/channel/ChannelMetaData;", "getJoinChannelLink", "getJoined", "getUsername", "getWebsite", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Channel {
    private final String about;
    private final ChannelMetaData channelMetaData;
    private final String joinChannelLink;
    private final String joined;
    private final String username;
    private final String website;

    public Channel(ChannelMetaData channelMetaData, String username, String joinChannelLink, String website, String joined, String about) {
        Intrinsics.checkNotNullParameter(channelMetaData, "channelMetaData");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(joinChannelLink, "joinChannelLink");
        Intrinsics.checkNotNullParameter(website, "website");
        Intrinsics.checkNotNullParameter(joined, "joined");
        Intrinsics.checkNotNullParameter(about, "about");
        this.channelMetaData = channelMetaData;
        this.username = username;
        this.joinChannelLink = joinChannelLink;
        this.website = website;
        this.joined = joined;
        this.about = about;
    }

    public static /* synthetic */ Channel copy$default(Channel channel, ChannelMetaData channelMetaData, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            channelMetaData = channel.channelMetaData;
        }
        if ((i10 & 2) != 0) {
            str = channel.username;
        }
        String str6 = str;
        if ((i10 & 4) != 0) {
            str2 = channel.joinChannelLink;
        }
        String str7 = str2;
        if ((i10 & 8) != 0) {
            str3 = channel.website;
        }
        String str8 = str3;
        if ((i10 & 16) != 0) {
            str4 = channel.joined;
        }
        String str9 = str4;
        if ((i10 & 32) != 0) {
            str5 = channel.about;
        }
        return channel.copy(channelMetaData, str6, str7, str8, str9, str5);
    }

    public final ChannelMetaData component1() {
        return this.channelMetaData;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.joinChannelLink;
    }

    public final String component4() {
        return this.website;
    }

    public final String component5() {
        return this.joined;
    }

    public final String component6() {
        return this.about;
    }

    public final Channel copy(ChannelMetaData channelMetaData, String username, String joinChannelLink, String website, String joined, String about) {
        Intrinsics.checkNotNullParameter(channelMetaData, "channelMetaData");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(joinChannelLink, "joinChannelLink");
        Intrinsics.checkNotNullParameter(website, "website");
        Intrinsics.checkNotNullParameter(joined, "joined");
        Intrinsics.checkNotNullParameter(about, "about");
        return new Channel(channelMetaData, username, joinChannelLink, website, joined, about);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Channel) {
            Channel channel = (Channel) obj;
            return Intrinsics.areEqual(this.channelMetaData, channel.channelMetaData) && Intrinsics.areEqual(this.username, channel.username) && Intrinsics.areEqual(this.joinChannelLink, channel.joinChannelLink) && Intrinsics.areEqual(this.website, channel.website) && Intrinsics.areEqual(this.joined, channel.joined) && Intrinsics.areEqual(this.about, channel.about);
        }
        return false;
    }

    public final String getAbout() {
        return this.about;
    }

    public final ChannelMetaData getChannelMetaData() {
        return this.channelMetaData;
    }

    public final String getJoinChannelLink() {
        return this.joinChannelLink;
    }

    public final String getJoined() {
        return this.joined;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        return this.about.hashCode() + a.b(this.joined, a.b(this.website, a.b(this.joinChannelLink, a.b(this.username, this.channelMetaData.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("Channel(channelMetaData=");
        m10.append(this.channelMetaData);
        m10.append(", username=");
        m10.append(this.username);
        m10.append(", joinChannelLink=");
        m10.append(this.joinChannelLink);
        m10.append(", website=");
        m10.append(this.website);
        m10.append(", joined=");
        m10.append(this.joined);
        m10.append(", about=");
        return b.l(m10, this.about, ')');
    }
}
