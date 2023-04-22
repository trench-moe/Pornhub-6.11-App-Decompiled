package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.vrtoolkit.cardboard.FullscreenMode;
import j8.c;
import j8.h;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;
import k8.c0;

/* loaded from: classes.dex */
public final class FileDataSource extends c {

    /* renamed from: e  reason: collision with root package name */
    public RandomAccessFile f6693e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f6694f;

    /* renamed from: g  reason: collision with root package name */
    public long f6695g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6696h;

    /* loaded from: classes.dex */
    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(String str, Throwable th, int i10) {
            super(str, th, i10);
        }

        public FileDataSourceException(Throwable th, int i10) {
            super(th, i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public FileDataSource() {
        super(false);
    }

    @Override // j8.d
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f6695g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f6693e;
            int i12 = c0.f11939a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.f6695g -= read;
                p(read);
            }
            return read;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS);
        }
    }

    @Override // j8.f
    public Uri c() {
        return this.f6694f;
    }

    @Override // j8.f
    public void close() {
        this.f6694f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f6693e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f6693e = null;
                if (this.f6696h) {
                    this.f6696h = false;
                    q();
                }
            } catch (IOException e10) {
                throw new FileDataSourceException(e10, FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS);
            }
        } catch (Throwable th) {
            this.f6693e = null;
            if (this.f6696h) {
                this.f6696h = false;
                q();
            }
            throw th;
        }
    }

    @Override // j8.f
    public long j(h hVar) {
        Uri uri = hVar.f11575a;
        this.f6694f = uri;
        r(hVar);
        int i10 = 2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f6693e = randomAccessFile;
            try {
                randomAccessFile.seek(hVar.f11579f);
                long j10 = hVar.f11580g;
                if (j10 == -1) {
                    j10 = this.f6693e.length() - hVar.f11579f;
                }
                this.f6695g = j10;
                if (j10 >= 0) {
                    this.f6696h = true;
                    s(hVar);
                    return this.f6695g;
                }
                throw new FileDataSourceException(null, null, 2008);
            } catch (IOException e10) {
                throw new FileDataSourceException(e10, FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (c0.f11939a < 21 || !a.b(e11.getCause())) {
                    i10 = 2005;
                }
                throw new FileDataSourceException(e11, i10);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11, 1004);
        } catch (SecurityException e12) {
            throw new FileDataSourceException(e12, 2006);
        } catch (RuntimeException e13) {
            throw new FileDataSourceException(e13, FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS);
        }
    }
}
