package com.app.pornhub.data.model.comments;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/data/model/comments/DeleteCommentRequest;", BuildConfig.FLAVOR, "itemId", BuildConfig.FLAVOR, "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getItemId", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeleteCommentRequest {
    private final String itemId;
    private final String type;

    public DeleteCommentRequest(String itemId, String type) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.itemId = itemId;
        this.type = type;
    }

    public static /* synthetic */ DeleteCommentRequest copy$default(DeleteCommentRequest deleteCommentRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deleteCommentRequest.itemId;
        }
        if ((i10 & 2) != 0) {
            str2 = deleteCommentRequest.type;
        }
        return deleteCommentRequest.copy(str, str2);
    }

    public final String component1() {
        return this.itemId;
    }

    public final String component2() {
        return this.type;
    }

    public final DeleteCommentRequest copy(String itemId, String type) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(type, "type");
        return new DeleteCommentRequest(itemId, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeleteCommentRequest) {
            DeleteCommentRequest deleteCommentRequest = (DeleteCommentRequest) obj;
            return Intrinsics.areEqual(this.itemId, deleteCommentRequest.itemId) && Intrinsics.areEqual(this.type, deleteCommentRequest.type);
        }
        return false;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.itemId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("DeleteCommentRequest(itemId=");
        m10.append(this.itemId);
        m10.append(", type=");
        return b.l(m10, this.type, ')');
    }
}
