package com.app.pornhub.data.model.comments;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/app/pornhub/data/model/comments/PostCommentRequest;", BuildConfig.FLAVOR, "vkey", BuildConfig.FLAVOR, "comment", "itemId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComment", "()Ljava/lang/String;", "getItemId", "getVkey", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PostCommentRequest {
    private final String comment;
    private final String itemId;
    private final String vkey;

    public PostCommentRequest(String vkey, String comment, String str) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.vkey = vkey;
        this.comment = comment;
        this.itemId = str;
    }

    public static /* synthetic */ PostCommentRequest copy$default(PostCommentRequest postCommentRequest, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = postCommentRequest.vkey;
        }
        if ((i10 & 2) != 0) {
            str2 = postCommentRequest.comment;
        }
        if ((i10 & 4) != 0) {
            str3 = postCommentRequest.itemId;
        }
        return postCommentRequest.copy(str, str2, str3);
    }

    public final String component1() {
        return this.vkey;
    }

    public final String component2() {
        return this.comment;
    }

    public final String component3() {
        return this.itemId;
    }

    public final PostCommentRequest copy(String vkey, String comment, String str) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Intrinsics.checkNotNullParameter(comment, "comment");
        return new PostCommentRequest(vkey, comment, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PostCommentRequest) {
            PostCommentRequest postCommentRequest = (PostCommentRequest) obj;
            return Intrinsics.areEqual(this.vkey, postCommentRequest.vkey) && Intrinsics.areEqual(this.comment, postCommentRequest.comment) && Intrinsics.areEqual(this.itemId, postCommentRequest.itemId);
        }
        return false;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getVkey() {
        return this.vkey;
    }

    public int hashCode() {
        int b10 = a.b(this.comment, this.vkey.hashCode() * 31, 31);
        String str = this.itemId;
        return b10 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("PostCommentRequest(vkey=");
        m10.append(this.vkey);
        m10.append(", comment=");
        m10.append(this.comment);
        m10.append(", itemId=");
        m10.append((Object) this.itemId);
        m10.append(')');
        return m10.toString();
    }
}
