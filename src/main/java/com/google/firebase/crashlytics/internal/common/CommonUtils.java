package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import kotlin.UByte;

/* loaded from: classes.dex */
public class CommonUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f7991a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    public static long f7992b = -1;

    /* loaded from: classes.dex */
    public enum Architecture {
        /* JADX INFO: Fake field, exist only in values array */
        X86_32,
        /* JADX INFO: Fake field, exist only in values array */
        X86_64,
        /* JADX INFO: Fake field, exist only in values array */
        ARM_UNKNOWN,
        /* JADX INFO: Fake field, exist only in values array */
        PPC,
        /* JADX INFO: Fake field, exist only in values array */
        PPC64,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV6,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV7,
        UNKNOWN,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV7S,
        /* JADX INFO: Fake field, exist only in values array */
        ARM64;
        

        /* renamed from: f  reason: collision with root package name */
        public static final Map<String, Architecture> f7994f;

        static {
            Architecture architecture;
            Architecture architecture2;
            Architecture architecture3;
            Architecture architecture4;
            HashMap hashMap = new HashMap(4);
            f7994f = hashMap;
            hashMap.put("armeabi-v7a", architecture3);
            hashMap.put("armeabi", architecture2);
            hashMap.put("arm64-v8a", architecture4);
            hashMap.put("x86", architecture);
        }
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", str, e10);
            }
        }
    }

    public static long b(String str, String str2, int i10) {
        return Long.parseLong(str.split(str2)[0].trim()) * i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        r2 = r6[1];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.io.File r8, java.lang.String r9) {
        /*
            java.lang.String r6 = "Failed to close system file reader."
            r0 = r6
            boolean r6 = r8.exists()
            r1 = r6
            r6 = 0
            r2 = r6
            if (r1 == 0) goto L6e
            r7 = 1
            r7 = 1
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
        L1a:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L68
            if (r3 == 0) goto L63
            r7 = 4
            java.lang.String r6 = "\\s*:\\s*"
            r4 = r6
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L68
            r4 = r6
            r5 = 2
            java.lang.String[] r6 = r4.split(r3, r5)     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L68
            r3 = r6
            int r4 = r3.length     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L68
            r7 = 6
            r6 = 1
            r5 = r6
            if (r4 <= r5) goto L1a
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L68
            boolean r6 = r4.equals(r9)     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L68
            r4 = r6
            if (r4 == 0) goto L1a
            r7 = 5
            r8 = r3[r5]     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L68
            r2 = r8
            goto L64
        L44:
            r9 = move-exception
            goto L4a
        L46:
            r8 = move-exception
            goto L6a
        L48:
            r9 = move-exception
            r1 = r2
        L4a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r3.<init>()     // Catch: java.lang.Throwable -> L68
            r7 = 2
            java.lang.String r4 = "Error parsing "
            r7 = 4
            r3.append(r4)     // Catch: java.lang.Throwable -> L68
            r3.append(r8)     // Catch: java.lang.Throwable -> L68
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = "FirebaseCrashlytics"
            r3 = r6
            android.util.Log.e(r3, r8, r9)     // Catch: java.lang.Throwable -> L68
        L63:
            r7 = 2
        L64:
            a(r1, r0)
            goto L6f
        L68:
            r8 = move-exception
            r2 = r1
        L6a:
            a(r2, r0)
            throw r8
        L6e:
            r7 = 2
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CommonUtils.c(java.io.File, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r4) {
        /*
            r1 = r4
            boolean r0 = j(r1)
            boolean r3 = k(r1)
            r1 = r3
            if (r1 == 0) goto Lf
            r0 = r0 | 2
            r3 = 4
        Lf:
            r3 = 3
            boolean r3 = android.os.Debug.isDebuggerConnected()
            r1 = r3
            if (r1 != 0) goto L22
            boolean r1 = android.os.Debug.waitingForDebugger()
            if (r1 == 0) goto L1f
            r3 = 4
            goto L23
        L1f:
            r3 = 0
            r1 = r3
            goto L25
        L22:
            r3 = 1
        L23:
            r3 = 1
            r1 = r3
        L25:
            if (r1 == 0) goto L2b
            r3 = 1
            r0 = r0 | 4
            r3 = 1
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CommonUtils.d(android.content.Context):int");
    }

    public static String e(Context context) {
        int f10 = f(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (f10 == 0) {
            f10 = f(context, "com.crashlytics.android.build_id", "string");
        }
        if (f10 != 0) {
            return context.getResources().getString(f10);
        }
        return null;
    }

    public static int f(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i10);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static SharedPreferences g(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static synchronized long h() {
        long j10;
        synchronized (CommonUtils.class) {
            if (f7992b == -1) {
                long j11 = 0;
                String c10 = c(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(c10)) {
                    String upperCase = c10.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j11 = b(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j11 = b(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j11 = b(upperCase, "GB", 1073741824);
                        } else {
                            Log.w("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: " + upperCase, null);
                        }
                    } catch (NumberFormatException e10) {
                        Log.e("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: " + upperCase, e10);
                    }
                    f7992b = j11;
                }
                f7992b = j11;
            }
            j10 = f7992b;
        }
        return j10;
    }

    public static String i(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & UByte.MAX_VALUE;
            int i12 = i10 * 2;
            char[] cArr2 = f7991a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    public static boolean j(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return string == null;
            }
        }
    }

    public static boolean k(Context context) {
        boolean j10 = j(context);
        String str = Build.TAGS;
        if ((j10 || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !j10 && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String l(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return i(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e10);
            return BuildConfig.FLAVOR;
        }
    }

    public static String m(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : BuildConfig.FLAVOR;
    }
}
