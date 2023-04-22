package v0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* loaded from: classes2.dex */
public class b {
    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static String b(Context context, Uri uri) {
        Cursor cursor;
        AutoCloseable autoCloseable = null;
        r7 = null;
        r7 = null;
        String str = null;
        try {
            try {
                cursor = context.getContentResolver().query(uri, new String[]{"mime_type"}, null, null, null);
            } catch (Exception e10) {
                e = e10;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                a(autoCloseable);
                throw th;
            }
            try {
                boolean moveToFirst = cursor.moveToFirst();
                uri = cursor;
                if (moveToFirst) {
                    boolean isNull = cursor.isNull(0);
                    uri = cursor;
                    if (!isNull) {
                        str = cursor.getString(0);
                        uri = cursor;
                    }
                }
            } catch (Exception e11) {
                e = e11;
                Log.w("DocumentFile", "Failed query: " + e);
                uri = cursor;
                a(uri);
                return str;
            }
            a(uri);
            return str;
        } catch (Throwable th2) {
            th = th2;
            autoCloseable = uri;
            a(autoCloseable);
            throw th;
        }
    }
}
