package q9;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class c implements Callable<Long> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f14438c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f14439f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Long f14440j;

    public c(SharedPreferences sharedPreferences, String str, Long l10) {
        this.f14438c = sharedPreferences;
        this.f14439f = str;
        this.f14440j = l10;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Long call() {
        return Long.valueOf(this.f14438c.getLong(this.f14439f, this.f14440j.longValue()));
    }
}
