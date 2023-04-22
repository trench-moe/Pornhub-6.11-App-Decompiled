package n5;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import n5.m;

/* loaded from: classes2.dex */
public class u<Data> implements m<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f13371b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a  reason: collision with root package name */
    public final c<Data> f13372a;

    /* loaded from: classes2.dex */
    public static final class a implements n<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f13373a;

        public a(ContentResolver contentResolver) {
            this.f13373a = contentResolver;
        }

        @Override // n5.n
        public m<Uri, AssetFileDescriptor> a(q qVar) {
            return new u(this);
        }

        @Override // n5.u.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f13373a, uri);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements n<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f13374a;

        public b(ContentResolver contentResolver) {
            this.f13374a = contentResolver;
        }

        @Override // n5.n
        public m<Uri, ParcelFileDescriptor> a(q qVar) {
            return new u(this);
        }

        @Override // n5.u.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f13374a, uri);
        }
    }

    /* loaded from: classes2.dex */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> b(Uri uri);
    }

    /* loaded from: classes2.dex */
    public static class d implements n<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f13375a;

        public d(ContentResolver contentResolver) {
            this.f13375a = contentResolver;
        }

        @Override // n5.n
        public m<Uri, InputStream> a(q qVar) {
            return new u(this);
        }

        @Override // n5.u.c
        public com.bumptech.glide.load.data.d<InputStream> b(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f13375a, uri);
        }
    }

    public u(c<Data> cVar) {
        this.f13372a = cVar;
    }

    @Override // n5.m
    public boolean a(Uri uri) {
        return f13371b.contains(uri.getScheme());
    }

    @Override // n5.m
    public m.a b(Uri uri, int i10, int i11, h5.d dVar) {
        Uri uri2 = uri;
        return new m.a(new c6.d(uri2), this.f13372a.b(uri2));
    }
}
