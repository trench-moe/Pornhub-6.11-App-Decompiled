package com.app.pornhub.domain.model.comment;

import a1.a;
import android.support.v4.media.b;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/app/pornhub/domain/model/comment/CommentActionResult;", BuildConfig.FLAVOR, "result", BuildConfig.FLAVOR, "commentId", BuildConfig.FLAVOR, "(ZLjava/lang/String;)V", "getCommentId", "()Ljava/lang/String;", "getResult", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommentActionResult {
    private final String commentId;
    private final boolean result;

    public CommentActionResult(boolean z10, String commentId) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        this.result = z10;
        this.commentId = commentId;
    }

    public static /* synthetic */ CommentActionResult copy$default(CommentActionResult commentActionResult, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = commentActionResult.result;
        }
        if ((i10 & 2) != 0) {
            str = commentActionResult.commentId;
        }
        return commentActionResult.copy(z10, str);
    }

    public final boolean component1() {
        return this.result;
    }

    public final String component2() {
        return this.commentId;
    }

    public final CommentActionResult copy(boolean z10, String commentId) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        return new CommentActionResult(z10, commentId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommentActionResult) {
            CommentActionResult commentActionResult = (CommentActionResult) obj;
            if (this.result == commentActionResult.result && Intrinsics.areEqual(this.commentId, commentActionResult.commentId)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getCommentId() {
        return this.commentId;
    }

    public final boolean getResult() {
        return this.result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public int hashCode() {
        boolean z10 = this.result;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return this.commentId.hashCode() + (r02 * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("CommentActionResult(result=");
        m10.append(this.result);
        m10.append(", commentId=");
        return b.l(m10, this.commentId, ')');
    }
}
