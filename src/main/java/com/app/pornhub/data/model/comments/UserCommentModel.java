package com.app.pornhub.data.model.comments;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.user.UserModel;
import com.app.pornhub.domain.config.UsersConfig;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/app/pornhub/data/model/comments/UserCommentModel;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "text", "dateAdded", BuildConfig.FLAVOR, UsersConfig.USER_PREF_KEY, "Lcom/app/pornhub/data/model/user/UserModel;", "(Ljava/lang/String;Ljava/lang/String;JLcom/app/pornhub/data/model/user/UserModel;)V", "getDateAdded", "()J", "getId", "()Ljava/lang/String;", "getText", "getUser", "()Lcom/app/pornhub/data/model/user/UserModel;", "component1", "component2", "component3", "component4", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserCommentModel {
    private final long dateAdded;

    /* renamed from: id  reason: collision with root package name */
    private final String f4333id;
    private final String text;
    private final UserModel user;

    public UserCommentModel(String id2, String text, long j10, UserModel user) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f4333id = id2;
        this.text = text;
        this.dateAdded = j10;
        this.user = user;
    }

    public static /* synthetic */ UserCommentModel copy$default(UserCommentModel userCommentModel, String str, String str2, long j10, UserModel userModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userCommentModel.f4333id;
        }
        if ((i10 & 2) != 0) {
            str2 = userCommentModel.text;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            j10 = userCommentModel.dateAdded;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            userModel = userCommentModel.user;
        }
        return userCommentModel.copy(str, str3, j11, userModel);
    }

    public final String component1() {
        return this.f4333id;
    }

    public final String component2() {
        return this.text;
    }

    public final long component3() {
        return this.dateAdded;
    }

    public final UserModel component4() {
        return this.user;
    }

    public final UserCommentModel copy(String id2, String text, long j10, UserModel user) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(user, "user");
        return new UserCommentModel(id2, text, j10, user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserCommentModel) {
            UserCommentModel userCommentModel = (UserCommentModel) obj;
            return Intrinsics.areEqual(this.f4333id, userCommentModel.f4333id) && Intrinsics.areEqual(this.text, userCommentModel.text) && this.dateAdded == userCommentModel.dateAdded && Intrinsics.areEqual(this.user, userCommentModel.user);
        }
        return false;
    }

    public final long getDateAdded() {
        return this.dateAdded;
    }

    public final String getId() {
        return this.f4333id;
    }

    public final String getText() {
        return this.text;
    }

    public final UserModel getUser() {
        return this.user;
    }

    public int hashCode() {
        int b10 = a.b(this.text, this.f4333id.hashCode() * 31, 31);
        long j10 = this.dateAdded;
        return this.user.hashCode() + ((b10 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("UserCommentModel(id=");
        m10.append(this.f4333id);
        m10.append(", text=");
        m10.append(this.text);
        m10.append(", dateAdded=");
        m10.append(this.dateAdded);
        m10.append(", user=");
        m10.append(this.user);
        m10.append(')');
        return m10.toString();
    }
}
