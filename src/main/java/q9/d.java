package q9;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class d implements Callable<String> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f14441c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f14442f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f14443j;

    public d(SharedPreferences sharedPreferences, String str, String str2) {
        this.f14441c = sharedPreferences;
        this.f14442f = str;
        this.f14443j = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() {
        return this.f14441c.getString(this.f14442f, this.f14443j);
    }
}
