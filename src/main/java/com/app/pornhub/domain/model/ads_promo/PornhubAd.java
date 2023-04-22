package com.app.pornhub.domain.model.ads_promo;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, d2 = {"Lcom/app/pornhub/domain/model/ads_promo/PornhubAd;", BuildConfig.FLAVOR, "spotId", BuildConfig.FLAVOR, "adId", "imgUrl", BuildConfig.FLAVOR, "link", "memberId", BuildConfig.FLAVOR, "campaignId", "(JJLjava/lang/String;Ljava/lang/String;IJ)V", "getAdId", "()J", "getCampaignId", "getImgUrl", "()Ljava/lang/String;", "getLink", "getMemberId", "()I", "getSpotId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PornhubAd {
    private final long adId;
    private final long campaignId;
    private final String imgUrl;
    private final String link;
    private final int memberId;
    private final long spotId;

    public PornhubAd(long j10, long j11, String imgUrl, String link, int i10, long j12) {
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        Intrinsics.checkNotNullParameter(link, "link");
        this.spotId = j10;
        this.adId = j11;
        this.imgUrl = imgUrl;
        this.link = link;
        this.memberId = i10;
        this.campaignId = j12;
    }

    public final long component1() {
        return this.spotId;
    }

    public final long component2() {
        return this.adId;
    }

    public final String component3() {
        return this.imgUrl;
    }

    public final String component4() {
        return this.link;
    }

    public final int component5() {
        return this.memberId;
    }

    public final long component6() {
        return this.campaignId;
    }

    public final PornhubAd copy(long j10, long j11, String imgUrl, String link, int i10, long j12) {
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        Intrinsics.checkNotNullParameter(link, "link");
        return new PornhubAd(j10, j11, imgUrl, link, i10, j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PornhubAd) {
            PornhubAd pornhubAd = (PornhubAd) obj;
            return this.spotId == pornhubAd.spotId && this.adId == pornhubAd.adId && Intrinsics.areEqual(this.imgUrl, pornhubAd.imgUrl) && Intrinsics.areEqual(this.link, pornhubAd.link) && this.memberId == pornhubAd.memberId && this.campaignId == pornhubAd.campaignId;
        }
        return false;
    }

    public final long getAdId() {
        return this.adId;
    }

    public final long getCampaignId() {
        return this.campaignId;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final String getLink() {
        return this.link;
    }

    public final int getMemberId() {
        return this.memberId;
    }

    public final long getSpotId() {
        return this.spotId;
    }

    public int hashCode() {
        long j10 = this.spotId;
        long j11 = this.adId;
        int b10 = a.b(this.imgUrl, ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31, 31);
        long j12 = this.campaignId;
        return ((a.b(this.link, b10, 31) + this.memberId) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        StringBuilder m10 = a.m("PornhubAd(spotId=");
        m10.append(this.spotId);
        m10.append(", adId=");
        m10.append(this.adId);
        m10.append(", imgUrl=");
        m10.append(this.imgUrl);
        m10.append(", link=");
        m10.append(this.link);
        m10.append(", memberId=");
        m10.append(this.memberId);
        m10.append(", campaignId=");
        m10.append(this.campaignId);
        m10.append(')');
        return m10.toString();
    }
}
