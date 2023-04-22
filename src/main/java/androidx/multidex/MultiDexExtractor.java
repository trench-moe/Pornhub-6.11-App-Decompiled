package androidx.multidex;

import a1.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.media.b;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import k1.c;

/* loaded from: classes.dex */
public final class MultiDexExtractor implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    public final File f2619c;

    /* renamed from: f  reason: collision with root package name */
    public final long f2620f;

    /* renamed from: j  reason: collision with root package name */
    public final File f2621j;

    /* renamed from: m  reason: collision with root package name */
    public final RandomAccessFile f2622m;
    public final FileChannel n;

    /* renamed from: t  reason: collision with root package name */
    public final FileLock f2623t;

    /* loaded from: classes.dex */
    public static class ExtractedDex extends File {
        public long crc;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.crc = -1L;
        }
    }

    public MultiDexExtractor(File file, File file2) {
        StringBuilder m10 = a.m("MultiDexExtractor(");
        m10.append(file.getPath());
        m10.append(", ");
        m10.append(file2.getPath());
        m10.append(")");
        Log.i("MultiDex", m10.toString());
        this.f2619c = file;
        this.f2621j = file2;
        this.f2620f = e(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f2622m = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.n = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f2623t = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e10) {
                e = e10;
                a(this.n);
                throw e;
            } catch (Error e11) {
                e = e11;
                a(this.n);
                throw e;
            } catch (RuntimeException e12) {
                e = e12;
                a(this.n);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e13) {
            a(this.f2622m);
            throw e13;
        }
    }

    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("MultiDex", "Failed to close resource", e10);
        }
    }

    public static void c(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(a.l("tmp-", str), ".zip", file.getParentFile());
        StringBuilder m10 = a.m("Extracting ");
        m10.append(createTempFile.getPath());
        Log.i("MultiDex", m10.toString());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (!createTempFile.setReadOnly()) {
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            }
            Log.i("MultiDex", "Renaming to " + file.getPath());
            if (createTempFile.renameTo(file)) {
                a(inputStream);
                createTempFile.delete();
                return;
            }
            throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
        } catch (Throwable th) {
            a(inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    public static long d(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    public static long e(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            c.a a10 = c.a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j10 = a10.f11772b;
            randomAccessFile.seek(a10.f11771a);
            byte[] bArr = new byte[16384];
            int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
            while (read != -1) {
                crc32.update(bArr, 0, read);
                j10 -= read;
                if (j10 == 0) {
                    break;
                }
                read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void k(Context context, String str, long j10, long j11, List<ExtractedDex> list) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong(str + "timestamp", j10);
        edit.putLong(b.m(new StringBuilder(), str, "crc"), j11);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i10 = 2;
        for (ExtractedDex extractedDex : list) {
            edit.putLong(str + "dex.crc." + i10, extractedDex.crc);
            edit.putLong(str + "dex.time." + i10, extractedDex.lastModified());
            i10++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2623t.release();
        this.n.close();
        this.f2622m.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<? extends java.io.File> f(android.content.Context r13, java.lang.String r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r0 = "MultiDexExtractor.load("
            java.lang.StringBuilder r0 = a1.a.m(r0)
            java.io.File r1 = r12.f2619c
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r15)
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MultiDex"
            android.util.Log.i(r1, r0)
            java.nio.channels.FileLock r0 = r12.f2623t
            boolean r0 = r0.isValid()
            if (r0 == 0) goto Ld8
            if (r15 != 0) goto L9e
            java.io.File r0 = r12.f2619c
            long r2 = r12.f2620f
            r4 = 3
            r4 = 4
            java.lang.String r5 = "multidex.version"
            android.content.SharedPreferences r4 = r13.getSharedPreferences(r5, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r14)
            java.lang.String r6 = "timestamp"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = -1
            long r8 = r4.getLong(r5, r6)
            long r10 = d(r0)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r5 = "crc"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            long r4 = r4.getLong(r0, r6)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L7a
            goto L7c
        L7a:
            r0 = 0
            goto L7e
        L7c:
            r0 = 5
            r0 = 1
        L7e:
            if (r0 != 0) goto L9e
            java.util.List r13 = r12.h(r13, r14)     // Catch: java.io.IOException -> L85
            goto Lbe
        L85:
            r15 = move-exception
            java.lang.String r0 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction"
            android.util.Log.w(r1, r0, r15)
            java.util.List r15 = r12.i()
            java.io.File r0 = r12.f2619c
            long r4 = d(r0)
            long r6 = r12.f2620f
            r2 = r13
            r3 = r14
            r8 = r15
            k(r2, r3, r4, r6, r8)
            goto Lbd
        L9e:
            if (r15 == 0) goto La6
            java.lang.String r15 = "Forced extraction must be performed."
            android.util.Log.i(r1, r15)
            goto Lab
        La6:
            java.lang.String r15 = "Detected that extraction must be performed."
            android.util.Log.i(r1, r15)
        Lab:
            java.util.List r15 = r12.i()
            java.io.File r0 = r12.f2619c
            long r4 = d(r0)
            long r6 = r12.f2620f
            r2 = r13
            r3 = r14
            r8 = r15
            k(r2, r3, r4, r6, r8)
        Lbd:
            r13 = r15
        Lbe:
            java.lang.String r14 = "load found "
            java.lang.StringBuilder r14 = a1.a.m(r14)
            int r15 = r13.size()
            r14.append(r15)
            java.lang.String r15 = " secondary dex files"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            android.util.Log.i(r1, r14)
            return r13
        Ld8:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "MultiDexExtractor was closed"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDexExtractor.f(android.content.Context, java.lang.String, boolean):java.util.List");
    }

    public final List<ExtractedDex> h(Context context, String str) {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f2619c.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i10 = sharedPreferences.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 + (-1));
        int i11 = 2;
        while (i11 <= i10) {
            ExtractedDex extractedDex = new ExtractedDex(this.f2621j, a0.a.k(str2, i11, ".zip"));
            if (!extractedDex.isFile()) {
                StringBuilder m10 = a.m("Missing extracted secondary dex file '");
                m10.append(extractedDex.getPath());
                m10.append("'");
                throw new IOException(m10.toString());
            }
            extractedDex.crc = e(extractedDex);
            long j10 = sharedPreferences.getLong(str + "dex.crc." + i11, -1L);
            long j11 = sharedPreferences.getLong(str + "dex.time." + i11, -1L);
            long lastModified = extractedDex.lastModified();
            if (j11 == lastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                if (j10 == extractedDex.crc) {
                    arrayList.add(extractedDex);
                    i11++;
                    sharedPreferences = sharedPreferences2;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str + "\"), expected modification time: " + j11 + ", modification time: " + lastModified + ", expected crc: " + j10 + ", file crc: " + extractedDex.crc);
        }
        return arrayList;
    }

    public final List<ExtractedDex> i() {
        String str = this.f2619c.getName() + ".classes";
        File[] listFiles = this.f2621j.listFiles(new k1.b(this));
        if (listFiles == null) {
            StringBuilder m10 = a.m("Failed to list secondary dex dir content (");
            m10.append(this.f2621j.getPath());
            m10.append(").");
            Log.w("MultiDex", m10.toString());
        } else {
            for (File file : listFiles) {
                StringBuilder m11 = a.m("Trying to delete old file ");
                m11.append(file.getPath());
                m11.append(" of size ");
                m11.append(file.length());
                Log.i("MultiDex", m11.toString());
                if (file.delete()) {
                    StringBuilder m12 = a.m("Deleted old file ");
                    m12.append(file.getPath());
                    Log.i("MultiDex", m12.toString());
                } else {
                    StringBuilder m13 = a.m("Failed to delete old file ");
                    m13.append(file.getPath());
                    Log.w("MultiDex", m13.toString());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f2619c);
        int i10 = 2;
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(this.f2621j, str + i10 + ".zip");
                arrayList.add(extractedDex);
                Log.i("MultiDex", "Extraction is needed for file " + extractedDex);
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    while (i11 < 3 && !z10) {
                        i11++;
                        c(zipFile, entry, extractedDex, str);
                        try {
                            extractedDex.crc = e(extractedDex);
                            z10 = true;
                        } catch (IOException e10) {
                            Log.w("MultiDex", "Failed to read crc from " + extractedDex.getAbsolutePath(), e10);
                            z10 = false;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Extraction ");
                        sb2.append(z10 ? "succeeded" : "failed");
                        sb2.append(" '");
                        sb2.append(extractedDex.getAbsolutePath());
                        sb2.append("': length ");
                        sb2.append(extractedDex.length());
                        sb2.append(" - crc: ");
                        sb2.append(extractedDex.crc);
                        Log.i("MultiDex", sb2.toString());
                        if (!z10) {
                            extractedDex.delete();
                            if (extractedDex.exists()) {
                                Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + "'");
                            }
                        }
                    }
                }
                if (!z10) {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
                i10++;
                entry = zipFile.getEntry("classes" + i10 + ".dex");
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException e11) {
                Log.w("MultiDex", "Failed to close resource", e11);
            }
        }
    }
}
