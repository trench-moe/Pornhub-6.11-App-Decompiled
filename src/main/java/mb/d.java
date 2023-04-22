package mb;

import android.content.Context;
import android.text.TextUtils;
import h9.m;
import h9.o;
import java.util.Arrays;
import l9.i;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f13077a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13078b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13079c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13080e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13081f;

    /* renamed from: g  reason: collision with root package name */
    public final String f13082g;

    public d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        o.k(!i.a(str), "ApplicationId must be set.");
        this.f13078b = str;
        this.f13077a = str2;
        this.f13079c = str3;
        this.d = str4;
        this.f13080e = str5;
        this.f13081f = str6;
        this.f13082g = str7;
    }

    public static d a(Context context) {
        y5.c cVar = new y5.c(context);
        String b10 = cVar.b("google_app_id");
        if (TextUtils.isEmpty(b10)) {
            return null;
        }
        return new d(b10, cVar.b("google_api_key"), cVar.b("firebase_database_url"), cVar.b("ga_trackingId"), cVar.b("gcm_defaultSenderId"), cVar.b("google_storage_bucket"), cVar.b("project_id"));
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (m.a(this.f13078b, dVar.f13078b) && m.a(this.f13077a, dVar.f13077a) && m.a(this.f13079c, dVar.f13079c) && m.a(this.d, dVar.d) && m.a(this.f13080e, dVar.f13080e) && m.a(this.f13081f, dVar.f13081f) && m.a(this.f13082g, dVar.f13082g)) {
                z10 = true;
            }
            return z10;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13078b, this.f13077a, this.f13079c, this.d, this.f13080e, this.f13081f, this.f13082g});
    }

    public String toString() {
        m.a aVar = new m.a(this);
        aVar.a("applicationId", this.f13078b);
        aVar.a("apiKey", this.f13077a);
        aVar.a("databaseUrl", this.f13079c);
        aVar.a("gcmSenderId", this.f13080e);
        aVar.a("storageBucket", this.f13081f);
        aVar.a("projectId", this.f13082g);
        return aVar.toString();
    }
}
