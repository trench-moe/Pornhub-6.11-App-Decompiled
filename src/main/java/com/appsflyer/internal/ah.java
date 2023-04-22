package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
final class ah extends aw<String> {
    public ah(Context context) {
        super(context, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.aw
    /* renamed from: values */
    public String AFInAppEventType() {
        Cursor cursor;
        Throwable th;
        try {
            ContentResolver contentResolver = this.AFInAppEventParameterName.getContentResolver();
            StringBuilder sb2 = new StringBuilder("content://");
            sb2.append(this.AFInAppEventType);
            cursor = contentResolver.query(Uri.parse(sb2.toString()), new String[]{"aid"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndex("aid"));
                        cursor.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
        }
    }

    @Override // com.appsflyer.internal.aw
    public final /* synthetic */ String AFInAppEventParameterName() {
        new Thread(this.values).start();
        return (String) super.AFInAppEventParameterName();
    }

    public final String AFKeystoreWrapper() {
        new Thread(this.values).start();
        return (String) super.AFInAppEventParameterName();
    }
}
