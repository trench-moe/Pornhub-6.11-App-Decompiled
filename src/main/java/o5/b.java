package o5;

import android.content.Context;
import android.net.Uri;
import i5.a;
import java.io.InputStream;
import n5.m;
import n5.n;
import n5.q;

/* loaded from: classes2.dex */
public class b implements m<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13583a;

    /* loaded from: classes2.dex */
    public static class a implements n<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f13584a;

        public a(Context context) {
            this.f13584a = context;
        }

        @Override // n5.n
        public m<Uri, InputStream> a(q qVar) {
            return new b(this.f13584a);
        }
    }

    public b(Context context) {
        this.f13583a = context.getApplicationContext();
    }

    @Override // n5.m
    public boolean a(Uri uri) {
        Uri uri2 = uri;
        return a0.b.N(uri2) && !uri2.getPathSegments().contains("video");
    }

    @Override // n5.m
    public m.a<InputStream> b(Uri uri, int i10, int i11, h5.d dVar) {
        Uri uri2 = uri;
        if (a0.b.O(i10, i11)) {
            c6.d dVar2 = new c6.d(uri2);
            Context context = this.f13583a;
            return new m.a<>(dVar2, i5.a.c(context, uri2, new a.C0152a(context.getContentResolver())));
        }
        return null;
    }
}
