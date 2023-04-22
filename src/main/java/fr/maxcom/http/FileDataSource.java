package fr.maxcom.http;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.android.vending.expansion.zipfile.ZipResourceFile;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import jcifs.smb.SmbFile;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import t3.k;

/* loaded from: classes.dex */
public class FileDataSource implements yd.b {

    /* renamed from: a  reason: collision with root package name */
    public Cipher f9588a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9589b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9590c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9591e;

    /* renamed from: f  reason: collision with root package name */
    public yd.a f9592f;

    /* renamed from: g  reason: collision with root package name */
    public URI f9593g;

    /* renamed from: h  reason: collision with root package name */
    public long f9594h;

    /* renamed from: i  reason: collision with root package name */
    public e f9595i;

    /* renamed from: j  reason: collision with root package name */
    public File f9596j;

    /* renamed from: k  reason: collision with root package name */
    public v0.a f9597k;

    /* renamed from: l  reason: collision with root package name */
    public String f9598l;

    /* renamed from: m  reason: collision with root package name */
    public ZipResourceFile.ZipEntryRO f9599m;
    public SmbFile n;

    /* renamed from: o  reason: collision with root package name */
    public AssetFileDescriptor f9600o;

    /* renamed from: p  reason: collision with root package name */
    public f f9601p;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9602a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f9603b;

        static {
            int[] iArr = new int[d.values().length];
            f9603b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9603b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[e.values().length];
            f9602a = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9602a[3] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9602a[4] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9602a[2] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9602a[5] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9602a[6] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f9604a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f9605b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9606c;
        public final boolean d;

        /* renamed from: e  reason: collision with root package name */
        public final long f9607e;

        /* renamed from: f  reason: collision with root package name */
        public int f9608f;

        public b(FileDataSource fileDataSource, Cipher cipher, long j10, boolean z10, boolean z11) {
            int blockSize = cipher.getBlockSize();
            this.f9604a = blockSize;
            this.f9605b = cipher.getIV();
            this.f9606c = z10;
            this.d = z11;
            this.f9607e = j10 / blockSize;
        }

        public long a() {
            long j10 = this.f9607e;
            if (this.f9606c && !this.d && j10 != 0) {
                j10--;
            }
            return j10 * this.f9604a;
        }

        public Cipher b(InputStream inputStream, yd.a aVar) {
            if (this.f9606c) {
                long j10 = this.f9607e;
                if (j10 != 0) {
                    int i10 = this.f9604a;
                    byte[] bArr = new byte[i10];
                    if (this.d) {
                        System.arraycopy(this.f9605b, 0, bArr, 0, i10);
                        int i11 = i10 - 1;
                        while (true) {
                            int i12 = (bArr[i11] & UByte.MAX_VALUE) + ((int) (255 & j10));
                            int i13 = i11 - 1;
                            bArr[i11] = (byte) i12;
                            if ((i12 >> 8) > 0) {
                                for (int i14 = i13; i14 >= 0; i14--) {
                                    byte b10 = (byte) (bArr[i14] + 1);
                                    bArr[i14] = b10;
                                    if (b10 != 0) {
                                        break;
                                    }
                                }
                            }
                            j10 >>= 8;
                            if (j10 <= 0 || i13 < 0) {
                                break;
                            }
                            i11 = i13;
                        }
                    } else {
                        this.f9608f = inputStream.read(bArr);
                    }
                    return ((k) aVar).a(bArr);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class c extends FilterInputStream {

        /* renamed from: c  reason: collision with root package name */
        public Cipher f9609c;

        /* renamed from: f  reason: collision with root package name */
        public final byte[] f9610f;

        /* renamed from: j  reason: collision with root package name */
        public byte[] f9611j;

        /* renamed from: m  reason: collision with root package name */
        public int f9612m;
        public int n;

        /* renamed from: t  reason: collision with root package name */
        public boolean f9613t;

        /* renamed from: u  reason: collision with root package name */
        public yd.a f9614u;

        /* renamed from: w  reason: collision with root package name */
        public boolean f9615w;
        public boolean y;

        public c(InputStream inputStream, Cipher cipher) {
            super(inputStream);
            this.f9609c = cipher;
            int max = Math.max(cipher.getBlockSize(), 1);
            int max2 = Math.max(max, (ConstantsKt.DEFAULT_BLOCK_SIZE / max) * max);
            this.f9610f = new byte[max2];
            int blockSize = cipher.getBlockSize();
            this.f9611j = new byte[max2 + (blockSize > 0 ? blockSize * 2 : 0)];
        }

        public final long a(long j10) {
            long j11 = 0;
            while (j11 < j10 && (this.f9612m != this.n || c())) {
                int min = (int) Math.min(j10 - j11, this.n - this.f9612m);
                this.f9612m += min;
                j11 += min;
            }
            return j11;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return this.n - this.f9612m;
        }

        public final boolean c() {
            if (this.f9613t) {
                return false;
            }
            Objects.requireNonNull(((FilterInputStream) this).in, "in == null");
            this.f9612m = 0;
            this.n = 0;
            while (this.n == 0) {
                int outputSize = this.f9609c.getOutputSize(this.f9610f.length);
                byte[] bArr = this.f9611j;
                if (bArr == null || bArr.length < outputSize) {
                    this.f9611j = new byte[outputSize];
                }
                int read = ((FilterInputStream) this).in.read(this.f9610f);
                if (read == -1) {
                    try {
                        int doFinal = this.f9609c.doFinal(this.f9611j, 0);
                        this.n = doFinal;
                        this.f9613t = true;
                        return doFinal != 0;
                    } catch (Exception e10) {
                        throw new IOException("Error while finalizing cipher", e10);
                    }
                }
                try {
                    this.n = this.f9609c.update(this.f9610f, 0, read, this.f9611j, 0);
                } catch (ShortBufferException e11) {
                    throw new AssertionError(e11);
                }
            }
            return true;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ((FilterInputStream) this).in.close();
            try {
                this.f9609c.doFinal();
            } catch (GeneralSecurityException unused) {
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            if (this.f9612m != this.n || c()) {
                byte[] bArr = this.f9611j;
                int i10 = this.f9612m;
                this.f9612m = i10 + 1;
                return bArr[i10] & UByte.MAX_VALUE;
            }
            return -1;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int i12 = 0;
            while (i12 < i11) {
                if (this.f9612m == this.n && !c()) {
                    if (i12 == 0) {
                        i12 = -1;
                    }
                    return i12;
                }
                int min = Math.min(i11 - i12, this.n - this.f9612m);
                System.arraycopy(this.f9611j, this.f9612m, bArr, i10, min);
                i10 += min;
                this.f9612m += min;
                i12 += min;
            }
            return i12;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) {
            boolean z10;
            long skip;
            int i10;
            FileDataSource fileDataSource = FileDataSource.this;
            if (fileDataSource.f9590c && (!(z10 = this.f9615w) || this.f9614u != null)) {
                b bVar = new b(fileDataSource, this.f9609c, j10, z10, this.y);
                long a10 = bVar.a();
                if (a10 != 0) {
                    long j11 = a10;
                    do {
                        skip = ((FilterInputStream) this).in.skip(j11);
                        j11 -= skip;
                        i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                        if (i10 <= 0) {
                            break;
                        }
                    } while (skip > 0);
                    if (i10 > 0) {
                        Log.e("FileDataSource", "missing " + j11 + " of the " + a10 + " bytes to skip");
                        throw new IOException("Unable to skip enough");
                    }
                    try {
                        Cipher b10 = bVar.b(((FilterInputStream) this).in, this.f9614u);
                        a10 += bVar.f9608f;
                        if (b10 != null) {
                            this.f9609c = b10;
                            return a(j10 - a10) + a10;
                        }
                    } catch (GeneralSecurityException e10) {
                        StringBuilder m10 = a1.a.m("Unable to get a new cipher: ");
                        m10.append(e10.getMessage());
                        Log.e("FileDataSource", m10.toString());
                        StringBuilder m11 = a1.a.m("Failed to get a new cipher: ");
                        m11.append(e10.getMessage());
                        throw new IOException(m11.toString());
                    }
                }
                return a(j10 - a10) + a10;
            }
            return a(j10);
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        HTTP,
        FTP
    }

    /* loaded from: classes.dex */
    public enum e {
        UNSET,
        FILE,
        DOCFILE,
        ZIP,
        SMB,
        ASSET,
        REMOTE
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        public final String f9627a;

        /* renamed from: b  reason: collision with root package name */
        public d f9628b;
        public Cipher d;

        /* renamed from: e  reason: collision with root package name */
        public InputStream f9630e;

        /* renamed from: h  reason: collision with root package name */
        public String f9633h;

        /* renamed from: c  reason: collision with root package name */
        public long f9629c = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f9631f = -1;

        /* renamed from: g  reason: collision with root package name */
        public long f9632g = -1;

        public f(String str) {
            this.f9627a = str;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(22:1|(1:3)(1:70)|4|(1:(1:(15:12|13|(1:67)(1:17)|18|(1:20)|21|22|23|(1:25)|26|(1:(1:52))(1:30)|31|(1:33)(2:40|(3:46|47|48))|34|(2:36|37)(1:39)))(1:68))|69|13|(1:15)|67|18|(0)|21|22|23|(0)|26|(1:28)|(0)|31|(0)(0)|34|(0)(0)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
            r5 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
            if (r10 != r16.f9628b) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
            r16.f9631f = java.lang.Integer.parseInt(r5.substring(r5.length() - 3));
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
            r0 = a1.a.m("Remote reply: ");
            r0.append(r16.f9631f);
            android.util.Log.w("FileDataSource", r0.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
            android.util.Log.e("FileDataSource", "Unable to parse: " + r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
            r0 = a1.a.m("Remote response: ");
            r0.append(r4.getHeaderField((java.lang.String) null));
            android.util.Log.w("FileDataSource", r0.toString());
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(javax.crypto.Cipher r17, long r18, yd.a r20, boolean r21, boolean r22, boolean r23) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.maxcom.http.FileDataSource.f.a(javax.crypto.Cipher, long, yd.a, boolean, boolean, boolean):void");
        }
    }

    public long a() {
        if (this.f9589b) {
            return -1L;
        }
        switch (a.f9602a[this.f9595i.ordinal()]) {
            case 1:
                return this.f9596j.length();
            case 2:
                ZipResourceFile.ZipEntryRO zipEntryRO = this.f9599m;
                if (zipEntryRO != null) {
                    return zipEntryRO.mUncompressedLength;
                }
                break;
            case 3:
                try {
                    SmbFile smbFile = this.n;
                    if (smbFile != null) {
                        return smbFile.length();
                    }
                } catch (Exception e10) {
                    StringBuilder m10 = a1.a.m("Unable to get the length of the resource: ");
                    m10.append(e10.getMessage());
                    Log.e("FileDataSource", m10.toString());
                    break;
                }
                break;
            case 4:
                v0.a aVar = this.f9597k;
                if (aVar != null) {
                    v0.c cVar = (v0.c) aVar;
                    Context context = cVar.f15913a;
                    Uri uri = cVar.f15914b;
                    ContentResolver contentResolver = context.getContentResolver();
                    Cursor cursor = null;
                    long j10 = 0;
                    try {
                        try {
                            cursor = contentResolver.query(uri, new String[]{"_size"}, null, null, null);
                        } catch (Throwable th) {
                            v0.b.a(cursor);
                            throw th;
                        }
                    } catch (Exception e11) {
                        Log.w("DocumentFile", "Failed query: " + e11);
                    }
                    if (cursor.moveToFirst() && !cursor.isNull(0)) {
                        j10 = cursor.getLong(0);
                        v0.b.a(cursor);
                        return j10;
                    }
                    v0.b.a(cursor);
                    return j10;
                }
                break;
            case 5:
                AssetFileDescriptor assetFileDescriptor = this.f9600o;
                if (assetFileDescriptor != null) {
                    return assetFileDescriptor.getLength();
                }
                break;
            case 6:
                return this.f9601p.f9632g;
        }
        return -1L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public String b() {
        String str;
        switch (a.f9602a[this.f9595i.ordinal()]) {
            case 1:
                str = this.f9596j.getName();
                break;
            case 2:
                ZipResourceFile.ZipEntryRO zipEntryRO = this.f9599m;
                if (zipEntryRO != null) {
                    str = zipEntryRO.mFileName;
                    break;
                }
                str = null;
                break;
            case 3:
                SmbFile smbFile = this.n;
                if (smbFile != null) {
                    str = smbFile.getName();
                    break;
                }
                str = null;
                break;
            case 4:
                v0.a aVar = this.f9597k;
                if (aVar != null) {
                    v0.c cVar = (v0.c) aVar;
                    String b10 = v0.b.b(cVar.f15913a, cVar.f15914b);
                    if ("vnd.android.document/directory".equals(b10)) {
                        return null;
                    }
                    return b10;
                }
                str = null;
                break;
            case 5:
                if (this.f9600o != null) {
                    str = new File(this.f9598l).getName();
                    break;
                }
                str = null;
                break;
            case 6:
                f fVar = this.f9601p;
                String str2 = fVar.f9633h;
                if (str2 == null) {
                    str = fVar.f9627a;
                    break;
                } else {
                    return str2;
                }
            default:
                str = null;
                break;
        }
        if (str == null) {
            return null;
        }
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return "text/texmacs".equals(guessContentTypeFromName) ? "application/octet-stream" : guessContentTypeFromName;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public java.io.InputStream c() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.maxcom.http.FileDataSource.c():java.io.InputStream");
    }

    public String d() {
        URI uri = this.f9593g;
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.maxcom.http.FileDataSource.e():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.maxcom.http.FileDataSource.f():boolean");
    }

    public void g(Cipher cipher) {
        this.f9588a = cipher;
        String algorithm = cipher.getAlgorithm();
        if (algorithm != null) {
            algorithm = algorithm.toUpperCase(Locale.US);
        }
        boolean z10 = true;
        this.f9589b = (this.f9588a.getBlockSize() == 0 || algorithm == null || algorithm.contains("/CFB") || algorithm.contains("/OFB") || algorithm.contains("/CTR") || algorithm.contains("/CTS") || algorithm.contains("/WITHCTS")) ? false : true;
        this.f9590c = algorithm != null && (algorithm.contains("/CTR") || algorithm.contains("/CBC") || algorithm.contains("/CFB") || algorithm.contains("/ECB"));
        this.d = algorithm != null && algorithm.contains("/CTR");
        if (algorithm == null || !this.f9590c || algorithm.contains("/ECB")) {
            z10 = false;
        }
        this.f9591e = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x005a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(java.net.URI r18, long r19) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.maxcom.http.FileDataSource.h(java.net.URI, long):void");
    }
}
