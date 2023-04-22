package com.google.firebase.installations.remote;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.remote.b;
import h9.o;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import sc.g;

/* loaded from: classes.dex */
public class c {

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f8099e = Pattern.compile("[0-9]+s");

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f8100f = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Context f8101a;

    /* renamed from: b  reason: collision with root package name */
    public final mc.b<g> f8102b;

    /* renamed from: c  reason: collision with root package name */
    public final mc.b<HeartBeatInfo> f8103c;
    public final qc.a d = new qc.a();

    public c(Context context, mc.b<g> bVar, mc.b<HeartBeatInfo> bVar2) {
        this.f8101a = context;
        this.f8102b = bVar;
        this.f8103c = bVar2;
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f8100f));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            Log.w("Firebase-Installations", str4);
            Object[] objArr = new Object[3];
            objArr[0] = str2;
            objArr[1] = str3;
            objArr[2] = TextUtils.isEmpty(str) ? BuildConfig.FLAVOR : a1.a.l(", ", str);
            Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr));
        }
    }

    public static long d(String str) {
        o.b(f8099e.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public final URL a(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new FirebaseInstallationsException(e10.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7 A[Catch: NameNotFoundException -> 0x0129, TryCatch #0 {NameNotFoundException -> 0x0129, blocks: (B:11:0x0098, B:13:0x00b6, B:15:0x00bc, B:18:0x00c6, B:21:0x00d7, B:22:0x00f5, B:24:0x0103, B:25:0x0122), top: B:33:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5 A[Catch: NameNotFoundException -> 0x0129, TryCatch #0 {NameNotFoundException -> 0x0129, blocks: (B:11:0x0098, B:13:0x00b6, B:15:0x00bc, B:18:0x00c6, B:21:0x00d7, B:22:0x00f5, B:24:0x0103, B:25:0x0122), top: B:33:0x0098 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection c(java.net.URL r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.c.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }

    public final InstallationResponse e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f8100f));
        TokenResult.a a10 = TokenResult.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        TokenResult tokenResult = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        ((b.C0105b) a10).f8096a = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a10.b(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                tokenResult = a10.a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str, str2, str3, tokenResult, InstallationResponse.ResponseCode.OK, null);
    }

    public final TokenResult f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f8100f));
        TokenResult.a a10 = TokenResult.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                ((b.C0105b) a10).f8096a = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a10.b(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        b.C0105b c0105b = (b.C0105b) a10;
        c0105b.f8098c = TokenResult.ResponseCode.OK;
        return c0105b.a();
    }

    public final void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
