package n5;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import n5.m;

/* loaded from: classes2.dex */
public final class j implements m<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13329a;

    /* loaded from: classes2.dex */
    public static final class a implements n<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f13330a;

        public a(Context context) {
            this.f13330a = context;
        }

        @Override // n5.n
        public m<Uri, File> a(q qVar) {
            return new j(this.f13330a);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: j  reason: collision with root package name */
        public static final String[] f13331j = {"_data"};

        /* renamed from: c  reason: collision with root package name */
        public final Context f13332c;

        /* renamed from: f  reason: collision with root package name */
        public final Uri f13333f;

        public b(Context context, Uri uri) {
            this.f13332c = context;
            this.f13333f = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(Priority priority, d.a<? super File> aVar) {
            Cursor query = this.f13332c.getContentResolver().query(this.f13333f, f13331j, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                    query.close();
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.f(new File(r0));
                return;
            }
            StringBuilder m10 = a1.a.m("Failed to find file path for: ");
            m10.append(this.f13333f);
            aVar.c(new FileNotFoundException(m10.toString()));
        }
    }

    public j(Context context) {
        this.f13329a = context;
    }

    @Override // n5.m
    public boolean a(Uri uri) {
        return a0.b.N(uri);
    }

    @Override // n5.m
    public m.a<File> b(Uri uri, int i10, int i11, h5.d dVar) {
        Uri uri2 = uri;
        return new m.a<>(new c6.d(uri2), new b(this.f13329a, uri2));
    }
}
