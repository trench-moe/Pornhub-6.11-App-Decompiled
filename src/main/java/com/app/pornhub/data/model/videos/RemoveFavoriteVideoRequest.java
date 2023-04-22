package com.app.pornhub.data.model.videos;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/app/pornhub/data/model/videos/RemoveFavoriteVideoRequest;", BuildConfig.FLAVOR, "vkey", BuildConfig.FLAVOR, "(Ljava/lang/String;)V", "getVkey", "()Ljava/lang/String;", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RemoveFavoriteVideoRequest {
    private final String vkey;

    public RemoveFavoriteVideoRequest(String vkey) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        this.vkey = vkey;
    }

    public static /* synthetic */ RemoveFavoriteVideoRequest copy$default(RemoveFavoriteVideoRequest removeFavoriteVideoRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = removeFavoriteVideoRequest.vkey;
        }
        return removeFavoriteVideoRequest.copy(str);
    }

    public final String component1() {
        return this.vkey;
    }

    public final RemoveFavoriteVideoRequest copy(String vkey) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        return new RemoveFavoriteVideoRequest(vkey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof RemoveFavoriteVideoRequest) && Intrinsics.areEqual(this.vkey, ((RemoveFavoriteVideoRequest) obj).vkey)) {
            return true;
        }
        return false;
    }

    public final String getVkey() {
        return this.vkey;
    }

    public int hashCode() {
        return this.vkey.hashCode();
    }

    public String toString() {
        return b.l(a.m("RemoveFavoriteVideoRequest(vkey="), this.vkey, ')');
    }
}
