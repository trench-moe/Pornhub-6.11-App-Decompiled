package p2;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.oaid.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f13785a;

    /* renamed from: b  reason: collision with root package name */
    public String f13786b;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("intermediate", 0);
        this.f13785a = sharedPreferences;
        String string = sharedPreferences.getString("stringA", BuildConfig.FLAVOR);
        Intrinsics.checkNotNull(string);
        Intrinsics.checkNotNullExpressionValue(string, "sharedPrefs.getString(\"stringA\", \"\")!!");
        this.f13786b = string;
    }

    @Override // p2.a
    public void a() {
        e(BuildConfig.FLAVOR);
        b(BuildConfig.FLAVOR);
    }

    @Override // p2.a
    public void b(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f13785a.edit().putString("stringB", token).apply();
    }

    @Override // p2.a
    public String c() {
        String string = this.f13785a.getString("stringB", BuildConfig.FLAVOR);
        Intrinsics.checkNotNull(string);
        Intrinsics.checkNotNullExpressionValue(string, "sharedPrefs.getString(\"stringB\", \"\")!!");
        return string;
    }

    @Override // p2.a
    public String d() {
        return this.f13786b;
    }

    @Override // p2.a
    public void e(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f13786b = token;
        this.f13785a.edit().putString("stringA", token).apply();
    }
}
