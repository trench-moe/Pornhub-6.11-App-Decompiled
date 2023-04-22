package x2;

import android.content.SharedPreferences;
import com.app.pornhub.data.model.user.LoginRequestModel;
import com.app.pornhub.data.model.user.SignUpTokenModel;
import com.app.pornhub.data.model.user.TwoFactorAuthRequestModel;
import com.app.pornhub.data.model.user.UserModel;
import com.app.pornhub.data.model.user.UserResponse;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.config.VideoQuality;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.Optional;
import com.app.pornhub.domain.model.OptionalKt;
import com.app.pornhub.domain.model.user.User;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.user.UserSettings;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes2.dex */
public final class m0 implements b3.e {

    /* renamed from: a  reason: collision with root package name */
    public final w2.b f17795a;

    /* renamed from: b  reason: collision with root package name */
    public final p2.d f17796b;

    /* renamed from: c  reason: collision with root package name */
    public final p2.a f17797c;
    public final s2.a d;

    /* renamed from: e  reason: collision with root package name */
    public final r2.a f17798e;

    /* renamed from: f  reason: collision with root package name */
    public final y2.a f17799f;

    /* renamed from: g  reason: collision with root package name */
    public final String f17800g;

    /* renamed from: h  reason: collision with root package name */
    public final SharedPreferences f17801h;

    /* renamed from: i  reason: collision with root package name */
    public final SharedPreferences f17802i;

    /* renamed from: j  reason: collision with root package name */
    public SignUpTokenModel f17803j;

    /* renamed from: k  reason: collision with root package name */
    public UserMetaData f17804k;

    /* renamed from: l  reason: collision with root package name */
    public final PublishSubject<Optional<UserMetaData>> f17805l;

    /* renamed from: m  reason: collision with root package name */
    public final PublishSubject<UserSettings> f17806m;
    public UserSettings n;

    /* renamed from: o  reason: collision with root package name */
    public String f17807o;

    /* renamed from: p  reason: collision with root package name */
    public final String f17808p;

    public m0(w2.b authService, p2.d tokenService, p2.a tokenStorage, s2.a modelMapper, r2.a serializationHelper, y2.a exceptionMapper, String androidId, SharedPreferences persistentPrefs, SharedPreferences userPrefs) {
        Intrinsics.checkNotNullParameter(authService, "authService");
        Intrinsics.checkNotNullParameter(tokenService, "tokenService");
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(serializationHelper, "serializationHelper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        Intrinsics.checkNotNullParameter(androidId, "androidId");
        Intrinsics.checkNotNullParameter(persistentPrefs, "persistentPrefs");
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        this.f17795a = authService;
        this.f17796b = tokenService;
        this.f17797c = tokenStorage;
        this.d = modelMapper;
        this.f17798e = serializationHelper;
        this.f17799f = exceptionMapper;
        this.f17800g = androidId;
        this.f17801h = persistentPrefs;
        this.f17802i = userPrefs;
        PublishSubject<Optional<UserMetaData>> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "create<Optional<UserMetaData>>()");
        this.f17805l = create;
        PublishSubject<UserSettings> create2 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create2, "create<UserSettings>()");
        this.f17806m = create2;
        this.f17807o = BuildConfig.FLAVOR;
        this.f17808p = "user/renew?userId=%s&uuid=%s&token=%s";
        this.n = new UserSettings(persistentPrefs.getBoolean("user_orientation_is_gay", false) ? UserOrientation.Gay.INSTANCE : UserOrientation.Straight.INSTANCE, VideoQuality.Q480p.INSTANCE, false, persistentPrefs.getBoolean(UsersConfig.AUTO_ROTATE_PREF_KEY, true), persistentPrefs.getBoolean(UsersConfig.AUTO_PLAY_PREF_KEY, true), persistentPrefs.getBoolean(UsersConfig.SHOW_DATA_WARNING, true));
        if (this.f17804k != null) {
            return;
        }
        String json = userPrefs.getString(UsersConfig.USER_PREF_KEY, BuildConfig.FLAVOR);
        if (json == null || json.length() == 0) {
            return;
        }
        Objects.requireNonNull(serializationHelper);
        Intrinsics.checkNotNullParameter(json, "json");
        UserModel userModel = (UserModel) serializationHelper.f14621a.a(UserModel.class).fromJson(json);
        if (userModel != null) {
            this.f17804k = modelMapper.s(userModel);
        } else {
            kf.a.f12078a.c("Couldn't parse user model from a value stored in shared preferences.", new Object[0]);
        }
        create.onNext(OptionalKt.asOptional(this.f17804k));
    }

    @Override // b3.e
    public Single<Boolean> a() {
        Single<Boolean> map = m9.a.i(this.f17795a.d(new TwoFactorAuthRequestModel(this.f17807o, null, 2, null))).doOnError(new x(this, 1)).map(a0.f17672j);
        Intrinsics.checkNotNullExpressionValue(map, "authService.resendCode(\n…  it.result\n            }");
        return map;
    }

    @Override // b3.e
    public void b(UserSettings userSettings) {
        Intrinsics.checkNotNullParameter(userSettings, "userSettings");
        this.n = userSettings;
        x(userSettings.getOrientation());
        this.f17801h.edit().putBoolean(UsersConfig.AUTO_PLAY_PREF_KEY, userSettings.isAutoPlayEnabled()).apply();
        this.f17801h.edit().putBoolean(UsersConfig.AUTO_ROTATE_PREF_KEY, userSettings.isAutoRotateEnabled()).apply();
        this.f17806m.onNext(this.n);
    }

    @Override // b3.e
    public String c() {
        UserMetaData userMetaData = this.f17804k;
        if (userMetaData == null) {
            return null;
        }
        return userMetaData.getId();
    }

    @Override // b3.e
    public String d(String baseUrl) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = this.f17808p;
        Object[] objArr = new Object[3];
        String c10 = c();
        if (c10 == null) {
            c10 = BuildConfig.FLAVOR;
        }
        objArr[0] = c10;
        objArr[1] = this.f17800g;
        objArr[2] = this.f17797c.d();
        String format = String.format(str, Arrays.copyOf(objArr, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return Intrinsics.stringPlus(baseUrl, format);
    }

    @Override // b3.e
    public Single<UserMetaData> e(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        Single<UserResponse> doOnSuccess = this.f17795a.c(new TwoFactorAuthRequestModel(this.f17807o, code)).doOnSuccess(new f0(this, 1));
        Intrinsics.checkNotNullExpressionValue(doOnSuccess, "authService.verifyCode(\n… saveTokens(it)\n        }");
        Single map = m9.a.i(doOnSuccess).doOnError(new d0(this, 1)).map(new j(this, 1));
        Intrinsics.checkNotNullExpressionValue(map, "authService.verifyCode(\n…          }\n            }");
        Single map2 = map.flatMap(new h0(this, 1)).map(l0.f17783f);
        Intrinsics.checkNotNullExpressionValue(map2, "performTwoFactorAuthLogi…serMetaData\n            }");
        return m9.a.i(map2);
    }

    @Override // b3.e
    public UserSettings f() {
        return this.n;
    }

    @Override // b3.e
    public void g(boolean z10) {
        this.n = this.n.changeShowDataWarning(z10);
    }

    @Override // b3.e
    public Single<UserMetaData> h(String refreshToken) {
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        this.f17797c.e("N/A");
        this.f17797c.b(refreshToken);
        Single<UserMetaData> map = o().flatMap(new e(this, 1)).map(new g0(this, 0));
        Intrinsics.checkNotNullExpressionValue(map, "getNewAccessTokenSingle(…serMetaData\n            }");
        return map;
    }

    @Override // b3.e
    public UserOrientation i() {
        return this.n.getOrientation();
    }

    @Override // b3.e
    public Observable<UserSettings> j() {
        return this.f17806m;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2 A[Catch: IOException -> 0x00f7, TryCatch #0 {IOException -> 0x00f7, blocks: (B:13:0x003c, B:25:0x006f, B:27:0x0082, B:36:0x0094, B:42:0x00a2, B:44:0x00c4, B:45:0x00cc, B:23:0x0067, B:19:0x005c, B:47:0x00ce, B:55:0x00ed, B:56:0x00f6, B:52:0x00df, B:53:0x00eb), top: B:62:0x003c }] */
    @Override // b3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.app.pornhub.domain.model.user.UserMetaData k() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.m0.k():com.app.pornhub.domain.model.user.UserMetaData");
    }

    @Override // b3.e
    public void l() {
        this.f17802i.edit().remove(UsersConfig.USER_PREF_KEY).apply();
        this.f17797c.a();
        this.f17804k = null;
        this.f17805l.onNext(OptionalKt.asOptional(null));
    }

    @Override // b3.e
    public void m(VideoQuality videoQuality) {
        Intrinsics.checkNotNullParameter(videoQuality, "videoQuality");
        this.n = this.n.changeVideoQuality(videoQuality);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    @Override // b3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.Completable n() {
        /*
            r13 = this;
            r9 = r13
            kf.a$a r0 = kf.a.f12078a
            com.app.pornhub.data.model.user.SignUpTokenModel r1 = r9.f17803j
            r11 = 6
            java.lang.String r2 = "Signup token fresh?: "
            r12 = 1
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r1)
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r0.c(r1, r3)
            r11 = 5
            com.app.pornhub.data.model.user.SignUpTokenModel r0 = r9.f17803j
            r11 = 1
            r1 = r11
            if (r0 == 0) goto L3e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            long r3 = r0.getExpiration()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r0.toSeconds(r5)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            r11 = 2
            r7 = 3
            long r7 = r0.toSeconds(r7)
            long r7 = r7 + r5
            r12 = 1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r11 = 6
            if (r0 < 0) goto L3e
            r11 = 1
            r0 = r11
            goto L40
        L3e:
            r12 = 0
            r0 = r12
        L40:
            if (r0 == 0) goto L4f
            io.reactivex.Completable r11 = io.reactivex.Completable.complete()
            r0 = r11
            java.lang.String r12 = "complete()"
            r1 = r12
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r11 = 2
            return r0
        L4f:
            w2.b r0 = r9.f17795a
            io.reactivex.Single r0 = r0.b()
            io.reactivex.Single r11 = m9.a.i(r0)
            r0 = r11
            x2.g r3 = new x2.g
            r3.<init>(r9, r1)
            r12 = 1
            io.reactivex.Single r11 = r0.doOnSuccess(r3)
            r0 = r11
            x2.e0 r1 = new x2.e0
            r11 = 4
            r1.<init>(r9, r2)
            io.reactivex.Single r0 = r0.doOnError(r1)
            io.reactivex.Completable r11 = r0.ignoreElement()
            r0 = r11
            java.lang.String r1 = "authService.getSignupTok…         .ignoreElement()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.m0.n():io.reactivex.Completable");
    }

    @Override // b3.e
    public Single<Optional<UserMetaData>> o() {
        Single fromCallable = Single.fromCallable(new Callable() { // from class: x2.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m0 this$0 = m0.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return OptionalKt.asOptional(this$0.k());
            }
        });
        Intrinsics.checkNotNullExpressionValue(fromCallable, "fromCallable { getNewAccessToken().asOptional() }");
        Single<Optional<UserMetaData>> onErrorReturn = m9.a.i(fromCallable).doOnError(new x(this, 0)).onErrorReturn(a0.f17671f);
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "fromCallable { getNewAcc…sOptional()\n            }");
        return onErrorReturn;
    }

    @Override // b3.e
    public UserMetaData p() {
        return this.f17804k;
    }

    @Override // b3.e
    public Observable<UserOrientation> q() {
        Observable map = this.f17806m.map(z.f17900f);
        Intrinsics.checkNotNullExpressionValue(map, "userSettingsSubject.map { it.orientation }");
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    @Override // b3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.Single<com.app.pornhub.domain.model.user.UserMetaData> r(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.m0.r(java.lang.String, java.lang.String, java.lang.String, java.lang.String):io.reactivex.Single");
    }

    @Override // b3.e
    public Observable<Optional<UserMetaData>> s() {
        Observable<Optional<UserMetaData>> observeOn = this.f17805l.observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observeOn, "userSubject.observeOn(An…dSchedulers.mainThread())");
        return observeOn;
    }

    @Override // b3.e
    public Single<UserMetaData> t(String str, String str2, String str3) {
        a0.a.u(str, "username", str2, "password", str3, "token");
        w2.b bVar = this.f17795a;
        if (str3.length() == 0) {
            str3 = null;
        }
        Single map = m9.a.i(bVar.e(new LoginRequestModel(str, str2, str3))).doOnError(new a(this, 2)).map(new h0(this, 0));
        Intrinsics.checkNotNullExpressionValue(map, "authService.login(\n     …          }\n            }");
        Single map2 = map.flatMap(new k(this, 2)).map(k0.f17766f);
        Intrinsics.checkNotNullExpressionValue(map2, "performLogin(username, p…serMetaData\n            }");
        return m9.a.i(map2);
    }

    public final Single<User> u(final UserMetaData userMetaData) {
        p2.d dVar = this.f17796b;
        String accessToken = userMetaData.getAccessToken();
        Intrinsics.checkNotNull(accessToken);
        Single<User> map = m9.a.i(dVar.a(accessToken)).doOnError(new d0(this, 0)).map(new Function() { // from class: x2.j0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                m0 this$0 = m0.this;
                UserMetaData userMetaData2 = userMetaData;
                UserResponse it = (UserResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(userMetaData2, "$userMetaData");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getError() == null) {
                    if (it.getUser() != null) {
                        User r10 = this$0.d.r(it.getUser());
                        r10.getUserMetaData().setVerified(userMetaData2.isVerified());
                        r10.getUserMetaData().setUserType(userMetaData2.getUserType());
                        r10.getUserMetaData().setEmailVerificationRequired(userMetaData2.getEmailVerificationRequired());
                        UserSettings userSettings = this$0.n;
                        int orientation = r10.getOrientation();
                        int gender = r10.getGender();
                        UserSettings changeOrientation = userSettings.changeOrientation((orientation == 1 && (gender == 1 || gender == 7)) ? UserOrientation.Gay.INSTANCE : UserOrientation.Straight.INSTANCE);
                        this$0.n = changeOrientation;
                        this$0.x(changeOrientation.getOrientation());
                        this$0.f17806m.onNext(this$0.n);
                        this$0.f17804k = r10.getUserMetaData();
                        this$0.f17805l.onNext(OptionalKt.asOptional(r10.getUserMetaData()));
                        this$0.y();
                        return r10;
                    }
                    throw this$0.v("Couldn't fetch profile data after successful login. The UserResponse object didn't contain any of expected data elements.");
                }
                throw new PornhubException(it.getError().getCode(), it.getError().getMessage());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "tokenService.getUserProf…          }\n            }");
        return map;
    }

    public final Throwable v(String str) {
        return new PornhubException(115, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(com.app.pornhub.data.model.user.UserResponse r6) {
        /*
            r5 = this;
            com.app.pornhub.data.model.ErrorModel r0 = r6.getError()
            if (r0 != 0) goto L61
            com.app.pornhub.data.model.user.UserModel r3 = r6.getUser()
            r0 = r3
            if (r0 == 0) goto L61
            com.app.pornhub.data.model.user.UserModel r0 = r6.getUser()
            java.lang.String r3 = r0.getAccessToken()
            r0 = r3
            r3 = 0
            r1 = r3
            r2 = 1
            r4 = 7
            if (r0 == 0) goto L2a
            r4 = 5
            int r3 = r0.length()
            r0 = r3
            if (r0 != 0) goto L26
            r4 = 3
            goto L2a
        L26:
            r4 = 7
            r0 = 0
            r4 = 6
            goto L2c
        L2a:
            r3 = 1
            r0 = r3
        L2c:
            if (r0 != 0) goto L61
            r4 = 2
            com.app.pornhub.data.model.user.UserModel r0 = r6.getUser()
            java.lang.String r0 = r0.getRefreshToken()
            if (r0 == 0) goto L41
            r4 = 1
            int r0 = r0.length()
            if (r0 != 0) goto L42
            r4 = 1
        L41:
            r1 = 1
        L42:
            if (r1 != 0) goto L61
            r4 = 5
            p2.a r0 = r5.f17797c
            com.app.pornhub.data.model.user.UserModel r1 = r6.getUser()
            java.lang.String r3 = r1.getAccessToken()
            r1 = r3
            r0.e(r1)
            p2.a r0 = r5.f17797c
            r4 = 2
            com.app.pornhub.data.model.user.UserModel r6 = r6.getUser()
            java.lang.String r6 = r6.getRefreshToken()
            r0.b(r6)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.m0.w(com.app.pornhub.data.model.user.UserResponse):void");
    }

    public final void x(UserOrientation userOrientation) {
        this.f17801h.edit().putBoolean("user_orientation_is_gay", Intrinsics.areEqual(userOrientation, UserOrientation.Gay.INSTANCE)).apply();
    }

    public final void y() {
        UserMetaData userMetaData = this.f17804k;
        if (userMetaData == null) {
            return;
        }
        Objects.requireNonNull(this.d);
        Intrinsics.checkNotNullParameter(userMetaData, "userMetaData");
        String id2 = userMetaData.getId();
        String username = userMetaData.getUsername();
        String urlThumbnail = userMetaData.getUrlThumbnail();
        boolean isVerified = userMetaData.isVerified();
        UserModel userModel = new UserModel(id2, username, urlThumbnail, Boolean.valueOf(isVerified), userMetaData.getChannelId(), Boolean.valueOf(userMetaData.getEmailVerificationRequired()), userMetaData.getUserType(), userMetaData.getAccessToken(), userMetaData.getRefreshToken(), null, null, null, null, null, null, null, null, null);
        r2.a aVar = this.f17798e;
        Objects.requireNonNull(aVar);
        Intrinsics.checkNotNullParameter(userModel, "userModel");
        String json = aVar.f14621a.a(UserModel.class).toJson(userModel);
        Intrinsics.checkNotNullExpressionValue(json, "userModelJsonAdapter.toJson(userModel)");
        this.f17802i.edit().putString(UsersConfig.USER_PREF_KEY, json).apply();
    }
}
