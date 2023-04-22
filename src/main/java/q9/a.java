package q9;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class a implements Callable<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f14432c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f14433f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Boolean f14434j;

    public a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f14432c = sharedPreferences;
        this.f14433f = str;
        this.f14434j = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.f14432c.getBoolean(this.f14433f, this.f14434j.booleanValue()));
    }
}
