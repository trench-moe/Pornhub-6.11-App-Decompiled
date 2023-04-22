package com.app.pornhub.data.model.comments;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.ErrorModel;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/app/pornhub/data/model/comments/CommentActionResponse;", BuildConfig.FLAVOR, "result", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(ZLjava/lang/String;Lcom/app/pornhub/data/model/ErrorModel;)V", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "getId", "()Ljava/lang/String;", "getResult", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommentActionResponse {
    private final ErrorModel error;

    /* renamed from: id  reason: collision with root package name */
    private final String f4330id;
    private final boolean result;

    public CommentActionResponse(boolean z10, String str, ErrorModel errorModel) {
        this.result = z10;
        this.f4330id = str;
        this.error = errorModel;
    }

    public static /* synthetic */ CommentActionResponse copy$default(CommentActionResponse commentActionResponse, boolean z10, String str, ErrorModel errorModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = commentActionResponse.result;
        }
        if ((i10 & 2) != 0) {
            str = commentActionResponse.f4330id;
        }
        if ((i10 & 4) != 0) {
            errorModel = commentActionResponse.error;
        }
        return commentActionResponse.copy(z10, str, errorModel);
    }

    public final boolean component1() {
        return this.result;
    }

    public final String component2() {
        return this.f4330id;
    }

    public final ErrorModel component3() {
        return this.error;
    }

    public final CommentActionResponse copy(boolean z10, String str, ErrorModel errorModel) {
        return new CommentActionResponse(z10, str, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommentActionResponse) {
            CommentActionResponse commentActionResponse = (CommentActionResponse) obj;
            return this.result == commentActionResponse.result && Intrinsics.areEqual(this.f4330id, commentActionResponse.f4330id) && Intrinsics.areEqual(this.error, commentActionResponse.error);
        }
        return false;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final String getId() {
        return this.f4330id;
    }

    public final boolean getResult() {
        return this.result;
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
        int i10 = r02 * 31;
        String str = this.f4330id;
        int i11 = 0;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        ErrorModel errorModel = this.error;
        if (errorModel != null) {
            i11 = errorModel.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        StringBuilder m10 = a.m("CommentActionResponse(result=");
        m10.append(this.result);
        m10.append(", id=");
        m10.append((Object) this.f4330id);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
