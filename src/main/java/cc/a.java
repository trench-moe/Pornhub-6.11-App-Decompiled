package cc;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.fragment.app.h0;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import dc.e;
import e.p;
import ea.f;
import ea.g;
import ea.h;
import ea.j;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements f<Void, Void> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f4016c;

    public a(b bVar) {
        this.f4016c = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    @Override // ea.f
    public g<Void> a(Void r13) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        b bVar = this.f4016c;
        h0 h0Var = bVar.f4021f;
        dc.f fVar = bVar.f4018b;
        Objects.requireNonNull(h0Var);
        Closeable closeable = null;
        try {
            Map n = h0Var.n(fVar);
            zb.a b10 = h0Var.b(h0Var.f(n), fVar);
            ((m9.a) h0Var.f2147m).o("Requesting settings from " + ((String) h0Var.f2145f));
            ((m9.a) h0Var.f2147m).E("Settings query params were: " + n);
            jSONObject = h0Var.o(b10.b());
        } catch (IOException e10) {
            if (((m9.a) h0Var.f2147m).l(6)) {
                Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
            }
            jSONObject = null;
        }
        if (jSONObject != null) {
            e d = this.f4016c.f4019c.d(jSONObject);
            p pVar = this.f4016c.f4020e;
            ?? r42 = d.d;
            Objects.requireNonNull(pVar);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                try {
                    jSONObject.put("expires_at", (long) r42);
                    fileWriter = new FileWriter((File) pVar.f8949c);
                } catch (Exception e11) {
                    e = e11;
                    fileWriter = null;
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.a(closeable, "Failed to close settings writer.");
                    throw th;
                }
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                    r42 = fileWriter;
                } catch (Exception e12) {
                    e = e12;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    r42 = fileWriter;
                    CommonUtils.a(r42, "Failed to close settings writer.");
                    this.f4016c.c(jSONObject, "Loaded settings: ");
                    b bVar2 = this.f4016c;
                    String str = bVar2.f4018b.f8905f;
                    SharedPreferences.Editor edit = CommonUtils.g(bVar2.f4017a).edit();
                    edit.putString("existing_instance_identifier", str);
                    edit.apply();
                    this.f4016c.f4023h.set(d);
                    this.f4016c.f4024i.get().b(d.f8898a);
                    h<dc.a> hVar = new h<>();
                    hVar.b(d.f8898a);
                    this.f4016c.f4024i.set(hVar);
                    return j.d(null);
                }
                CommonUtils.a(r42, "Failed to close settings writer.");
                this.f4016c.c(jSONObject, "Loaded settings: ");
                b bVar22 = this.f4016c;
                String str2 = bVar22.f4018b.f8905f;
                SharedPreferences.Editor edit2 = CommonUtils.g(bVar22.f4017a).edit();
                edit2.putString("existing_instance_identifier", str2);
                edit2.apply();
                this.f4016c.f4023h.set(d);
                this.f4016c.f4024i.get().b(d.f8898a);
                h<dc.a> hVar2 = new h<>();
                hVar2.b(d.f8898a);
                this.f4016c.f4024i.set(hVar2);
            } catch (Throwable th2) {
                th = th2;
                closeable = r42;
                CommonUtils.a(closeable, "Failed to close settings writer.");
                throw th;
            }
        }
        return j.d(null);
    }
}
