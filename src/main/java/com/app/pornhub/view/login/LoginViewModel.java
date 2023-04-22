package com.app.pornhub.view.login;

import android.content.SharedPreferences;
import com.app.pornhub.domain.model.user.UserAuthLevel;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.appsflyer.oaid.BuildConfig;
import f3.g;
import f3.h;
import f3.o;
import f3.p;
import f3.r;
import f3.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v3.d;
import z3.a;

/* loaded from: classes.dex */
public final class LoginViewModel extends d {
    public final p d;

    /* renamed from: e  reason: collision with root package name */
    public final r f5393e;

    /* renamed from: f  reason: collision with root package name */
    public final t f5394f;

    /* renamed from: g  reason: collision with root package name */
    public final h f5395g;

    /* renamed from: h  reason: collision with root package name */
    public final o f5396h;

    /* renamed from: i  reason: collision with root package name */
    public final g f5397i;

    /* renamed from: j  reason: collision with root package name */
    public final q3.d f5398j;

    /* renamed from: k  reason: collision with root package name */
    public final SharedPreferences f5399k;

    /* renamed from: l  reason: collision with root package name */
    public final androidx.lifecycle.p<a<LoginResult>> f5400l;

    /* loaded from: classes.dex */
    public static abstract class LoginResult {

        @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/app/pornhub/view/login/LoginViewModel$LoginResult$Success;", "Lcom/app/pornhub/view/login/LoginViewModel$LoginResult;", BuildConfig.FLAVOR, "component1", "userId", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/app/pornhub/domain/model/user/UserAuthLevel;", "userAuthLevel", "Lcom/app/pornhub/domain/model/user/UserAuthLevel;", "a", "()Lcom/app/pornhub/domain/model/user/UserAuthLevel;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class Success extends LoginResult {
            private final UserAuthLevel userAuthLevel;
            private final String userId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(String userId, UserAuthLevel userAuthLevel) {
                super(null);
                Intrinsics.checkNotNullParameter(userId, "userId");
                Intrinsics.checkNotNullParameter(userAuthLevel, "userAuthLevel");
                this.userId = userId;
                this.userAuthLevel = userAuthLevel;
            }

            public final UserAuthLevel a() {
                return this.userAuthLevel;
            }

            public final String b() {
                return this.userId;
            }

            public final String component1() {
                return this.userId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Success) {
                    Success success = (Success) obj;
                    if (Intrinsics.areEqual(this.userId, success.userId) && Intrinsics.areEqual(this.userAuthLevel, success.userAuthLevel)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                return this.userAuthLevel.hashCode() + (this.userId.hashCode() * 31);
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("Success(userId=");
                m10.append(this.userId);
                m10.append(", userAuthLevel=");
                m10.append(this.userAuthLevel);
                m10.append(')');
                return m10.toString();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/login/LoginViewModel$LoginResult$TwoFactorAuth;", "Lcom/app/pornhub/view/login/LoginViewModel$LoginResult;", BuildConfig.FLAVOR, "component1", "phoneNumber", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class TwoFactorAuth extends LoginResult {
            private final String phoneNumber;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TwoFactorAuth(String phoneNumber) {
                super(null);
                Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                this.phoneNumber = phoneNumber;
            }

            public final String a() {
                return this.phoneNumber;
            }

            public final String component1() {
                return this.phoneNumber;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TwoFactorAuth) && Intrinsics.areEqual(this.phoneNumber, ((TwoFactorAuth) obj).phoneNumber);
            }

            public int hashCode() {
                return this.phoneNumber.hashCode();
            }

            public String toString() {
                return android.support.v4.media.b.l(a1.a.m("TwoFactorAuth(phoneNumber="), this.phoneNumber, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends LoginResult {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5401a = new a();

            public a() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends LoginResult {

            /* renamed from: a  reason: collision with root package name */
            public static final b f5402a = new b();

            public b() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends LoginResult {

            /* renamed from: a  reason: collision with root package name */
            public final int f5403a;

            public c(int i10) {
                super(null);
                this.f5403a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && this.f5403a == ((c) obj).f5403a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f5403a;
            }

            public String toString() {
                return android.support.v4.media.a.i(a1.a.m("LoginError(errorCode="), this.f5403a, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends LoginResult {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f5404a;

            public d(boolean z10) {
                super(null);
                this.f5404a = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f5404a == ((d) obj).f5404a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v2 */
            /* JADX WARN: Type inference failed for: r0v3 */
            public int hashCode() {
                boolean z10 = this.f5404a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                return r02;
            }

            public String toString() {
                return a0.a.l(a1.a.m("ResendCodeResult(success="), this.f5404a, ')');
            }
        }

        public LoginResult() {
        }

        public LoginResult(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public LoginViewModel(p logInUseCase, r loginWithVerificationCodeUseCase, t resendSmsCodeUseCase, h getCurrentAuthLevelUseCase, o getUserSettingsUseCase, g createPremiumRenewalUrlUseCase, q3.d webLinksManager, SharedPreferences sharedPrefs) {
        Intrinsics.checkNotNullParameter(logInUseCase, "logInUseCase");
        Intrinsics.checkNotNullParameter(loginWithVerificationCodeUseCase, "loginWithVerificationCodeUseCase");
        Intrinsics.checkNotNullParameter(resendSmsCodeUseCase, "resendSmsCodeUseCase");
        Intrinsics.checkNotNullParameter(getCurrentAuthLevelUseCase, "getCurrentAuthLevelUseCase");
        Intrinsics.checkNotNullParameter(getUserSettingsUseCase, "getUserSettingsUseCase");
        Intrinsics.checkNotNullParameter(createPremiumRenewalUrlUseCase, "createPremiumRenewalUrlUseCase");
        Intrinsics.checkNotNullParameter(webLinksManager, "webLinksManager");
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        this.d = logInUseCase;
        this.f5393e = loginWithVerificationCodeUseCase;
        this.f5394f = resendSmsCodeUseCase;
        this.f5395g = getCurrentAuthLevelUseCase;
        this.f5396h = getUserSettingsUseCase;
        this.f5397i = createPremiumRenewalUrlUseCase;
        this.f5398j = webLinksManager;
        this.f5399k = sharedPrefs;
        this.f5400l = new androidx.lifecycle.p<>();
    }

    public final void c(UserMetaData userMetaData) {
        this.f5400l.l(new a<>(new LoginResult.Success(userMetaData.getId(), this.f5395g.a())));
    }
}
