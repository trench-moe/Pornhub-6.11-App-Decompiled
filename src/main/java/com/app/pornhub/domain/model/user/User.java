package com.app.pornhub.domain.model.user;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000eHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003Jm\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010-\u001a\u00020\u000eJ\u0006\u0010.\u001a\u00020\u000eJ\t\u0010/\u001a\u00020\u0007HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00061"}, d2 = {"Lcom/app/pornhub/domain/model/user/User;", BuildConfig.FLAVOR, "userMetaData", "Lcom/app/pornhub/domain/model/user/UserMetaData;", "fullName", BuildConfig.FLAVOR, "gender", BuildConfig.FLAVOR, "age", "relationStatus", "orientation", "videoWatchedCount", "myProfileViewedCount", "dateAdded", BuildConfig.FLAVOR, "lastLogin", "(Lcom/app/pornhub/domain/model/user/UserMetaData;Ljava/lang/String;IIIIIIJJ)V", "getAge", "()I", "getDateAdded", "()J", "getFullName", "()Ljava/lang/String;", "getGender", "getLastLogin", "getMyProfileViewedCount", "getOrientation", "getRelationStatus", "getUserMetaData", "()Lcom/app/pornhub/domain/model/user/UserMetaData;", "getVideoWatchedCount", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", BuildConfig.FLAVOR, "other", "getDateAddedMilliseconds", "getLastLoginMilliseconds", "hashCode", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class User {
    private final int age;
    private final long dateAdded;
    private final String fullName;
    private final int gender;
    private final long lastLogin;
    private final int myProfileViewedCount;
    private final int orientation;
    private final int relationStatus;
    private final UserMetaData userMetaData;
    private final int videoWatchedCount;

    public User(UserMetaData userMetaData, String fullName, int i10, int i11, int i12, int i13, int i14, int i15, long j10, long j11) {
        Intrinsics.checkNotNullParameter(userMetaData, "userMetaData");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.userMetaData = userMetaData;
        this.fullName = fullName;
        this.gender = i10;
        this.age = i11;
        this.relationStatus = i12;
        this.orientation = i13;
        this.videoWatchedCount = i14;
        this.myProfileViewedCount = i15;
        this.dateAdded = j10;
        this.lastLogin = j11;
    }

    public final UserMetaData component1() {
        return this.userMetaData;
    }

    public final long component10() {
        return this.lastLogin;
    }

    public final String component2() {
        return this.fullName;
    }

    public final int component3() {
        return this.gender;
    }

    public final int component4() {
        return this.age;
    }

    public final int component5() {
        return this.relationStatus;
    }

    public final int component6() {
        return this.orientation;
    }

    public final int component7() {
        return this.videoWatchedCount;
    }

    public final int component8() {
        return this.myProfileViewedCount;
    }

    public final long component9() {
        return this.dateAdded;
    }

    public final User copy(UserMetaData userMetaData, String fullName, int i10, int i11, int i12, int i13, int i14, int i15, long j10, long j11) {
        Intrinsics.checkNotNullParameter(userMetaData, "userMetaData");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        return new User(userMetaData, fullName, i10, i11, i12, i13, i14, i15, j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof User) {
            User user = (User) obj;
            return Intrinsics.areEqual(this.userMetaData, user.userMetaData) && Intrinsics.areEqual(this.fullName, user.fullName) && this.gender == user.gender && this.age == user.age && this.relationStatus == user.relationStatus && this.orientation == user.orientation && this.videoWatchedCount == user.videoWatchedCount && this.myProfileViewedCount == user.myProfileViewedCount && this.dateAdded == user.dateAdded && this.lastLogin == user.lastLogin;
        }
        return false;
    }

    public final int getAge() {
        return this.age;
    }

    public final long getDateAdded() {
        return this.dateAdded;
    }

    public final long getDateAddedMilliseconds() {
        return this.dateAdded * 1000;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final int getGender() {
        return this.gender;
    }

    public final long getLastLogin() {
        return this.lastLogin;
    }

    public final long getLastLoginMilliseconds() {
        return this.lastLogin * 1000;
    }

    public final int getMyProfileViewedCount() {
        return this.myProfileViewedCount;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final int getRelationStatus() {
        return this.relationStatus;
    }

    public final UserMetaData getUserMetaData() {
        return this.userMetaData;
    }

    public final int getVideoWatchedCount() {
        return this.videoWatchedCount;
    }

    public int hashCode() {
        String str = this.fullName;
        long j10 = this.dateAdded;
        long j11 = this.lastLogin;
        return ((((((((((((((a.b(str, this.userMetaData.hashCode() * 31, 31) + this.gender) * 31) + this.age) * 31) + this.relationStatus) * 31) + this.orientation) * 31) + this.videoWatchedCount) * 31) + this.myProfileViewedCount) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        StringBuilder m10 = a.m("User(userMetaData=");
        m10.append(this.userMetaData);
        m10.append(", fullName=");
        m10.append(this.fullName);
        m10.append(", gender=");
        m10.append(this.gender);
        m10.append(", age=");
        m10.append(this.age);
        m10.append(", relationStatus=");
        m10.append(this.relationStatus);
        m10.append(", orientation=");
        m10.append(this.orientation);
        m10.append(", videoWatchedCount=");
        m10.append(this.videoWatchedCount);
        m10.append(", myProfileViewedCount=");
        m10.append(this.myProfileViewedCount);
        m10.append(", dateAdded=");
        m10.append(this.dateAdded);
        m10.append(", lastLogin=");
        m10.append(this.lastLogin);
        m10.append(')');
        return m10.toString();
    }
}
