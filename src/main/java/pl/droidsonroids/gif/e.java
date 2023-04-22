package pl.droidsonroids.gif;

import android.content.res.AssetManager;
import android.content.res.Resources;

/* loaded from: classes3.dex */
public abstract class e {

    /* loaded from: classes3.dex */
    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f14128a;

        /* renamed from: b  reason: collision with root package name */
        public final String f14129b;

        public b(AssetManager assetManager, String str) {
            super(null);
            this.f14128a = assetManager;
            this.f14129b = str;
        }

        @Override // pl.droidsonroids.gif.e
        public GifInfoHandle a() {
            return new GifInfoHandle(this.f14128a.openFd(this.f14129b));
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f14130a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14131b;

        public c(Resources resources, int i10) {
            super(null);
            this.f14130a = resources;
            this.f14131b = i10;
        }

        @Override // pl.droidsonroids.gif.e
        public GifInfoHandle a() {
            return new GifInfoHandle(this.f14130a.openRawResourceFd(this.f14131b));
        }
    }

    public e(a aVar) {
    }

    public abstract GifInfoHandle a();
}
