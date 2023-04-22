package com.app.pornhub.data.model.videos;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.f;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JW\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\fR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, d2 = {"Lcom/app/pornhub/data/model/videos/EncodingsModel;", BuildConfig.FLAVOR, "res2160Url", BuildConfig.FLAVOR, "res1440Url", "res1080Url", "res720Url", "res480Url", "is1440pAvailable", BuildConfig.FLAVOR, "is2160pAvailable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "()Z", "getRes1080Url", "()Ljava/lang/String;", "getRes1440Url", "getRes2160Url", "getRes480Url", "getRes720Url", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EncodingsModel {
    private final boolean is1440pAvailable;
    private final boolean is2160pAvailable;
    private final String res1080Url;
    private final String res1440Url;
    private final String res2160Url;
    private final String res480Url;
    private final String res720Url;

    public EncodingsModel(@f(name = "2160p") String str, @f(name = "1440p") String str2, @f(name = "1080p") String str3, @f(name = "720p") String str4, @f(name = "480p") String res480Url, @f(name = "1440p_available") boolean z10, @f(name = "2160p_available") boolean z11) {
        Intrinsics.checkNotNullParameter(res480Url, "res480Url");
        this.res2160Url = str;
        this.res1440Url = str2;
        this.res1080Url = str3;
        this.res720Url = str4;
        this.res480Url = res480Url;
        this.is1440pAvailable = z10;
        this.is2160pAvailable = z11;
    }

    public static /* synthetic */ EncodingsModel copy$default(EncodingsModel encodingsModel, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = encodingsModel.res2160Url;
        }
        if ((i10 & 2) != 0) {
            str2 = encodingsModel.res1440Url;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = encodingsModel.res1080Url;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = encodingsModel.res720Url;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = encodingsModel.res480Url;
        }
        String str9 = str5;
        if ((i10 & 32) != 0) {
            z10 = encodingsModel.is1440pAvailable;
        }
        boolean z12 = z10;
        if ((i10 & 64) != 0) {
            z11 = encodingsModel.is2160pAvailable;
        }
        return encodingsModel.copy(str, str6, str7, str8, str9, z12, z11);
    }

    public final String component1() {
        return this.res2160Url;
    }

    public final String component2() {
        return this.res1440Url;
    }

    public final String component3() {
        return this.res1080Url;
    }

    public final String component4() {
        return this.res720Url;
    }

    public final String component5() {
        return this.res480Url;
    }

    public final boolean component6() {
        return this.is1440pAvailable;
    }

    public final boolean component7() {
        return this.is2160pAvailable;
    }

    public final EncodingsModel copy(@f(name = "2160p") String str, @f(name = "1440p") String str2, @f(name = "1080p") String str3, @f(name = "720p") String str4, @f(name = "480p") String res480Url, @f(name = "1440p_available") boolean z10, @f(name = "2160p_available") boolean z11) {
        Intrinsics.checkNotNullParameter(res480Url, "res480Url");
        return new EncodingsModel(str, str2, str3, str4, res480Url, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EncodingsModel) {
            EncodingsModel encodingsModel = (EncodingsModel) obj;
            return Intrinsics.areEqual(this.res2160Url, encodingsModel.res2160Url) && Intrinsics.areEqual(this.res1440Url, encodingsModel.res1440Url) && Intrinsics.areEqual(this.res1080Url, encodingsModel.res1080Url) && Intrinsics.areEqual(this.res720Url, encodingsModel.res720Url) && Intrinsics.areEqual(this.res480Url, encodingsModel.res480Url) && this.is1440pAvailable == encodingsModel.is1440pAvailable && this.is2160pAvailable == encodingsModel.is2160pAvailable;
        }
        return false;
    }

    public final String getRes1080Url() {
        return this.res1080Url;
    }

    public final String getRes1440Url() {
        return this.res1440Url;
    }

    public final String getRes2160Url() {
        return this.res2160Url;
    }

    public final String getRes480Url() {
        return this.res480Url;
    }

    public final String getRes720Url() {
        return this.res720Url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.res2160Url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.res1440Url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.res1080Url;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.res720Url;
        int b10 = a.b(this.res480Url, (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
        boolean z10 = this.is1440pAvailable;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (b10 + i11) * 31;
        boolean z11 = this.is2160pAvailable;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return i12 + i10;
    }

    public final boolean is1440pAvailable() {
        return this.is1440pAvailable;
    }

    public final boolean is2160pAvailable() {
        return this.is2160pAvailable;
    }

    public String toString() {
        StringBuilder m10 = a.m("EncodingsModel(res2160Url=");
        m10.append((Object) this.res2160Url);
        m10.append(", res1440Url=");
        m10.append((Object) this.res1440Url);
        m10.append(", res1080Url=");
        m10.append((Object) this.res1080Url);
        m10.append(", res720Url=");
        m10.append((Object) this.res720Url);
        m10.append(", res480Url=");
        m10.append(this.res480Url);
        m10.append(", is1440pAvailable=");
        m10.append(this.is1440pAvailable);
        m10.append(", is2160pAvailable=");
        return a0.a.l(m10, this.is2160pAvailable, ')');
    }
}
