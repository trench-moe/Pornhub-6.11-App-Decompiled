package q3;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.app.pornhub.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f14324a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f14325b;

    /* renamed from: c  reason: collision with root package name */
    public final b3.e f14326c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14327e;

    /* renamed from: f  reason: collision with root package name */
    public final String f14328f;

    /* renamed from: g  reason: collision with root package name */
    public final String f14329g;

    /* renamed from: h  reason: collision with root package name */
    public final String f14330h;

    /* renamed from: i  reason: collision with root package name */
    public final String f14331i;

    /* renamed from: j  reason: collision with root package name */
    public final String f14332j;

    /* renamed from: k  reason: collision with root package name */
    public final String f14333k;

    /* renamed from: l  reason: collision with root package name */
    public final String f14334l;

    /* renamed from: m  reason: collision with root package name */
    public final String f14335m;
    public final String n;

    /* renamed from: o  reason: collision with root package name */
    public final String f14336o;

    /* renamed from: p  reason: collision with root package name */
    public final String f14337p;

    /* renamed from: q  reason: collision with root package name */
    public final String f14338q;

    public g(Resources resources, SharedPreferences preferences, b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f14324a = resources;
        this.f14325b = preferences;
        this.f14326c = currentUserRepository;
        String string = resources.getString(R.string.ads_interstitial_url);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.ads_interstitial_url)");
        this.d = q(string, currentUserRepository.c());
        String string2 = resources.getString(R.string.login_banner_url);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.login_banner_url)");
        this.f14327e = q(string2, currentUserRepository.c());
        String string3 = resources.getString(R.string.signup_button_url);
        Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.signup_button_url)");
        this.f14328f = q(string3, currentUserRepository.c());
        String string4 = resources.getString(R.string.upgrade_menu_url);
        Intrinsics.checkNotNullExpressionValue(string4, "resources.getString(R.string.upgrade_menu_url)");
        this.f14329g = q(string4, currentUserRepository.c());
        String string5 = resources.getString(R.string.offline_videos_menu_url);
        Intrinsics.checkNotNullExpressionValue(string5, "resources.getString(R.st….offline_videos_menu_url)");
        this.f14330h = q(string5, currentUserRepository.c());
        String string6 = resources.getString(R.string.offline_video_action_button_url);
        Intrinsics.checkNotNullExpressionValue(string6, "resources.getString(R.st…_video_action_button_url)");
        this.f14331i = q(string6, currentUserRepository.c());
        String string7 = resources.getString(R.string.locked_video_url);
        Intrinsics.checkNotNullExpressionValue(string7, "resources.getString(R.string.locked_video_url)");
        this.f14332j = q(string7, currentUserRepository.c());
        String string8 = resources.getString(R.string.quality_upsell_url);
        Intrinsics.checkNotNullExpressionValue(string8, "resources.getString(R.string.quality_upsell_url)");
        this.f14333k = q(string8, currentUserRepository.c());
        String string9 = resources.getString(R.string.onboarding_upsell_url);
        Intrinsics.checkNotNullExpressionValue(string9, "resources.getString(R.st…ng.onboarding_upsell_url)");
        this.f14334l = q(string9, currentUserRepository.c());
        String string10 = resources.getString(R.string.onboarding_upsell_appsflyer_url);
        Intrinsics.checkNotNullExpressionValue(string10, "resources.getString(R.st…ing_upsell_appsflyer_url)");
        q(string10, currentUserRepository.c());
        this.f14335m = Intrinsics.stringPlus(p(), resources.getString(R.string.app_download_url));
        this.n = Intrinsics.stringPlus(p(), resources.getString(R.string.terms_and_conditions_url));
        this.f14336o = Intrinsics.stringPlus(p(), resources.getString(R.string.resend_email_url));
        this.f14337p = Intrinsics.stringPlus(p(), resources.getString(R.string.privacy_url));
        this.f14338q = Intrinsics.stringPlus(p(), resources.getString(R.string.terms_and_conditions_url));
    }

    @Override // q3.d
    public String a() {
        return this.f14338q;
    }

    @Override // q3.d
    public String b() {
        return this.f14327e;
    }

    @Override // q3.d
    public String c() {
        return this.f14329g;
    }

    @Override // q3.d
    public String d() {
        return this.f14333k;
    }

    @Override // q3.d
    public String e() {
        return this.f14332j;
    }

    @Override // q3.d
    public String f() {
        return this.f14334l;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @Override // q3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String g() {
        /*
            r6 = this;
            android.content.SharedPreferences r0 = r6.f14325b
            r5 = 2
            android.content.res.Resources r1 = r6.f14324a
            r4 = 6
            r2 = 2131952232(0x7f130268, float:1.95409E38)
            r4 = 5
            java.lang.String r3 = r1.getString(r2)
            r1 = r3
            java.lang.String r2 = ""
            r5 = 6
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L1a
            r0 = 0
            goto L24
        L1a:
            java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r0)
            r0 = r3
            java.lang.String r3 = r0.toString()
            r0 = r3
        L24:
            if (r0 == 0) goto L32
            int r3 = r0.length()
            r1 = r3
            if (r1 != 0) goto L2f
            r4 = 3
            goto L33
        L2f:
            r1 = 0
            r5 = 4
            goto L35
        L32:
            r4 = 6
        L33:
            r3 = 1
            r1 = r3
        L35:
            if (r1 != 0) goto L50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "https://"
            r2 = r3
            r1.append(r2)
            r1.append(r0)
            r0 = 47
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            r0 = r3
            goto L62
        L50:
            r4 = 1
            android.content.res.Resources r0 = r6.f14324a
            r1 = 2131952220(0x7f13025c, float:1.9540877E38)
            r5 = 3
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r3 = "{\n                resour…m_base_url)\n            }"
            r1 = r3
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r5 = 2
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.g.g():java.lang.String");
    }

    @Override // q3.d
    public String h() {
        return this.f14328f;
    }

    @Override // q3.d
    public String i() {
        return this.f14336o;
    }

    @Override // q3.d
    public String j() {
        return this.f14335m;
    }

    @Override // q3.d
    public String k() {
        return this.n;
    }

    @Override // q3.d
    public String l() {
        return this.f14330h;
    }

    @Override // q3.d
    public String m() {
        return this.f14331i;
    }

    @Override // q3.d
    public String n() {
        return this.f14337p;
    }

    @Override // q3.d
    public String o() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String p() {
        /*
            r6 = this;
            android.content.SharedPreferences r0 = r6.f14325b
            android.content.res.Resources r1 = r6.f14324a
            r2 = 2131952231(0x7f130267, float:1.9540899E38)
            r4 = 5
            java.lang.String r3 = r1.getString(r2)
            r1 = r3
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L18
            r3 = 0
            r0 = r3
            goto L20
        L18:
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r0)
            java.lang.String r0 = r0.toString()
        L20:
            if (r0 == 0) goto L2e
            r5 = 2
            int r3 = r0.length()
            r1 = r3
            if (r1 != 0) goto L2b
            goto L2f
        L2b:
            r3 = 0
            r1 = r3
            goto L31
        L2e:
            r4 = 4
        L2f:
            r3 = 1
            r1 = r3
        L31:
            if (r1 != 0) goto L4f
            r4 = 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r5 = 5
            java.lang.String r2 = "https://"
            r4 = 7
            r1.append(r2)
            r1.append(r0)
            r0 = 47
            r5 = 3
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            r0 = r3
            goto L60
        L4f:
            r4 = 4
            android.content.res.Resources r0 = r6.f14324a
            r1 = 2131952219(0x7f13025b, float:1.9540875E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r3 = "{\n                resour…b_base_url)\n            }"
            r1 = r3
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r5 = 1
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.g.p():java.lang.String");
    }

    public final String q(String str, String str2) {
        if (str2 == null) {
            return p() + "android_app/" + str;
        }
        return p() + "android_app/" + str + "?userId=" + ((Object) str2);
    }
}
