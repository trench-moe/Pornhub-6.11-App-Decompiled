package n5;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import n5.m;

/* loaded from: classes2.dex */
public class v<Data> implements m<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f13376b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a  reason: collision with root package name */
    public final m<f, Data> f13377a;

    /* loaded from: classes2.dex */
    public static class a implements n<Uri, InputStream> {
        @Override // n5.n
        public m<Uri, InputStream> a(q qVar) {
            return new v(qVar.b(f.class, InputStream.class));
        }
    }

    public v(m<f, Data> mVar) {
        this.f13377a = mVar;
    }

    @Override // n5.m
    public boolean a(Uri uri) {
        return f13376b.contains(uri.getScheme());
    }

    @Override // n5.m
    public m.a b(Uri uri, int i10, int i11, h5.d dVar) {
        return this.f13377a.b(new f(uri.toString()), i10, i11, dVar);
    }
}
