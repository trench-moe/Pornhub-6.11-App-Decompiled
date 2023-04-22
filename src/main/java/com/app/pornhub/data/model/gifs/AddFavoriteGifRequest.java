package com.app.pornhub.data.model.gifs;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/app/pornhub/data/model/gifs/AddFavoriteGifRequest;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.VALUE, BuildConfig.FLAVOR, "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getValue", "()I", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AddFavoriteGifRequest {

    /* renamed from: id  reason: collision with root package name */
    private final String f4336id;
    private final int value;

    public AddFavoriteGifRequest(String id2, int i10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f4336id = id2;
        this.value = i10;
    }

    public static /* synthetic */ AddFavoriteGifRequest copy$default(AddFavoriteGifRequest addFavoriteGifRequest, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addFavoriteGifRequest.f4336id;
        }
        if ((i11 & 2) != 0) {
            i10 = addFavoriteGifRequest.value;
        }
        return addFavoriteGifRequest.copy(str, i10);
    }

    public final String component1() {
        return this.f4336id;
    }

    public final int component2() {
        return this.value;
    }

    public final AddFavoriteGifRequest copy(String id2, int i10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new AddFavoriteGifRequest(id2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddFavoriteGifRequest) {
            AddFavoriteGifRequest addFavoriteGifRequest = (AddFavoriteGifRequest) obj;
            if (Intrinsics.areEqual(this.f4336id, addFavoriteGifRequest.f4336id) && this.value == addFavoriteGifRequest.value) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getId() {
        return this.f4336id;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.f4336id.hashCode() * 31) + this.value;
    }

    public String toString() {
        StringBuilder m10 = a.m("AddFavoriteGifRequest(id=");
        m10.append(this.f4336id);
        m10.append(", value=");
        return android.support.v4.media.a.i(m10, this.value, ')');
    }
}
