package com.app.pornhub.data.model.user;

import a0.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0018J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00109\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010 J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jà\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\u00072\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u000fHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\u0006\u0010#R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010!\u001a\u0004\b(\u0010 R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b)\u0010\u001cR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b*\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001aR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b0\u0010\u001c¨\u0006I"}, d2 = {"Lcom/app/pornhub/data/model/user/UserModel;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "username", "urlThumbnail", "isVerified", BuildConfig.FLAVOR, "channelId", "emailVerificationRequired", "userType", "accessToken", "refreshToken", "fullName", "gender", BuildConfig.FLAVOR, "age", "relationStatus", "orientation", "videoWatchedCount", "myProfileViewedCount", "dateAdded", BuildConfig.FLAVOR, "lastLogin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V", "getAccessToken", "()Ljava/lang/String;", "getAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChannelId", "getDateAdded", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEmailVerificationRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFullName", "getGender", "getId", "getLastLogin", "getMyProfileViewedCount", "getOrientation", "getRefreshToken", "getRelationStatus", "getUrlThumbnail", "getUserType", "getUsername", "getVideoWatchedCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)Lcom/app/pornhub/data/model/user/UserModel;", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserModel {
    private final String accessToken;
    private final Integer age;
    private final String channelId;
    private final Long dateAdded;
    private final Boolean emailVerificationRequired;
    private final String fullName;
    private final Integer gender;

    /* renamed from: id  reason: collision with root package name */
    private final String f4349id;
    private final Boolean isVerified;
    private final Long lastLogin;
    private final Integer myProfileViewedCount;
    private final Integer orientation;
    private final String refreshToken;
    private final Integer relationStatus;
    private final String urlThumbnail;
    private final String userType;
    private final String username;
    private final Integer videoWatchedCount;

    public UserModel(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2, String str5, String str6, String str7, String str8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l10, Long l11) {
        a.u(str, "id", str2, "username", str3, "urlThumbnail");
        this.f4349id = str;
        this.username = str2;
        this.urlThumbnail = str3;
        this.isVerified = bool;
        this.channelId = str4;
        this.emailVerificationRequired = bool2;
        this.userType = str5;
        this.accessToken = str6;
        this.refreshToken = str7;
        this.fullName = str8;
        this.gender = num;
        this.age = num2;
        this.relationStatus = num3;
        this.orientation = num4;
        this.videoWatchedCount = num5;
        this.myProfileViewedCount = num6;
        this.dateAdded = l10;
        this.lastLogin = l11;
    }

    public final String component1() {
        return this.f4349id;
    }

    public final String component10() {
        return this.fullName;
    }

    public final Integer component11() {
        return this.gender;
    }

    public final Integer component12() {
        return this.age;
    }

    public final Integer component13() {
        return this.relationStatus;
    }

    public final Integer component14() {
        return this.orientation;
    }

    public final Integer component15() {
        return this.videoWatchedCount;
    }

    public final Integer component16() {
        return this.myProfileViewedCount;
    }

    public final Long component17() {
        return this.dateAdded;
    }

    public final Long component18() {
        return this.lastLogin;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.urlThumbnail;
    }

    public final Boolean component4() {
        return this.isVerified;
    }

    public final String component5() {
        return this.channelId;
    }

    public final Boolean component6() {
        return this.emailVerificationRequired;
    }

    public final String component7() {
        return this.userType;
    }

    public final String component8() {
        return this.accessToken;
    }

    public final String component9() {
        return this.refreshToken;
    }

    public final UserModel copy(String id2, String username, String urlThumbnail, Boolean bool, String str, Boolean bool2, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l10, Long l11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(urlThumbnail, "urlThumbnail");
        return new UserModel(id2, username, urlThumbnail, bool, str, bool2, str2, str3, str4, str5, num, num2, num3, num4, num5, num6, l10, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserModel) {
            UserModel userModel = (UserModel) obj;
            return Intrinsics.areEqual(this.f4349id, userModel.f4349id) && Intrinsics.areEqual(this.username, userModel.username) && Intrinsics.areEqual(this.urlThumbnail, userModel.urlThumbnail) && Intrinsics.areEqual(this.isVerified, userModel.isVerified) && Intrinsics.areEqual(this.channelId, userModel.channelId) && Intrinsics.areEqual(this.emailVerificationRequired, userModel.emailVerificationRequired) && Intrinsics.areEqual(this.userType, userModel.userType) && Intrinsics.areEqual(this.accessToken, userModel.accessToken) && Intrinsics.areEqual(this.refreshToken, userModel.refreshToken) && Intrinsics.areEqual(this.fullName, userModel.fullName) && Intrinsics.areEqual(this.gender, userModel.gender) && Intrinsics.areEqual(this.age, userModel.age) && Intrinsics.areEqual(this.relationStatus, userModel.relationStatus) && Intrinsics.areEqual(this.orientation, userModel.orientation) && Intrinsics.areEqual(this.videoWatchedCount, userModel.videoWatchedCount) && Intrinsics.areEqual(this.myProfileViewedCount, userModel.myProfileViewedCount) && Intrinsics.areEqual(this.dateAdded, userModel.dateAdded) && Intrinsics.areEqual(this.lastLogin, userModel.lastLogin);
        }
        return false;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Integer getAge() {
        return this.age;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final Long getDateAdded() {
        return this.dateAdded;
    }

    public final Boolean getEmailVerificationRequired() {
        return this.emailVerificationRequired;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final Integer getGender() {
        return this.gender;
    }

    public final String getId() {
        return this.f4349id;
    }

    public final Long getLastLogin() {
        return this.lastLogin;
    }

    public final Integer getMyProfileViewedCount() {
        return this.myProfileViewedCount;
    }

    public final Integer getOrientation() {
        return this.orientation;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final Integer getRelationStatus() {
        return this.relationStatus;
    }

    public final String getUrlThumbnail() {
        return this.urlThumbnail;
    }

    public final String getUserType() {
        return this.userType;
    }

    public final String getUsername() {
        return this.username;
    }

    public final Integer getVideoWatchedCount() {
        return this.videoWatchedCount;
    }

    public int hashCode() {
        int b10 = a1.a.b(this.urlThumbnail, a1.a.b(this.username, this.f4349id.hashCode() * 31, 31), 31);
        Boolean bool = this.isVerified;
        int i10 = 0;
        int hashCode = (b10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.channelId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.emailVerificationRequired;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.userType;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accessToken;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.refreshToken;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fullName;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.gender;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.age;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.relationStatus;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.orientation;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.videoWatchedCount;
        int hashCode12 = (hashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.myProfileViewedCount;
        int hashCode13 = (hashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l10 = this.dateAdded;
        int hashCode14 = (hashCode13 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.lastLogin;
        if (l11 != null) {
            i10 = l11.hashCode();
        }
        return hashCode14 + i10;
    }

    public final Boolean isVerified() {
        return this.isVerified;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("UserModel(id=");
        m10.append(this.f4349id);
        m10.append(", username=");
        m10.append(this.username);
        m10.append(", urlThumbnail=");
        m10.append(this.urlThumbnail);
        m10.append(", isVerified=");
        m10.append(this.isVerified);
        m10.append(", channelId=");
        m10.append((Object) this.channelId);
        m10.append(", emailVerificationRequired=");
        m10.append(this.emailVerificationRequired);
        m10.append(", userType=");
        m10.append((Object) this.userType);
        m10.append(", accessToken=");
        m10.append((Object) this.accessToken);
        m10.append(", refreshToken=");
        m10.append((Object) this.refreshToken);
        m10.append(", fullName=");
        m10.append((Object) this.fullName);
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
