package com.mixpanel.android.viewcrawler;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import cd.g;
import cd.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mixpanel.android.util.ImageStore;
import com.mixpanel.android.viewcrawler.c;
import com.mixpanel.android.viewcrawler.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class EditProtocol {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f8330e = new Class[0];

    /* renamed from: f  reason: collision with root package name */
    public static final List<c.C0112c> f8331f = Collections.emptyList();

    /* renamed from: a  reason: collision with root package name */
    public final Context f8332a;

    /* renamed from: b  reason: collision with root package name */
    public final g f8333b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageStore f8334c;
    public final e.j d;

    /* loaded from: classes.dex */
    public static class BadInstructionsException extends Exception {
        private static final long serialVersionUID = -4062004792184145311L;

        public BadInstructionsException(String str) {
            super(str);
        }

        public BadInstructionsException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* loaded from: classes.dex */
    public static class CantGetEditAssetsException extends Exception {
        public CantGetEditAssetsException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* loaded from: classes.dex */
    public static class InapplicableInstructionsException extends BadInstructionsException {
        private static final long serialVersionUID = 3977056710817909104L;

        public InapplicableInstructionsException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final e f8335a;

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f8336b;

        public b(e eVar, List list, a aVar) {
            this.f8335a = eVar;
            this.f8336b = list;
        }
    }

    public EditProtocol(Context context, g gVar, ImageStore imageStore, e.j jVar) {
        this.f8332a = context;
        this.f8333b = gVar;
        this.f8334c = imageStore;
        this.d = jVar;
    }

    public final Object a(Object obj, String str, List<String> list) {
        try {
            if ("java.lang.CharSequence".equals(str)) {
                return obj;
            }
            if (!"boolean".equals(str)) {
                if ("java.lang.Boolean".equals(str)) {
                    return obj;
                }
                if (!"int".equals(str) && !"java.lang.Integer".equals(str)) {
                    if (!"float".equals(str) && !"java.lang.Float".equals(str)) {
                        if (!"android.graphics.drawable.Drawable".equals(str) && !"android.graphics.drawable.BitmapDrawable".equals(str)) {
                            if ("android.graphics.drawable.ColorDrawable".equals(str)) {
                                return new ColorDrawable(((Number) obj).intValue());
                            }
                            throw new BadInstructionsException("Don't know how to interpret type " + str + " (arg was " + obj + ")");
                        }
                        return b((JSONObject) obj, list);
                    }
                    return Float.valueOf(((Number) obj).floatValue());
                }
                obj = Integer.valueOf(((Number) obj).intValue());
            }
            return obj;
        } catch (ClassCastException unused) {
            throw new BadInstructionsException("Couldn't interpret <" + obj + "> as " + str);
        }
    }

    public final Drawable b(JSONObject jSONObject, List<String> list) {
        int i10;
        int i11;
        int i12;
        int i13;
        try {
            if (jSONObject.isNull("url")) {
                throw new BadInstructionsException("Can't construct a BitmapDrawable with a null url");
            }
            String string = jSONObject.getString("url");
            boolean z10 = false;
            if (jSONObject.isNull("dimensions")) {
                i13 = 0;
                i10 = 0;
                i11 = 0;
                i12 = 0;
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("dimensions");
                int i14 = jSONObject2.getInt("left");
                i10 = jSONObject2.getInt("right");
                i11 = jSONObject2.getInt("top");
                i12 = jSONObject2.getInt("bottom");
                i13 = i14;
                z10 = true;
            }
            try {
                Bitmap b10 = this.f8334c.b(string);
                list.add(string);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(Resources.getSystem(), b10);
                if (z10) {
                    bitmapDrawable.setBounds(i13, i11, i10, i12);
                }
                return bitmapDrawable;
            } catch (ImageStore.CantGetImageException e10) {
                throw new CantGetEditAssetsException(e10.getMessage(), e10.getCause());
            }
        } catch (JSONException e11) {
            throw new BadInstructionsException("Couldn't read drawable description", e11);
        }
    }

    public b c(JSONObject jSONObject) {
        e hVar;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            List<c.C0112c> e10 = e(jSONObject.getJSONArray("path"), this.f8333b);
            if (e10.size() != 0) {
                if (jSONObject.getString("change_type").equals("property")) {
                    String string = jSONObject.getJSONObject("property").getString("classname");
                    if (string == null) {
                        throw new BadInstructionsException("Can't bind an edit property without a target class");
                    }
                    try {
                        fd.c f10 = f(Class.forName(string), jSONObject.getJSONObject("property"));
                        JSONArray jSONArray = jSONObject.getJSONArray("args");
                        Object[] objArr = new Object[jSONArray.length()];
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
                            objArr[i10] = a(jSONArray2.get(0), jSONArray2.getString(1), arrayList);
                        }
                        String str2 = f10.d;
                        fd.a aVar = str2 == null ? null : new fd.a(f10.f9556b, str2, objArr, Void.TYPE);
                        if (aVar == null) {
                            throw new BadInstructionsException("Can't update a read-only property " + f10.f9555a + " (add a mutator to make this work)");
                        }
                        hVar = new e.k(e10, aVar, f10.f9557c);
                    } catch (ClassNotFoundException e11) {
                        throw new BadInstructionsException("Can't find class for visit path: " + str, e11);
                    }
                } else if (!jSONObject.getString("change_type").equals("layout")) {
                    throw new BadInstructionsException("Can't figure out the edit type");
                } else {
                    JSONArray jSONArray3 = jSONObject.getJSONArray("args");
                    ArrayList arrayList2 = new ArrayList();
                    int length = jSONArray3.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject optJSONObject = jSONArray3.optJSONObject(i11);
                        String string2 = optJSONObject.getString("view_id_name");
                        String string3 = optJSONObject.getString("anchor_id_name");
                        Integer i12 = i(-1, string2, this.f8333b);
                        Integer i13 = string3.equals("0") ? 0 : string3.equals("-1") ? -1 : i(-1, string3, this.f8333b);
                        if (i12 != null && i13 != null) {
                            arrayList2.add(new e.g(i12.intValue(), optJSONObject.getInt("verb"), i13.intValue()));
                        }
                        cb.e.j0("MixpanelAPI.EProtocol", "View (" + string2 + ") or anchor (" + string3 + ") not found.");
                    }
                    hVar = new e.h(e10, arrayList2, jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), this.d);
                }
                return new b(hVar, arrayList, null);
            }
            throw new InapplicableInstructionsException("Edit will not be bound to any element in the UI.");
        } catch (NoSuchMethodException e12) {
            throw new BadInstructionsException("Can't create property mutator", e12);
        } catch (JSONException e13) {
            throw new BadInstructionsException("Can't interpret instructions due to JSONException", e13);
        }
    }

    public e d(JSONObject jSONObject, e.i iVar) {
        try {
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("event_type");
            List<c.C0112c> e10 = e(jSONObject.getJSONArray("path"), this.f8333b);
            if (e10.size() == 0) {
                throw new InapplicableInstructionsException("event '" + string + "' will not be bound to any element in the UI.");
            } else if ("click".equals(string2)) {
                return new e.b(e10, 1, string, iVar);
            } else {
                if ("selected".equals(string2)) {
                    return new e.b(e10, 4, string, iVar);
                }
                if ("text_changed".equals(string2)) {
                    return new e.c(e10, string, iVar);
                }
                if ("detected".equals(string2)) {
                    return new e.l(e10, string, iVar);
                }
                throw new BadInstructionsException("Mixpanel can't track event type \"" + string2 + "\"");
            }
        } catch (JSONException e11) {
            throw new BadInstructionsException("Can't interpret instructions due to JSONException", e11);
        }
    }

    public List<c.C0112c> e(JSONArray jSONArray, g gVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            String Y = cb.e.Y(jSONObject, "prefix");
            String Y2 = cb.e.Y(jSONObject, "view_class");
            int optInt = jSONObject.optInt("index", -1);
            String Y3 = cb.e.Y(jSONObject, "contentDescription");
            int optInt2 = jSONObject.optInt("id", -1);
            String Y4 = cb.e.Y(jSONObject, "mp_id_name");
            String Y5 = cb.e.Y(jSONObject, "tag");
            if ("shortest".equals(Y)) {
                i10 = 1;
            } else if (Y != null) {
                cb.e.j0("MixpanelAPI.EProtocol", "Unrecognized prefix type \"" + Y + "\". No views will be matched");
                return f8331f;
            } else {
                i10 = 0;
            }
            Integer i12 = i(optInt2, Y4, gVar);
            if (i12 == null) {
                return f8331f;
            }
            arrayList.add(new c.C0112c(i10, Y2, optInt, i12.intValue(), Y3, Y5));
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final fd.c f(java.lang.Class<?> r13, org.json.JSONObject r14) {
        /*
            r12 = this;
            r8 = r12
            java.lang.String r0 = "set"
            java.lang.String r10 = "get"
            r1 = r10
            r11 = 5
            java.lang.String r2 = "name"
            r11 = 3
            java.lang.String r2 = r14.getString(r2)     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            boolean r10 = r14.has(r1)     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            r3 = r10
            java.lang.String r11 = "selector"
            r4 = r11
            r5 = 0
            r10 = 3
            if (r3 == 0) goto L43
            r10 = 7
            org.json.JSONObject r1 = r14.getJSONObject(r1)     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            java.lang.String r11 = r1.getString(r4)     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            r3 = r11
            java.lang.String r6 = "result"
            r11 = 3
            org.json.JSONObject r11 = r1.getJSONObject(r6)     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            r1 = r11
            java.lang.String r10 = "type"
            r6 = r10
            java.lang.String r1 = r1.getString(r6)     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            java.lang.Class r11 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            r1 = r11
            fd.a r6 = new fd.a     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            r10 = 5
            java.lang.Class<?>[] r7 = com.mixpanel.android.viewcrawler.EditProtocol.f8330e     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            r10 = 7
            r6.<init>(r13, r3, r7, r1)     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            r11 = 3
            goto L45
        L43:
            r11 = 3
            r6 = r5
        L45:
            boolean r10 = r14.has(r0)     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            r1 = r10
            if (r1 == 0) goto L56
            r10 = 7
            org.json.JSONObject r14 = r14.getJSONObject(r0)     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            java.lang.String r11 = r14.getString(r4)     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            r5 = r11
        L56:
            fd.c r14 = new fd.c     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            r14.<init>(r2, r13, r6, r5)     // Catch: java.lang.ClassNotFoundException -> L5c org.json.JSONException -> L66 java.lang.NoSuchMethodException -> L72
            return r14
        L5c:
            r13 = move-exception
            com.mixpanel.android.viewcrawler.EditProtocol$BadInstructionsException r14 = new com.mixpanel.android.viewcrawler.EditProtocol$BadInstructionsException
            java.lang.String r0 = "Can't read property JSON, relevant arg/return class not found"
            r14.<init>(r0, r13)
            r10 = 1
            throw r14
        L66:
            r13 = move-exception
            com.mixpanel.android.viewcrawler.EditProtocol$BadInstructionsException r14 = new com.mixpanel.android.viewcrawler.EditProtocol$BadInstructionsException
            r10 = 4
            java.lang.String r10 = "Can't read property JSON"
            r0 = r10
            r14.<init>(r0, r13)
            throw r14
            r10 = 7
        L72:
            r13 = move-exception
            com.mixpanel.android.viewcrawler.EditProtocol$BadInstructionsException r14 = new com.mixpanel.android.viewcrawler.EditProtocol$BadInstructionsException
            java.lang.String r0 = "Can't create property reader"
            r14.<init>(r0, r13)
            r11 = 4
            throw r14
            r10 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.viewcrawler.EditProtocol.f(java.lang.Class, org.json.JSONObject):fd.c");
    }

    public fd.f g(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONObject("config").getJSONArray("classes");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                Class<?> cls = Class.forName(jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
                JSONArray jSONArray2 = jSONObject2.getJSONArray("properties");
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    arrayList.add(f(cls, jSONArray2.getJSONObject(i11)));
                }
            }
            return new fd.f(this.f8332a, arrayList, this.f8333b);
        } catch (ClassNotFoundException e10) {
            throw new BadInstructionsException("Can't resolve types for snapshot configuration", e10);
        } catch (JSONException e11) {
            throw new BadInstructionsException("Can't read snapshot configuration", e11);
        }
    }

    public ed.e<String, Object> h(JSONObject jSONObject) {
        Object string;
        try {
            String string2 = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String string3 = jSONObject.getString("type");
            if ("number".equals(string3)) {
                String string4 = jSONObject.getString("encoding");
                if ("d".equals(string4)) {
                    string = Double.valueOf(jSONObject.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                } else if (!"l".equals(string4)) {
                    throw new BadInstructionsException("number must have encoding of type \"l\" for long or \"d\" for double in: " + jSONObject);
                } else {
                    string = Long.valueOf(jSONObject.getLong(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
            } else if ("boolean".equals(string3)) {
                string = Boolean.valueOf(jSONObject.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            } else if (!"string".equals(string3)) {
                throw new BadInstructionsException("Unrecognized tweak type " + string3 + " in: " + jSONObject);
            } else {
                string = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            }
            return new ed.e<>(string2, string);
        } catch (JSONException e10) {
            throw new BadInstructionsException("Can't read tweak update", e10);
        }
    }

    public final Integer i(int i10, String str, g gVar) {
        int i11;
        if (str == null) {
            i11 = -1;
        } else if (!((h) gVar).f4073a.containsKey(str)) {
            cb.e.j0("MixpanelAPI.EProtocol", "Path element contains an id name not known to the system. No views will be matched.\nMake sure that you're not stripping your packages R class out with proguard.\nid name was \"" + str + "\"");
            return null;
        } else {
            i11 = ((h) gVar).f4073a.get(str).intValue();
        }
        if (-1 == i11 || -1 == i10 || i11 == i10) {
            return -1 != i11 ? Integer.valueOf(i11) : Integer.valueOf(i10);
        }
        cb.e.B("MixpanelAPI.EProtocol", "Path contains both a named and an explicit id, and they don't match. No views will be matched.");
        return null;
    }
}
