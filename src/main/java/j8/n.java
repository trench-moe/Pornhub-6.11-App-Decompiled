package j8;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.vrtoolkit.cardboard.FullscreenMode;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import k8.c0;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public class n extends c {

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11626e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11627f;

    /* renamed from: g  reason: collision with root package name */
    public final int f11628g;

    /* renamed from: h  reason: collision with root package name */
    public final String f11629h;

    /* renamed from: i  reason: collision with root package name */
    public final p f11630i;

    /* renamed from: j  reason: collision with root package name */
    public final p f11631j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f11632k;

    /* renamed from: l  reason: collision with root package name */
    public jb.f<String> f11633l;

    /* renamed from: m  reason: collision with root package name */
    public h f11634m;
    public HttpURLConnection n;

    /* renamed from: o  reason: collision with root package name */
    public InputStream f11635o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f11636p;

    /* renamed from: q  reason: collision with root package name */
    public int f11637q;

    /* renamed from: r  reason: collision with root package name */
    public long f11638r;

    /* renamed from: s  reason: collision with root package name */
    public long f11639s;

    /* loaded from: classes2.dex */
    public static final class b implements o {

        /* renamed from: b  reason: collision with root package name */
        public String f11641b;

        /* renamed from: a  reason: collision with root package name */
        public final p f11640a = new p();

        /* renamed from: c  reason: collision with root package name */
        public int f11642c = 8000;
        public int d = 8000;

        @Override // j8.f.a
        /* renamed from: b */
        public n a() {
            return new n(this.f11641b, this.f11642c, this.d, false, this.f11640a, null, false, null);
        }
    }

    public n(String str, int i10, int i11, boolean z10, p pVar, jb.f fVar, boolean z11, a aVar) {
        super(true);
        this.f11629h = str;
        this.f11627f = i10;
        this.f11628g = i11;
        this.f11626e = z10;
        this.f11630i = pVar;
        this.f11633l = null;
        this.f11631j = new p();
        this.f11632k = z11;
    }

    public static void x(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = c0.f11939a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                Objects.requireNonNull(superclass);
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // j8.d
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f11638r;
            if (j10 != -1) {
                long j11 = j10 - this.f11639s;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.f11635o;
            int i12 = c0.f11939a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.f11639s += read;
                p(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            h hVar = this.f11634m;
            int i13 = c0.f11939a;
            throw HttpDataSource$HttpDataSourceException.b(e10, hVar, 2);
        }
    }

    @Override // j8.f
    public Uri c() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // j8.f
    public void close() {
        try {
            InputStream inputStream = this.f11635o;
            if (inputStream != null) {
                long j10 = this.f11638r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f11639s;
                }
                x(this.n, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    h hVar = this.f11634m;
                    int i10 = c0.f11939a;
                    throw new HttpDataSource$HttpDataSourceException(e10, hVar, (int) FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS, 3);
                }
            }
            this.f11635o = null;
            t();
            if (this.f11636p) {
                this.f11636p = false;
                q();
            }
        } catch (Throwable th) {
            this.f11635o = null;
            t();
            if (this.f11636p) {
                this.f11636p = false;
                q();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
    @Override // j8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long j(final j8.h r19) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.n.j(j8.h):long");
    }

    @Override // j8.c, j8.f
    public Map<String, List<String>> k() {
        HttpURLConnection httpURLConnection = this.n;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    public final void t() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                k8.a.i("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.n = null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final java.net.URL u(java.net.URL r11, java.lang.String r12, j8.h r13) {
        /*
            r10 = this;
            r0 = 1
            r8 = 4
            r6 = 2001(0x7d1, float:2.804E-42)
            r1 = r6
            if (r12 == 0) goto L91
            java.net.URL r2 = new java.net.URL     // Catch: java.net.MalformedURLException -> L89
            r2.<init>(r11, r12)     // Catch: java.net.MalformedURLException -> L89
            java.lang.String r12 = r2.getProtocol()
            java.lang.String r6 = "https"
            r3 = r6
            boolean r6 = r3.equals(r12)
            r3 = r6
            if (r3 != 0) goto L47
            java.lang.String r6 = "http"
            r3 = r6
            boolean r6 = r3.equals(r12)
            r3 = r6
            if (r3 != 0) goto L47
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r11 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r9 = 3
            java.lang.String r6 = "Unsupported protocol redirect: "
            r2 = r6
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r3 = r12.length()
            if (r3 == 0) goto L3a
            java.lang.String r6 = r2.concat(r12)
            r12 = r6
            goto L42
        L3a:
            java.lang.String r9 = "Ⓢⓜⓞⓑ⓸⓺"
            java.lang.String r12 = new java.lang.String
            r12.<init>(r2)
            r8 = 4
        L42:
            r11.<init>(r12, r13, r1, r0)
            throw r11
            r8 = 7
        L47:
            boolean r3 = r10.f11626e
            r7 = 6
            if (r3 != 0) goto L88
            r9 = 1
            java.lang.String r3 = r11.getProtocol()
            boolean r6 = r12.equals(r3)
            r3 = r6
            if (r3 == 0) goto L59
            goto L88
        L59:
            r9 = 3
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r2 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r7 = 5
            java.lang.String r6 = r11.getProtocol()
            r11 = r6
            r6 = 41
            r3 = r6
            int r3 = a0.a.e(r11, r3)
            int r6 = r12.length()
            r4 = r6
            int r4 = r4 + r3
            java.lang.String r3 = "Disallowed cross-protocol redirect ("
            r9 = 7
            java.lang.String r5 = " to "
            r8 = 3
            java.lang.StringBuilder r11 = a0.a.n(r4, r3, r11, r5, r12)
            java.lang.String r12 = ")"
            r8 = 3
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r2.<init>(r11, r13, r1, r0)
            throw r2
            r8 = 2
        L88:
            return r2
        L89:
            r11 = move-exception
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r12 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r12.<init>(r11, r13, r1, r0)
            r7 = 1
            throw r12
        L91:
            r8 = 5
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r11 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r7 = 6
            java.lang.String r12 = "Null location redirect"
            r11.<init>(r12, r13, r1, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.n.u(java.net.URL, java.lang.String, j8.h):java.net.URL");
    }

    public final HttpURLConnection v(h hVar) {
        HttpURLConnection w10;
        URL url = new URL(hVar.f11575a.toString());
        int i10 = hVar.f11577c;
        byte[] bArr = hVar.d;
        long j10 = hVar.f11579f;
        long j11 = hVar.f11580g;
        boolean z10 = (hVar.f11582i & 1) == 1;
        if (!this.f11626e && !this.f11632k) {
            return w(url, i10, bArr, j10, j11, z10, true, hVar.f11578e);
        }
        int i11 = 0;
        URL url2 = url;
        int i12 = i10;
        byte[] bArr2 = bArr;
        while (true) {
            int i13 = i11 + 1;
            if (i11 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException(android.support.v4.media.b.e(31, "Too many redirects: ", i13)), hVar, 2001, 1);
            }
            long j12 = j10;
            long j13 = j10;
            int i14 = i12;
            URL url3 = url2;
            long j14 = j11;
            w10 = w(url2, i12, bArr2, j12, j11, z10, false, hVar.f11578e);
            int responseCode = w10.getResponseCode();
            String headerField = w10.getHeaderField("Location");
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                w10.disconnect();
                url2 = u(url3, headerField, hVar);
                i12 = i14;
            } else if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                break;
            } else {
                w10.disconnect();
                if (this.f11632k && responseCode == 302) {
                    i12 = i14;
                } else {
                    bArr2 = null;
                    i12 = 1;
                }
                url2 = u(url3, headerField, hVar);
            }
            j10 = j13;
            i11 = i13;
            j11 = j14;
        }
        return w10;
    }

    public final HttpURLConnection w(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) {
        String sb2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f11627f);
        httpURLConnection.setReadTimeout(this.f11628g);
        HashMap hashMap = new HashMap();
        p pVar = this.f11630i;
        if (pVar != null) {
            hashMap.putAll(pVar.a());
        }
        hashMap.putAll(this.f11631j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = q.f11645a;
        if (j10 == 0 && j11 == -1) {
            sb2 = null;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("bytes=");
            sb3.append(j10);
            sb3.append("-");
            if (j11 != -1) {
                sb3.append((j10 + j11) - 1);
            }
            sb2 = sb3.toString();
        }
        if (sb2 != null) {
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        String str = this.f11629h;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(h.a(i10));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void y(long j10, h hVar) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
        while (j10 > 0) {
            int min = (int) Math.min(j10, (long) ConstantsKt.DEFAULT_BLOCK_SIZE);
            InputStream inputStream = this.f11635o;
            int i10 = c0.f11939a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), hVar, (int) FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS, 1);
            }
            if (read == -1) {
                throw new HttpDataSource$HttpDataSourceException(hVar, 2008, 1);
            }
            j10 -= read;
            p(read);
        }
    }
}
