package com.app.pornhub.data.model.playlist;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.ErrorModel;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/app/pornhub/data/model/playlist/CreatePlaylistResponse;", BuildConfig.FLAVOR, "playlistId", BuildConfig.FLAVOR, "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(ILcom/app/pornhub/data/model/ErrorModel;)V", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "getPlaylistId", "()I", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CreatePlaylistResponse {
    private final ErrorModel error;
    private final int playlistId;

    public CreatePlaylistResponse(int i10, ErrorModel errorModel) {
        this.playlistId = i10;
        this.error = errorModel;
    }

    public static /* synthetic */ CreatePlaylistResponse copy$default(CreatePlaylistResponse createPlaylistResponse, int i10, ErrorModel errorModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = createPlaylistResponse.playlistId;
        }
        if ((i11 & 2) != 0) {
            errorModel = createPlaylistResponse.error;
        }
        return createPlaylistResponse.copy(i10, errorModel);
    }

    public final int component1() {
        return this.playlistId;
    }

    public final ErrorModel component2() {
        return this.error;
    }

    public final CreatePlaylistResponse copy(int i10, ErrorModel errorModel) {
        return new CreatePlaylistResponse(i10, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreatePlaylistResponse) {
            CreatePlaylistResponse createPlaylistResponse = (CreatePlaylistResponse) obj;
            if (this.playlistId == createPlaylistResponse.playlistId && Intrinsics.areEqual(this.error, createPlaylistResponse.error)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final int getPlaylistId() {
        return this.playlistId;
    }

    public int hashCode() {
        int i10 = this.playlistId * 31;
        ErrorModel errorModel = this.error;
        return i10 + (errorModel == null ? 0 : errorModel.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("CreatePlaylistResponse(playlistId=");
        m10.append(this.playlistId);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
