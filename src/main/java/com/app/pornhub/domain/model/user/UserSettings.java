package com.app.pornhub.domain.model.user;

import a1.a;
import com.app.pornhub.domain.config.VideoQuality;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006'"}, d2 = {"Lcom/app/pornhub/domain/model/user/UserSettings;", BuildConfig.FLAVOR, "orientation", "Lcom/app/pornhub/domain/model/user/UserOrientation;", "videoQuality", "Lcom/app/pornhub/domain/config/VideoQuality;", "isOfflineAllowed", BuildConfig.FLAVOR, "isAutoRotateEnabled", "isAutoPlayEnabled", "showDataWarning", "(Lcom/app/pornhub/domain/model/user/UserOrientation;Lcom/app/pornhub/domain/config/VideoQuality;ZZZZ)V", "()Z", "getOrientation", "()Lcom/app/pornhub/domain/model/user/UserOrientation;", "getShowDataWarning", "getVideoQuality", "()Lcom/app/pornhub/domain/config/VideoQuality;", "changeAutoPlayEnabled", "enabled", "changeAutoRotateEnabled", "changeOfflineAllowed", "offlineAllowed", "changeOrientation", "changeShowDataWarning", "changeVideoQuality", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserSettings {
    private final boolean isAutoPlayEnabled;
    private final boolean isAutoRotateEnabled;
    private final boolean isOfflineAllowed;
    private final UserOrientation orientation;
    private final boolean showDataWarning;
    private final VideoQuality videoQuality;

    public UserSettings(UserOrientation orientation, VideoQuality videoQuality, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(videoQuality, "videoQuality");
        this.orientation = orientation;
        this.videoQuality = videoQuality;
        this.isOfflineAllowed = z10;
        this.isAutoRotateEnabled = z11;
        this.isAutoPlayEnabled = z12;
        this.showDataWarning = z13;
    }

    public static /* synthetic */ UserSettings copy$default(UserSettings userSettings, UserOrientation userOrientation, VideoQuality videoQuality, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            userOrientation = userSettings.orientation;
        }
        if ((i10 & 2) != 0) {
            videoQuality = userSettings.videoQuality;
        }
        VideoQuality videoQuality2 = videoQuality;
        if ((i10 & 4) != 0) {
            z10 = userSettings.isOfflineAllowed;
        }
        boolean z14 = z10;
        if ((i10 & 8) != 0) {
            z11 = userSettings.isAutoRotateEnabled;
        }
        boolean z15 = z11;
        if ((i10 & 16) != 0) {
            z12 = userSettings.isAutoPlayEnabled;
        }
        boolean z16 = z12;
        if ((i10 & 32) != 0) {
            z13 = userSettings.showDataWarning;
        }
        return userSettings.copy(userOrientation, videoQuality2, z14, z15, z16, z13);
    }

    public final UserSettings changeAutoPlayEnabled(boolean z10) {
        return copy$default(this, null, null, false, false, z10, false, 47, null);
    }

    public final UserSettings changeAutoRotateEnabled(boolean z10) {
        return copy$default(this, null, null, false, z10, false, false, 55, null);
    }

    public final UserSettings changeOfflineAllowed(boolean z10) {
        return copy$default(this, null, null, z10, false, false, false, 59, null);
    }

    public final UserSettings changeOrientation(UserOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return copy$default(this, orientation, null, false, false, false, false, 62, null);
    }

    public final UserSettings changeShowDataWarning(boolean z10) {
        return copy$default(this, null, null, false, false, false, z10, 31, null);
    }

    public final UserSettings changeVideoQuality(VideoQuality videoQuality) {
        Intrinsics.checkNotNullParameter(videoQuality, "videoQuality");
        return copy$default(this, null, videoQuality, false, false, false, false, 61, null);
    }

    public final UserOrientation component1() {
        return this.orientation;
    }

    public final VideoQuality component2() {
        return this.videoQuality;
    }

    public final boolean component3() {
        return this.isOfflineAllowed;
    }

    public final boolean component4() {
        return this.isAutoRotateEnabled;
    }

    public final boolean component5() {
        return this.isAutoPlayEnabled;
    }

    public final boolean component6() {
        return this.showDataWarning;
    }

    public final UserSettings copy(UserOrientation orientation, VideoQuality videoQuality, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(videoQuality, "videoQuality");
        return new UserSettings(orientation, videoQuality, z10, z11, z12, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserSettings) {
            UserSettings userSettings = (UserSettings) obj;
            return Intrinsics.areEqual(this.orientation, userSettings.orientation) && Intrinsics.areEqual(this.videoQuality, userSettings.videoQuality) && this.isOfflineAllowed == userSettings.isOfflineAllowed && this.isAutoRotateEnabled == userSettings.isAutoRotateEnabled && this.isAutoPlayEnabled == userSettings.isAutoPlayEnabled && this.showDataWarning == userSettings.showDataWarning;
        }
        return false;
    }

    public final UserOrientation getOrientation() {
        return this.orientation;
    }

    public final boolean getShowDataWarning() {
        return this.showDataWarning;
    }

    public final VideoQuality getVideoQuality() {
        return this.videoQuality;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.videoQuality.hashCode() + (this.orientation.hashCode() * 31)) * 31;
        boolean z10 = this.isOfflineAllowed;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z11 = this.isAutoRotateEnabled;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z12 = this.isAutoPlayEnabled;
        int i15 = z12;
        if (z12 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z13 = this.showDataWarning;
        if (!z13) {
            i10 = z13 ? 1 : 0;
        }
        return i16 + i10;
    }

    public final boolean isAutoPlayEnabled() {
        return this.isAutoPlayEnabled;
    }

    public final boolean isAutoRotateEnabled() {
        return this.isAutoRotateEnabled;
    }

    public final boolean isOfflineAllowed() {
        boolean z10 = this.isOfflineAllowed;
        return true;
    }

    public String toString() {
        StringBuilder m10 = a.m("UserSettings(orientation=");
        m10.append(this.orientation);
        m10.append(", videoQuality=");
        m10.append(this.videoQuality);
        m10.append(", isOfflineAllowed=");
        m10.append(this.isOfflineAllowed);
        m10.append(", isAutoRotateEnabled=");
        m10.append(this.isAutoRotateEnabled);
        m10.append(", isAutoPlayEnabled=");
        m10.append(this.isAutoPlayEnabled);
        m10.append(", showDataWarning=");
        return a0.a.l(m10, this.showDataWarning, ')');
    }
}
