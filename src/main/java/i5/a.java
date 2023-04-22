package i5;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class a implements d<InputStream> {

    /* renamed from: c  reason: collision with root package name */
    public final Uri f10529c;

    /* renamed from: f  reason: collision with root package name */
    public final c f10530f;

    /* renamed from: j  reason: collision with root package name */
    public InputStream f10531j;

    /* renamed from: i5.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0152a implements i5.b {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f10532b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f10533a;

        public C0152a(ContentResolver contentResolver) {
            this.f10533a = contentResolver;
        }

        @Override // i5.b
        public Cursor a(Uri uri) {
            return this.f10533a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f10532b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements i5.b {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f10534b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f10535a;

        public b(ContentResolver contentResolver) {
            this.f10535a = contentResolver;
        }

        @Override // i5.b
        public Cursor a(Uri uri) {
            return this.f10535a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f10534b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public a(Uri uri, c cVar) {
        this.f10529c = uri;
        this.f10530f = cVar;
    }

    public static a c(Context context, Uri uri, i5.b bVar) {
        return new a(uri, new c(com.bumptech.glide.b.b(context).f5622m.e(), bVar, com.bumptech.glide.b.b(context).n, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f10531j;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public DataSource d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(Priority priority, d.a<? super InputStream> aVar) {
        try {
            InputStream f10 = f();
            this.f10531j = f10;
            aVar.f(f10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r6 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r6 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
        r7 = null;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x002b: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:11:0x002b */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Throwable, java.lang.NullPointerException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream f() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.a.f():java.io.InputStream");
    }
}
