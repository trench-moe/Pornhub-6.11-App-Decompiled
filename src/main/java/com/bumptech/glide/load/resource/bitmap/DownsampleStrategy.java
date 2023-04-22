package com.bumptech.glide.load.resource.bitmap;

/* loaded from: classes.dex */
public abstract class DownsampleStrategy {

    /* renamed from: a  reason: collision with root package name */
    public static final DownsampleStrategy f5838a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final DownsampleStrategy f5839b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final DownsampleStrategy f5840c;
    public static final DownsampleStrategy d;

    /* renamed from: e  reason: collision with root package name */
    public static final DownsampleStrategy f5841e;

    /* renamed from: f  reason: collision with root package name */
    public static final h5.c<DownsampleStrategy> f5842f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f5843g;

    /* loaded from: classes.dex */
    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* loaded from: classes.dex */
    public static class a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i10, int i11, int i12, int i13) {
            SampleSizeRounding sampleSizeRounding = SampleSizeRounding.QUALITY;
            if (b(i10, i11, i12, i13) != 1.0f && !DownsampleStrategy.f5843g) {
                return SampleSizeRounding.MEMORY;
            }
            return sampleSizeRounding;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, DownsampleStrategy.f5838a.b(i10, i11, i12, i13));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i10, int i11, int i12, int i13) {
            return DownsampleStrategy.f5843g ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i10, int i11, int i12, int i13) {
            if (DownsampleStrategy.f5843g) {
                return Math.min(i12 / i10, i13 / i11);
            }
            int max = Math.max(i11 / i13, i10 / i12);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    static {
        b bVar = new b();
        f5840c = bVar;
        d = new d();
        f5841e = bVar;
        f5842f = h5.c.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bVar);
        f5843g = true;
    }

    public abstract SampleSizeRounding a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
