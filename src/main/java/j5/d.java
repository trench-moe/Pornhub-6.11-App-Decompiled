package j5;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f11390a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final d f11391b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final d f11392c = new c();

    /* loaded from: classes2.dex */
    public class a extends d {
        @Override // j5.d
        public boolean a() {
            return false;
        }

        @Override // j5.d
        public boolean b() {
            return false;
        }

        @Override // j5.d
        public boolean c(DataSource dataSource) {
            return false;
        }

        @Override // j5.d
        public boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public class b extends d {
        @Override // j5.d
        public boolean a() {
            return true;
        }

        @Override // j5.d
        public boolean b() {
            return false;
        }

        @Override // j5.d
        public boolean c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // j5.d
        public boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public class c extends d {
        @Override // j5.d
        public boolean a() {
            return true;
        }

        @Override // j5.d
        public boolean b() {
            return true;
        }

        @Override // j5.d
        public boolean c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
            if (r4 == com.bumptech.glide.load.DataSource.DATA_DISK_CACHE) goto L4;
         */
        @Override // j5.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean d(boolean r3, com.bumptech.glide.load.DataSource r4, com.bumptech.glide.load.EncodeStrategy r5) {
            /*
                r2 = this;
                if (r3 == 0) goto L7
                r1 = 2
                com.bumptech.glide.load.DataSource r3 = com.bumptech.glide.load.DataSource.DATA_DISK_CACHE
                if (r4 == r3) goto Ld
            L7:
                r1 = 5
                com.bumptech.glide.load.DataSource r3 = com.bumptech.glide.load.DataSource.LOCAL
                if (r4 != r3) goto L14
                r1 = 4
            Ld:
                com.bumptech.glide.load.EncodeStrategy r3 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED
                r1 = 1
                if (r5 != r3) goto L14
                r3 = 1
                goto L17
            L14:
                r1 = 1
                r0 = 0
                r3 = r0
            L17:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: j5.d.c.d(boolean, com.bumptech.glide.load.DataSource, com.bumptech.glide.load.EncodeStrategy):boolean");
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy);
}
