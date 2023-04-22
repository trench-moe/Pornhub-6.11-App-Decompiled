package cd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentMap<String, a> f4088a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap<String, a> f4089b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentMap<String, a> f4090c = new ConcurrentHashMap();
    public final List<Object> d = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4091a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f4092b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f4093c;
        public final Number d;

        /* renamed from: e  reason: collision with root package name */
        public final Number f4094e;

        /* renamed from: f  reason: collision with root package name */
        public final String f4095f;

        public a(int i10, Object obj, Number number, Number number2, Object obj2, String str) {
            Object obj3;
            Long l10 = obj2;
            this.f4091a = i10;
            this.f4095f = str;
            this.d = number;
            this.f4094e = number2;
            if (number == null || number2 == null) {
                obj3 = obj;
            } else {
                if (c(obj)) {
                    obj3 = obj;
                } else {
                    obj3 = Long.valueOf(Math.min(Math.max(((Number) obj).longValue(), number.longValue()), number2.longValue()));
                    cb.e.j0("MixpanelAPI.Tweaks", "Attempt to define a tweak \"" + str + "\" with default value " + obj3 + " out of its bounds [" + number + ", " + number2 + "]Tweak \"" + str + "\" new default value: " + obj3 + ".");
                }
                if (!c(l10)) {
                    Long valueOf = Long.valueOf(Math.min(Math.max(((Number) l10).longValue(), number.longValue()), number2.longValue()));
                    cb.e.j0("MixpanelAPI.Tweaks", "Attempt to define a tweak \"" + str + "\" with value " + obj3 + " out of its bounds [" + number + ", " + number2 + "]Tweak \"" + str + "\" new value: " + valueOf + ".");
                    l10 = valueOf;
                }
            }
            this.f4093c = obj3;
            this.f4092b = l10;
        }

        public static a a(JSONObject jSONObject) {
            String string;
            String string2;
            Object string3;
            Number number;
            Number number2;
            Object obj;
            int i10;
            Object valueOf;
            int i11;
            Object valueOf2;
            Number valueOf3;
            Number valueOf4;
            try {
                string = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                string2 = jSONObject.getString("type");
            } catch (JSONException unused) {
            }
            if ("number".equals(string2)) {
                String string4 = jSONObject.getString("encoding");
                if ("d".equals(string4)) {
                    i11 = 2;
                    valueOf = Double.valueOf(jSONObject.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                    valueOf2 = Double.valueOf(jSONObject.getDouble("default"));
                    valueOf3 = !jSONObject.isNull("minimum") ? Double.valueOf(jSONObject.getDouble("minimum")) : null;
                    if (!jSONObject.isNull("maximum")) {
                        valueOf4 = Double.valueOf(jSONObject.getDouble("maximum"));
                        number2 = valueOf4;
                        obj = valueOf;
                        number = valueOf3;
                        string3 = valueOf2;
                        i10 = i11;
                    }
                    valueOf4 = null;
                    number2 = valueOf4;
                    obj = valueOf;
                    number = valueOf3;
                    string3 = valueOf2;
                    i10 = i11;
                } else if (!"l".equals(string4)) {
                    return null;
                } else {
                    valueOf = Long.valueOf(jSONObject.getLong(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                    i11 = 3;
                    valueOf2 = Long.valueOf(jSONObject.getLong("default"));
                    valueOf3 = !jSONObject.isNull("minimum") ? Long.valueOf(jSONObject.getLong("minimum")) : null;
                    if (!jSONObject.isNull("maximum")) {
                        valueOf4 = Long.valueOf(jSONObject.getLong("maximum"));
                        number2 = valueOf4;
                        obj = valueOf;
                        number = valueOf3;
                        string3 = valueOf2;
                        i10 = i11;
                    }
                    valueOf4 = null;
                    number2 = valueOf4;
                    obj = valueOf;
                    number = valueOf3;
                    string3 = valueOf2;
                    i10 = i11;
                }
                return null;
            } else if (!"boolean".equals(string2)) {
                if ("string".equals(string2)) {
                    Object string5 = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    string3 = jSONObject.getString("default");
                    number = null;
                    number2 = null;
                    obj = string5;
                    i10 = 4;
                }
                return null;
            } else {
                Object valueOf5 = Boolean.valueOf(jSONObject.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                string3 = Boolean.valueOf(jSONObject.getBoolean("default"));
                number = null;
                number2 = null;
                obj = valueOf5;
                i10 = 1;
            }
            return new a(i10, string3, number, number2, obj, string);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Number] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Number b() {
            /*
                r5 = this;
                r2 = r5
                r0 = 0
                r4 = 1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                r0 = r4
                java.lang.Object r1 = r2.f4093c
                if (r1 == 0) goto L13
                r4 = 4
                java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.ClassCastException -> L11
                r0 = r1
                goto L14
            L11:
                r4 = 5
            L13:
                r4 = 2
            L14:
                java.lang.Object r1 = r2.f4092b
                if (r1 == 0) goto L1b
                java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.ClassCastException -> L1b
                r0 = r1
            L1b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cd.k.a.b():java.lang.Number");
        }

        public final boolean c(Object obj) {
            Number number;
            try {
                number = (Number) obj;
            } catch (ClassCastException unused) {
            }
            if (Math.min(Math.max(number.longValue(), this.d.longValue()), this.f4094e.longValue()) != this.d.longValue()) {
                if (Math.min(Math.max(number.longValue(), this.d.longValue()), this.f4094e.longValue()) == this.f4094e.longValue()) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    public synchronized Map<String, a> a() {
        return new HashMap(this.f4088a);
    }

    public synchronized boolean b(String str, Object obj) {
        if (this.f4088a.containsKey(str)) {
            return !this.f4088a.get(str).f4092b.equals(obj);
        }
        return false;
    }

    public synchronized void c(String str, Object obj) {
        if (this.f4088a.containsKey(str)) {
            a aVar = this.f4088a.get(str);
            this.f4088a.put(str, new a(aVar.f4091a, aVar.f4093c, aVar.d, aVar.f4094e, obj, aVar.f4095f));
            return;
        }
        cb.e.j0("MixpanelAPI.Tweaks", "Attempt to set a tweak \"" + str + "\" which has never been defined.");
    }
}
