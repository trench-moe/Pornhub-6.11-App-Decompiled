package com.app.pornhub.data.model.adspromos;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/data/model/adspromos/PromoBannerResponse;", BuildConfig.FLAVOR, "image", BuildConfig.FLAVOR, "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PromoBannerResponse {
    private final String image;
    private final String url;

    public PromoBannerResponse(String str, String str2) {
        this.image = str;
        this.url = str2;
    }

    public static /* synthetic */ PromoBannerResponse copy$default(PromoBannerResponse promoBannerResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = promoBannerResponse.image;
        }
        if ((i10 & 2) != 0) {
            str2 = promoBannerResponse.url;
        }
        return promoBannerResponse.copy(str, str2);
    }

    public final String component1() {
        return this.image;
    }

    public final String component2() {
        return this.url;
    }

    public final PromoBannerResponse copy(String str, String str2) {
        return new PromoBannerResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PromoBannerResponse) {
            PromoBannerResponse promoBannerResponse = (PromoBannerResponse) obj;
            if (Intrinsics.areEqual(this.image, promoBannerResponse.image) && Intrinsics.areEqual(this.url, promoBannerResponse.url)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.image;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        StringBuilder m10 = a.m("PromoBannerResponse(image=");
        m10.append((Object) this.image);
        m10.append(", url=");
        m10.append((Object) this.url);
        m10.append(')');
        return m10.toString();
    }
}
