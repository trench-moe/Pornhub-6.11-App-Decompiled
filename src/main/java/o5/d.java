package o5;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import n5.m;
import n5.n;
import n5.q;

/* loaded from: classes2.dex */
public final class d<DataT> implements m<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13587a;

    /* renamed from: b  reason: collision with root package name */
    public final m<File, DataT> f13588b;

    /* renamed from: c  reason: collision with root package name */
    public final m<Uri, DataT> f13589c;
    public final Class<DataT> d;

    /* loaded from: classes2.dex */
    public static abstract class a<DataT> implements n<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f13590a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f13591b;

        public a(Context context, Class<DataT> cls) {
            this.f13590a = context;
            this.f13591b = cls;
        }

        @Override // n5.n
        public final m<Uri, DataT> a(q qVar) {
            return new d(this.f13590a, qVar.b(File.class, this.f13591b), qVar.b(Uri.class, this.f13591b), this.f13591b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: o5.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0237d<DataT> implements com.bumptech.glide.load.data.d<DataT> {
        public static final String[] A = {"_data"};

        /* renamed from: c  reason: collision with root package name */
        public final Context f13592c;

        /* renamed from: f  reason: collision with root package name */
        public final m<File, DataT> f13593f;

        /* renamed from: j  reason: collision with root package name */
        public final m<Uri, DataT> f13594j;

        /* renamed from: m  reason: collision with root package name */
        public final Uri f13595m;
        public final int n;

        /* renamed from: t  reason: collision with root package name */
        public final int f13596t;

        /* renamed from: u  reason: collision with root package name */
        public final h5.d f13597u;

        /* renamed from: w  reason: collision with root package name */
        public final Class<DataT> f13598w;
        public volatile boolean y;

        /* renamed from: z  reason: collision with root package name */
        public volatile com.bumptech.glide.load.data.d<DataT> f13599z;

        public C0237d(Context context, m<File, DataT> mVar, m<Uri, DataT> mVar2, Uri uri, int i10, int i11, h5.d dVar, Class<DataT> cls) {
            this.f13592c = context.getApplicationContext();
            this.f13593f = mVar;
            this.f13594j = mVar2;
            this.f13595m = uri;
            this.n = i10;
            this.f13596t = i11;
            this.f13597u = dVar;
            this.f13598w = cls;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.f13598w;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f13599z;
            if (dVar != null) {
                dVar.b();
            }
        }

        public final com.bumptech.glide.load.data.d<DataT> c() {
            m.a<DataT> b10;
            Cursor cursor = null;
            if (Environment.isExternalStorageLegacy()) {
                m<File, DataT> mVar = this.f13593f;
                Uri uri = this.f13595m;
                try {
                    Cursor query = this.f13592c.getContentResolver().query(uri, A, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                query.close();
                                b10 = mVar.b(file, this.n, this.f13596t, this.f13597u);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                b10 = this.f13594j.b(this.f13592c.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0 ? MediaStore.setRequireOriginal(this.f13595m) : this.f13595m, this.n, this.f13596t, this.f13597u);
            }
            if (b10 != null) {
                return b10.f13340c;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.y = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f13599z;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(Priority priority, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> c10 = c();
                if (c10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f13595m));
                    return;
                }
                this.f13599z = c10;
                if (this.y) {
                    cancel();
                } else {
                    c10.e(priority, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    public d(Context context, m<File, DataT> mVar, m<Uri, DataT> mVar2, Class<DataT> cls) {
        this.f13587a = context.getApplicationContext();
        this.f13588b = mVar;
        this.f13589c = mVar2;
        this.d = cls;
    }

    @Override // n5.m
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && a0.b.N(uri);
    }

    @Override // n5.m
    public m.a b(Uri uri, int i10, int i11, h5.d dVar) {
        Uri uri2 = uri;
        return new m.a(new c6.d(uri2), new C0237d(this.f13587a, this.f13588b, this.f13589c, uri2, i10, i11, dVar, this.d));
    }
}
