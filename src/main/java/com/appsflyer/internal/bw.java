package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import java.util.Map;

/* loaded from: classes.dex */
public final class bw extends bq {
    public bw(Runnable runnable) {
        super("samsung", runnable);
    }

    @Override // com.appsflyer.internal.bt
    public final void AFInAppEventParameterName(Context context) {
        values(context, new aw<Map<String, Object>>(context, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.bw.3
            private static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j10 = cursor.getLong(columnIndex);
                if (j10 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j10));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00ea, code lost:
                if (r2 != null) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0100, code lost:
                if (0 == 0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0102, code lost:
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0105, code lost:
                r0 = ((android.content.pm.PackageItemInfo) r14.AFInAppEventParameterName.getPackageManager().resolveContentProvider(r14.AFInAppEventType, 128)).packageName;
                r14.valueOf.AFInAppEventType.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.aa.AFKeystoreWrapper(r14.AFInAppEventParameterName, r0)));
                r14.valueOf.AFInAppEventType.put("api_ver_name", com.appsflyer.internal.aa.values(r14.AFInAppEventParameterName, r0));
                r14.valueOf.AFInAppEventType();
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x014b, code lost:
                return r14.valueOf.AFInAppEventType;
             */
            @Override // com.appsflyer.internal.aw
            /* renamed from: values */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.Map<java.lang.String, java.lang.Object> AFInAppEventType() {
                /*
                    Method dump skipped, instructions count: 340
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.bw.AnonymousClass3.AFInAppEventType():java.util.Map");
            }

            private static void values(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                    map.put(str, string);
                }
            }
        });
    }
}
