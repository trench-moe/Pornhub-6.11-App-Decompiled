package com.app.pornhub.domain.model.comment;

import a1.a;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003JU\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\bHÖ\u0001J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020+J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001b¨\u0006."}, d2 = {"Lcom/app/pornhub/domain/model/comment/UserComment;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "text", "dateAdded", BuildConfig.FLAVOR, "votesUp", BuildConfig.FLAVOR, "votesDown", "children", BuildConfig.FLAVOR, UsersConfig.USER_PREF_KEY, "Lcom/app/pornhub/domain/model/user/UserMetaData;", "(Ljava/lang/String;Ljava/lang/String;JIILjava/util/List;Lcom/app/pornhub/domain/model/user/UserMetaData;)V", "getChildren", "()Ljava/util/List;", "getDateAdded", "()J", "getId", "()Ljava/lang/String;", "getText", "getUser", "()Lcom/app/pornhub/domain/model/user/UserMetaData;", "getVotesDown", "()I", "setVotesDown", "(I)V", "getVotesUp", "setVotesUp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "incrementVotesDown", BuildConfig.FLAVOR, "incrementVotesUp", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserComment {
    private final List<UserComment> children;
    private final long dateAdded;

    /* renamed from: id  reason: collision with root package name */
    private final String f4898id;
    private final String text;
    private final UserMetaData user;
    private int votesDown;
    private int votesUp;

    public UserComment(String id2, String text, long j10, int i10, int i11, List<UserComment> children, UserMetaData user) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f4898id = id2;
        this.text = text;
        this.dateAdded = j10;
        this.votesUp = i10;
        this.votesDown = i11;
        this.children = children;
        this.user = user;
    }

    public final String component1() {
        return this.f4898id;
    }

    public final String component2() {
        return this.text;
    }

    public final long component3() {
        return this.dateAdded;
    }

    public final int component4() {
        return this.votesUp;
    }

    public final int component5() {
        return this.votesDown;
    }

    public final List<UserComment> component6() {
        return this.children;
    }

    public final UserMetaData component7() {
        return this.user;
    }

    public final UserComment copy(String id2, String text, long j10, int i10, int i11, List<UserComment> children, UserMetaData user) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(user, "user");
        return new UserComment(id2, text, j10, i10, i11, children, user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserComment) {
            UserComment userComment = (UserComment) obj;
            return Intrinsics.areEqual(this.f4898id, userComment.f4898id) && Intrinsics.areEqual(this.text, userComment.text) && this.dateAdded == userComment.dateAdded && this.votesUp == userComment.votesUp && this.votesDown == userComment.votesDown && Intrinsics.areEqual(this.children, userComment.children) && Intrinsics.areEqual(this.user, userComment.user);
        }
        return false;
    }

    public final List<UserComment> getChildren() {
        return this.children;
    }

    public final long getDateAdded() {
        return this.dateAdded;
    }

    public final String getId() {
        return this.f4898id;
    }

    public final String getText() {
        return this.text;
    }

    public final UserMetaData getUser() {
        return this.user;
    }

    public final int getVotesDown() {
        return this.votesDown;
    }

    public final int getVotesUp() {
        return this.votesUp;
    }

    public int hashCode() {
        int b10 = a.b(this.text, this.f4898id.hashCode() * 31, 31);
        long j10 = this.dateAdded;
        return this.user.hashCode() + android.support.v4.media.a.b(this.children, (((((b10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.votesUp) * 31) + this.votesDown) * 31, 31);
    }

    public final void incrementVotesDown() {
        this.votesDown++;
    }

    public final void incrementVotesUp() {
        this.votesUp++;
    }

    public final void setVotesDown(int i10) {
        this.votesDown = i10;
    }

    public final void setVotesUp(int i10) {
        this.votesUp = i10;
    }

    public String toString() {
        StringBuilder m10 = a.m("UserComment(id=");
        m10.append(this.f4898id);
        m10.append(", text=");
        m10.append(this.text);
        m10.append(", dateAdded=");
        m10.append(this.dateAdded);
        m10.append(", votesUp=");
        m10.append(this.votesUp);
        m10.append(", votesDown=");
        m10.append(this.votesDown);
        m10.append(", children=");
        m10.append(this.children);
        m10.append(", user=");
        m10.append(this.user);
        m10.append(')');
        return m10.toString();
    }
}
