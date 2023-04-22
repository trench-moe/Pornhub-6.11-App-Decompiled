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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/app/pornhub/data/model/playlist/PlaylistActionResponse;", BuildConfig.FLAVOR, "result", BuildConfig.FLAVOR, "videosCount", BuildConfig.FLAVOR, "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(ZILcom/app/pornhub/data/model/ErrorModel;)V", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "getResult", "()Z", "getVideosCount", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaylistActionResponse {
    private final ErrorModel error;
    private final boolean result;
    private final int videosCount;

    public PlaylistActionResponse(boolean z10, int i10, ErrorModel errorModel) {
        this.result = z10;
        this.videosCount = i10;
        this.error = errorModel;
    }

    public static /* synthetic */ PlaylistActionResponse copy$default(PlaylistActionResponse playlistActionResponse, boolean z10, int i10, ErrorModel errorModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = playlistActionResponse.result;
        }
        if ((i11 & 2) != 0) {
            i10 = playlistActionResponse.videosCount;
        }
        if ((i11 & 4) != 0) {
            errorModel = playlistActionResponse.error;
        }
        return playlistActionResponse.copy(z10, i10, errorModel);
    }

    public final boolean component1() {
        return this.result;
    }

    public final int component2() {
        return this.videosCount;
    }

    public final ErrorModel component3() {
        return this.error;
    }

    public final PlaylistActionResponse copy(boolean z10, int i10, ErrorModel errorModel) {
        return new PlaylistActionResponse(z10, i10, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaylistActionResponse) {
            PlaylistActionResponse playlistActionResponse = (PlaylistActionResponse) obj;
            return this.result == playlistActionResponse.result && this.videosCount == playlistActionResponse.videosCount && Intrinsics.areEqual(this.error, playlistActionResponse.error);
        }
        return false;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final boolean getResult() {
        return this.result;
    }

    public final int getVideosCount() {
        return this.videosCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.result;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = ((r02 * 31) + this.videosCount) * 31;
        ErrorModel errorModel = this.error;
        return i10 + (errorModel == null ? 0 : errorModel.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("PlaylistActionResponse(result=");
        m10.append(this.result);
        m10.append(", videosCount=");
        m10.append(this.videosCount);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
