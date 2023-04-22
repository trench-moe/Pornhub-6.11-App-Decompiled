package x8;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f18062a;

    /* renamed from: b  reason: collision with root package name */
    public final w8.b f18063b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f18064c;
    public d d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18065e;

    /* renamed from: f  reason: collision with root package name */
    public a f18066f;

    public b(Context context) {
        w8.b bVar = new w8.b(-1, 0, 0);
        this.f18062a = context;
        this.f18063b = bVar;
        c();
    }

    public b(Context context, w8.b bVar) {
        this.f18062a = context;
        this.f18063b = bVar;
        c();
    }

    public final void a() {
        c();
        this.f18066f = null;
    }

    public final boolean b(Uri uri) {
        int i10;
        if (uri == null) {
            c();
            return true;
        } else if (uri.equals(this.f18064c)) {
            return this.f18065e;
        } else {
            c();
            this.f18064c = uri;
            w8.b bVar = this.f18063b;
            int i11 = bVar.f16955f;
            if (i11 == 0 || (i10 = bVar.f16956j) == 0) {
                this.d = new d(this.f18062a, 0, 0, false, this);
            } else {
                this.d = new d(this.f18062a, i11, i10, false, this);
            }
            d dVar = this.d;
            Objects.requireNonNull(dVar, "null reference");
            Uri uri2 = this.f18064c;
            Objects.requireNonNull(uri2, "null reference");
            dVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
            return false;
        }
    }

    public final void c() {
        d dVar = this.d;
        if (dVar != null) {
            dVar.cancel(true);
            this.d = null;
        }
        this.f18064c = null;
        this.f18065e = false;
    }
}
