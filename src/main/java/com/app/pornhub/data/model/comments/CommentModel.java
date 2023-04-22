package com.app.pornhub.data.model.comments;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.user.UserModel;
import com.app.pornhub.domain.config.UsersConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fHÆ\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006'"}, d2 = {"Lcom/app/pornhub/data/model/comments/CommentModel;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "text", "dateAdded", BuildConfig.FLAVOR, "votesUp", "votesDown", UsersConfig.USER_PREF_KEY, "Lcom/app/pornhub/data/model/user/UserModel;", "children", BuildConfig.FLAVOR, "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/app/pornhub/data/model/user/UserModel;Ljava/util/List;)V", "getChildren", "()Ljava/util/List;", "getDateAdded", "()J", "getId", "()Ljava/lang/String;", "getText", "getUser", "()Lcom/app/pornhub/data/model/user/UserModel;", "getVotesDown", "getVotesUp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommentModel {
    private final List<CommentModel> children;
    private final long dateAdded;

    /* renamed from: id  reason: collision with root package name */
    private final String f4331id;
    private final String text;
    private final UserModel user;
    private final String votesDown;
    private final String votesUp;

    public CommentModel(String id2, String text, long j10, String votesUp, String votesDown, UserModel user, List<CommentModel> list) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(votesUp, "votesUp");
        Intrinsics.checkNotNullParameter(votesDown, "votesDown");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f4331id = id2;
        this.text = text;
        this.dateAdded = j10;
        this.votesUp = votesUp;
        this.votesDown = votesDown;
        this.user = user;
        this.children = list;
    }

    public final String component1() {
        return this.f4331id;
    }

    public final String component2() {
        return this.text;
    }

    public final long component3() {
        return this.dateAdded;
    }

    public final String component4() {
        return this.votesUp;
    }

    public final String component5() {
        return this.votesDown;
    }

    public final UserModel component6() {
        return this.user;
    }

    public final List<CommentModel> component7() {
        return this.children;
    }

    public final CommentModel copy(String id2, String text, long j10, String votesUp, String votesDown, UserModel user, List<CommentModel> list) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(votesUp, "votesUp");
        Intrinsics.checkNotNullParameter(votesDown, "votesDown");
        Intrinsics.checkNotNullParameter(user, "user");
        return new CommentModel(id2, text, j10, votesUp, votesDown, user, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommentModel) {
            CommentModel commentModel = (CommentModel) obj;
            if (Intrinsics.areEqual(this.f4331id, commentModel.f4331id) && Intrinsics.areEqual(this.text, commentModel.text) && this.dateAdded == commentModel.dateAdded && Intrinsics.areEqual(this.votesUp, commentModel.votesUp) && Intrinsics.areEqual(this.votesDown, commentModel.votesDown) && Intrinsics.areEqual(this.user, commentModel.user) && Intrinsics.areEqual(this.children, commentModel.children)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List<CommentModel> getChildren() {
        return this.children;
    }

    public final long getDateAdded() {
        return this.dateAdded;
    }

    public final String getId() {
        return this.f4331id;
    }

    public final String getText() {
        return this.text;
    }

    public final UserModel getUser() {
        return this.user;
    }

    public final String getVotesDown() {
        return this.votesDown;
    }

    public final String getVotesUp() {
        return this.votesUp;
    }

    public int hashCode() {
        int b10 = a.b(this.text, this.f4331id.hashCode() * 31, 31);
        long j10 = this.dateAdded;
        int hashCode = (this.user.hashCode() + a.b(this.votesDown, a.b(this.votesUp, (b10 + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31)) * 31;
        List<CommentModel> list = this.children;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("CommentModel(id=");
        m10.append(this.f4331id);
        m10.append(", text=");
        m10.append(this.text);
        m10.append(", dateAdded=");
        m10.append(this.dateAdded);
        m10.append(", votesUp=");
        m10.append(this.votesUp);
        m10.append(", votesDown=");
        m10.append(this.votesDown);
        m10.append(", user=");
        m10.append(this.user);
        m10.append(", children=");
        return android.support.v4.media.a.k(m10, this.children, ')');
    }
}
