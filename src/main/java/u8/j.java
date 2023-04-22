package u8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import io.reactivex.annotations.SchedulerSupport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class j extends i9.a {
    public static final c0 n;

    /* renamed from: c  reason: collision with root package name */
    public final List<g9.a> f15693c;

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f15694f;

    /* renamed from: j  reason: collision with root package name */
    public int f15695j;

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f15692m = {SchedulerSupport.NONE, "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<j> CREATOR = new s0();

    static {
        c0 c0Var = new c0();
        c0Var.b("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        c0Var.b("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        c0Var.b("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        c0Var.b("com.google.android.gms.cast.metadata.TITLE", "title", 1);
        c0Var.b("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        c0Var.b("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        c0Var.b("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        c0Var.b("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        c0Var.b("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        c0Var.b("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        c0Var.b("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        c0Var.b("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        c0Var.b("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        c0Var.b("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        c0Var.b("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        c0Var.b("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        c0Var.b("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        c0Var.b("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        c0Var.b("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        c0Var.b("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        c0Var.b("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        c0Var.b("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        c0Var.b("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        c0Var.b("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        c0Var.b("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        c0Var.b("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        c0Var.b("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        c0Var.b("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        n = c0Var;
    }

    public j() {
        this(0);
    }

    public j(int i10) {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        this.f15693c = arrayList;
        this.f15694f = bundle;
        this.f15695j = i10;
    }

    public j(List<g9.a> list, Bundle bundle, int i10) {
        this.f15693c = list;
        this.f15694f = bundle;
        this.f15695j = i10;
    }

    public static void s0(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int a10 = n.a(str);
        if (a10 == i10 || a10 == 0) {
            return;
        }
        String str2 = f15692m[i10];
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb2.append("Value for ");
        sb2.append(str);
        sb2.append(" must be a ");
        sb2.append(str2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return v0(this.f15694f, jVar.f15694f) && this.f15693c.equals(jVar.f15693c);
        }
        return false;
    }

    public int hashCode() {
        Bundle bundle = this.f15694f;
        int i10 = 17;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = this.f15694f.get(str);
                i10 = (i10 * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f15693c.hashCode() + (i10 * 31);
    }

    public boolean p0(String str) {
        return this.f15694f.containsKey(str);
    }

    public String q0(String str) {
        s0(str, 1);
        return this.f15694f.getString(str);
    }

    public boolean r0() {
        List<g9.a> list = this.f15693c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final JSONObject t0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.f15695j);
        } catch (JSONException unused) {
        }
        JSONArray b10 = b9.a.b(this.f15693c);
        if (b10.length() != 0) {
            try {
                jSONObject.put("images", b10);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i10 = this.f15695j;
        if (i10 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i10 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i10 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str != null && this.f15694f.containsKey(str)) {
                    c0 c0Var = n;
                    String str2 = (String) ((Map) c0Var.f15647c).get(str);
                    if (str2 != null) {
                        int a10 = c0Var.a(str);
                        if (a10 != 1) {
                            if (a10 == 2) {
                                jSONObject.put(str2, this.f15694f.getInt(str));
                            } else if (a10 == 3) {
                                jSONObject.put(str2, this.f15694f.getDouble(str));
                            } else if (a10 != 4) {
                                if (a10 == 5) {
                                    jSONObject.put(str2, a9.a.b(this.f15694f.getLong(str)));
                                }
                            }
                        }
                        jSONObject.put(str2, this.f15694f.getString(str));
                    }
                }
            }
            for (String str3 : this.f15694f.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object obj = this.f15694f.get(str3);
                    if (obj instanceof String) {
                        jSONObject.put(str3, obj);
                    } else if (obj instanceof Integer) {
                        jSONObject.put(str3, obj);
                    } else if (obj instanceof Double) {
                        jSONObject.put(str3, obj);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final void u0(JSONObject jSONObject) {
        this.f15694f.clear();
        this.f15693c.clear();
        this.f15695j = 0;
        try {
            this.f15695j = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            b9.a.c(this.f15693c, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i10 = this.f15695j;
        if (i10 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i10 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i10 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    c0 c0Var = n;
                    String str = (String) ((Map) c0Var.f15648f).get(next);
                    if (str == null) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            this.f15694f.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.f15694f.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.f15694f.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(str)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                int a10 = c0Var.a(str);
                                if (a10 != 1) {
                                    if (a10 != 2) {
                                        if (a10 == 3) {
                                            double optDouble = jSONObject.optDouble(next);
                                            if (!Double.isNaN(optDouble)) {
                                                this.f15694f.putDouble(str, optDouble);
                                            }
                                        } else if (a10 != 4) {
                                            if (a10 == 5) {
                                                Bundle bundle = this.f15694f;
                                                long optLong = jSONObject.optLong(next);
                                                Pattern pattern = a9.a.f249a;
                                                bundle.putLong(str, optLong * 1000);
                                            }
                                        } else if (obj2 instanceof String) {
                                            String str2 = (String) obj2;
                                            if (b9.a.a(str2) != null) {
                                                this.f15694f.putString(str, str2);
                                            }
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.f15694f.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    this.f15694f.putString(str, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r9 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r12.containsKey(r1) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v0(android.os.Bundle r11, android.os.Bundle r12) {
        /*
            r10 = this;
            r7 = r10
            int r9 = r11.size()
            r0 = r9
            int r1 = r12.size()
            r2 = 0
            r9 = 2
            if (r0 == r1) goto Lf
            return r2
        Lf:
            java.util.Set r9 = r11.keySet()
            r0 = r9
            java.util.Iterator r9 = r0.iterator()
            r0 = r9
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            r9 = 3
            java.lang.Object r9 = r0.next()
            r1 = r9
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r9 = r11.get(r1)
            r3 = r9
            java.lang.Object r9 = r12.get(r1)
            r4 = r9
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L4d
            r9 = 4
            boolean r5 = r4 instanceof android.os.Bundle
            r9 = 2
            if (r5 == 0) goto L4d
            r9 = 4
            r5 = r3
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = r4
            android.os.Bundle r6 = (android.os.Bundle) r6
            boolean r9 = r7.v0(r5, r6)
            r5 = r9
            if (r5 == 0) goto L4b
            r9 = 2
            goto L4d
        L4b:
            r9 = 7
            return r2
        L4d:
            if (r3 != 0) goto L58
            if (r4 != 0) goto L57
            boolean r1 = r12.containsKey(r1)
            if (r1 != 0) goto L19
        L57:
            return r2
        L58:
            r9 = 6
            boolean r1 = r3.equals(r4)
            if (r1 != 0) goto L19
            r9 = 6
            return r2
        L61:
            r9 = 1
            r11 = r9
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.j.v0(android.os.Bundle, android.os.Bundle):boolean");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.u(parcel, 2, this.f15693c, false);
        t9.k0.l(parcel, 3, this.f15694f, false);
        int i11 = this.f15695j;
        parcel.writeInt(262148);
        parcel.writeInt(i11);
        t9.k0.z(parcel, v2);
    }
}
