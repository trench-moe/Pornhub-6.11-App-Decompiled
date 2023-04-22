package com.app.pornhub.domain.config;

import com.app.pornhub.domain.model.user.UserAuthLevel;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.user.UserSettings;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/domain/config/UsersConfig;", BuildConfig.FLAVOR, "()V", "Companion", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UsersConfig {
    public static final String AUTO_PLAY_PREF_KEY = "AutoPlay";
    public static final String AUTO_ROTATE_PREF_KEY = "AutoRotate";
    public static final Companion Companion = new Companion(null);
    public static final int GENDER_COMPANY = 4;
    public static final int GENDER_COUPLE = 3;
    public static final int GENDER_F2M = 9;
    public static final int GENDER_FEMALE_COUPLE = 6;
    public static final int GENDER_GIRL = 2;
    public static final int GENDER_GROUP = 8;
    public static final int GENDER_GUY = 1;
    public static final int GENDER_M2F = 5;
    public static final int GENDER_MALE_COUPLE = 7;
    public static final int GENDER_OTHER = 10;
    public static final int MAX_CHARS_EMAIL_SIGNUP = 50;
    public static final int MAX_CHARS_PASSWORD_LOGIN = 40;
    public static final int MAX_CHARS_PASSWORD_SIGNUP = 40;
    public static final int MAX_CHARS_USERNAME_LOGIN = 18;
    public static final int MAX_CHARS_USERNAME_SIGNUP = 18;
    public static final int MIN_CHARS_PASSWORD_LOGIN = 6;
    public static final int MIN_CHARS_PASSWORD_SIGNUP = 6;
    public static final int MIN_CHARS_TAG = 3;
    public static final int MIN_CHARS_USERNAME_LOGIN = 3;
    public static final int MIN_CHARS_USERNAME_SIGNUP = 3;
    public static final int ORIENTATION_BOTH = 3;
    public static final int ORIENTATION_GIRLS = 2;
    public static final int ORIENTATION_GUYS = 1;
    public static final int RELATION_STATUS_OPEN = 3;
    public static final int RELATION_STATUS_SINGLE = 1;
    public static final int RELATION_STATUS_TAKEN = 2;
    public static final String SHOW_DATA_WARNING = "show_data_warning";
    public static final int USERS_PAGE_LIMIT = 16;
    public static final String USER_PREF_KEY = "user";
    public static final String USER_TYPE_EXPIRED = "Expired";
    public static final String USER_TYPE_FREE = "Free";
    public static final String USER_TYPE_PREMIUM = "Premium";
    public static final String USER_TYPE_TRIAL = "Trial";

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0004J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0007J\u0010\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u000200H\u0007J\u0010\u0010.\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0007J\u0010\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020)H\u0007J\u0010\u00105\u001a\u00020,2\u0006\u00104\u001a\u00020)H\u0007J\u0010\u00106\u001a\u00020,2\u0006\u00104\u001a\u00020)H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/app/pornhub/domain/config/UsersConfig$Companion;", BuildConfig.FLAVOR, "()V", "AUTO_PLAY_PREF_KEY", BuildConfig.FLAVOR, "AUTO_ROTATE_PREF_KEY", "GENDER_COMPANY", BuildConfig.FLAVOR, "GENDER_COUPLE", "GENDER_F2M", "GENDER_FEMALE_COUPLE", "GENDER_GIRL", "GENDER_GROUP", "GENDER_GUY", "GENDER_M2F", "GENDER_MALE_COUPLE", "GENDER_OTHER", "MAX_CHARS_EMAIL_SIGNUP", "MAX_CHARS_PASSWORD_LOGIN", "MAX_CHARS_PASSWORD_SIGNUP", "MAX_CHARS_USERNAME_LOGIN", "MAX_CHARS_USERNAME_SIGNUP", "MIN_CHARS_PASSWORD_LOGIN", "MIN_CHARS_PASSWORD_SIGNUP", "MIN_CHARS_TAG", "MIN_CHARS_USERNAME_LOGIN", "MIN_CHARS_USERNAME_SIGNUP", "ORIENTATION_BOTH", "ORIENTATION_GIRLS", "ORIENTATION_GUYS", "RELATION_STATUS_OPEN", "RELATION_STATUS_SINGLE", "RELATION_STATUS_TAKEN", "SHOW_DATA_WARNING", "USERS_PAGE_LIMIT", "USER_PREF_KEY", "USER_TYPE_EXPIRED", "USER_TYPE_FREE", "USER_TYPE_PREMIUM", "USER_TYPE_TRIAL", "getUserAuthLevel", "Lcom/app/pornhub/domain/model/user/UserAuthLevel;", "userType", "hasMoreFriends", BuildConfig.FLAVOR, "size", "isGay", "userOrientation", "Lcom/app/pornhub/domain/model/user/UserOrientation;", "userSettings", "Lcom/app/pornhub/domain/model/user/UserSettings;", "isPremiumAllowed", "userAuthLevel", "isPremiumExpired", "isUserLoggedIn", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserAuthLevel getUserAuthLevel(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case 2198156:
                        if (str.equals(UsersConfig.USER_TYPE_FREE)) {
                            return UserAuthLevel.Free.INSTANCE;
                        }
                        break;
                    case 81075958:
                        if (!str.equals(UsersConfig.USER_TYPE_TRIAL)) {
                            break;
                        } else {
                            return UserAuthLevel.Trial.INSTANCE;
                        }
                    case 355417861:
                        if (!str.equals(UsersConfig.USER_TYPE_EXPIRED)) {
                            break;
                        } else {
                            return UserAuthLevel.Expired.INSTANCE;
                        }
                    case 1346201143:
                        if (str.equals(UsersConfig.USER_TYPE_PREMIUM)) {
                            return UserAuthLevel.Premium.INSTANCE;
                        }
                        break;
                }
            }
            return UserAuthLevel.None.INSTANCE;
        }

        public final boolean hasMoreFriends(int i10) {
            return i10 % 16 == 0;
        }

        @JvmStatic
        public final boolean isGay(UserOrientation userOrientation) {
            Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
            return userOrientation instanceof UserOrientation.Gay;
        }

        @JvmStatic
        public final boolean isGay(UserSettings userSettings) {
            Intrinsics.checkNotNullParameter(userSettings, "userSettings");
            return isGay(userSettings.getOrientation());
        }

        @JvmStatic
        public final boolean isPremiumAllowed(UserAuthLevel userAuthLevel) {
            Intrinsics.checkNotNullParameter(userAuthLevel, "userAuthLevel");
            if (!(userAuthLevel instanceof UserAuthLevel.Premium) && !(userAuthLevel instanceof UserAuthLevel.Trial)) {
            }
            return true;
        }

        @JvmStatic
        public final boolean isPremiumExpired(UserAuthLevel userAuthLevel) {
            Intrinsics.checkNotNullParameter(userAuthLevel, "userAuthLevel");
            return userAuthLevel instanceof UserAuthLevel.Expired;
        }

        @JvmStatic
        public final boolean isUserLoggedIn(UserAuthLevel userAuthLevel) {
            Intrinsics.checkNotNullParameter(userAuthLevel, "userAuthLevel");
            return !(userAuthLevel instanceof UserAuthLevel.None);
        }
    }

    @JvmStatic
    public static final boolean isGay(UserOrientation userOrientation) {
        return Companion.isGay(userOrientation);
    }

    @JvmStatic
    public static final boolean isGay(UserSettings userSettings) {
        return Companion.isGay(userSettings);
    }

    @JvmStatic
    public static final boolean isPremiumAllowed(UserAuthLevel userAuthLevel) {
        return Companion.isPremiumAllowed(userAuthLevel);
    }

    @JvmStatic
    public static final boolean isPremiumExpired(UserAuthLevel userAuthLevel) {
        return Companion.isPremiumExpired(userAuthLevel);
    }

    @JvmStatic
    public static final boolean isUserLoggedIn(UserAuthLevel userAuthLevel) {
        return Companion.isUserLoggedIn(userAuthLevel);
    }
}
