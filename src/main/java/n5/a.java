package n5;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;
import n5.m;

/* loaded from: classes2.dex */
public class a<Data> implements m<Uri, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f13299a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0220a<Data> f13300b;

    /* renamed from: n5.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0220a<Data> {
        com.bumptech.glide.load.data.d<Data> b(AssetManager assetManager, String str);
    }

    /* loaded from: classes2.dex */
    public static class b implements n<Uri, AssetFileDescriptor>, InterfaceC0220a<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f13301a;

        public b(AssetManager assetManager) {
            this.f13301a = assetManager;
        }

        @Override // n5.n
        public m<Uri, AssetFileDescriptor> a(q qVar) {
            return new a(this.f13301a, this);
        }

        @Override // n5.a.InterfaceC0220a
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> b(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements n<Uri, InputStream>, InterfaceC0220a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f13302a;

        public c(AssetManager assetManager) {
            this.f13302a = assetManager;
        }

        @Override // n5.n
        public m<Uri, InputStream> a(q qVar) {
            return new a(this.f13302a, this);
        }

        @Override // n5.a.InterfaceC0220a
        public com.bumptech.glide.load.data.d<InputStream> b(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }
    }

    public a(AssetManager assetManager, InterfaceC0220a<Data> interfaceC0220a) {
        this.f13299a = assetManager;
        this.f13300b = interfaceC0220a;
    }

    @Override // n5.m
    public boolean a(Uri uri) {
        Uri uri2 = uri;
        boolean z10 = false;
        if ("file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0))) {
            z10 = true;
        }
        return z10;
    }

    @Override // n5.m
    public m.a b(Uri uri, int i10, int i11, h5.d dVar) {
        Uri uri2 = uri;
        return new m.a(new c6.d(uri2), this.f13300b.b(this.f13299a, uri2.toString().substring(22)));
    }
}
