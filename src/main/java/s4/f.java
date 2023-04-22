package s4;

import aa.d;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import c7.a;
import c7.p;
import com.app.pornhub.R;
import com.app.pornhub.view.login.LoginFragment;
import com.app.pornhub.view.login.SignupActivity;
import com.google.firebase.encoders.EncodingException;
import j6.b;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k6.j;
import k6.n;
import k8.m;
import s4.a;
import s6.s;
import w6.l0;
import w6.n0;
import w6.w;
import x6.c0;
import y7.h;
import z6.f;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements a.b, ea.d, ea.e, s.d, s.b, m.a, w.e, a.d, f.a, tb.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14829c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14830f;

    public /* synthetic */ f(Object obj, int i10) {
        this.f14829c = i10;
        this.f14830f = obj;
    }

    @Override // c7.a.d
    public long a(long j10) {
        return ((p) this.f14830f).g(j10);
    }

    @Override // s6.s.b
    public Object apply(Object obj) {
        switch (this.f14829c) {
            case 3:
                j6.b bVar = (j6.b) this.f14830f;
                b.a aVar = (b.a) obj;
                Objects.requireNonNull(bVar);
                cb.e.y("CctTransportBackend", "Making request to: %s", aVar.f11427a);
                HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f11427a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(bVar.f11426g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.2"));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str = aVar.f11429c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        ((ic.d) bVar.f11421a).a(aVar.f11428b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                        gZIPOutputStream.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        cb.e.M("CctTransportBackend", "Status Code: " + responseCode);
                        cb.e.M("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                        cb.e.M("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                        if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                            return new b.C0165b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                        }
                        if (responseCode != 200) {
                            return new b.C0165b(responseCode, null, 0L);
                        }
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                            b.C0165b c0165b = new b.C0165b(responseCode, null, ((j) n.a(new BufferedReader(new InputStreamReader(gZIPInputStream)))).f11878a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c0165b;
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (EncodingException e10) {
                    e = e10;
                    cb.e.C("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new b.C0165b(400, null, 0L);
                } catch (ConnectException e11) {
                    e = e11;
                    cb.e.C("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new b.C0165b(500, null, 0L);
                } catch (UnknownHostException e12) {
                    e = e12;
                    cb.e.C("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new b.C0165b(500, null, 0L);
                } catch (IOException e13) {
                    e = e13;
                    cb.e.C("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new b.C0165b(400, null, 0L);
                }
            case 4:
            default:
                Map map = (Map) this.f14830f;
                Cursor cursor = (Cursor) obj;
                i6.b bVar2 = s.f14890t;
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    Set set = (Set) map.get(Long.valueOf(j10));
                    if (set == null) {
                        set = new HashSet();
                        map.put(Long.valueOf(j10), set);
                    }
                    set.add(new s.c(cursor.getString(1), cursor.getString(2), null));
                }
                return null;
            case 5:
                s sVar = (s) this.f14830f;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                i6.b bVar3 = s.f14890t;
                Objects.requireNonNull(sVar);
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + sVar.f14892f.a()).execute();
                return null;
        }
    }

    @Override // z6.f.a
    public void b(z6.f fVar) {
        y7.b bVar = (y7.b) this.f14830f;
        h hVar = (h) fVar;
        synchronized (bVar.f21828b) {
            hVar.m();
            O[] oArr = bVar.f21831f;
            int i10 = bVar.f21833h;
            bVar.f21833h = i10 + 1;
            oArr[i10] = hVar;
            bVar.h();
        }
    }

    public Object c() {
        i6.b bVar = s.f14890t;
        ((SQLiteDatabase) this.f14830f).beginTransaction();
        return null;
    }

    @Override // tb.a
    public void f(String str, Bundle bundle) {
        ((rb.a) this.f14830f).f14744b.f(str, bundle);
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        switch (this.f14829c) {
            case 7:
                ((n0.c) obj).i(((l0) this.f14830f).f16667j);
                return;
            default:
                ((c0) obj).j((c0.a) this.f14830f);
                return;
        }
    }

    @Override // ea.e
    public void onSuccess(Object obj) {
        SignupActivity signupActivity = (SignupActivity) this.f14830f;
        int i10 = SignupActivity.S;
        Objects.requireNonNull(signupActivity);
        String m10 = ((d.b) ((d9.f) ((d.a) obj).f11775f)).m();
        if (m10.isEmpty()) {
            signupActivity.G(signupActivity.getString(R.string.error_captcha_init_failed));
        } else {
            signupActivity.H(m10);
        }
    }

    @Override // ea.d
    public void q(Exception exc) {
        LoginFragment loginFragment = (LoginFragment) this.f14830f;
        int i10 = LoginFragment.f5386u0;
        if (loginFragment.L()) {
            loginFragment.N0(loginFragment.I(R.string.error_captcha_init_failed));
        }
    }
}
