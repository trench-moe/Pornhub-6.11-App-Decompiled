package com.app.pornhub.domain.model.update;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0014\u001a\u00020\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/app/pornhub/domain/model/update/ProgressEvent;", BuildConfig.FLAVOR, "percent", BuildConfig.FLAVOR, "contentLength", BuildConfig.FLAVOR, "bytesRead", "(IJJ)V", "getBytesRead", "()J", "getContentLength", "getPercent", "()I", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "getProgress", "hashCode", "toString", BuildConfig.FLAVOR, "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressEvent {
    private final long bytesRead;
    private final long contentLength;
    private final int percent;

    public ProgressEvent(int i10, long j10, long j11) {
        this.percent = i10;
        this.contentLength = j10;
        this.bytesRead = j11;
    }

    public static /* synthetic */ ProgressEvent copy$default(ProgressEvent progressEvent, int i10, long j10, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = progressEvent.percent;
        }
        if ((i11 & 2) != 0) {
            j10 = progressEvent.contentLength;
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = progressEvent.bytesRead;
        }
        return progressEvent.copy(i10, j12, j11);
    }

    public final int component1() {
        return this.percent;
    }

    public final long component2() {
        return this.contentLength;
    }

    public final long component3() {
        return this.bytesRead;
    }

    public final ProgressEvent copy(int i10, long j10, long j11) {
        return new ProgressEvent(i10, j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProgressEvent) {
            ProgressEvent progressEvent = (ProgressEvent) obj;
            return this.percent == progressEvent.percent && this.contentLength == progressEvent.contentLength && this.bytesRead == progressEvent.bytesRead;
        }
        return false;
    }

    public final long getBytesRead() {
        return this.bytesRead;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final int getPercent() {
        return this.percent;
    }

    public final int getProgress() {
        return (int) (((float) this.bytesRead) / (((float) this.contentLength) / 100.0f));
    }

    public int hashCode() {
        long j10 = this.contentLength;
        long j11 = this.bytesRead;
        return (((this.percent * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        StringBuilder m10 = a.m("ProgressEvent(percent=");
        m10.append(this.percent);
        m10.append(", contentLength=");
        m10.append(this.contentLength);
        m10.append(", bytesRead=");
        m10.append(this.bytesRead);
        m10.append(')');
        return m10.toString();
    }
}
