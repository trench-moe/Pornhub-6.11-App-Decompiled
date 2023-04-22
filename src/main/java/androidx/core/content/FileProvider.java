package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import c0.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f1810f = {"_display_name", "_size"};

    /* renamed from: j  reason: collision with root package name */
    public static final File f1811j = new File("/");

    /* renamed from: m  reason: collision with root package name */
    public static HashMap<String, a> f1812m = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public a f1813c;

    /* loaded from: classes.dex */
    public interface a {
        File a(Uri uri);

        Uri b(File file);
    }

    /* loaded from: classes.dex */
    public static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final String f1814a;

        /* renamed from: b  reason: collision with root package name */
        public final HashMap<String, File> f1815b = new HashMap<>();

        public b(String str) {
            this.f1814a = str;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // androidx.core.content.FileProvider.a
        public java.io.File a(android.net.Uri r6) {
            /*
                r5 = this;
                java.lang.String r4 = r6.getEncodedPath()
                r0 = r4
                r4 = 47
                r1 = r4
                r4 = 1
                r2 = r4
                int r4 = r0.indexOf(r1, r2)
                r1 = r4
                java.lang.String r3 = r0.substring(r2, r1)
                java.lang.String r4 = android.net.Uri.decode(r3)
                r3 = r4
                int r1 = r1 + r2
                java.lang.String r4 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                java.lang.String r0 = r0.substring(r1)
                java.lang.String r0 = android.net.Uri.decode(r0)
                java.util.HashMap<java.lang.String, java.io.File> r1 = r5.f1815b
                r4 = 1
                java.lang.Object r4 = r1.get(r3)
                r1 = r4
                java.io.File r1 = (java.io.File) r1
                r4 = 2
                if (r1 == 0) goto L78
                java.io.File r6 = new java.io.File
                r4 = 6
                r6.<init>(r1, r0)
                r4 = 5
                r4 = 6
                java.io.File r6 = r6.getCanonicalFile()     // Catch: java.io.IOException -> L5c
                java.lang.String r4 = r6.getPath()
                r0 = r4
                java.lang.String r4 = r1.getPath()
                r1 = r4
                boolean r4 = r0.startsWith(r1)
                r0 = r4
                if (r0 == 0) goto L4f
                r4 = 3
                return r6
            L4f:
                r4 = 6
                java.lang.SecurityException r6 = new java.lang.SecurityException
                r4 = 2
                java.lang.String r4 = "Resolved path jumped beyond configured root"
                r0 = r4
                r6.<init>(r0)
                r4 = 5
                throw r6
                r4 = 2
            L5c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r4 = 6
                r1.<init>()
                r4 = 3
                java.lang.String r2 = "Failed to resolve canonical path for "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r4 = r1.toString()
                r6 = r4
                r0.<init>(r6)
                r4 = 4
                throw r0
                r4 = 2
            L78:
                r4 = 7
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r4 = 2
                java.lang.String r4 = "Unable to find configured root for "
                r1 = r4
                java.lang.String r6 = android.support.v4.media.b.i(r1, r6)
                r0.<init>(r6)
                r4 = 7
                throw r0
                r4 = 6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.b.a(android.net.Uri):java.io.File");
        }

        @Override // androidx.core.content.FileProvider.a
        public Uri b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f1815b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    String substring = path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1);
                    return new Uri.Builder().scheme("content").authority(this.f1814a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException(a1.a.l("Failed to find configured root that contains ", canonicalPath));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }
    }

    public static a a(Context context, String str) {
        a aVar;
        synchronized (f1812m) {
            aVar = f1812m.get(str);
            if (aVar == null) {
                try {
                    aVar = b(context, str);
                    f1812m.put(str, aVar);
                } catch (IOException e10) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                } catch (XmlPullParserException e11) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                }
            }
        }
        return aVar;
    }

    public static a b(Context context, String str) {
        b bVar = new b(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider == null) {
            throw new IllegalArgumentException(a1.a.l("Couldn't find meta-data for provider with authority ", str));
        }
        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return bVar;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                File file = null;
                String attributeValue = loadXmlMetaData.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.NAME);
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f1811j;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    Object obj = c0.a.f3717a;
                    File[] b10 = a.b.b(context, null);
                    if (b10.length > 0) {
                        file = b10[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    Object obj2 = c0.a.f3717a;
                    File[] a10 = a.b.a(context);
                    if (a10.length > 0) {
                        file = a10[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        file = externalMediaDirs[0];
                    }
                }
                if (file != null) {
                    String[] strArr = {attributeValue2};
                    for (int i10 = 0; i10 < 1; i10++) {
                        String str2 = strArr[i10];
                        if (str2 != null) {
                            file = new File(file, str2);
                        }
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        bVar.f1815b.put(attributeValue, file.getCanonicalFile());
                    } catch (IOException e10) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e10);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        this.f1813c = a(context, providerInfo.authority.split(";")[0]);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f1813c.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File a10 = this.f1813c.a(uri);
        int lastIndexOf = a10.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a10.getName().substring(lastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i10;
        File a10 = this.f1813c.a(uri);
        if ("r".equals(str)) {
            i10 = 268435456;
        } else {
            if (!"w".equals(str) && !"wt".equals(str)) {
                if ("wa".equals(str)) {
                    i10 = 704643072;
                } else if ("rw".equals(str)) {
                    i10 = 939524096;
                } else if (!"rwt".equals(str)) {
                    throw new IllegalArgumentException(a1.a.l("Invalid mode: ", str));
                } else {
                    i10 = 1006632960;
                }
            }
            i10 = 738197504;
        }
        return ParcelFileDescriptor.open(a10, i10);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        File a10 = this.f1813c.a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f1810f;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = queryParameter == null ? a10.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(a10.length());
            }
            i11 = i10;
        }
        String[] strArr4 = new String[i11];
        System.arraycopy(strArr3, 0, strArr4, 0, i11);
        Object[] objArr2 = new Object[i11];
        System.arraycopy(objArr, 0, objArr2, 0, i11);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
