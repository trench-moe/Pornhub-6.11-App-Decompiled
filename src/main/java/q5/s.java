package q5;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class s implements h5.e<Bitmap, Bitmap> {

    /* loaded from: classes2.dex */
    public static final class a implements j5.i<Bitmap> {

        /* renamed from: c  reason: collision with root package name */
        public final Bitmap f14401c;

        public a(Bitmap bitmap) {
            this.f14401c = bitmap;
        }

        @Override // j5.i
        public void b() {
        }

        @Override // j5.i
        public int c() {
            return d6.l.c(this.f14401c);
        }

        @Override // j5.i
        public Class<Bitmap> d() {
            return Bitmap.class;
        }

        @Override // j5.i
        public Bitmap get() {
            return this.f14401c;
        }
    }

    @Override // h5.e
    public j5.i<Bitmap> a(Bitmap bitmap, int i10, int i11, h5.d dVar) {
        return new a(bitmap);
    }

    @Override // h5.e
    public /* bridge */ /* synthetic */ boolean b(Bitmap bitmap, h5.d dVar) {
        return true;
    }
}
